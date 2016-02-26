package com.navikraft.trial.navsacademy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

    }

    public void registerButtonHandler(View view) {

        Intent actsignup=new Intent(this,Signup.class);
        startActivity(actsignup);

    }

    public void forgetPassHanddeler(View view) {
        Intent forgetpassintent=new Intent(this,PasswordRecovery.class);
        startActivity(forgetpassintent);
    }

    public void dashBoardHandler(View view) {
        Intent dashboardintent=new Intent(this,DashBoard.class);
        startActivity(dashboardintent);
    }
}
