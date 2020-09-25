package com.mycompany.justinantunescardoso_ceng319lab01_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);
        TextView createView = new TextView(this);
        LinearLayout LinearLayout = (LinearLayout) findViewById(R.id.LinearLayout);
        createView.setText(R.string.createview);
        LinearLayout.addView(createView);
    }

    @SuppressLint("ResourceType")
    @Override
    protected void onStart() {
        super.onStart();
        TextView startView = new TextView(this);
        LinearLayout LinearLayout = (LinearLayout) findViewById(R.id.LinearLayout);
        startView.setText(R.string.startview);
        LinearLayout.addView(startView);
    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView stopView = new TextView(this);
        LinearLayout LinearLayout = (LinearLayout) findViewById(R.id.LinearLayout);
        stopView.setText(R.string.stopview);
        LinearLayout.addView(stopView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TextView destroyView = new TextView(this);
        LinearLayout LinearLayout = (LinearLayout) findViewById(R.id.LinearLayout);
        destroyView.setText(R.string.destroyview);
        LinearLayout.addView(destroyView);
    }
}