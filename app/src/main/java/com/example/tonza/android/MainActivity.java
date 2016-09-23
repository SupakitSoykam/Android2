package com.example.tonza.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);

        Button bnt3 = (Button) findViewById(R.id.button_3);
        bnt3.setOnClickListener(this);

        Button bnt4 = (Button) findViewById(R.id.button_4);
        bnt4.setOnClickListener(this);

        Button bnt5 = (Button) findViewById(R.id.button_5);
        bnt5.setOnClickListener(this);

        Button bnt6 = (Button) findViewById(R.id.button_6);
        bnt6.setOnClickListener(this);

        Button bnt7 = (Button) findViewById(R.id.button_7);
        bnt7.setOnClickListener(this);

        Button bnt8 = (Button) findViewById(R.id.button_8);
        bnt8.setOnClickListener(this);

        Button bnt9 = (Button) findViewById(R.id.button_9);
        bnt9.setOnClickListener(this);

        Button bnt0 = (Button) findViewById(R.id.button_0);
        bnt0.setOnClickListener(this);

        Button bnt11 = (Button) findViewById(R.id.clear_button);
        bnt11.setOnClickListener(this);


    }
String textshow = "";
    @Override
    public void onClick(View view) {
        //Toast t = Toast.makeText(this, "Hello", Toast.LENGTH_LONG);
        //t.show();
        TextView tv = (TextView) findViewById(R.id.digit_text_view);


            int id = view.getId();
            if (id == R.id.button_1) {
                textshow = textshow+"1";
                tv.setText(textshow);
            } else if (id == R.id.button_2) {
                textshow = textshow+"2";
                tv.setText(textshow);
            } else if (id == R.id.button_3) {
                textshow = textshow+"3";
                tv.setText(textshow);
            } else if (id == R.id.button_4) {
                textshow = textshow+"4";
                tv.setText(textshow);
            } else if (id == R.id.button_5) {
                textshow = textshow+"5";
                tv.setText(textshow);
            } else if (id == R.id.button_6) {
                textshow = textshow+"6";
                tv.setText(textshow);
            } else if (id == R.id.button_7) {
                textshow = textshow+"7";
                tv.setText(textshow);
            } else if (id == R.id.button_8) {
                textshow = textshow+"8";
                tv.setText(textshow);
            } else if (id == R.id.button_9) {
                textshow = textshow+"9";
                tv.setText(textshow);
            } else if (id == R.id.button_0) {
                textshow = textshow+"0";
                tv.setText(textshow);
            } else if (id == R.id.clear_button) {
                textshow = "";
                tv.setText("");
            }



    }
}
