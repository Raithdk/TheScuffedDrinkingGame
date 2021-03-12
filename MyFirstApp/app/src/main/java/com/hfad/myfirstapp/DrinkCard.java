package com.hfad.myfirstapp;

public class DrinkCard extends Card {
    private int sips = (int)(Math.random() * ((Settings.getHiSips()+1) - Settings.getLowSips()) + Settings.getLowSips());


    //Use user defined sips
    public DrinkCard(String text, String category, String hColor){
        super(text, category, hColor);
    }

    //Set amount of sips
    public DrinkCard(String text, String category, String hColor, int sips){
        this(text, category, hColor);
        this.sips = sips;
        if(this.sips == 1 && text.contains("tåre")){
            super.setCardPrompt(text.replace("tåre","tår"));
        }
        if (text.contains("/x")) {
            String[] splitPrompt = text.split("/x");
            super.setCardPrompt( splitPrompt[0] + sips + splitPrompt[1] );
        }


    }

    //Random amount of sips between lowSips and HiSips
    public DrinkCard(String text, String category, String hColor,  int lowSips, int hiSips){
        this(text, category, hColor, (int) (Math.random() * (hiSips - lowSips) + lowSips));

    }

    @Override
    public String displayCard(){
        return getCardPrompt();

    }

    public int getSips() {
        return sips;
    }
}
