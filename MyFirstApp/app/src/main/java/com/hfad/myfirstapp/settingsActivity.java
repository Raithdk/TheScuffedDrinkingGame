package com.hfad.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

public class settingsActivity extends Activity {
    EditText lowLimit;
    EditText highLimit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
         lowLimit = findViewById(R.id.lowSipsNum);
         highLimit = findViewById(R.id.highSipNum);
        lowLimit.setText(Integer.toString(Settings.getLowSips()));
        highLimit.setText(Integer.toString(Settings.getHiSips()));

        final ImageButton ib = findViewById(R.id.returnBtn);
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

    public void onReturn(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onSave(View view){
        if(lowLimit.getText().toString().equals("") || highLimit.getText().toString().equals("")){
            Toast.makeText(this, "ERROR need to fill int boxes", Toast.LENGTH_SHORT).show();
        }else{
        int lowLimitInt = Integer.parseInt(lowLimit.getText().toString());
        int highLimitInt = Integer.parseInt(highLimit.getText().toString());
        if(lowLimitInt > highLimitInt) {
            Toast.makeText(this, "Lower limit needs to be lower than Upper limit", Toast.LENGTH_SHORT).show();
        } else if(10 < highLimitInt){
            highLimit.setText("10");
            Toast.makeText(this, "Upper limit must be 10 or under", Toast.LENGTH_SHORT).show();
        } else {
            Settings.setLowSips(lowLimitInt);
            Settings.setHiSips(highLimitInt);


            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }}
}