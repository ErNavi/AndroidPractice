package com.navikraft.trial.navsacademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ChooseImg extends AppCompatActivity {


    //ListView contact_list;
    GridView img_grid;
    List<Img> data1 = ImgProvider.getData();
    ArrayAdapter<Img> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_img);


        adapter=new ArrayAdapter<Img>(this,R.layout.choose_img_layout,data1);

        img_grid=(GridView) findViewById(R.id.gv_choose_img);
        registerForContextMenu(img_grid);
        img_grid.setAdapter(adapter);
        img_grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Img img = data1.get(position);
                Toast.makeText(getApplicationContext(), "hwxs u doing" + getApplicationContext() + "__" + this, Toast.LENGTH_LONG).show();
                //displayQueDetails(view, course1);

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_choose_img, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings){
            Toast.makeText(ChooseImg.this, "you choose Settings", Toast.LENGTH_LONG).show();
            return true;
        }
        else{
            if (id == R.id.action_imp){
                Toast.makeText(ChooseImg.this,"you choose Important",Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);
            }
            return super.onOptionsItemSelected(item);
        }
    }
}
