package com.example.examapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    SessionManager sessionManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        sessionManager =  new SessionManager(this);
        openActivity();
    }
    public void openActivity() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                redirection();
            }
        }, 3000);
    }
    public void redirection(){
       // if (sessionManager.getLogged()){
            Intent main  =  new Intent(this,DepartmentPage.class);
            startActivity(main);
            finish();
      /*  }else{
            Intent intent = new Intent(this,SigninSignupActivity.class);
            startActivity(intent);
            finish();
        }*/

    }

}
