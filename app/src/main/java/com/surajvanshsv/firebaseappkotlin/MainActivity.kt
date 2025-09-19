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


class MainActivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // we will use now firestore





//        // we are using realtime database here
//
//        val textView : TextView = findViewById(R.id.textview)
//
//
//
//        database = Firebase.database.reference
//
//        // writing custom objects to firebase
//        val user1 = User("Suraj", "1234")
//        database.child("Users").setValue(user1)
//
//        // reading custom objects from firebase
//        val pe = object : ValueEventListener {
//            override fun onDataChange(snapshot: DataSnapshot) {
//                val u1 : User = snapshot.getValue<User>() as User
//                textView.text = u1.toString()
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                return
//            }
//        }
//
//
//        database.child("Users").addValueEventListener(pe)
//
//
//

//        // writing to database
//        database.child("price").setValue("1920$")
//
//        // reading data from database
//        val postListener = object : ValueEventListener {
//
//            override fun onDataChange(snapshot: DataSnapshot) {
//                val gold_price = snapshot.value
//                textView.text = gold_price.toString()
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                Log.w(TAG, "loadPost:onCancelled", error.toException())
//
//            }
//        }
//        database.child("price").addValueEventListener(postListener)
//


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}