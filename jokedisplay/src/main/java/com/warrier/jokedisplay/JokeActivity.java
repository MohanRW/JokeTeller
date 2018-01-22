package com.warrier.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Galahad on 06/12/2017.
 */

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "joke_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);

        TextView jokeTextView = (TextView) findViewById(R.id.joke_textview);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
