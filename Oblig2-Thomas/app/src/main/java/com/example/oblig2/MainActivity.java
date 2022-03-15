package com.example.oblig2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView myText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link
        myText = (TextView) findViewById(R.id.TextboxID);
        button = (Button) findViewById(R.id.button);

        // Action on button click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myText.setText("Gratulerer du trykket på en knapp");
            }
        });
    }
}