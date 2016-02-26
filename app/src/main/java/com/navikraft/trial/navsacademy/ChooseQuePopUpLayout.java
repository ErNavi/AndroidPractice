package com.navikraft.trial.navsacademy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by AmazingNaveen on 22/02/2016.
 */
public class ChooseQuePopUpLayout extends DialogFragment {


    public static ChooseQuePopUpLayout dataSeeker(String title, String body){
        ChooseQuePopUpLayout dataseeker= new ChooseQuePopUpLayout();
        Bundle data=new Bundle();
        data.putString("body_text", body);
        data.putString("title", title);
        dataseeker.setArguments(data);
        return dataseeker;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        String title=getArguments().getString("title");
        String body=getArguments().getString("body_text");

        return new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(body)
                .setPositiveButton(R.string.dismiss_text, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent ChooseImgIntent =new Intent(getContext(),ChooseImg.class);
                        startActivity(ChooseImgIntent);
                        Toast.makeText(getActivity(), "gotch ya!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();

    }
}


