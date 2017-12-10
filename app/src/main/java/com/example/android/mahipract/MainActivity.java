package com.example.android.mahipract;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Bujji, Chinnu and Bunnu!");
        textView.setTextSize(56);
        textView.setTextColor(Color.GREEN);
        setContentView(textView);
    }
}
