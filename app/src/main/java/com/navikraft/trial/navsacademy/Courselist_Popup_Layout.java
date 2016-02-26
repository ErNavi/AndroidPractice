package com.navikraft.trial.navsacademy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Courselist_Popup_Layout extends DialogFragment {



    public static Courselist_Popup_Layout dataSeeker(String title, String body){
        Courselist_Popup_Layout dataseeker=new Courselist_Popup_Layout();
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
                        Toast.makeText(getActivity(), "gotch ya!", Toast.LENGTH_SHORT).show();
                    }
                })
                .create();

    }
}
