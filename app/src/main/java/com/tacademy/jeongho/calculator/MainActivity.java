package com.tacademy.jeongho.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calText = (TextView)findViewById(R.id.cal_text);

        Button btn = (Button)findViewById(R.id.btn_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("1");
            }
        });

        btn = (Button)findViewById(R.id.btn_2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("2");
            }
        });

        btn = (Button)findViewById(R.id.btn_3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("3");
            }
        });

        btn = (Button)findViewById(R.id.btn_4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("4");
            }
        });

        btn = (Button)findViewById(R.id.btn_5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("5");
            }
        });

        btn = (Button)findViewById(R.id.btn_6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("6");
            }
        });

        btn = (Button)findViewById(R.id.btn_7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("7");
            }
        });

        btn = (Button)findViewById(R.id.btn_8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("8");
            }
        });

        btn = (Button)findViewById(R.id.btn_9);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("9");
            }
        });

        btn = (Button)findViewById(R.id.btn_c);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("");
            }
        });

        btn = (Button)findViewById(R.id.btn_0);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("0");
            }
        });

        btn = (Button)findViewById(R.id.btn_equal);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("=");
            }
        });

        btn = (Button)findViewById(R.id.btn_plus);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("+");
            }
        });

        btn = (Button)findViewById(R.id.btn_minus);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("-");
            }
        });

        btn = (Button)findViewById(R.id.btn_multi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calText.setText("*");
            }
        });

    }
}
