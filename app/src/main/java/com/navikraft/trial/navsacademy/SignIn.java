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
}
