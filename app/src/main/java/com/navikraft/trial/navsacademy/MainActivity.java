package com.navikraft.trial.navsacademy;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String Log_Tag = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitOnClickListner();
    }

    public void submitOnClickListner() {
    Button sub_btn = (Button) findViewById(R.id.btn_submit);
    sub_btn.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View v){
        Log.d(Log_Tag, "Button Clicked");
    }});
}

}
