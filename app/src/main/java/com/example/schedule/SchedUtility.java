package com.example.schedule;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class SchedUtility {

    static CollectionReference getCollectionReferenceForSched(){
        //FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        //return FirebaseFirestore.getInstance().collection("Courses").document(get.currentUser.getUid()).collection("my_Courses")
        return FirebaseFirestore.getInstance().collection("Schedule");
    }
}
