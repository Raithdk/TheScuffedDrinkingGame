package com.hfad.myfirstapp;

public class DrinkCard extends Card {
    private int sips = 0;


    //Set amount of sips
    public DrinkCard(String text, String hColor, int sips){
        super(text, hColor);
        this.sips = sips;

    }

    //Random amount of sips between lowSips and HiSips
    public DrinkCard(String text, String hColor, int lowSips, int hiSips){
        super(text, hColor);
        this.sips = (int) (Math.random() * (hiSips - lowSips) + lowSips);

    }

    @Override
    public String displayCard(){
        if (cardPrompt.contains("/x")) {
            String[] splitPrompt = super.cardPrompt.split("/x");
            return splitPrompt[0] + sips + splitPrompt[1];
        }
        return cardPrompt + "Test";

    }
}
