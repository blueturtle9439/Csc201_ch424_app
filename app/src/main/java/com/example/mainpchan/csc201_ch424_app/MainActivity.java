package com.example.mainpchan.csc201_ch424_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {

            EditText city1input =(EditText) findViewById(R.id.city1input);
            EditText city2input =(EditText) findViewById(R.id.city2input);
            EditText city3input =(EditText) findViewById(R.id.city3input);

            TextView output = (TextView) findViewById(R.id.output);


            String[] input = new String[3];

            input[0] = String.valueOf(city1input.getText()).trim();
            input[1] = String.valueOf(city2input.getText()).trim();
            input[2] = String.valueOf(city3input.getText()).trim();

            Arrays.sort(input, String.CASE_INSENSITIVE_ORDER);

            output.setText("The three cities in alphabetical order are " + Arrays.toString(input));

        }
    };
}