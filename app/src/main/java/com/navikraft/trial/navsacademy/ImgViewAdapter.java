package com.navikraft.trial.navsacademy;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by AmazingNaveen on 26/02/2016.
 */
public class ImgViewAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList data;
    private int layoutResourceId;

    public ImgViewAdapter(Context context, int layoutResourceId, ArrayList data) {
        super(context, layoutResourceId, data);
        this.context=context;
        this.data=data;
        this.layoutResourceId=layoutResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        RecyclerView.ViewHolder holder=null;

        if(row==null)
        {
            LayoutInflater inflater=((Activity)context).getLayoutInflater();
            row=inflater.inflate(layoutResourceId,parent,false);
            holder=new RecyclerView.ViewHolder() {
                @Override
                public String toString() {
                    return super.toString();

                }
            }

        }

        return super.getView(position, convertView, parent);

    }
}
