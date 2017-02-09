package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button aPoint3Btn,aPoint2Btn,aFreeThrowBtn,bPoint3Btn,bPoint2Btn,bFreeThrowBtn, resetBtn;
    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialisation();
    }

    public void initialisation()
    {
        aPoint3Btn = (Button) findViewById(R.id.aPoint3Btn);
        aPoint2Btn = (Button) findViewById(R.id.aPoint2Btn);
        aFreeThrowBtn = (Button) findViewById(R.id.aFreeThrowBtn);
        bPoint3Btn = (Button) findViewById(R.id.bPoint3Btn);
        bPoint2Btn = (Button) findViewById(R.id.bPoint2Btn);
        bFreeThrowBtn = (Button) findViewById(R.id.bFreeThrowBtn);
        resetBtn = (Button) findViewById(R.id.resetBtn);
    }

    public void bAddThreeBtn(View v)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void bAddTwoBtn(View v)
    {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void bFreeThrowBtn(View v)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void aAddThreeBtn(View v)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void aAddTwoBtn(View v)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void aFreeThrowBtn(View v)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
