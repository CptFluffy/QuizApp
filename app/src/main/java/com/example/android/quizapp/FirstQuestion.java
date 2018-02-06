package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

/**
 * Created by For on 4/14/2017.
 */

public class FirstQuestion extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_question);

    }

    int score = 0;

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        System.out.println(score);
        System.out.println(view.getId());
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.first:
                if (checked)
                    break;
            case R.id.second:
                if (checked)
                    break;
            case R.id.third:
                if (checked)
                break;
            case R.id.forth:
                if (checked)
                    break;
            case R.id.fifth:
                if (checked)
                    break;
        }
    }


    public void nextQuestion(View view) {
        RadioButton checked = (RadioButton) findViewById(R.id.third);
        if (checked.isChecked()) {
            score++;
        }
        Intent i = new Intent(this, SecondQuestion.class);
        Bundle bundle = new Bundle();
        bundle.putInt("SCORE", score);
        i.putExtras(bundle);
        startActivity(i);
    }


}