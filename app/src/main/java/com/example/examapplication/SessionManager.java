package com.example.examapplication;

import android.content.Context;

public class SessionManager {

    LocalData localData;

    public SessionManager(Context context){
        localData = new LocalData(context);
    }
    String userLogin =" onum illa";
    Boolean  logged = false;

    public Boolean getLogged() {
        localData.getBool("logged");
        return logged;
    }

    public void setLogged(Boolean logged) {
        localData.setBool("logged",logged);
        this.logged = logged;
    }

    public String getUserLogin() {
        localData.getStr("userlogin");
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        localData.setStr("userlogin",userLogin);
        this.userLogin = userLogin;
    }


}
