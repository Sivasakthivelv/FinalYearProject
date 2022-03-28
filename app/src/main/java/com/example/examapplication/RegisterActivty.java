package com.example.examapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

import butterknife.BindView;

public class RegisterActivty  extends AppCompatActivity {


    SessionManager sessionManager;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    String MobilePattern = "[0-9]{10}";

    @BindView(R.id.tv_name)
    EditText tv_name;
    @BindView(R.id.tv_regno)
    EditText tv_regno;
    @BindView(R.id.tv_department)
    EditText tv_department;
    @BindView(R.id.tv_email)
    EditText tv_email;
    @BindView(R.id.tv_phone)
    EditText tv_phone;
    @BindView(R.id.tv_password)
    EditText tv_password;
    @BindView(R.id.btn_submit)
    Button btn_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        sessionManager = new SessionManager(this);

        initview();

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (vaildData()){
                   Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                   Intent intent = new Intent(RegisterActivty.this,DepartmentPage.class);
                   sessionManager.setuserLogin("isLogin");
                   startActivity(intent);
                   finish();
               }
            }
        });
    }

    public  boolean vaildData(){
        boolean valid = true;
        if (tv_name.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter the name", Toast.LENGTH_LONG).show();
            valid = false;
        } else if (tv_regno.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter the Register no", Toast.LENGTH_LONG).show();
            valid = false;
        }
        else if (tv_department.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter the Department", Toast.LENGTH_LONG).show();
            valid = false;
        }
        else if (tv_email.getText().toString().isEmpty() || !VALID_EMAIL_ADDRESS_REGEX.matcher(tv_email.getText().toString()).matches()) {
            Toast.makeText(getApplicationContext(), "Invalid email id", Toast.LENGTH_LONG).show();
            valid = false;
        }
        else if (tv_phone.getText().toString().isEmpty()/* || !MobilePattern.matches(tv_phone.getText().toString())*/) {
            Toast.makeText(getApplicationContext(), "Enter the Phone", Toast.LENGTH_LONG).show();
            valid = false;
        }
        else if (tv_password.getText().toString().isEmpty() && !(tv_password.getText().length() >= 6)) {
            Toast.makeText(getApplicationContext(), "Enter the password", Toast.LENGTH_LONG).show();
            valid = false;
        }
        return valid;
    }

    public void initview(){
        tv_name = findViewById(R.id.tv_name);
        tv_regno = findViewById(R.id.tv_regno);
        tv_department = findViewById(R.id.tv_department);
        tv_email = findViewById(R.id.tv_email);
        tv_phone = findViewById(R.id.tv_phone);
        tv_password = findViewById(R.id.tv_password);
        btn_submit = findViewById(R.id.btn_submit);
    }

}
