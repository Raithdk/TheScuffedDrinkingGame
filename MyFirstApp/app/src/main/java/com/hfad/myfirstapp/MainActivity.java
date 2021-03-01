package com.hfad.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends Activity {
    private CardHandler core = new CardHandler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, MyService.class));

        final ImageButton ib = findViewById(R.id.settingsBtn);
        // Get the last ImageButton's layout parameters
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) ib.getLayoutParams();
        // Set the height of this ImageButton
        params.height = 200;
        // Set the width of that ImageButton
        params.width = 200;
        // Apply the updated layout parameters to last ImageButton
        ib.setLayoutParams(params);
        // Set the ImageButton image scale type for fourth ImageButton
        ib.setScaleType(ImageView.ScaleType.FIT_XY);

    }

    public void onClickSwitchCard(View view) {
        stopService(new Intent(this, MyService.class));
        TextView brands = findViewById(R.id.promptView);
        Card card = core.switchCards();
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