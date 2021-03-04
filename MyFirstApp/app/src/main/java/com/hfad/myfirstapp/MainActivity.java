package com.hfad.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends Activity {
    private CardHandler core = new CardHandler();
    Button cardButton;
    TextView devBox;
    TextView categoryBox;
    boolean firstTime;
    static boolean startMusic = true;

    ImageButton settingsBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        firstTime = true;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(startMusic) {
            startService(new Intent(this, MyService.class));
            startMusic = false;
        }
        cardButton = findViewById(R.id.switch_card);
        final ImageButton ib = findViewById(R.id.settingsBtn);
        final ImageButton ib1 = findViewById(R.id.diceBtn);
        categoryBox = findViewById(R.id.cardCategory);
        categoryBox.setVisibility(View.INVISIBLE);
        setBtnSize(ib);
        setBtnSize(ib1);
        devBox = findViewById(R.id.devbox);
        settingsBtn = findViewById(R.id.settingsBtn);
        if(Settings.isDevBoxActivated) {
            devBox.setVisibility(View.VISIBLE);
        } else {
            devBox.setVisibility(View.INVISIBLE);
        }

        settingsBtn.setOnClickListener(new DoubleClickListener() {

            @Override
            public void onSingleClick(View v) {
                if(firstTime){
                    onClickSettings(v);
                }
            }

            @Override
            public void onDoubleClick(View v) {
                onClickSettings(v);
            }
        });

    }
    public void openDiceGame(View view){
        Intent intent = new Intent(this, diceGameActivity.class);
        startActivity(intent);

    }

    private void setBtnSize(ImageButton b){
        // Get the last ImageButton's layout parameters
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) b.getLayoutParams();
        // Set the height of this ImageButton
        params.height = 100;
        // Set the width of that ImageButton
        params.width = 100;
        // Apply the updated layout parameters to last ImageButton
        b.setLayoutParams(params);
        // Set the ImageButton image scale type for fourth ImageButton
        b.setScaleType(ImageView.ScaleType.FIT_XY);
    }

   public void onClickSwitchCard(View view) {
        if(firstTime) {
            stopService(new Intent(this, MyService.class));
            settingsBtn.setImageResource(0);
            findViewById(R.id.diceBtn).setVisibility(View.INVISIBLE);
            categoryBox.setVisibility(View.VISIBLE);
            cardButton.setText("Skift Kort");
            firstTime = false;
        }
        TextView brands = findViewById(R.id.promptView);
        Card card = core.switchCards();
        categoryBox.setText(card.getCategory());
        ConstraintLayout background = findViewById(R.id.background);
        TextView devBox = findViewById(R.id.devbox);
        background.setBackgroundColor(Color.parseColor(card.getbColor()));
        //updates devbox
        if(devBox.isShown()){
            devBox.setText(core.updateDevbox());
        }

        brands.setText(card.displayCard());
    }

    public void onClickSettings(View view){
        Intent intent = new Intent(this, settingsActivity.class);
        startActivity(intent);

    }


}