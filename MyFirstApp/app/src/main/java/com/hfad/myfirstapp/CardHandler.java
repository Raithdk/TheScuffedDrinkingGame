package com.hfad.myfirstapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardHandler {

    private final String drinkCardColor = "#f06565",//"#f57e76",
            neutralCardColor = "#e9edc0",
            truthCardColor = "#66e3a4",//"#65f0aa",
            dareCardColor = "#de96f2",
            neverCardColor = "#57caff",
            ruleCardColor = "#ff9359",
            voteCardColor = "#e9ff57",
            personalCardColor = "#93bbf0",
            likelyCardColor = "#bd93f0",
            groupsCardColor = "#db70ab";

    String[] promptArray, drinkArray, truthArray, dareArray, neverArray, ruleArray, voteArray, personalArray, likelyArray, groupsArray;

    List<Card> neutralCards = new ArrayList<>();
    List<Card> drinkCards = new ArrayList<>();
    List<Card> truthCards = new ArrayList<>();
    List<Card> dareCards = new ArrayList<>();
    List<Card> neverCards = new ArrayList<>();
    List<Card> ruleCards = new ArrayList<>();
    List<Card> voteCards = new ArrayList<>();
    List<Card> personalCards = new ArrayList<>();
    List<Card> likelyCards = new ArrayList<>();
    List<Card> groupsCards = new ArrayList<>();

    List<List<Card>> arrayCards = new ArrayList<>(Arrays.asList(neutralCards,drinkCards,truthCards,dareCards,neverCards,ruleCards,voteCards,personalCards,likelyCards,groupsCards));
    private List<Card> allCards = new ArrayList<>();

    public CardHandler() {

        CreateCards();

    }

    private void CreateCards() {
        promptArray = StringMetadata.neutralPrompts.split("\n");
        drinkArray = StringMetadata.drinkPrompts.split("\n");
        truthArray = StringMetadata.truthPrompts.split("\n");
        dareArray = StringMetadata.darePrompts.split("\n");
        neverArray = StringMetadata.neverHaveIEverPrompts.split("\n");
        ruleArray = StringMetadata.rulePrompts.split("\n");
        voteArray = StringMetadata.votePrompts.split("\n");
        likelyArray = StringMetadata.likelyPrompts.split("\n");
        groupsArray = StringMetadata.groupsPrompts.split("\n");

        personalArray = StringMetadata.personalPrompts.split("\n");

        if(Settings.isPersonalCard){
            for(String prompt : personalArray){
                personalCards.add(new Card(prompt.trim(), StringMetadata.CATEGORY_NEUTRAL, personalCardColor));
            }
        }

        if(Settings.isNeutralCard){
        for (String prompt : promptArray) {
            neutralCards.add(new Card(prompt.trim(), StringMetadata.CATEGORY_NEUTRAL, neutralCardColor));
        }
        }

        if(Settings.isDrinkCard){
        for (String prompt : drinkArray) {
            drinkCards.add(createDrinkCard(prompt.trim(), StringMetadata.CATEGORY_DRINK, drinkCardColor));
        }}
        //sandhedskort
        if(Settings.isTruthCard){
        for (String prompt : truthArray) {
            truthCards.add(new Card(prompt.trim(), StringMetadata.CATEGORY_TRUTH, truthCardColor));
        }}
        //konsekvenskort
        if(Settings.isDareCard){
        for (String prompt : dareArray) {
            dareCards.add(new Card(prompt.trim(), StringMetadata.CATEGORY_DARE, dareCardColor));
        }}
        //Pegekort
        if(Settings.isNeverCard){
        for (String prompt :  neverArray) {
            neverCards.add(createDrinkCard(prompt.trim(), StringMetadata.CATEGORY_NEVER, neverCardColor));
        }}
        //regelkort
        if(Settings.isRuleCard){
        for (String prompt : ruleArray){
            Card card;
            if(prompt.contains("/x")){
                card = createDrinkCard(prompt.trim(), StringMetadata.CATEGORY_RULE, ruleCardColor);
            } else {
                card = new Card(prompt.trim(), StringMetadata.CATEGORY_RULE,ruleCardColor);
            }
            ruleCards.add(card);
        }}
        //votekort
        if(Settings.isVoteCard){
        for (String prompt : voteArray) {
            voteCards.add(new DrinkCard(prompt.trim(), StringMetadata.CATEGORY_VOTE, voteCardColor, 1,3));
        }}

        if(Settings.isLikelyCard){
            for(String prompt : likelyArray){
                likelyCards.add(new Card(prompt.trim(), StringMetadata.CATEGORY_LIKELY, likelyCardColor));
            }
        }
        if(Settings.isGroupsCard){
            for(String prompt : groupsArray){
                groupsCards.add(new Card(prompt.trim(), StringMetadata.CATEGORY_GROUPS, groupsCardColor));
            }
        }

        //check om all
        boolean isEmpty = true;
        for(List<Card> s : arrayCards){
            if(s.size() > 0){
                isEmpty = false;
                break;
            }

        }
        if(isEmpty){
            //allCards.add(new Card("Du har slået alle kort fra, din bøv!", StringMetadata.CATEGORY_NEUTRAL,neutralCardColor));
        }
        //missing shuffle algoritm for list<Card> 
        //allCards = shuffleCards(allCards);
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

    private Card createDrinkCard(String prompt, String category, String color){
        if(prompt.contains("##")) {
            String[] drinkCard = splitCard(prompt);
            if (drinkCard.length > 2) {
                return new DrinkCard(drinkCard[0], category, color, Integer.parseInt(drinkCard[1]), Integer.parseInt(drinkCard[2]));
            } else {
                return new DrinkCard(drinkCard[0], category, color, Integer.parseInt(drinkCard[1]));
            }
        } else {
            return new DrinkCard(prompt, category, color));
        }
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
        if (cardCounter > allCards.size()-1) {
            allCards.clear();
            CreateCards();
            cardCounter = 0;
        }

        Card c = allCards.get(cardCounter);
        cardCounter++;
        return c;
    }

    public String updateDevbox() {
        String devDisplay = "Cardcount: " + cardCounter + " Out of " + allCards.size() +
                "\n" + "Card Type: " + allCards.get(cardCounter - 1).getCategory() +
                "\n" + "Sip range: " + Settings.getLowSips() +"-"+Settings.getHiSips()+
                "\n" + "Gamemode: " + Settings.getGamemode()+"\n";
        if (allCards.get(cardCounter - 1) instanceof DrinkCard) {
            devDisplay = devDisplay.concat( " Sips: " + ((DrinkCard)allCards.get(cardCounter-1)).getSips());
        }
        return devDisplay;

    }
}