package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_title);
        textView = (TextView) findViewById(R.id.text);

    }

    public void start(View View){
        Intent ganesh = new Intent(this, FirstQuestion.class);
        startActivity(ganesh);
    }
}