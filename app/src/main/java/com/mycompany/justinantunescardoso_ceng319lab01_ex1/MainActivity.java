package com.mycompany.justinantunescardoso_ceng319lab01_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //dc849a55-dfaf-48e2-b0bd-b6c45a566661
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView onCreate = new TextView(this);
        LinearLayout lineLay = (LinearLayout) findViewById(R.id.lineLay);
        onCreate.setText(R.string.onCreate);
        lineLay.addView(onCreate);
    }

    @SuppressLint("ResourceType")
    @Override
    protected void onStart() {
        super.onStart();
        TextView onStart = new TextView(this);
        LinearLayout lineLay = (LinearLayout) findViewById(R.id.lineLay);
        onStart.setText(R.string.onStart);
        lineLay.addView(onStart);
    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView onStop = new TextView(this);
        LinearLayout lineLay = (LinearLayout) findViewById(R.id.lineLay);
        onStop.setText(R.string.onStop);
        lineLay.addView(onStop);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TextView onDestroy = new TextView(this);
        LinearLayout lineLay = (LinearLayout) findViewById(R.id.lineLay);
        onDestroy.setText(R.string.onDestroy);
        lineLay.addView(onDestroy);
    }
}