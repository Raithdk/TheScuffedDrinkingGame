package com.hfad.myfirstapp;

public class StringMetadata {

    public final static String CATEGORY_NEUTRAL = "Selskabs Kort",
            CATEGORY_DRINK = "Drik Ud!",
            CATEGORY_TRUTH = "Sandhed",
            CATEGORY_DARE = "Konsekvens",
            CATEGORY_POINT = "Pege Kort",
            CATEGORY_RULE = "Regel!";

    public final static String neutralPrompts = "Hvis du er den yngste i selskabet skal du drikke ud \n" +
            "Hvis du hedder Sasha skal du drikke ud\n" +
            "Den første der bunder ud må vælge en der skal bunde\n" +
            "Alle der hellere vil spille et andet spil bunder\n" +
            "Du skal synge med på musikken der bliver spillet indtil det bliver din tur igen\n" +
            "Vælg et offer og nedstir dem til det bliver din tur igen\n" +
            "Hedder du William Mortensen skal du bunde. Det er ikke mig der laver reglerne, det er spillet\n" +
            "Lad som om du kaster en bold til en medspiller, sørg for de griber den\n" +
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
            "Kategori!\n" +
            "Kategori!\n" +
            "Thunder (eller folkevogn)\n" +
            "Drik X antal tåre, din højre sidemand drikker X-1 tåre. Dette kører rundt til X=0.\n";

    public final static String drinkPrompts =
            "Alle med briller drikker /x tåre\n" +
                    "Den der ejer den enhed er spilles på, må give /x tåre ud! ##5-10\n" +
                    "Alle der er flyttet hjemmefra må give /x tåre ud\n" +
                    "Hvis dit navn starter med en vokal skal du drikke /x tåre\n" +
                    "Hvis dit navn starter med en konsonant skal du drikke /x tåre\n" +
                    "Drik /x tåre, hvis du nogensinde har kørt galt\n" +
                    "Den laveste i selskabet må du give /x tåre ud \n" +
                    "Den laveste i selskabet skal du drikke /x tåre \n" +
                    "Alle studerende drikker /x tåre \n" +
                    "Alle med blond hår drikker /x tåre ##4\n" +
                    "Alle rødhårede må give /x tåre \n" +
                    "Alle brunnetter må give /x tåre væk\n" +
                    "Hvis du har et mellemnavn skal du drikke /x tåre, hvis du har mere, drik dobbelt \n" +
                    "Hvis du har mere end /x vokaler i dit navn skal du drikke /x tåre pr ekstra vokal \n" +
                    "Hvis du har mere end /x konsonanter i dit navn skal du tage 1 tår pr ekstra konsonant\n" +
                    "Sig 3 ting inden for en kategori. Den første der gætter kategorien må give /x tåre væk\n" +
                    "Alle under 170 drikker /x tåre\n" +
                    "Alle over 170 må give /x tåre væk \n" +
                    "Sten saks papir (Taberen drikker /x tåre) \n" +
                    "Folk med briller må give /x tåre ud\n" +
                    "Folk uden briller skal drikke /x tåre for deres 2 perfekte øjne >:( ##2\n" +
                    "Højeste og laveste drikker /x tåre\n" +
                    "Jeg har aldrig. Din Venstre sidemakker vælger. Alle der har gjort det drikker /x tåre\n" +
                    "Alle lavere end dig drikker /x tårer - Er du den laveste drikke du selv dobbelt tårer\n" +
                    "Alle højere end dig drikker /x tårer - Er du den højeste drikker du selv dobbelt tårer\n" +
                    "Giv /x tårer til den første spiller du får øjenkontakt med\n" +
                    "Alle der drikker øl drikker /x tåre øl\n" +
                    "Alle der drikker øl må give /x tåre væk\n" +
                    "Alle der har iphone skal drikke /x tåre\n" +
                    "Giv /x tåre til en af modsatte køn\n" +
                    "Giv /x tåre til en af modsatte køn\n" +
                    "Giv /x tåre til en af modsatte køn\n" +
                    "Vælg en der må give /x tåre væk \n" +
                    "Vælg en der må give /x tåre væk\n" +
                    "Vælg en der må give /x tåre væk \n" +
                    "Vælg en der må give /x tåre væk \n" +
                    "Alle der drikker noget med cola må give /x tåre væk\n" +
                    "Alle der drikker noget med vodka må give /x tåre væk\n" +
                    "Alle der drikker luderbenzin skal drikke /x tåre… Svagt \n" +
                    "Alle der har en kæreste drikker /x tåre\n" +
                    "Alle der er på instagram drikker /x tåre\n" +
                    "Alle der har en Android må give /x tåre væk\n" +
                    "Din venstre sidemand drikker /x tåre\n" +
                    "Din venstre sidemand må give /x tåre væk\n" +
                    "Din højre sidemand drikker /x tåre\n" +
                    "Din højre sidemand må give /x tåre væk\n" +
                    "Vælg to af det modsatte køn der skal drikke /x tåre\n" +
                    "Vælg to af det modsatte køn der skal drikke /x tåre\n" +
                    "Vælg to af det modsatte køn der skal drikke /x tåre\n" +
                    "Dine sidemænd skåler og drikker /x tåre hver\n" +
                    "Alle der har røget hash drikker /x tåre \n" +
                    "Alle navy blå huer må give /x tåre væk \n" +
                    "Alle røde huer drikker /x tåre \n" +
                    "Alle der stadig kunne køre bil drikker /x tåre\n" +
                    "Alle der har en tatovering må give /x tåre væk\n" +
                    "Alle der har betalt for porno drikker /x tåre som straf. You’re down bad... ##6\n" +
                    "Singler drikker /x tåre! \n" +
                    "Dem der regelmæssigt går i fitness må give /x tåre væk. Rip Krelle19 virus\n" +
                    "Dem der har arbejdet i et supermarked drikker /x tåre. I kender allerede smerten\n" +
                    "Alle der erkender at de bruger for meget tid på TikTok drikker /x tåre\n" +
                    "Drik /x tåre! \n" +
                    "Drik /x tåre! \n" +
                    "Drik /x tåre! \n" +
                    "Drik /x tåre! \n" +
                    "Giv /x tåre ud! \n" +
                    "Giv /x tåre ud! \n" +
                    "Giv /x tåre ud! \n" +
                    "Giv /x tåre ud! \n" +
                    "Alle der har haft informatik drikker /x tåre \n" +
                    "Alle der går på uni drikker /x tåre \n";

    public final static String truthPrompts = "Hvem i dette rum ville du helst skifte plads med for en dag?\n" +
            "Hvilken superhelte kraft vil du have og hvorfor?\n" +
            "Hvad ved spilleren til højre mere om end dig? \n" +
            "Hvem i dette rum ville du helst have med på en øde ø? \n" +
            "Hvem i dette rum har den værste musiksmag? \n" +
            "Hvem i dette rum har den bedste musiksmag?\n" +
            "Hvilke 3 ting ville du redde fra dit hus, hvis det brændte? \n" +
            "Hvem I dette rum havde du det dårligste førstehåndsindtryk af?\n" +
            "Kan du lide brød? \n" +
            "Hvem I dette rum ville du helst kunne mute i en hel dag?\n";

    public final static String darePrompts = "Vis dit bedste move på dansegulvet eller tøm dit glas\n" +
            "Vis et af dine 10 nyeste billeder eller videoer og fortæl historien bag\n" +
            "Syng med på din senest afspillede spotifysang eller tøm dit glas\n" +
            "Post et billede på snap- eller instastory af selskabet\n" +
            "Tag et gruppebillede (med hele gruppen Thomas (eller bare med William))\n";

    public final static String pointPrompts = "Udpeg den yngste spiller, de skal drikke /x tåre hvis du gættede korrekt ellers tag dem selv. ##3-5\n" +
            "Udpeg den ældste spiller, de skal drikke /x tåre hvis du gættede korrekt ellers tag dem selv. ##3-5\n" +
            "Peg på den mest ædru person, de skal drikke /x tåre. ##3-6\n" +
            "Peg på den fuldeste person, de drikker /x tåre. Hvis det er dig, giv 5 tåre væk. Legend. ##3\n" +
            "Udpeg person der skal stave “Rød grød med fløde”, hvis korrekt, må de give /x tåre ##3-4\n";

    public final static String rulePrompts = "Vælg et nyt navn til en medspiller \n" +
            "Vælg et nyt navn til en medspiller \n" +
            "Vælg to personer der skal være druk-makkere de næste /x runder\n" +
            "Regel kort. Gælder til næste regel kort er trukket.\n" +
            "Regel kort. Gælder til næste regel kort er trukket.\n" +
            "Regel kort. Gælder til næste regel kort er trukket.\n" +
            "Alle skal bruge deres venstre hånd til at drikke og spille spillet de næste /x runder. 2 straf tåre ved fejl\n" +
            "Vælg en druk bøddel - Hver gang du drikker må din bøddel give 1 tår væk.\n";
}
