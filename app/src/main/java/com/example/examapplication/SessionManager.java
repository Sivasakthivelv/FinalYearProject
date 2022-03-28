package com.example.examapplication;

import android.content.Context;

public class SessionManager {

    Context context;
    LocalData localData;


    public SessionManager(Context context) {
        this.context = context;
        localData = new LocalData(context);
    }

    String name = "";

    public String getName() {
        return localData.getStr("name");
    }

    public void setName(String name) {
        localData.setStr("name",name);
        this.name = name;
    }

    public void setuserLogin(String userLogin){
        localData.setStr("userLogin",userLogin);
    }
    public String getuserLogin(){
        return localData.getStr("userLogin");
    }



}
