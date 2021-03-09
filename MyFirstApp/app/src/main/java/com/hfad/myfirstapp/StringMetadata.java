package com.hfad.myfirstapp;

public class StringMetadata {

    public final static String CATEGORY_NEUTRAL = "Selskabs Kort",
            CATEGORY_DRINK = "Drik Ud!",
            CATEGORY_TRUTH = "Sandhed",
            CATEGORY_DARE = "Konsekvens",
            CATEGORY_NEVER = "Jeg Har Aldrig",
            CATEGORY_RULE = "Regel!",
            CATEGORY_VOTE = "Enig eller Uenig?",
            CATEGORY_LIKELY = "Hvem Er Mest Tilbøjelig Til",
            CATEGORY_GROUPS = "Hvem Er Gruppens";

    public static String personalPrompts = "Hvis du hedder Sasha, skal du drikke ud\n" +
            "Hvis du hedder Sasha, må du vælge en som skal bunde\n" +
            "Hedder du William Mortensen, skal du bunde. Det er ikke mig der laver reglerne, det er spillet\n" +
            "Hvis du gik i HTX’s Y-klasse skal du bunde\n" +
            "Hvis du gik i Y (HTX eller STX) må du vælge en som skal tage /x tåre\n" +
            "Hvis dit efternavn starter med R, skal du tage et shot\n" +
            "Hvis du har et mellemnavn, skal du tage et shot\n" +
            "Hvis dit efternavn starter med “Frederik”, skal du bunde\n" +
            "Hvis dit navn er Thomas Raith, må du give en bund til Kristian Mathias Regnarson\n" +
            "Anton Sandbye skal give Rema1000 tåre væk. Ej han skal selv tage 5\n" +
            "Mia ser tørstig ud, hun skal drikke 5 tåre\n" +
            "Sari, eller skal jeg sige Camilla? Du drikker 4 tåre\n" +
            "Camilla må give 5 tåre væk\n" +
            "Sasha må give 6 tåre væk\n" +
            "William, giv antal tåre væk som dage siden sidst du slukkede end brand. Hvis der er mere end 7, skal du drikke 5.\n" +
            "Kristian… Fuck pisspanden. Kirsten må give 4 tåre væk\n" +
            "Anton Sandbye skal svare sandt. Hvem synger bedst, Simon Sandbye eller Thomas Raith?\n" +
            "Thomas vælger om alle røde huer skal drikke 4 tåre... Selvfølgelig skal de det!\n" +
            "Starter dit navn med K og slutter på ristian, skal du drikke 5 tåre\n" +
            "Hedder din far Tommy Mortensen, skal du drikke 3 tåre\n" +
            "Alle, der har et t i deres navn, drikker 1 tår\n" +
            "Alle, der bor på Lyrsbyvej drikker 3 tåre\n" +
            "Alle, der bor i Rønne tømmer deres glas\n" +
            "Alle, der bor i Klemensker må give 2 tåre væk. Wack by!\n" +
            "Alle, der går på HF bunder\n" +
            "Alle, der bor i Ømarie må give 5 tåre til nogle som ikke gør. Sej by!\n" +
            "Hvis dit efternavn starter med S, skal du bunde\n" +
            "Hvis din mest brugte sætning er “shut the fuck up”, skal du bunde\n" +
            "Hvis du er i familie med en politiker, bunder du \n" +
            "Hedder du Oscar Severin Statager Schmidt må du give 3 tåre til hver af det modsatte køn i dette selvskab. Chadcar\n";

    public final static String neutralPrompts = "Hvis du er den yngste i selskabet, skal du drikke ud \n" +
            "Den første, der bunder, må vælge en, der skal bunde\n" +
            "Alle, der hellere vil spille et andet spil, bunder\n" +
            "Vælg et offer og nedstir dem til det bliver din tur igen\n" +
            "Lad som om du kaster en bold til en medspiller og sørg for de griber den. I skåler, hvis det ikke lykkes\n" +
            "Drik antal tåre som bogstaver i dit fornavn\n" +
            "Drik antal tåre som bogstaver i efternavn\n" +
            "Tag et shot\n" +
            "Din højre sidemakker blander din næste drink \n" +
            "Bund din drink\n" +
            "Uddel samme antal tåre som der er år mellem ældste og yngste spiller\n" +
            "Giv et shot\n" +
            "Vælg en, der skal bunde\n" +
            "Herreskål\n" +
            "Herreskål\n" +
            "Dameskål\n" +
            "Dameskål\n" +
            "Fællesskål\n" +
            "Fællesskål\n" +
            "Kategori!\n" +
            "Kategori!\n" +
            "Thunder\n" +
            "Folkevogn (alle tager en tår hver gang der bliver sagt “folkevogn”)\n" +
            "Drik X antal tåre, din højre sidemand drikker X-1 tåre. Dette kører rundt til X=0\n" +
            "Du grim\n" +
            "Uvejr! (Vandfald)\n" +
            "Du dum\n" +
            "Læs ikke dette kort op. Giv en highfive til alle i rummet. Hvis en eller flere lader dig hænge i mere en 5 sekunder, må du give /x tåre som deres straf. \n" +
            "Du spiller flaskehalsen peger på. Den flasken peger på, må bestemme, hvem af jer to, der skal bunde hans/hendes drink. \n" +
            "Shhh! Du må ikke snakke før det er din tur igen.\n" +
            "Du skal kigge væk. Dine medspillere hælder nu enten vand i 2 shotglas og vand i det 3. Du skal nu tage et af de 3 shots.\n" +
            "Alle lægger deres telefoner på bordet med skærmen opad. Den første der modtager en notifikation må uddele et shot.\n";

    public final static String drinkPrompts =
            "Alle med briller, drikker /x tåre\n" +
                    "Den der ejer den enhed, der spilles på, må give /x tåre ud! ##5-10\n" +
                    "Alle, der er flyttet hjemmefra, må give /x tåre ud\n" +
                    "Hvis dit navn starter med en vokal, skal du drikke /x tåre\n" +
                    "Hvis dit navn starter med en konsonant, skal du drikke /x tåre\n" +
                    "Drik /x tåre, hvis du nogensinde har kørt galt\n" +
                    "Den laveste i selskabet må give /x tåre ud \n" +
                    "Den laveste i selskabet skal drikke /x tåre \n" +
                    "Hvis du har et O i dit fornavn, skal du drikke /x tåre\n" +
                    "Alle studerende drikker /x tåre \n" +
                    "Alle med blond hår drikker /x tåre\n" +
                    "Alle med blond hår må give /x tåre væk\n" +
                    "Alle rødhårede må give /x tåre \n" +
                    "Alle brunetter må give /x tåre væk\n" +
                    "Alle brunetter drikker /x tåre\n" +
                    "Hvis du har ét mellemnavn skal du drikke /x tåre, hvis du har mere end et, drik dobbelt \n" +
                    "Hvis du har mere end /x vokaler i dit navn, skal du drikke /x tåre pr. ekstra vokal \n" +
                    "Hvis du har mere end /x konsonanter i dit navn, skal du tage 1 tår pr. ekstra konsonant\n" +
                    "Alle som må køre bil, men egentlig ikke burde på grund af sit syn, drikker /x tåre\n" +
                    "Sig 3 ting inden for en kategori. Den første, der gætter kategorien må give /x tåre væk\n" +
                    "Alle under 170 drikker /x tåre\n" +
                    "Alle over 170 må give /x tåre væk \n" +
                    "Sten saks papir (Taberen drikker /x tåre) \n" +
                    "Folk med briller må give /x tåre ud\n" +
                    "Folk uden briller skal drikke /x tåre for deres 2 perfekte øjne >:( ##2\n" +
                    "Højeste og laveste drikker /x tåre\n" +
                    "Jeg har aldrig. Din Venstre sidemakker vælger. Alle der har gjort det, drikker /x tåre\n" +
                    "Alle lavere end dig drikker /x tåre - Er du den laveste, drikker du selv det dobbelte antal tåre\n" +
                    "Alle højere end dig drikker /x tårer - Er du den højeste, drikker du selv det dobbelte antal tåre\n" +
                    "Giv /x tårer til den første spiller du får øjenkontakt med\n" +
                    "Alle, der drikker øl drikker /x tåre øl\n" +
                    "Alle, der drikker øl må give /x tåre væk\n" +
                    "Alle, der har iPhone skal drikke /x tåre\n" +
                    "Giv /x tåre til en af modsatte køn\n" +
                    "Giv /x tåre til en af modsatte køn\n" +
                    "Giv /x tåre til en af modsatte køn\n" +
                    "Vælg en, der må give /x tåre væk \n" +
                    "Vælg en, der må give /x tåre væk\n" +
                    "Vælg en, der må give /x tåre væk \n" +
                    "Vælg en, der må give /x tåre væk \n" +
                    "Alle, der drikker noget med cola må give /x tåre væk\n" +
                    "Alle, der drikker noget med vodka må give /x tåre væk\n" +
                    "Alle, der drikker luderbenzin skal drikke /x tåre… Svagt \n" +
                    "Alle, der har en kæreste drikker /x tåre\n" +
                    "Alle singler drikker /x tåre\n" +
                    "Alle, der er på instagram drikker /x tåre\n" +
                    "Alle, der har Android må give /x tåre væk\n" +
                    "Alle, der har iPhone må give /x tåre væk\n" +
                    "Din venstre sidemand drikker /x tåre\n" +
                    "Din venstre sidemand må give /x tåre væk\n" +
                    "Din højre sidemand drikker /x tåre\n" +
                    "Din højre sidemand må give /x tåre væk\n" +
                    "Din venstre sidemand drikker /x tåre\n" +
                    "Din venstre sidemand må give /x tåre væk\n" +
                    "Din højre sidemand drikker /x tåre\n" +
                    "Din højre sidemand må give /x tåre væk\n" +
                    "Personen overfor dig må give /x tåre væk\n" +
                    "Personen overfor dig skal drikke /x tåre\n" +
                    "Vælg to af det modsatte køn, der skal drikke /x tåre\n" +
                    "Vælg to af det modsatte køn, der skal drikke /x tåre\n" +
                    "Vælg to af det modsatte køn, der skal drikke /x tåre\n" +
                    "Dine sidemænd skåler og drikker /x tåre hver\n" +
                    "Du skåler med dine sidemænd, og i drikker /x tåre\n" +
                    "Alle, der har prøvet at ryge hash drikker /x tåre \n" +
                    "Alle navy blå huer må give /x tåre væk \n" +
                    "Alle røde huer drikker /x tåre\n" +
                    "Alle røde huer må give /x tåre væk\n" +
                    "Alle, der stadig kunne køre bil drikker /x tåre\n" +
                    "Alle, der har en tatovering må give /x tåre væk\n" +
                    "Alle, der har en tatovering drikker /x tåre\n" +
                    "Alle, der har betalt for porno drikker /x tåre som straf. You’re down bad... ##6\n" +
                    "Singlerne drikker /x tåre! \n" +
                    "Dem, der regelmæssigt går i fitness, må give /x tåre væk. Rip Krelle19 virus\n" +
                    "Dem, der har arbejdet i et supermarked drikker /x tåre. I kender allerede smerten\n" +
                    "Drik /x tåre! \n" +
                    "Drik /x tåre! \n" +
                    "Drik /x tåre! \n" +
                    "Drik /x tåre! \n" +
                    "Giv /x tåre ud! \n" +
                    "Giv /x tåre ud! \n" +
                    "Giv /x tåre ud! \n" +
                    "Giv /x tåre ud! \n" +
                    "Alle, der har haft informatik drikker /x tåre \n" +
                    "Alle, der går på uni drikker /x tåre \n" +
                    "Alle, der ikke har adresse på Bornholm drikker /x tåre \n" +
                    "Alle, der har spillet warzone drikker /x tåre \n" +
                    "Peg på den fuldeste person, de drikker /x tåre. Hvis det er dig, giv 5 tåre væk. Legend\n" +
                    "Vælg den mest ædru person, de skal drikke /x tåre\n" +
                    "Vælg en, der skal sige en joke. Er den ikke sjov, skal vedkommende drikke /x tåre!\n" +
                    "Vælg den yngste spiller. De skal drikke /x tåre, hvis du gættede korrekt - ellers tag dem selv\n" +
                    "Vælg den ældste spiller. De skal drikke /x tåre, hvis du gættede korrekt - ellers tag dem selv\n" +
                    "Vælg den person, der er bedst til ikke at bukke under for gruppepres. Vedkommende tømmer sit glas\n" +
                    "Udpeg person, der skal stave “Rød grød med fløde”. Hvis de gør det korrekt, må de give /x tåre!\n" +
                    "Udpeg personen med den største IQ. Personen må give /x tåre ud for sit kloge hovede\n" +
                    "Du vælger om alle (inklusiv dig selv) skal drikke /x tåre eller ej\n" +
                    "Du vælger om alle (inklusiv dig selv) skal drikke /x tåre eller ej\n" +
                    "Hvis du kan oversætte 1011 til titalssystemet, må du give /x tåre væk\n" +
                    "Alle, der har set Star Wars drikker /x tåre \n" +
                    "Alle, der har fået et hak i huen må give /x tåre \n" +
                    "Alle, der har lyn i huen må give /x tåre\n" +
                    "Alle, der er i et forhold drikker /x tåre\n" +
                    "Alle, der har drukket rød bil drikker /x tåre\n" +
                    "Alle, der har set Friends drikker /x tåre\n" +
                    "Alle, der har set The Office må give /x tåre\n" +
                    "Alle, der har et arbejde på nuværende tidspunkt, må give /x tåre væk - Hvis man har flere må man give /x tåre pr. arbejde\n" +
                    "Alle, der har haft tysk i gymnasiet må give /x tåre ud\n" +
                    "Alle, der har haft Biologi på A-niveau må give /x tåre ud\n";

    public final static String truthPrompts = "Skål med den i dette rum, du helst ville skifte plads med for en dag\n" +
            "Hvilken superhelte kraft vil du have og hvorfor?\n" +
            "Hvad ved spilleren til højre mere om end dig?\n" +
            "Hvad ved spilleren til venstre mere om end dig?\n" +
            "Hvad ved spilleren til højre mindre om end dig?\n" +
            "Hvad ved spilleren til venstre mindre om end dig?\n" +
            "Skål med den i dette rum, du helst ville have med på en øde ø\n" +
            "Skål med den i dette rum, der har den værste musiksmag\n" +
            "Skål med den i dette rum, der har den bedste musiksmag\n" +
            "Hvilke 3 ting ville du redde fra dit hus, hvis det brændte ned?\n" +
            "Skål med den i dette rum, du havde det dårligste førstehåndsindtryk af\n" +
            "Skål med den i dette rum, du havde det bedste førstehåndsindtryk af\n" +
            "Kan du lide brød?\n" +
            "Skål med den i dette rum, du helst ville kunne mute i en hel dag\n" +
            "Hvem i dette rummet har størst alkoholiske tendenser? Skål med vedkommende. De har det hårdt\n" +
            "Skål med den person, der har størst sandsynlighed for at begå mord ved et uheld\n" +
            "Skål med den person, der har størst sandsynlighed for at begå selvmord ved et uheld\n" +
            "Skål med de 3, du ville vælge i fuck-marry-kill. Du behøver ikke fortælle, hvem der er hvem. \n" +
            "Skål med den medspiller, du er mest fortrolig med\n" +
            "Skål med den medspiller, du ved mindst om\n" +
            "Skål med den medspiller, du ved mest om\n" +
            "Skål med den medspiller, du har mindst tilfælles med\n" +
            "Skål med den medspiller, du har mest tilfælles med\n" +
            "Skål med den medspiller, du mener har den bedste hukommelse\n" +
            "Skål med den medspiller, du mener har den værste hukommelse";

    public final static String darePrompts = "Vis dit bedste move på dansegulvet eller tøm dit glas\n" +
            "Vis et af dine 10 nyeste billeder/videoer og fortæl historien bag\n" +
            "Syng med på din senest afspillede spotifysang eller tøm dit glas\n" +
            "Sæt din yndlingssang på\n" +
            "Sæt en sang på\n" +
            "Sæt en sang på\n" +
            "Sæt en sang på\n" +
            "Sæt en sang på\n" +
            "Post et billede på snap- eller instastory af selskabet\n" +
            "Tag et gruppebillede\n" +
            "Hold en tale om det fantastiske design af sodavandsdåsen eller tøm dit glas\n" +
            "Hold en tale om, hvorfor øl faktisk ikke er øl eller tøm dit glas\n" +
            "Hold en tale om, hvorfor ananas skal/ikke skal på pizza eller tøm dit glas\n" +
            "Sæt Uvejr af Simon Sandbye på\n" +
            "Forklar om bogstavet e eller tag et shot\n" +
            "Sæt dig på skødet af en anden medspiller indtil det er din tur igen eller tøm dit glas\n";

    public static String likelyPrompts = "At lave en app fordi alle andre drukspil blev for kedelige?\n" +
            "At købe billigt toiletpapir?\n" +
            "At køre galt?\n" +
            "At køre spritkørsel?\t\n" +
            "At bo hjemme til de er 30?\n" +
            "At dø først?\n" +
            "At være det største naturmenneske?\n" +
            "At være det største bymenneske?\n" +
            "At bygge et ikea møbel forkert?\n" +
            "At drukne i et glas vand?\n" +
            "At starte en virksomhed?\n" +
            "At flytte til udlandet?\n" +
            "At have en IQ under 70?\n" +
            "At blive ludoman?\n" +
            "At blive alkoholiker?\n" +
            "At bruge de dummeste penge?\n" +
            "At tage en tilfældig pille i byen?\n" +
            "At spise alt, når de bliver fulde?\n" +
            "At eje for mange dyr?\n" +
            "At lave impulskøb?\n" +
            "At få blackout?\n" +
            "At brække sig til en fest?\n" +
            "At blive mor eller far først?\n" +
            "At spille på flere heste på samme tid?\n" +
            "At tage fejl ift. højre eller venstre?\n" +
            "At blive kørt ned fordi de ikke kiggede sig for, før de gik over vejen?\n" +
            "At gifte sig til penge?\n" +
            "At droppe al uddannelse og blive stripper?\n" +
            "At blive lærer?\n" +
            "At fare vild i en telefonboks?\n" +
            "At starte en brand?\n" +
            "At slukke en brand?\n" +
            "At få madforgiftning grundet dårlig dømmekraft af maden?\n" +
            "At grine til en begravelse?\n" +
            "At græde til en reklame?\n" +
            "At bruge et udløbet ID?\n" +
            "At blive akavet omkring det andet køn?\n" +
            "At være den rigeste om 20 år?\n" +
            "At starte en karriere inden for fodbold/håndbold?\n" +
            "At have det dårligste syn?\n" +
            "At tage fejl af “skub/træk” på døren?\n" +
            "At overleve længst på en øde ø?\n" +
            "At smadre en Nokia?\n" +
            "At have en fast bolleven?\n" +
            "At miste sit kørekort?\n" +
            "At kysse med en, da vedkommende var fuld, og så afvise personen, når de blev ædru nok til at vurdere udseendet?\n" +
            "At blive fuld udelukkende på andres alkohol? \n" +
            "At bruge færrest penge i byen?\n" +
            "At bruge flest penge i byen?\n" +
            "At være mere forelsket i sin hund end i en kæreste?\n";

    public final static String groupsPrompts = "Nørd?\n" +
            "Mor/far?\n" +
            "Musiker?\n" +
            "Dansemus?\n" +
            "Brian?\n" +
            "Idiot?\n" +
            "Hårde type?\n" +
            "Wannabe Bear Grylls?\n" +
            "Kloge åge?\n" +
            "Blondine?\n" +
            "Mobbeoffer?\n" +
            "Træningsfanatiker?\n" +
            "Klovn?\n" +
            "Splejs?\n" +
            "Gamer?\n" +
            "Barn?\n" +
            "Curlingbarn?\n" +
            "Håndværker?\n" +
            "Pædagog?\n" +
            "Psykolog?\n" +
            "Taxi?\n" +
            "Simp?\n" +
            "“Jeg starter i morgen”?\n" +
            "Linse Kessler?\n" +
            "Ronnie Coleman?\n" +
            "Dyreelsker?";


    public final static String neverHaveIEverPrompts = "Kysset med en og glemt det dagen efter\n" +
            "Været på stripklub\n" +
            "Haft sex i et telt\n" +
            "Lavet 69’eren… Nice\n" +
            "Drukket af en vandpyt\n" +
            "Spist euforiserende svampe\n" +
            "Taget snus\n" +
            "Røget hash\n" +
            "Været fuld hver dag i en hel uge (hurra for studenteruge)\n" +
            "Blevet stoppet af politiet\n" +
            "Løjet om mit bodycount\n" +
            "Trådt i en lort\n" +
            "Kysset en af samme køn\n" +
            "Taget del i nøgenløb\n" +
            "Gået en uge uden bad\n" +
            "Blevet stoppet af politiet\n" +
            "Spillet computer/playstation mere end 4 timer uden at rejse mig\n" +
            "Pisset i en flaske\n" +
            "Faldet på cykel i en brandert\n" +
            "Brækket mig på en bar/bodega\n" +
            "Brækket mig på et spillested/klub\n" +
            "Tømt karaflen i et offentligt svømmebassin\n" +
            "Stjålet fra arbejde\n" +
            "Vågnet op i det fri, morgenen efter en fest\n" +
            "Været til Ros\n" +
            "Binget en hel serie på en dag\n" +
            "Blevet smidt ud af en klub\n" +
            "Set Totally Spies\n" +
            "Fået en bøde for at tisse offentligt\n" +
            "Fået en parkeringsbøde\n" +
            "Fået en fartbøde\n" +
            "Kysset med en, jeg gik i klasse med\n" +
            "Danset på et bord (drik dobbelt, hvis det gik i stykker)\n" +
            "Løjet om min alder\n" +
            "Brugt undskyldningen “jeg skal til læge” for at slippe for time\n" +
            "Skoddet en smøg på mig selv eller en anden\n" +
            "Tegnet på en fordrukken ven\n" +
            "Haft sex med 2 eller flere på samme uge \n" +
            "Kysset med en af samme køn\n" +
            "Kysset med en i dette rum\n" +
            "Blevet opereret \n" +
            "Brækket en knogle\n" +
            "Datet en kollega\n" +
            "Taget et bodytequila eller lagt krop til et\n" +
            "Stukket en finger i halsen på en anden\n" +
            "Stukket en finger i halsen på mig selv\n" +
            "Modtaget et nøgenbillede\n" +
            "Sendt et nøgenbillede\n" +
            "Grædt til filmen UP\n" +
            "Været med i en rap battle\n" +
            "Kastet en person ind i en væg\n" +
            "Haft et crush på en vens bror eller søster\n" +
            "Løjet om, hvor jeg kom fra\n" +
            "Stjålet noget mens jeg var fuld\n" +
            "Flirtet mig til en drink\n" +
            "Taget en “dagen-derpå pille”\n" +
            "Skadet en anden person under druk\n" +
            "Slået op med en person over telefon\n" +
            "Kysset med flere på samme aften\n" +
            "Taget en graviditetstest\n" +
            "Hjulpet min partner med at åbne min bh, fordi vedkommende ikke kunne\n" +
            "Faldet ned af en trappe under en bytur\n";

    public final static String rulePrompts = "Vælg et nyt navn til en medspiller \n" +
            "Vælg et nyt navn til en medspiller \n" +
            "Vælg to personer der skal være druk-makkere de næste /x runder\n" +
            "Regel kort. Gælder til næste regel kort er trukket.\n" +
            "Regel kort. Gælder til næste regel kort er trukket.\n" +
            "Regel kort. Gælder til næste regel kort er trukket.\n" +
            "Alle skal bruge deres venstre hånd til at drikke og spille spillet de næste /x runder. 2 straf tåre ved fejl\n" +
            "Vælg en druk bøddel - Hver gang du skal drikke må din bøddel give 1 tår væk\n" +
            "Hola! Du skal snakke et fremmedsprog de næste /x runder\n" +
            "Du skal synge med på musikken de næste /x runder\n";

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
            "Lave tomme dåser (uden pant), hver gang du klapper, eller et barn døbes dit fulde navn, hver gang du slår dig?\n" +
            "Covid-19 eller Krelle-19 virus? \n" +
            "Simon Sandbye eller Anton Sandbye?\n" +
            "Uvejr eller Big Time Rush temasang? (Vindersangen sættes på)\n" +
            "Pizza med ananas? Ja eller Nej\n" +
            "Du har to lasagner som du sætter ovenpå hinanden. Er det så 1 stor lasagne eller 2 lasagner, der bare er stablet?\n" +
            "Skifte køn eller blive til en peanut?\n" +
            "Nipple størrelse penis eller penis størrelse nipples?\n" +
            "Mokai eller sommersby?\n" +
            "Sismofytter eller Små sure?\n" +
            "Humaniora eller naturfag?\n" +
            "Har et sugerør 1 eller 2 huller?\n" +
            "Big Time Rush eller iCarly?\n" +
            "Hannah Montana eller Magi på Waverly Place?\n" +
            "Vild med dans eller X Factor?\n";


    public static String[] HELP_TEXT ={"Druk kortene beskriver handlinger der enten ender ud i at personen med mobilen selv skal drikke, må vælge nogle der må give tåre væk eller selv at må give tåre til væk.",
                                "Selskabskort er neutrale kort som ikke indeholder et specifikt antal tåre. De kan ses som ukategoriseret kort.",
                                "Kortet viser to ting. Der stemmes om hvilken der er den bedste. Første \"påstand\" et en hånd/tommel op, anden er hånd/tommel ned. Undertallet drikker antal tåre som personer i overtallet.",
                                "Sandheds kortet fremviser en påstand. Hvis der ikke står skål skal man selv svare på påstanden. Står der skål skal man vælge den person man føler der passer bedst til påstanden og skåle med dem",
                                "Jeg Har Aldrig fremviser et scenarie. Alle som har gjort været i dette scenarie drikker en tår.",
                                "Konsekvens kort beskriver noget man skal gøre. Hvis ikke dette udføres skal en straf tildeles.",
                                "Tæl ned fra 3. Alle peger på den person de mener der er mest tilbøjelig til at gøre den givne ting. Alle drikker antal tåre som der personer som peger på en.\n",
                                "Regelkort beskriver regler (duh) som gælder under spillet. Hvis antal runder reglen gælder samt staf tåre ikke er specificeret gælder reglerne resten af spillet med 1 straftår. "};

    public static String getHelpText(int i){
        return HELP_TEXT[i];
    }
}
