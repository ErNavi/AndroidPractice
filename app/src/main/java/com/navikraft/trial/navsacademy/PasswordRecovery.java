package com.navikraft.trial.navsacademy;

import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RelativeLayout;


public class PasswordRecovery extends AppCompatActivity{

    TextView tv_phone, tv_email;
    String str="Hiiiiii , i love u";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_recovery);

        tv_phone = (TextView) findViewById(R.id.tv_pm_choose_phone);
        tv_email = (TextView) findViewById(R.id.tv_pm_choose_email);
        final FragPmPhone fragPmPhone=new FragPmPhone();
        final FragPmEmail fragPmEmail=new FragPmEmail();

        tv_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm_phone=getFragmentManager();
                FragmentTransaction ft_phone= fm_phone.beginTransaction();
                ft_phone.remove(fragPmEmail);
                ft_phone.replace(R.id.pm_r_layout_phone,fragPmPhone,str);
                ft_phone.commit();

            }
        });

        tv_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm_email=getFragmentManager();
                FragmentTransaction ft_email=fm_email.beginTransaction();
                ft_email.remove(fragPmPhone);
                ft_email.replace(R.id.pm_r_layout_email,fragPmEmail,str);
                ft_email.commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_password_recovery, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(PasswordRecovery.this, "you choose Settings", Toast.LENGTH_LONG).show();
            return true;
        } else {
            if (id == R.id.action_imp) {
                Toast.makeText(PasswordRecovery.this, "you choose Important", Toast.LENGTH_LONG).show();
                return true;

            }
            return super.onOptionsItemSelected(item);
        }


    }


    public void showDialog(View view) {
        int t=R.string.pm_dialog_title;
        int b=R.string.pm_dialog_msg;
        PMAlertDialog myDialog=PMAlertDialog.newInstance(t,b);
        myDialog.show(getFragmentManager(),"dialog");
    }
}
