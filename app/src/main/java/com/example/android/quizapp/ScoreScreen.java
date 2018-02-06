package com.example.android.quizapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Fluffy on 03.02.2018.
 */

public class ScoreScreen extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_screen);

        Bundle bundle = getIntent().getExtras();
        this.score = bundle.getInt("SCORE", 0);

        TextView show = (TextView) findViewById(R.id.score);
        show.setText(score + " out of 10");
    }

    int score;

}
