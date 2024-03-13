package com.example.financetrackingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fstpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fstpage);

    }

    public void m4(View view) {
        Intent intent = new Intent(this, entry.class);
        startActivity(intent);
    }
}