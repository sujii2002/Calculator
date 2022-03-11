package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
i

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        EditText i1 = findViewById(R.id.i1);
        EditText i2 = findViewById(R.id.i2);
        EditText i3 = findViewById(R.id.i3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ab = i1.getText().toString();
                float n1 = Float.parseFloat(ab);
                String ba = i2.getText().toString();
                float n2 = Float.parseFloat(ba);
                float c = n1+n2;
                String ans = Float.toString(c);
                i3.setText(ans);


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ab = i1.getText().toString();
                float n1 = Float.parseFloat(ab);
                String ba = i2.getText().toString();
                float n2 = Float.parseFloat(ba);
                float c = n1-n2;
                String ans = Float.toString(c);
                i3.setText(ans);


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ab = i1.getText().toString();
                float n1 = Float.parseFloat(ab);
                String ba = i2.getText().toString();
                float n2 = Float.parseFloat(ba);
                float c = n1*n2;
                String ans = Float.toString(c);
                i3.setText(ans);


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ab = i1.getText().toString();
                float n1 = Float.parseFloat(ab);
                String ba = i2.getText().toString();
                float n2 = Float.parseFloat(ba);
                float c = n1/n2;
                String ans = Float.toString(c);
                i3.setText(ans);


            }
        });


    }
}