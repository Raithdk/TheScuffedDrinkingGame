package com.hfad.myfirstapp;

public class Settings {
    public static int lowSips =1, hiSips=5;
    public static String gamemode = "Normal";
    public static boolean isDrinkCard = true, isNeutralCard = true,
            isTruthCard = true, isDareCard = true,
            isNeverCard = true, isRuleCard = true,
            isVoteCard = true, isPersonalCard = true;
    public static boolean isDevBoxActivated = false;


    public static void setIsPersonalCard(boolean isPersonalCard){ Settings.isPersonalCard= isPersonalCard; }
    public static void setHiSips(int hiSips) {
        Settings.hiSips = hiSips;
    }

    public static void setLowSips(int lowSips) {
        Settings.lowSips = lowSips;
    }

    public static void setIsDareCard(boolean isDareCard) {
        Settings.isDareCard = isDareCard;
    }

    public static void setIsDrinkCard(boolean isDrinkCard) {
        Settings.isDrinkCard = isDrinkCard;
    }

    public static void setIsNeutralCard(boolean isNeutralCard) {
        Settings.isNeutralCard = isNeutralCard;
    }

    public static void setIsNeverCard(boolean isPointCard) {
        Settings.isNeverCard = isNeverCard;
    }

    public static void setIsRuleCard(boolean isRuleCard) {
        Settings.isRuleCard = isRuleCard;
    }

    public static void setIsTruthCard(boolean isTruthCard) {
        Settings.isTruthCard = isTruthCard;
    }

    public static void setIsVoteCard(boolean isVoteCard) {
        Settings.isVoteCard = isVoteCard;
    }

    public static int getHiSips() {
        return hiSips;
    }

    public static int getLowSips() {
        return lowSips;
    }

    public static String getGamemode() {
        return gamemode;
    }

    public static void setGamemode(String gamemode) {
        Settings.gamemode = gamemode;
    }
}
