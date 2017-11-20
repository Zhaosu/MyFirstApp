package com.example.android.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.sample.utilities.MyTextUtil;

public class MainActivity extends AppCompatActivity {
    private static final int VALUE = 506;
    //private static final String LOG_TAG = "MainActivity" ;
    private static final String TAG = "MainActivity";

    //    TODO:FINISH IT!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate:");
        for (int i = 0; i < 3; i++) {
            Log.i(TAG, "onCreate: i=" + i);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause:");
    }
}
