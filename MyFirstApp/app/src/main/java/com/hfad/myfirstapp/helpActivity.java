package com.hfad.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class helpActivity extends Activity {
public int test;
TextView helpText;
int drinkID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        test = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        helpText = findViewById(R.id.helpTextView);

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
        Intent intent = new Intent(this, settingsActivity.class);
        startActivity(intent);
    }

    public void onHelpCat(View view){


        if (view.getId() == findViewById(R.id.drinkHelpBtn).getId()){
            helpText.setText(StringMetadata.getHelpText(0));
            return;
        }
        if (view.getId() == findViewById(R.id.neutralHelpBtn).getId()){
            helpText.setText(StringMetadata.getHelpText(1));
            return;
        }
        if (view.getId() == findViewById(R.id.voteHelpBtn).getId()){
            helpText.setText(StringMetadata.getHelpText(2));
            return;
        }
        if (view.getId() == findViewById(R.id.truthHelpBtn).getId()){
            helpText.setText(StringMetadata.getHelpText(3));
            return;
        }
        if (view.getId() == findViewById(R.id.neverHelpBtn).getId()){
            helpText.setText(StringMetadata.getHelpText(4));
            return;
        }
        if (view.getId() == findViewById(R.id.dareHelpBtn).getId()){
            helpText.setText(StringMetadata.getHelpText(5));
            return;
        }
        if (view.getId() == findViewById(R.id.likelyHelpBtn).getId()){
            helpText.setText(StringMetadata.getHelpText(6));
            return;
        }
        if (view.getId() == findViewById(R.id.ruleHelpBtn).getId()){
            helpText.setText(StringMetadata.getHelpText(7));
            return;
        }


    }
}