package com.example.abhi.rickshawowner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SetUserInformation extends AppCompatActivity {

    private Button feed_data;
    private EditText inputName, inputEnrollment, inputContact, inputBhavan, inputRoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_user_information);
        feed_data=(Button)findViewById(R.id.feed_data);
        inputName = (EditText) findViewById(R.id.yourname);
        inputContact = (EditText) findViewById(R.id.contactnumber);

        feed_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name = inputName.getText().toString().trim();
                String Contact = inputContact.getText().toString().trim();
                user newuser=new user(Name ,Contact);
                newuser.writeNewUser(Name ,Contact);


                // ...

                startActivity(new Intent(SetUserInformation.this, MainActivity.class));
                finish();
            }
        });
    }
}

