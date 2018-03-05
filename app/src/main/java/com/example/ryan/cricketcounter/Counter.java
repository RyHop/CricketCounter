package com.example.ryan.cricketcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Counter extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
    }
    public void resetMatch(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayTeamBScore(teamBScore);
        displayTeamAScore(teamAScore);

    }

    public void run(View view){
        teamAScore +=1;
        displayTeamAScore(teamAScore);



    }
    public void fourer(View view){
        teamAScore +=4;
        displayTeamAScore(teamAScore);

    }

    public void sixer(View view){
        teamAScore +=6;
        displayTeamAScore(teamAScore);

    }
    public void runB(View view){
        teamBScore +=1;
        displayTeamBScore(teamBScore);

    }
    public void fourerB(View view){
        teamBScore +=4;
        displayTeamBScore(teamBScore);
    }

    public void sixerB(View view){
        teamBScore +=6;
        displayTeamBScore(teamBScore);

    }
    public void displayTeamAScore(int teamAScore){
        TextView scoreView =  (TextView) findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(teamAScore));

    }
    public void displayTeamBScore(int teamBScore){
        TextView scoreView =  (TextView) findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(teamBScore));

    }
}
