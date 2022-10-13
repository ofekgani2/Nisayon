package com.example.nisayon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_title;
    Button btn_press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_title = findViewById(R.id.tv_title);
        btn_press = findViewById(R.id.btn_press);
        btn_press.setOnClickListener(view -> tv_title.setText("hey natali, i love u"));


    }
}