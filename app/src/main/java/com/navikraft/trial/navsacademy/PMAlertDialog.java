package com.navikraft.trial.navsacademy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by AmazingNaveen on 19/02/2016.
 */
public class PMAlertDialog extends DialogFragment {

    public static PMAlertDialog newInstance(int title, int body) {
        PMAlertDialog frag = new PMAlertDialog();
        Bundle args = new Bundle();
        args.putInt("title", title);
        args.putInt("body", body);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int title = getArguments().getInt("title");
        int body = getArguments().getInt("body");
        return new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setPositiveButton(R.string.pm_dialog_pbtn_text,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                Toast.makeText(getActivity(), "gotch ya!", Toast.LENGTH_LONG).show();
                            }
                        }
                )
                .setNegativeButton(R.string.pm_dialog_nbtn_text,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                Toast.makeText(getActivity(), "oops bye i'm gone..!", Toast.LENGTH_LONG).show();
                            }
                        }
                )
                .setMessage(body)
                .create();
    }


//
//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        int title = getArguments().getInt("title");
//
//        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
//        builder.setTitle(title)
//                .setPositiveButton(R.string.pm_dialog_pbtn_text, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getActivity(),"gotch ya!",Toast.LENGTH_LONG).show();
//                    }
//                })
//                .setNegativeButton(R.string.pm_dialog_nbtn_text, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(getActivity(), "oops bye i'm gone..!", Toast.LENGTH_LONG).show();
//                    }
//                })
//                .setMessage(R.string.pm_dialog_msg);
//        AlertDialog dialog=builder.create();
//        return dialog;
//    }

//    void showDialog() {
//        DialogFragment newFragment=PMAlertDialog.newInstance(R.string.pm_dialog_title);
//        newFragment.show(getFragmentManager(), "dialog");
//    }


}
