package com.prasun.multipleactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        String name = getIntent().getStringExtra("user-name");
        String location = getIntent().getStringExtra("user-location");

        TextView textLabel = (TextView) findViewById(R.id.textViewActTwo);
        textLabel.setText("Name : " + name +" " + "Location : "+ location);
    }
}
