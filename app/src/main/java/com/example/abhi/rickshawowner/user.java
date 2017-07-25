package com.example.abhi.rickshawowner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by abhi on 2/9/17.
 */

public class user {
    private DatabaseReference mDatabase;

    public String contactNumber;
    public String yourName;

    public user() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public user( String yourname,String contactno) {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        this.yourName = yourname;
        this.contactNumber=contactno;

    }
    public void writeNewUser(String yourname,String contactno) {
        user user = new user(yourName,contactNumber);

        mDatabase.child("users").child("rickshawowners").child(contactNumber).setValue(user);
    }

}

