package com.hfad.myfirstapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CardHandler {

    String drinkCardColor = "#f57e76",
            neutralCardColor = "#96b4fa",
            truthCardColor = "#beebc2",
            dareCardColor = "#e3c0ed",
            pointCardColor = "#e9edc0";

    private String neutralPrompts = StringMetadata.neutralPrompts;

    private String drinkPrompts = StringMetadata.drinkPrompts;

    private String truthPrompts = StringMetadata.truthPrompts;

    private String darePrompts = StringMetadata.darePrompts;

    private String pointPrompts = StringMetadata.pointPrompts;

    private List<Card> allCards = new ArrayList<>();

    public CardHandler() {

        CreateCards();

        this.allCards = shuffleCards(allCards);
    }

    private void CreateCards() {
        String promptArray[] = neutralPrompts.split("\n");
        String drinkArray[] = drinkPrompts.split("\n");
        String truthArray[] = truthPrompts.split("\n");
        String dareArray[] = darePrompts.split("\n");
        String pointArray[] = pointPrompts.split("\n");

        for (String prompt : promptArray) {
            allCards.add(new Card(prompt, "Neutral", neutralCardColor));
        }

        for (String prompt : drinkArray) {
            String[] drinkCard = splitCard(prompt);
            if (drinkCard.length > 2) {
                allCards.add(new DrinkCard(drinkCard[0], "Drink", drinkCardColor, Integer.parseInt(drinkCard[1]), Integer.parseInt(drinkCard[2])));
            } else {
                allCards.add(new DrinkCard(drinkCard[0], "Drink", drinkCardColor, Integer.parseInt(drinkCard[1])));
            }

        }
        //sandhedskort
        for (String prompt : truthArray) {
            allCards.add(new Card(prompt, "Truth", truthCardColor));
        }
        //konsekvenskort
        for (String prompt : dareArray) {
            allCards.add(new Card(prompt, "Dare", dareCardColor));
        }
        //Pegekort
        for (String prompt : pointArray) {
            String[] pointCard = splitCard(prompt);
            if (pointCard.length > 2) {
                allCards.add(new DrinkCard(pointCard[0], "Point", pointCardColor, Integer.parseInt(pointCard[1]), Integer.parseInt(pointCard[2])));
            } else {
                allCards.add(new DrinkCard(pointCard[0], "Point", pointCardColor, Integer.parseInt(pointCard[1])));
            }
        }
    }

    private List<Card> shuffleCards(List<Card> list) {
        for (int i = 0; i < list.size() * 3; i++) {
            //takes random card index
            int card1Place = (int) (Math.random() * list.size());
            int card2Place = (int) (Math.random() * list.size());
            //finds the cards at the index
            Card card1 = list.get(card1Place);
            Card card2 = list.get(card2Place);
            //replace each card with eachother
            list.set(card1Place, card2);
            list.set(card2Place, card1);

        }

        return list;
    }

    public String[] splitCard(String card) {
        String[] cardArray = card.split("##");
        List<String> fullArray = new ArrayList<>();
        fullArray.add(cardArray[0]);
        if (cardArray[1].contains("-")) {
            String[] numberArray = cardArray[1].split("-");
            fullArray.add(numberArray[0].trim());
            fullArray.add(numberArray[1].trim());
        } else {
            fullArray.add(cardArray[1].trim());
        }

        String[] s = new String[fullArray.size()];
        for (int i = 0; i < fullArray.size(); i++) {
            s[i] = fullArray.get(i);
        }
        return s;

    }

    int cardCounter = 0;

    public Card switchCards() {
        if (cardCounter >= allCards.size()) {
            allCards.clear();
            CreateCards();


            allCards = shuffleCards(allCards);
            cardCounter = 0;
        }

        Card c = allCards.get(cardCounter);
        cardCounter++;
        System.out.println(cardCounter);
        return c;
    }

    public String updateDevbox() {
        String devDisplay = "Cardcount: " + cardCounter + " Out of " + allCards.size() +
                "\n" + "Card Type: " + allCards.get(cardCounter - 1).getCategory() +
                "\n";
        if (allCards.get(cardCounter - 1) instanceof DrinkCard) {
            devDisplay = devDisplay.concat( " Sips: " + ((DrinkCard)allCards.get(cardCounter-1)).getSips());
        }
        return devDisplay;

    }
}