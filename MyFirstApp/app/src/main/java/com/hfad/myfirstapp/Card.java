package com.hfad.myfirstapp;

public class Card {
    private String cardPrompt;
    private String bColor;
    private String category;

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

    public String getCardPrompt(){ return cardPrompt; }

    public void setCardPrompt(String replacement){
        this.cardPrompt = replacement;
    }

}
