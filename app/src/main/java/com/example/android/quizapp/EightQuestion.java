package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

public class EightQuestion extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eight_question);

        Bundle bundle = getIntent().getExtras();
        this.score = bundle.getInt("SCORE", 0);
    }

    private int score;

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
        RadioButton checked = (RadioButton) findViewById(R.id.second);
        if (checked.isChecked()) {
            score++;
        }

        Intent i = new Intent(this, NinthQuestion.class);
        Bundle bundle = new Bundle();
        bundle.putInt("SCORE", score);
        i.putExtras(bundle);
        startActivity(i);
    }
}
