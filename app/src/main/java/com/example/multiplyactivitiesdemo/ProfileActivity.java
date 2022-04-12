package com.example.multiplyactivitiesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    private Button signout;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "ProfileAcitivty started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "ProfileAcitivty stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MProfileAcitivty destroyed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("==>", "ProfileAcitivty paused.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("==>", "ProfileAcitivty resumed.");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
            Log.d("==>", "ProfileAcitivty created.");
            signout = findViewById(R.id.signout_button);

            signout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("==>", "Sign out pressed.");
                }
            });

    }
}