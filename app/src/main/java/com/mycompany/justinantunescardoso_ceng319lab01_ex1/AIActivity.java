package com.mycompany.justinantunescardoso_ceng319lab01_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        TextView createView = new TextView(this);
        createView.setText(R.string.createView);
        linearLayout.addView(createView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView startView = new TextView(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        startView.setText(R.string.startView);
        linearLayout.addView(startView);
    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView stopView = new TextView(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        stopView.setText(R.string.stopView);
        linearLayout.addView(stopView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TextView destroyView = new TextView(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        destroyView.setText(R.string.destroyView);
        linearLayout.addView(destroyView);
    }
}