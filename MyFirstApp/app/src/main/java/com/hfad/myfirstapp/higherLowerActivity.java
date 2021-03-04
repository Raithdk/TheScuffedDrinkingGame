package com.hfad.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class higherLowerActivity extends Activity {
    Button startBtn, lowerBtn, higherBtn;
    int prevRoll, correctCounter, winCondition;
    TextView numberView, guessView, streakView, rangeView;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_higher_lower);
        winCondition = Settings.getHiSips();

        guessView = findViewById(R.id.guessView);
        streakView = findViewById(R.id.streakView);
        rangeView = findViewById(R.id.rangeView);
        layout = findViewById(R.id.higherLower);
        numberView = findViewById(R.id.numberView);
        startBtn = findViewById(R.id.startBtn);
        lowerBtn = findViewById(R.id.lowerBtn);
        higherBtn = findViewById(R.id.higherBtn);

        rangeView.setText(rangeView.getText().toString().concat("\nGoal: " + winCondition + " Wins" ));
    }

    public void onStart(View view){
        startBtn.setVisibility(View.INVISIBLE);
        lowerBtn.setVisibility(View.VISIBLE);
        higherBtn.setVisibility(View.VISIBLE);
        prevRoll = (int) (Math.random() * 10)+1;
        numberView.setText(Integer.toString(prevRoll));

    }
    public void onRoll(View view){
        int roll = (int) (Math.random() * 10)+1;
        numberView.setText(Integer.toString(roll));
        String streakString;

        if ((view.getId() == findViewById(R.id.lowerBtn).getId() && roll < prevRoll) || (view.getId() == findViewById(R.id.higherBtn).getId() && roll > prevRoll))
        {
            //correct
            correctCounter++;
            streakString = "\nYou need: " + (winCondition - correctCounter) + " more to switch!";
            layout.setBackgroundColor(Color.parseColor("#019053"));
            guessView.setText("");
            if (correctCounter == winCondition){
                restart();
                guessView.setText("You guessed " + correctCounter + " in a row!");
                correctCounter= 0;
                streakView.setText("Streak : " + correctCounter);
                numberView.setText("Switch!");
                return;
            } else{
                guessView.setText("Correct!" + streakString);
            }
        }
        else if(prevRoll - roll == 0)
        {
            numberView.setText("Cheers!");
            restart();

        }
        else
        {
            //incorrect
            streakString = "\nYour streak was : " + correctCounter;
            correctCounter = 0;
            layout.setBackgroundColor(Color.parseColor("#e05353"));
            guessView.setText("Wrong!" + streakString);
        }
        streakView.setText("Streak : " + correctCounter);

        prevRoll = roll;
    }

    private void restart(){
        startBtn.setVisibility(View.VISIBLE);
        lowerBtn.setVisibility(View.INVISIBLE);
        higherBtn.setVisibility(View.INVISIBLE);
        layout.setBackgroundColor(Color.parseColor("#f9ef77"));
        startBtn.setText("Roll!");
    }
}