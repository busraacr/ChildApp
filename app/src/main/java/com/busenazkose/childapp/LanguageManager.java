package com.busenazkose.childapp;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;

public class LanguageManager {
    private Context ct;
    public LanguageManager(Context cont){
        ct = cont;
    }
    public void updateLang(String text){
        Locale locale = new Locale(text);
        Locale.setDefault(locale);
        Resources res = ct.getResources();
        Configuration config = res.getConfiguration();
        config.locale = locale;
        res.updateConfiguration(config, res.getDisplayMetrics());
    }

}