package com.hfad.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class diceGameActivity extends Activity implements View.OnClickListener {
    int rollCount = 0, prevRoll, prevGuess;
    TextView firstNumber,lastNumber, infoBox, dividerBox, guessView, guessSum, outcomeView;
    View halfLayout;
    ConstraintLayout layout;
    ImageButton returnBtn;
    Button diceButton, btn_unfocus;
    boolean btn_is_focus = false;
    int roll, guess, difference;
    private int[] btn_id = {R.id.button, R.id.button2, R.id.button3, R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9};
    private Button[] btn = new Button[btn_id.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_game);
        dividerBox = findViewById(R.id.numberDivider);
        firstNumber = findViewById(R.id.fNumberView);
        lastNumber = findViewById(R.id.lNumberView);
        infoBox = findViewById(R.id.infoView);
        halfLayout = findViewById(R.id.halfView);
        returnBtn = findViewById(R.id.returnBtn);
        diceButton = findViewById(R.id.diceRollBtn);
        layout = findViewById(R.id.diceBackground);
        guessView = findViewById(R.id.diceGuessView);
        guessSum = findViewById(R.id.guessSum);
        outcomeView = findViewById(R.id.outcomeView);

        for(int i = 0; i < btn.length; i++){
            btn[i] = findViewById(btn_id[i]);
            btn[i].setOnClickListener(this);
        }
        btn_unfocus = btn[0];

        dividerBox.setOnClickListener(new DoubleClickListener() {

            @Override
            public void onSingleClick(View v) {
            }

            @Override
            public void onDoubleClick(View v) {
                switchActivity();
            }
        });


        final ImageButton ib = returnBtn;
        // Get the last ImageButton's layout parameters
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) ib.getLayoutParams();
        // Set the height of this ImageButton
        params.height = 100;
        // Set the width of that ImageButton
        params.width = 100;
        // Apply the updated layout parameters to last ImageButton
        ib.setLayoutParams(params);
        // Set the ImageButton image scale type for fourth ImageButton
        ib.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                guess = 1;
                setFocus(btn_unfocus, btn[guess-1]);
                break;
            case R.id.button2:
                guess = 2;
                setFocus(btn_unfocus, btn[guess-1]);
                break;
            case R.id.button3:
                guess = 3;
                setFocus(btn_unfocus, btn[guess-1]);
                break;
            case R.id.button4:
                guess = 4;
                setFocus(btn_unfocus, btn[guess-1]);
                break;
            case R.id.button5:
                guess = 5;
                setFocus(btn_unfocus, btn[guess-1]);
                break;
                case R.id.button6:
                    guess = 6;
                    setFocus(btn_unfocus, btn[guess-1]);

                    break;
            case R.id.button7:
                guess = 7;
                setFocus(btn_unfocus, btn[guess-1]);
                break;
                case R.id.button8:
                    guess = 8;
                    setFocus(btn_unfocus, btn[guess-1]);
                    break;
                    case R.id.button9:
                        guess = 9;
                        setFocus(btn_unfocus, btn[guess-1]);
                        break;


        }
    }

    private void setFocus(Button btn_unfocus, Button btn_focus){
        btn_unfocus.setBackground(getResources().getDrawable(R.drawable.purple_corner));
        btn_focus.setBackground(getResources().getDrawable(R.drawable.purple_corner_focus));
        this.btn_unfocus = btn_focus;
        btn_is_focus = true;
    }

    private void switchActivity(){
        Intent intent = new Intent(this , higherLowerActivity.class);
        startActivity(intent);
    }

    public void onRollDice(View view){
            roll = (int) (Math.random() * 9) + 1;



            if(btn_is_focus) {

                btn_is_focus = false;
                btn_unfocus.setBackground(getResources().getDrawable(R.drawable.purple_corner));
                String i = Integer.toString(roll);
                //numberTxt.setText(""+i);
                if (rollCount % 2 == 1) {
                    btn[prevGuess-1].setVisibility(view.VISIBLE);
                    if(Settings.isDiceGame){
                        //if guessing 5 second time (highest prob for low sips)
                        if(guess == 5){

                            while(Math.abs(roll-guess) <= 2){
                                //while difference is 2 or under
                                roll = (int) (Math.random() * 9) + 1;
                            }}
                    }
                    //show both numbers
                    while(roll == prevGuess){
                        roll = (int) (Math.random() * 9) + 1;
                    }
                    if(roll == guess){
                        //Hvis man gætter rigtig anden gang
                        layout.setBackgroundColor(Color.parseColor("#019053"));
                        firstNumber.setText(Integer.toString(guess));
                        dividerBox.setText("-");
                        lastNumber.setText(Integer.toString(prevGuess));
                    } else{
                        layout.setBackgroundColor(Color.parseColor("#e05353"));
                        firstNumber.setText(Integer.toString(guess));
                        dividerBox.setText("-");
                        lastNumber.setText(Integer.toString(roll));
                    }
                    guessSum.setText("Runde 1\nGæt: "+prevGuess + " Slag: " + prevRoll);
                    outcomeView.setText("Runde 2\nGæt: "+guess + " Slag: " + roll);

                    guessView.setText("Begynd igen!");
                    //halfLayout.setVisibility(view.VISIBLE);
                    String difference = rollDifference(guess, roll);

                    infoBox.setText(difference);
                    firstNumber.setVisibility(view.VISIBLE);
                    lastNumber.setVisibility(view.VISIBLE);
                    infoBox.setVisibility(view.VISIBLE);
                    outcomeView.setVisibility(view.VISIBLE);
                    guessSum.setVisibility(view.VISIBLE);

                } else {
                    //first round
                    btn[guess-1].setVisibility(view.INVISIBLE);
                    if(roll == guess){
                        //Hvis man gætter rigtig første gang
                        layout.setBackgroundColor(Color.parseColor("#f9ef77"));
                        infoBox.setText("Byt!");
                    }else{
                        layout.setBackgroundColor(Color.parseColor("#e05353"));
                        infoBox.setText("Forkert!");
                    }
                    guessView.setText("You guessed: " + guess);
                    firstNumber.setVisibility(view.INVISIBLE);
                    lastNumber.setVisibility(view.INVISIBLE);
                    outcomeView.setVisibility(view.INVISIBLE);
                    guessSum.setVisibility(view.INVISIBLE);
                    halfLayout.setVisibility(view.INVISIBLE);
                    dividerBox.setText(i);

                }
                prevRoll = roll;
                prevGuess = guess;
                rollCount++;
            }
    }

    private String rollDifference(int prevRoll, int roll){
        int diff = Math.abs(prevRoll-roll);
        String output;

        if (diff == 0){
            output = "Dealer drikker: ";
            diff = Math.abs(prevGuess - guess);
        } else{
            output =  "Spiller drikker: ";
        }
        if(diff>1){
            return output + diff + " Tår!";
        }
        return output + diff + " Tåre!";
    }

    public void onReturn(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}