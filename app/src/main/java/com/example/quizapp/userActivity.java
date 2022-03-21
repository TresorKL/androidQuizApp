package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import za.ac.logic.processor.Processor;
import za.ac.logic.user.User;

public class userActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Intent user = getIntent();

        String studentNumStr = user.getStringExtra("studentNum").toString();

         int studentNum = Integer.parseInt(studentNumStr);

         Processor process = new Processor();

        User currentUser =process.getCurrentUser(studentNum);

        // set text views
        TextView studNum = findViewById(R.id.studentNum);
        TextView age = findViewById(R.id.age);
        TextView contact = findViewById(R.id.contact);
        TextView welcome = findViewById(R.id.welcome);

        welcome.setText("WELCOME "+currentUser.getName());

        contact.setText("Contact "+currentUser.getContact());

       age.setText("Age: "+currentUser.getAge());

     studNum.setText("Student Num: "+currentUser.getStudentNumber());


    }

    public void logoutBtn(View v){



        Intent main = new Intent(this,MainActivity.class);
        startActivity(main);
    }

    public void quizBtn(View v){
        Intent quiz = new Intent(this,Quiz.class);
        startActivity(quiz);

    }

}