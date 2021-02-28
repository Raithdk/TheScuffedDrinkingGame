package com.hfad.myfirstapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DrukSpilMain {



    private String neutralPrompts = "Hvis du er den yngste i selskabet skal du drikke ud \n" +
            "Hvis du hedder Sasha skal du drikke ud\n" +
            "Drik antallet af bogstaver i dit fornavn i tårer\n" +
            "Drik antal tåre som bogstaver i efternavn\n" +
            "Tag et shot\n" +
            "Din højre sidemakker blander din næste drink \n" +
            "Bund din drink\n" +
            "Uddel samme antal tåre som der er år mellem ældste og yngste spiller\n" +
            "Giv et shot\n" +
            "Vælg en der skal bunde\n" +
            "Herreskål\n" +
            "Herreskål\n" +
            "Dameskål\n" +
            "Dameskål\n" +
            "Fællesskål\n" +
            "Fællesskål\n" +
            "Thunder (eller folkevogn)\n" +
            "Drik X antal tåre, din højre sidemand drikker X-1 tåre. Dette kører rundt til X=0.\n";

    private String drinkPrompts =
            "Alle med briller drikker /x tåre ##3\n" +
                    "Den der ejer den enhed er spilles på, må give /x tåre ud! ##5-10\n" +
                    "Alle der er flyttet hjemmefra må give /x tåre ud ##2\n" +
                    "Hvis dit navn starter med en vokal skal du drikke /x tåre ##3\n" +
                    "Hvis dit navn starter med en konsonant skal du drikke /x tåre ##3\n" +
                    "Drik /x tåre, hvis du nogensinde har kørt galt ##4\n" +
                    "Hvis du er den laveste i selskabet må du give /x tåre ud ##2\n" +
                    "Alle studerende drikker /x tåre ##5\n" +
                    "Alle med blond hår drikker /x tåre ##4\n" +
                    "Alle rødhårede må give /x tåre ##2\n" +
                    "Hvis du har et mellemnavn skal du drikke /x tåre, hvis du har mere, drik dobbelt ##2-4\n" +
                    "Hvis du har mere end /x vokaler i dit navn skal du drikke /x tåre pr ekstra vokal ##1-3\n" +
                    "Hvis du har mere end /x konsonanter i dit navn skal du tage 1 tår pr ekstra konsonant ##2-3\n" +
                    "Sig 3 ting inden for en kategori. Den første der gætter kategorien må give /x tåre væk ##3-4\n" +
                    "Sten saks papir (Taberen drikker /x tåre) ##2-5\n" +
                    "Folk med briller må give /x tåre ud ##2-4\n" +
                    "Folk uden briller skal drikke /x tåre for deres 2 perfekte øjne >:( ##2\n" +
                    "Højeste og laveste drikker /x tåre ##2-4\n" +
                    "Jeg har aldrig. Din Venstre sidemakker vælger. Alle der har gjort det drikker /x tåre ##2-4\n" +
                    "Alle lavere end dig drikker /x tårer - Er du den laveste drikke du selv dobbelt tårer ##2-4\n" +
                    "Alle højere end dig drikker /x tårer - Er du den højeste drikker du selv dobbelt tårer ##2-4\n" +
                    "Giv /x tårer til den første spiller du får øjenkontakt med ##2-5\n" +
                    "Drik /x tåre! ##2-6\n" +
                    "Drik /x tåre! ##2-6\n" +
                    "Drik /x tåre! ##2-6\n" +
                    "Drik /x tåre! ##2-6\n" +
                    "Giv /x tåre ud! ##2-6\n" +
                    "Giv /x tåre ud! ##2-6\n" +
                    "Giv /x tåre ud! ##2-6\n" +
                    "Giv /x tåre ud! ##2-6\n";

    private String truthPrompts = "Hvem i dette rum ville du helst skifte plads med for en dag?\n" +
            "Hvilken superhelte kraft vil du have og hvorfor?\n" +
            "Hvad ved spilleren til højre mere om end dig? \n" +
            "Hvem i dette rum ville du helst have med på en øde ø? \n" +
            "Hvem i dette rum har en bedste/værste musiksmag? \n";

    private String darePrompts = "Vis dit bedste move på dansegulvet eller tøm dit glas\n" +
            "Vis et af dine 10 nyeste billeder eller videoer og fortæl historien bag\n" +
            "Syng med på din senest afspillede spotifysang eller tøm dit glas\n" +
            "Post et billede på snap- eller instastory af selskabet\n" +
            "Tag et gruppebillede (med hele gruppen Thomas (eller bare med William))\n";

    private String pointPrompts = "Udpeg den yngste spiller, de skal drikke /x tåre hvis du gættede korrekt ellers tag dem selv. ##3-5\n" +
            "Udpeg den ældste spiller, de skal drikke /x tåre hvis du gættede korrekt ellers tag dem selv. ##3-5\n" +
            "Peg på den mest ædru person, de skal drikke /x tåre. ##3-6\n" +
            "Peg på den fuldeste person, de drikker /x tåre. Hvis det er dig, giv 5 tåre væk. Legend. ##3\n" +
            "Udpeg person der skal stave “Rød grød med fløde”, hvis korrekt, må de give /x tåre ##3-4\n";

    private List<Card> allCards = new ArrayList<>();

    public DrukSpilMain(){
        CreateCards();
        this.allCards = shuffleCards(allCards);
    }

    private void CreateCards(){
        String promptArray[] = neutralPrompts.split("\n");
        String drinkArray[] = drinkPrompts.split("\n");
        String truthArray[] = truthPrompts.split("\n");
        String dareArray[] = darePrompts.split("\n");
        String pointArray[] = pointPrompts.split("\n");

        for (String prompt : promptArray) {
            allCards.add(new Card(prompt, "#96b4fa"));
        }

        for (String prompt : drinkArray){
            String[] drinkCard = splitCard(prompt);
            if(drinkCard.length > 2){
                allCards.add(new DrinkCard(drinkCard[0], "#f57e76", Integer.parseInt(drinkCard[1]),Integer.parseInt(drinkCard[2])));
            }
            else{
                allCards.add(new DrinkCard(drinkCard[0], "#f57e76", Integer.parseInt(drinkCard[1])));
            }

        }
        //sandhedskort
        for (String prompt : truthArray) {
            allCards.add(new Card(prompt, "#beebc2"));
        }
        //konsekvenskort
        for (String prompt : dareArray){
            allCards.add(new Card(prompt, "#e3c0ed"));
        }
        //Pegekort
        for (String prompt : pointArray){
            String[] pointCard = splitCard(prompt);
            if(pointCard.length > 2){
                allCards.add(new DrinkCard(pointCard[0], "#e9edc0", Integer.parseInt(pointCard[1]),Integer.parseInt(pointCard[2])));
            }
            else{
                allCards.add(new DrinkCard(pointCard[0], "#e9edc0", Integer.parseInt(pointCard[1])));
            }
        }
    }

    private List<Card> shuffleCards(List<Card> list){
        for(int i = 0; i < list.size()*3; i++){
            //takes random card index
            int card1Place = (int) (Math.random() * list.size());
            int card2Place = (int) (Math.random() * list.size());
            //finds the cards at the index
            Card card1 = list.get(card1Place);
            Card card2 = list.get(card2Place);
            //replace each card with eachother
            list.set(card1Place,card2);
            list.set(card2Place,card1);

        }

        return list;
    }

    public String[] splitCard(String card){
        String[] cardArray = card.split("##");
        List<String> fullArray = new ArrayList<>();
        fullArray.add(cardArray[0]);
        if(cardArray[1].contains("-")){
            String[] numberArray = cardArray[1].split("-");
            fullArray.add(numberArray[0].trim());
            fullArray.add(numberArray[1].trim());
        } else {
            fullArray.add(cardArray[1].trim());
        }

        String[] s = new  String[fullArray.size()];
        for (int i = 0; i < fullArray.size(); i++){
            s[i] = fullArray.get(i);
        }
        return s;

    }

    int cardCounter = 0;
    public Card switchCards(){
        if (cardCounter >= allCards.size()){
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

    public String updateDevbox(){

        return "Cardcount: " + cardCounter + " Out of " + allCards.size() +
                "\n" + "Card Type: " + allCards.get(cardCounter-1).getClass().toString().replace("com.hfad.myfirstapp.","") +
                "\n";
    }
}
