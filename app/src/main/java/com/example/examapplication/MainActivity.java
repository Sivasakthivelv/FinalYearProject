package com.example.examapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SessionManager sessionManager;
    TextView tv_ti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sessionManager =  new SessionManager(this);

        tv_ti = findViewById(R.id.tv_ti);
        tv_ti.setText(sessionManager.getLogged().toString());

    }
}