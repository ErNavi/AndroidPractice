package com.navikraft.trial.navsacademy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Iterator;
import java.util.List;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);


        final List<Course> data=DataProvider.getData();
//        Iterator<Course> iterator=data.iterator();
//            while(iterator.hasNext()){
//                Course course=iterator.next();
//            }

        ArrayAdapter<Course> courselistAdapter=new ArrayAdapter<Course>(this,android.R.layout.simple_list_item_1,data);
        ListView listView= (ListView) findViewById(R.id.list_course);
        listView.setAdapter(courselistAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Course course = data.get(position);

                DisplayDetails(view, course);
            }
        });

    }

    private void DisplayDetails(View view,Course course) {


        String title=course.getTitle();
        String body=course.getDescription();
        Courselist_Popup_Layout newdialog=Courselist_Popup_Layout.dataSeeker(title,body);
        newdialog.show(getFragmentManager(),"dialog");


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings){
            Toast.makeText(DashBoard.this, "you choose Settings", Toast.LENGTH_LONG).show();
            return true;
        }
        else{
        if (id == R.id.action_imp){
            Toast.makeText(DashBoard.this,"you choose Important",Toast.LENGTH_LONG).show();
            return super.onOptionsItemSelected(item);
            }
            return super.onOptionsItemSelected(item);
        }
    }


}
