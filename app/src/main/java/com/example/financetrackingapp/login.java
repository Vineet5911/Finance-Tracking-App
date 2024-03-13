package com.example.financetrackingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.financetrackingapp.R;
import com.example.financetrackingapp.fstpage;
import com.example.financetrackingapp.signup;

public class login extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "1234";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.uname);
        passwordEditText = findViewById(R.id.pass);
    }

    public void m1(View view) {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

    public void m3(View view){
        String enteredUsername = usernameEditText.getText().toString();
        String enteredPassword = passwordEditText.getText().toString();

        if (enteredUsername.equals(ADMIN_USERNAME) && enteredPassword.equals(ADMIN_PASSWORD)) {
            Intent intent = new Intent(this, fstpage.class);
            startActivity(intent);
            Toast.makeText(this, "Login succesfully", Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_LONG).show();
        }
    }
}
