package com.hfad.myfirstapp;

public class StringMetadata {

    public final static String CATEGORY_NEUTRAL = "Selskabs Kort",
            CATEGORY_DRINK = "Drik Ud!",
            CATEGORY_TRUTH = "Sandhed",
            CATEGORY_DARE = "Konsekvens",
            CATEGORY_NEVER = "Jeg Har Aldrig",
            CATEGORY_RULE = "Regel!",
            CATEGORY_VOTE = "Enig eller Uenig?",
            CATEGORY_LIKELY = "Mest Tilbøjelig Til";


    public final static String neutralPrompts = "Hvis du er den yngste i selskabet skal du drikke ud \n" +
            "Den første der bunder ud må vælge en der skal bunde\n" +
            "Alle der hellere vil spille et andet spil bunder\n" +
            "Du skal synge med på musikken der bliver spillet indtil det bliver din tur igen\n" +
            "Vælg et offer og nedstir dem til det bliver din tur igen\n" +
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
            "Thunder (Eller folkevogn)\n" +
            "Drik X antal tåre, din højre sidemand drikker X-1 tåre. Dette kører rundt til X=0\n";

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
                    "Alle brunetter må give /x tåre væk\n" +
                    "Hvis du har et mellemnavn skal du drikke /x tåre, hvis du har mere, drik dobbelt \n" +
                    "Hvis du har mere end /x vokaler i dit navn skal du drikke /x tåre pr ekstra vokal \n" +
                    "Hvis du har mere end /x konsonanter i dit navn skal du tage 1 tår pr ekstra konsonant\n" +
                    "Alle må køre bil, men egentlig ikke burde på grund af sit syn drikker /x tåre\n" +
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
                    "Alle der går på uni drikker /x tåre \n" +
                    "Alle der ikke har adresse på Bornholm drikker /x tåre \n" +
                    "Alle der har spillet warzone drikker /x tåre \n" +
                    "Peg på den fuldeste person, de drikker /x tåre. Hvis det er dig, giv 5 tåre væk. Legend\n" +
                    "Vælg den mest ædru person, de skal drikke /x tåre\n" +
                    "Vælg en der skal sige en joke. Er den ikke sjov skal vedkommende drikke /x tåre!\n" +
                    "Vælg den yngste spiller, de skal drikke /x tåre hvis du gættede korrekt ellers tag dem selv. \n" +
                    "Vælg den ældste spiller, de skal drikke /x tåre hvis du gættede korrekt ellers tag dem selv. \n" +
                    "Vælg den person der er bedst til ikke at bukke under for gruppepres. Vedkommende tømmer sit glas. \n" +
                    "Udpeg person der skal stave “Rød grød med fløde”, hvis korrekt, må de give /x tåre!\n" +
                    "Udpeg personen med den største IQ. Personen må give /x tåre ud for sit kloge hovede\n";

    public final static String truthPrompts = "Skål med den i dette rum du helst ville skifte plads med for en dag?\n" +
            "Hvilken superhelte kraft vil du have og hvorfor?\n" +
            "Hvad ved spilleren til højre mere om end dig? \n" +
            "Skål med den i dette rum du ville helst ville have med på en øde ø? \n" +
            "Skål med den i dette rum der har den værste musiksmag? \n" +
            "Skål med den i dette rum der har den bedste musiksmag?\n" +
            "Hvilke 3 ting ville du redde fra dit hus, hvis det brændte? \n" +
            "Skål med den i dette rum du havde du det dårligste førstehåndsindtryk af?\n" +
            "Kan du lide brød? \n" +
            "Skål med den i dette rum du helst ville kunne mute i en hel dag? \n" +
            "Hvem i dette rummet har størst alkoholiske tendenser? Skål med vedkommende. De har det hårdt\n" +
            "Skål med den person der har størst sandsynlighed for at begå mord ved et uheld\n" +
            "Skål med den person der har størst sandsynlighed for at begå selvmord ved et uheld\n";

    public final static String darePrompts = "Vis dit bedste move på dansegulvet eller tøm dit glas\n" +
            "Vis et af dine 10 nyeste billeder eller videoer og fortæl historien bag\n" +
            "Syng med på din senest afspillede spotifysang eller tøm dit glas\n" +
            "Sæt din yndlingssang på\n" +
            "Post et billede på snap- eller instastory af selskabet\n" +
            "Tag et gruppebillede\n";

    public final static String neverHaveIEverPrompts = "Kysset med en, og glemt det dagen efter\n" +
            "69… Nice\n" +
            "Været på stripklub\n" +
            "Haft sex i et telt\n" +
            "Spist euforiserende svampe\n" +
            "Taget snus\n" +
            "Røget hash\n" +
            "Været fuld hver dag i en hel uge\n" +
            "Blevet stoppet af politiet\n" +
            "Løjet om mit bodycount\n" +
            "Trådt i en lort\n" +
            "Kysset en af samme køn\n" +
            "Taget del i nøgenløb\n" +
            "Gået en uge uden bad\n" +
            "Blevet stoppet af politiet\n" +
            "Spillet mere end 4 timer uden at rejse mig\n" +
            "Været bange for sit helbred efter større mængder koffein\n" +
            "Pisset i en flaske\n" +
            "Faldet på cykel i en brandert\n" +
            "Brækket mig på en bar/bodega\n" +
            "Brækket mig på et spillested/klub\n" +
            "Tømt karaflen i et offentligt svømmebassin\n" +
            "Stjålet fra arbejde\n" +
            "Vågnet op i det fri, morgenen efter en fest\n";

    public final static String rulePrompts = "Vælg et nyt navn til en medspiller \n" +
            "Vælg et nyt navn til en medspiller \n" +
            "Vælg to personer der skal være druk-makkere de næste /x runder\n" +
            "Regel kort. Gælder til næste regel kort er trukket.\n" +
            "Regel kort. Gælder til næste regel kort er trukket.\n" +
            "Regel kort. Gælder til næste regel kort er trukket.\n" +
            "Alle skal bruge deres venstre hånd til at drikke og spille spillet de næste /x runder. 2 straf tåre ved fejl\n" +
            "Vælg en druk bøddel - Hver gang du drikker må din bøddel give 1 tår væk.\n";

    public final static String votePrompts = "Kat eller hund? \n" +
            "Øl eller sommersby? \n" +
            "Håndbold eller fodbold?\n" +
            "FIFA eller Warzone?\n" +
            "Friends eller The Office?\n" +
            "Rød eller blå hue?\n" +
            "Skummetmælk eller letmælk?\n" +
            "Sommer eller vinter? \n" +
            "Hyggedruk eller fest i byen?\n" +
            "Volley eller badminton?\n" +
            "Dansk eller Matematik?\n" +
            "Just Dance eller WII sport?\n" +
            "Matematikfessor eller Matematik i Måneby? \n" +
            "Koalaer eller pandaer?\n" +
            "Vodka eller Gin? \n" +
            "Pepsi eller Coca Cola? \n" +
            "Faxe Kondi eller Sprite?\n" +
            "Hitten eller Musikhuset?\n" +
            "Jagermeister eller Rom\n" +
            "Nutella eller peanutbutter?\n" +
            "Gå på regnbuer eller snakke med fluer? \n" +
            "Lave tomme dåser (uden pant) hver gang du klapper eller et barn døbes dit fulde navn hver gang du slår dig?\n";

    public static String personalPrompts = "Hvis du hedder Sasha skal du drikke ud\n" +
            "Hedder du William Mortensen skal du bunde. Det er ikke mig der laver reglerne, det er spillet\n" +
            "Hvis du gik i HTX’s Y-klasse skal du bunde\n" +
            "Hvis dit efternavn starter med R, skal du tage et shot\n" +
            "Hvis du har et mellemnavn skal du tage et shot\n" +
            "Hvis dit efternavn starter med “Fredrik” skal du bunde\n" +
            "Hvis dit navn er Thomas Raith må du give en bund til Kristian Mathias Regnarson\n";

    public static String likelyPrompts = "Lave en app fordi alle andre drukspil blev for kedelige\n" +
            "Købe billigt toiletpapir\n" +
            "Køre galt\n" +
            "Spritkørsel\n" +
            "Få kørekort som 30 årig\n" +
            "Bo hjemme til de 30\n" +
            "Dø først\n" +
            "Være det største naturmenneske\n" +
            "Være det største bymenneske\n" +
            "Bygge et ikea møbel forkert\n" +
            "Drukne i et glas vand\n" +
            "Starte en virksomhed\n" +
            "At flytte til udlandet\n" +
            "Have en IQ under 60\n" +
            "Blive ludoman\n" +
            "Blive alkoholiker\n" +
            "Bruge de dummeste penge\n" +
            "Tage en tilfældig pille i byen\n" +
            "Spise alt når de bliver fulde\n" +
            "Eje for mange dyr\n";
}
