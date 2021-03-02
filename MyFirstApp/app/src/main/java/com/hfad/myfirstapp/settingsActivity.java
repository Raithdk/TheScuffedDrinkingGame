package com.hfad.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import org.florescu.android.rangeseekbar.RangeSeekBar;

public class settingsActivity extends Activity {

    RangeSeekBar rangeSeekBar;
    TextView gamemodeView;
    TextView gamemodeLabel;
    CheckBox rNeutral,rDrink,rVote, rDare, rPoint,rTruth,rRule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        rangeSeekBar = findViewById(R.id.drinkRange);
        rangeSeekBar.setSelectedMaxValue(Settings.getHiSips());
        rangeSeekBar.setSelectedMinValue(Settings.getLowSips());
        gamemodeView = findViewById(R.id.gamemode);
        gamemodeView.setText(updateGamemode((int) rangeSeekBar.getSelectedMinValue(),(int) rangeSeekBar.getSelectedMaxValue()));

        gamemodeLabel = findViewById(R.id.gamemodeLabel);

        rNeutral = findViewById(R.id.neutralRadio);
        rDrink = findViewById(R.id.drinkRadio);
        rDare = findViewById(R.id.dareRadio);
        rVote = findViewById(R.id.voteRadio);
        rPoint = findViewById(R.id.pointRadio);
        rTruth = findViewById(R.id.truthRadio);
        rRule = findViewById(R.id.ruleRadio);

        rNeutral.setChecked(Settings.isNeutralCard);
        rDrink.setChecked(Settings.isDrinkCard);
        rDare.setChecked(Settings.isDareCard);
        rVote.setChecked(Settings.isVoteCard);
        rPoint.setChecked(Settings.isPointCard);
        rTruth.setChecked(Settings.isTruthCard);
        rRule.setChecked(Settings.isRuleCard);

        gamemodeLabel.setOnClickListener(new DoubleClickListener() {

            @Override
            public void onSingleClick(View v) {

            }

            @Override
            public void onDoubleClick(View v) {
                Settings.isDevBoxActivated = !Settings.isDevBoxActivated;
            }
        });


        rangeSeekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
            @Override
            public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {
                int lowRange = (int) bar.getSelectedMinValue();
                int highRange = (int) bar.getSelectedMaxValue();
                String gamemode = updateGamemode(lowRange,highRange);
                gamemodeView.setText(gamemode);
                Settings.setGamemode(gamemode);

            }
        });

        final ImageButton ib = findViewById(R.id.returnBtn);
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

    public void onReturn(View view){
        onSave(view);
    }

    public void onSave(View view){

        int lowLimitInt = (int) rangeSeekBar.getSelectedMinValue();
        int highLimitInt = (int) rangeSeekBar.getSelectedMaxValue();
        Settings.setLowSips(lowLimitInt);
        Settings.setHiSips(highLimitInt);

        Settings.setIsNeutralCard(rNeutral.isChecked());
        Settings.setIsDrinkCard(rDrink.isChecked());
        Settings.setIsDareCard(rDare.isChecked());
        Settings.setIsVoteCard(rVote.isChecked());
        Settings.setIsPointCard(rPoint.isChecked());
        Settings.setIsTruthCard(rTruth.isChecked());
        Settings.setIsRuleCard(rRule.isChecked());

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }

        private String updateGamemode(int low, int high){
            if(high == 10 && low ==1){
                return "Death";
            }
            //gambler gamemode
            if (high-low >= 5){
                if (high > 7) {
                    return "High-Stakes Gambler";
                } else if (high < 7){
                    return "Low-Stakes Gambler";
                } else{
                    return "Gambler";
                }
            }
            if ((high > 7 && low > 4) && (high-low < 5)){
                return "Alcoholic mode";
            }
            if(high <= 3){
                return "Pussy Mode";
            }
            if(high > 7 && low >4){
                return "Are you thinking straight?";
            }
            if(high <= 5 && low <=2 ){
                return "Normal Mode";
            }
            if(high >3){
                return "Rough";
            }

            return "Testing New Waters";
        }
}