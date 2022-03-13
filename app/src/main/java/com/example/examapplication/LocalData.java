package com.example.examapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalData {
    private final Context context;
    SharedPreferences sharedPref ;


    public LocalData(Context context){
        this.context = context;
        sharedPref =context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public final static String PREFS_NAME = "appname_prefs";

    public boolean sharedPreferenceExist(String key)
    {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        if(!prefs.contains(key)){
            return true;
        }
        else {
            return false;
        }
    }

    public  void setInt( String key, int value) {
        sharedPref= context.getSharedPreferences(PREFS_NAME,0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public  int getInt(String key) {
        sharedPref = context.getSharedPreferences(PREFS_NAME, 0);
        return sharedPref.getInt(key, 0);
    }

    public  void setStr(String key, String value) {
        sharedPref = context.getSharedPreferences(PREFS_NAME,0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public  String getStr(String key) {
        sharedPref = context.getSharedPreferences(PREFS_NAME, 0);
        return sharedPref.getString(key,"DNF");
    }

    public  void setBool(String key, boolean value) {
        sharedPref = context.getSharedPreferences(PREFS_NAME,0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public  boolean getBool(String key) {
        sharedPref= context.getSharedPreferences(PREFS_NAME, 0);
        return sharedPref.getBoolean(key,false);
    }

}
