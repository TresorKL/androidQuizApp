package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import za.ac.logic.processor.Processor;


public class MainActivity extends AppCompatActivity {

    EditText nameText;
    EditText studentNumText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void loginBtn(View view){
        boolean isValidUser;
         nameText = findViewById(R.id.name);
         studentNumText =findViewById(R.id.studentNum);

        String name = nameText.getText().toString();
        String studentNum= studentNumText.getText().toString();

        Processor process = new Processor();

        isValidUser = process.validUser(name,Integer.parseInt(studentNum));

       if (isValidUser){

            Intent user = new Intent(this, userActivity.class);
           user.putExtra("studentNum",studentNum);

            startActivity(user);

        }else{

           Toast.makeText(this,"INVALID INPUT",Toast.LENGTH_LONG).show();

       }






    }
}