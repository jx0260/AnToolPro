package com.chinaedu.antoolpro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "resume");
        Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "destroy");
        Toast.makeText(this, "destroy", Toast.LENGTH_SHORT).show();
    }
}
