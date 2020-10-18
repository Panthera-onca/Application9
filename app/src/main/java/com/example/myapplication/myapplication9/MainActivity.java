package com.example.myapplication.myapplication9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ACOS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickHello(View view) {
        Intent intention = new Intent(this, HelloActivity.class);
        startActivityForResult(intention, 14540);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 14540){
            Log.i(TAG, "requestCode:" + requestCode);
            Log.i(TAG, "resultCode:" + resultCode);
            Log.i(TAG, "data:" + data.getStringExtra("info"));
        }
    }
}