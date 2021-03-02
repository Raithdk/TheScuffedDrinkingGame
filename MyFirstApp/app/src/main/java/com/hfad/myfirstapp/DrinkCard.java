package com.hfad.myfirstapp;

public class DrinkCard extends Card {
    private int sips = (int)(Math.random() * (Settings.getHiSips() - Settings.getLowSips()) + Settings.getLowSips());


    //Use user defined sips
    public DrinkCard(String text, String category, String hColor){
        super(text, category, hColor);
    }

    //Set amount of sips
    public DrinkCard(String text, String category, String hColor, int sips){
        super(text, category, hColor);
        this.sips = sips;
    }

    //Random amount of sips between lowSips and HiSips
    public DrinkCard(String text, String category, String hColor,  int lowSips, int hiSips){
        super(text, category, hColor);
        this.sips = (int) (Math.random() * (hiSips - lowSips) + lowSips);

    }

    @Override
    public String displayCard(){
        if(this.sips == 1 && super.cardPrompt.contains("tåre")){
            super.setCardPrompt(super.cardPrompt.replace("tåre","tår"));
        }
        if (cardPrompt.contains("/x")) {
            String[] splitPrompt = super.cardPrompt.split("/x");
            return splitPrompt[0] + sips + splitPrompt[1];
        }
        return cardPrompt + "Test";

    }

    public int getSips() {
        return sips;
    }
}
