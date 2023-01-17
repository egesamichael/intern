package com.praisewebsolutions.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer teamA = 0,teamB=0;
    TextView teamAScore,teamBscore;
    Button plus1, plus2, plus3, reset,plus1B,plus2B,plus3B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamBscore=findViewById(R.id.teamBScore);
        plus1 = findViewById(R.id.teamAbutton1);
        teamAScore = findViewById(R.id.teamAScore);
        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               teamA = teamA + 1;
               teamAScore.setText(""+teamA);

            }
        });

        plus2 = findViewById(R.id.teamAbutton2);
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA = teamA + 2;
                teamAScore.setText(""+teamA);
            }

        });
        plus3=findViewById(R.id.teamAbutton3);
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA=teamA+3;
                teamAScore.setText(""+teamA);
            }
        });

        reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA = 0;
                teamAScore.setText(""+teamA);
                teamB=0;
                teamBscore.setText(""+teamB);
            }
        });

        plus1B=findViewById(R.id.teamBbutton1);
        plus1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB=teamB+1;
                teamBscore.setText(""+teamB);
            }
        });
    }
}