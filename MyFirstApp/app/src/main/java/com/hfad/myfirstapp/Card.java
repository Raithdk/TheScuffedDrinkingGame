package com.hfad.myfirstapp;

import android.graphics.Color;

public class Card {
    String cardPrompt;
    String bColor;

    public Card(String text, String hColor){
        this.cardPrompt = text;
        this.bColor = hColor;

    }

    @Override
    public String toString() {
        return "Card{" +
                "cardPrompt='" + cardPrompt + '\'' +
                '}';
    }

    public String getbColor(){
        return bColor;
    }


    public String displayCard(){
        return cardPrompt;
    }
}
