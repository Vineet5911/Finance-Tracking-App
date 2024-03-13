package com.example.financetrackingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void m2(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
        Toast.makeText(this, "Signup succesfully", Toast.LENGTH_LONG).show();
    }
}