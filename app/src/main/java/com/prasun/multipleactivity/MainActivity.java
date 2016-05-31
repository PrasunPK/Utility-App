package com.prasun.multipleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = (Button) findViewById(R.id.buttonActOne);

        if(buttonOne != null) {
            buttonOne.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    EditText actOneText = (EditText) findViewById(R.id.act_one_name);
                    String input_text = actOneText.getText().toString();

                    Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
                    intent.putExtra("user-name", input_text);
                    intent.putExtra("user-location", "Chennai");
                    startActivity(intent);
                }
            });
        }
    }
}
