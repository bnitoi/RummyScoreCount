package com.example.android.rummycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int rounds = 0;
    int pinkTemporal = 0;
    int pinkTotal = 0;
    int yellowTemporal = 0;
    int yellowTotal = 0;
    int greenTemporal = 0;
    int greenTotal = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** number of rounds */

    public void plus (View v) {
        rounds = rounds + 1;
        displayTotalRounds(rounds);
    }

    public void displayTotalRounds(int score) {
        TextView scoreView = (TextView) findViewById(R.id.number_rounds);
        scoreView.setText(String.valueOf(score));
    }

    /** pink job */

    public void add_100_pink (View v) {
        pinkTemporal = pinkTemporal + 100;
        displayTemporalPink(pinkTemporal);
    }

    public void add_50_pink (View v) {
        pinkTemporal = pinkTemporal + 50;
        displayTemporalPink(pinkTemporal);
    }

    public void add_10_pink (View v) {
        pinkTemporal = pinkTemporal + 10;
        displayTemporalPink(pinkTemporal);
    }

    public void add_5_pink (View v) {
        pinkTemporal = pinkTemporal + 5;
        displayTemporalPink(pinkTemporal);
    }

    public void reset_pink (View v) {
        pinkTemporal = 0;
        displayTemporalPink(pinkTemporal);
    }

    public void transfer_pink (View v) {
        pinkTotal = pinkTotal + pinkTemporal;
        pinkTemporal = 0;
        displayTemporalPink(pinkTemporal);
        displayTotalPink(pinkTotal);
    }

    public void displayTemporalPink(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pink_temporal_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTotalPink(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pink_player_score);
        scoreView.setText(String.valueOf(score));
    }

    /** yellow job */

    public void add_100_yellow (View v) {
        yellowTemporal = yellowTemporal + 100;
        displayTemporalYellow(yellowTemporal);
    }

    public void add_50_yellow (View v) {
        yellowTemporal = yellowTemporal + 50;
        displayTemporalYellow(yellowTemporal);
    }

    public void add_10_yellow (View v) {
        yellowTemporal = yellowTemporal + 10;
        displayTemporalYellow(yellowTemporal);
    }

    public void add_5_yellow (View v) {
        yellowTemporal = yellowTemporal + 5;
        displayTemporalYellow(yellowTemporal);
    }

    public void reset_yellow (View v) {
        yellowTemporal = 0;
        displayTemporalYellow(yellowTemporal);
    }

    public void transfer_yellow (View v) {
        yellowTotal = yellowTotal + yellowTemporal;
        yellowTemporal = 0;
        displayTemporalYellow(yellowTemporal);
        displayTotalYellow(yellowTotal);
    }

    public void displayTemporalYellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_temporal_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTotalYellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_player_score);
        scoreView.setText(String.valueOf(score));
    }

    /**green job*/

    public void add_100_green (View v) {
        greenTemporal = greenTemporal + 100;
        displayTemporalGreen(greenTemporal);
    }

    public void add_50_green (View v) {
        greenTemporal = greenTemporal + 50;
        displayTemporalGreen(greenTemporal);
    }

    public void add_10_green (View v) {
        greenTemporal = greenTemporal + 10;
        displayTemporalGreen(greenTemporal);
    }

    public void add_5_green (View v) {
        greenTemporal = greenTemporal + 5;
        displayTemporalGreen(greenTemporal);
    }

    public void reset_green (View v) {
        greenTemporal = 0;
        displayTemporalGreen(greenTemporal);
    }

    public void transfer_green (View v) {
        greenTotal = greenTotal + greenTemporal;
        greenTemporal = 0;
        displayTemporalGreen(greenTemporal);
        displayTotalGreen(greenTotal);
    }

    public void displayTemporalGreen(int score) {
        TextView scoreView = (TextView) findViewById(R.id.green_temporal_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTotalGreen(int score) {
        TextView scoreView = (TextView) findViewById(R.id.green_player_score);
        scoreView.setText(String.valueOf(score));
    }

    /** reset all job    */

    public void reset_all (View v) {
        rounds = 0;
        pinkTemporal = 0;
        yellowTemporal = 0;
        greenTemporal = 0;
        pinkTotal = 0;
        yellowTotal = 0;
        greenTotal = 0;
        displayTotalRounds(rounds);
        displayTemporalPink(pinkTemporal);
        displayTemporalYellow(yellowTemporal);
        displayTemporalGreen(greenTemporal);
        displayTotalPink(pinkTotal);
        displayTotalYellow(yellowTotal);
        displayTotalGreen(greenTotal);
    }
}

