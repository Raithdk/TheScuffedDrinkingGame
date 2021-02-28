package com.hfad.myfirstapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtCardHandler {
    File cardFile;
    Scanner inputStream;

    //Header values: Category, Color,
    String category;
    String color;
    String cardType;
    List<String> cardMeta = new ArrayList<>();

    public TxtCardHandler(String fName) throws FileNotFoundException {
        cardFile = new File(fName);

        if (cardFile.exists()){
           inputStream = new Scanner(cardFile);
           cardType = cardFile.getName().replace(".txt", "");
           scanFile();
        }

    }

    public String[] getCardMeta(){
        String[] s = new String[cardMeta.size()];
        for (int i = 0; i < cardMeta.size(); i++){
            s[i] = cardMeta.get(i);
        }
        return s;
    }

    private void scanFile(){
        if(inputStream.hasNext()){
            splitHeader(inputStream.nextLine());
            int lines = 1;

            while(inputStream.hasNext()){
               cardMeta.add(inputStream.nextLine());
               lines++;
            }
            System.out.println("File Scanned. " + lines + " found");
        } else{
            System.out.println("File Empty");
        }
    }

    private void splitHeader(String header){
        String[] h = header.split(";");
        try {
            category = h[0];
            color = h[1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("HEADER ERROR " + cardType + ".txt IS MISSING CORRECT HEADER" );
        }
    }

    public String getCategory() {
        return category;
    }
    public String getColor(){
     return color;
    }
    public String getCardType(){return  cardType; }
}
