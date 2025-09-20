# FirebaseAppKotlin 📱🔥

An Android application demonstrating the integration and usage of Firebase Realtime Database and Firebase Firestore in Kotlin.
This app showcases fundamental operations like writing, reading, updating, and deleting data with both Firebase database solutions.

✨ **Features**

*   **Firebase Realtime Database Integration:**
    *   ✅ Write primitive data (e.g., strings, numbers).
    *   ✅ Write custom Kotlin objects (`User` class).
    *   ✅ Read data and listen for real-time updates using `ValueEventListener`.
    *   ✅ Deserialize data back into custom Kotlin objects.
*   **Firebase Firestore Integration:**
    *   ✅ Create and manage collections.
    *   ✅ Add documents with specific IDs or auto-generated IDs.
    *   ✅ Update existing documents.
    *   ✅ Delete documents from a collection.
    *   ✅ Fetch specific documents.
    *   ✅ Fetch all documents within a collection.
*   **UI:**
    *   ✅ Simple UI to display data fetched from Firebase (e.g., in a `TextView`).

🛠️ **Tech Stack**

| Category          | Tech Used                                     |
|-------------------|-----------------------------------------------|
| Language          | Kotlin                                        |
| Platform          | Android                                       |
| Databases         | Firebase Realtime Database, Firebase Firestore |
| Firebase SDKs     | `firebase-database-ktx`, `firebase-firestore-ktx` |
| UI                | Android SDK Standard UI Components            |
| Build System      | Gradle                                        |


📦 **Project Structure**

FirebaseAppKotlin/
│
├── app/
│   ├── src/main/
│   │   ├── java/com/surajvanshsv/firebaseappkotlin/
│   │   │   ├── MainActivity.kt     # Core Activity with Firebase logic
│   │   │   └── User.kt             # Data class for Realtime Database
│   │   ├── res/
│   │   │   └── layout/
│   │   │       └── activity_main.xml # Layout for MainActivity
│   │   └── AndroidManifest.xml
│   ├── google-services.json        # Firebase project configuration 
│   └── build.gradle.kts            # App-level Gradle build script
│
└── build.gradle.kts                # Project-level Gradle build script

🔌 **Firebase Services Used**

*   **Firebase Realtime Database:** For storing and syncing data in real-time.
*   **Firebase Firestore:** For more structured, queryable NoSQL document data.

🚀 **Getting Started**

1.  **Clone this repo**
    ```bash
    git clone https://github.com/surajpsk12/firebaseappkotlin.git
    ```
2.  **Open in Android Studio**

3.  **Add your Firebase Configuration (`google-services.json`)**
    *   Go to your Firebase project console.
    *   Download the `google-services.json` file.
    *   Place it in the `FirebaseAppKotlin/app/` directory.
    *   **Important**: This file contains sensitive API keys. Add it to your `.gitignore` if this is a public repository.

4.  **Enable Firebase Services**
    *   In the Firebase Console, ensure you have **Firebase Realtime Database** and **Firebase Firestore** enabled for your project.
    *   Set up appropriate security rules for development/testing (e.g., allow read/write access).

5.  **Build and Run** the application on an Android emulator or device.

💡 **Learnings from this Project**

✔ Integrating and configuring Firebase SDKs in a Kotlin Android project.
✔ Performing Create, Read, Update, Delete (CRUD) operations with Firebase Realtime Database.
✔ Working with `ValueEventListener` for real-time data synchronization.
✔ Storing and retrieving custom Kotlin objects in Realtime Database.
✔ Performing CRUD operations with Firebase Firestore (collections and documents).
✔ Handling asynchronous operations from Firebase using listeners (e.g., `addOnSuccessListener`).
✔ Basic display of data from Firebase in an Android UI.


## 🌐 Connect With Me

*   🔗 [LinkedIn - Suraj Kumar](https://www.linkedin.com/in/surajvansh12/)
*   💻 [GitHub - surajpsk12](https://github.com/surajpsk12)

