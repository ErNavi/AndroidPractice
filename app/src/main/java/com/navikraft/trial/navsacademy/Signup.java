package com.navikraft.trial.navsacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    public static final String Log_Tag = "Signup";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        submitOnClickListner();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_signup, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings){
            Toast.makeText(Signup.this,"you choose Settings",Toast.LENGTH_LONG).show();
            return true;
        }
        else {
            if (id == R.id.action_imp) {
                Toast.makeText(Signup.this, "you choose Important", Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);
            }
            return super.onOptionsItemSelected(item);
        }
    }

    public void submitOnClickListner() {
    Button sub_btn = (Button) findViewById(R.id.btn_submit);
    sub_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Log.d(Log_Tag, "Button Clicked");
            Intent ChooseQueIntent =new Intent(Signup.this,ChooseQue.class);
            startActivity(ChooseQueIntent);
        }
    });
}

}
