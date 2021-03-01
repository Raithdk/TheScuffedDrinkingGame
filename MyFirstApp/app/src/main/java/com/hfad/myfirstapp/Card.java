package com.hfad.myfirstapp;

import android.graphics.Color;

public class Card {
    String cardPrompt;
    String bColor;
    String category;

    public Card(String text, String category, String hColor){
        this.cardPrompt = text;
        this.bColor = hColor;
        this.category = category;

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

    public String getCategory() { return category; }
}
