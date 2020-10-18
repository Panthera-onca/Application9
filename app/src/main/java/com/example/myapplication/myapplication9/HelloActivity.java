package com.example.myapplication.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        Intent resultat = new Intent();
        resultat.putExtra("info", "Hello world");
        this.setResult(RESULT_OK, resultat);
    }
}