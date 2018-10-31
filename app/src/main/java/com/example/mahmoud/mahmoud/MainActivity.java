package com.example.mahmoud.mahmoud;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {



    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("/userProfile/G61NcBJdoMnfWAnomnZH");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    DatabaseReference usersRef = ref.child("users");

    Map<String, User> users = new HashMap<>();
users.put("alanisawesome", new User("June 23, 1912", "Alan Turing"));
users.put("gracehop", new User("December 9, 1906", "Grace Hopper"));

usersRef.setValueAsync(users);


















}
