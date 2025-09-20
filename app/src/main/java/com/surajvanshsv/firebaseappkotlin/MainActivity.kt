package com.surajvanshsv.firebaseappkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.database
import com.google.firebase.database.getValue
import com.google.firebase.firestore.firestore


class MainActivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // we will use now firestore

        val textView = findViewById<TextView>(R.id.textview)
        // initializing the firestore
        val db = Firebase.firestore

        // udpating the data in document
        db.collection("Users")
            .document("User1")
            .update("born",2000)

//         deleting
        db.collection("Users")
            .document("User1")
            .delete()



        // creating a collection  : " users "
        val users_collection  = db.collection("Users")

        // creating a document in Users collection
        val user1 = hashMapOf(
            "name" to "Suraj",
            "lname" to "Kumar",
            "born" to "2005"
        )
        val user2 = hashMapOf(
            "name" to "Vansh",
            "lname" to "Kumar",
            "born" to "2006"
        )


//        // adding document to collection
        users_collection.document("User1").set(user1)
        users_collection.document("User2").set(user2)


        // reading data from firestore
        // recieve  document from firestore
        val docRef = db.collection("Users").document("User1")

        // recieving specific data from firestore
        docRef.get().addOnSuccessListener { document ->
            if(document != null){
                textView.text = "${document.data?.get("name")}"
            }
        }

        // reading all document in a collection at once
        var allDocument : String = ""
        db.collection("Users").get().addOnSuccessListener { result ->
            for (document in result){
                allDocument += "${document.data}" + "\n"
            }
            textView.text = ""+allDocument
        }





        // we are using realtime database here

        database = Firebase.database.reference

        // writing custom objects to firebase
        val user3 = User("Suraj", "1234")
        database.child("Users").setValue(user3)

        // reading custom objects from firebase
        val pe = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val u1 : User = snapshot.getValue<User>() as User
                textView.text = u1.toString()
            }

            override fun onCancelled(error: DatabaseError) {
                return
            }
        }


        database.child("Users").addValueEventListener(pe)




        // writing to database
        database.child("price").setValue("1920$")

        // reading data from database
        val postListener = object : ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {
                val gold_price = snapshot.value
                textView.text = gold_price.toString()
            }

            override fun onCancelled(error: DatabaseError) {

            }
        }
        database.child("price").addValueEventListener(postListener)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}