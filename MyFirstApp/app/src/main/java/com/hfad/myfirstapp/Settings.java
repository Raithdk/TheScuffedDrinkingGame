package com.hfad.myfirstapp;

public class Settings {
    public static int lowSips =1, hiSips=5;

    public static void setHiSips(int hiSips) {
        Settings.hiSips = hiSips;
    }

    public static void setLowSips(int lowSips) {
        Settings.lowSips = lowSips;
    }

    public static int getHiSips() {
        return hiSips;
    }

    public static int getLowSips() {
        return lowSips;
    }
}
