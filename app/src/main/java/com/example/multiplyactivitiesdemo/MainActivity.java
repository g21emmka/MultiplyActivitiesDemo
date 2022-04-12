package com.example.multiplyactivitiesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signin;


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "MainAcitivty started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "MainAcitivty stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MainAcitivty destroyed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("==>", "MainAcitivty paused.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("==>", "MainAcitivty resumed.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>", "MainAcitivty created.");

        signin = findViewById(R.id.signin_button);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Sign in button pressed.");
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);

            }
        });
    }
}