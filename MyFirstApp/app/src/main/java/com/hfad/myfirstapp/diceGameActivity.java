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
    int rollCount = 0, prevRoll;
    TextView firstNumber,lastNumber, infoBox, dividerBox;
    View halfLayout;
    ImageButton returnBtn;
    Button diceButton;
    int roll;
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

        diceButton.setVisibility(View.INVISIBLE);

        for(int i = 0; i < btn.length; i++){
            btn[i] = (Button) findViewById(btn_id[i]);
            btn[i].setOnClickListener(this);
        }


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
                roll = 1;
                break;
            case R.id.button2:
                roll = 2;
                break;
            case R.id.button3:
                roll = 3;
                break;
            case R.id.button4:
                roll = 4;
                break;
            case R.id.button5:
                roll = 5;
                break;
                case R.id.button6:
                    roll = 6;
                    break;
            case R.id.button7:
                roll = 7;
                break;
                case R.id.button8:
                    roll = 8;
                    break;
                    case R.id.button9:
                        roll = 9;
                        break;


        }
        onRollDice(v);
    }

    private void switchActivity(){
        Intent intent = new Intent(this , higherLowerActivity.class);
        startActivity(intent);
    }

    public void onRollDice(View view){
        boolean fromBtn = false;
        for(int id : btn_id){
            if(view.getId() == id){
                fromBtn = true;
            }
        }

        if(!fromBtn) {
            roll = (int) (Math.random() * 9) + 1;

            if(Settings.isDiceGame){
            if(prevRoll == 5 && Math.abs(prevRoll-roll) <=2 && roll != 5){
                int ran = (int)(Math.random()*2)+1;
                if(prevRoll-roll < 0) {
                    System.out.print(roll);

                    roll =  roll + ran;
                    System.out.println("+"+ran + "  " +roll);

                }
                else {
                    System.out.print(roll);
                    roll =  roll - ran;
                    System.out.println("-" + ran+"  " +roll);
                }
            }
            }

        }
        String i = Integer.toString(roll);
        //numberTxt.setText(""+i);
        if(rollCount % 2 == 1) {
            //show both numbers
            halfLayout.setVisibility(view.VISIBLE);
            String difference = rollDifference(prevRoll,roll);
            firstNumber.setText(Integer.toString(prevRoll));
            dividerBox.setText("-");
            lastNumber.setText(Integer.toString(roll));
            infoBox.setText(difference);
            firstNumber.setVisibility(view.VISIBLE);
            lastNumber.setVisibility(view.VISIBLE);
            infoBox.setVisibility(view.VISIBLE);
            diceButton.setVisibility(View.INVISIBLE);
                for(Button b : btn){
                    b.setVisibility(View.VISIBLE);
                }

        } else {
            firstNumber.setVisibility(view.INVISIBLE);
            lastNumber.setVisibility(view.INVISIBLE);
            infoBox.setVisibility(view.INVISIBLE);
            halfLayout.setVisibility(view.INVISIBLE);
            dividerBox.setText(i);
            diceButton.setVisibility(View.VISIBLE);
                for(Button b : btn){
                    b.setVisibility(View.INVISIBLE);
                }
        }
        prevRoll = roll;
        rollCount++;
    }

    private String rollDifference(int prevRoll, int roll){
        int diff = prevRoll-roll;
        if (diff == 0){
            return "Dealer Drikker!\nByt!";
        }
        return "Drik: " + Integer.toString(diff).replace("-","") + " Tåre!";
    }

    public void onReturn(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}