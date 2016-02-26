package com.navikraft.trial.navsacademy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

/**
 * Created by AmazingNaveen on 22/02/2016.
 */
public class ChooseQue extends AppCompatActivity {

    ListView contact_list;
    List<Course> data1 = DataProvider.getData();
    ArrayAdapter<Course> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_que);

        adapter=new ArrayAdapter<Course>(this,android.R.layout.simple_list_item_1,data1);

        contact_list=(ListView) findViewById(R.id.lv_contacts);
        registerForContextMenu(contact_list);
        contact_list.setAdapter(adapter);
        contact_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Course course1 = data1.get(position);
                Toast.makeText(getApplicationContext(),"hwxs u doing"+getApplicationContext()+"__"+this,Toast.LENGTH_LONG).show();
                displayQueDetails(view, course1);
            }
        });
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.cm_choose_que_add:
                Toast.makeText(this,"u choose to add",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.cm_choose_que_edit:
                Toast.makeText(this,"u choose to edit",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.cm_choose_que_del:
                data1.remove(info.position);
                adapter.notifyDataSetChanged();
                return true;
            default:
                Toast.makeText(this,"u choose to nothing",Toast.LENGTH_SHORT).show();
                return super.onContextItemSelected(item);
        }



    }

    private void displayQueDetails(View view, Course course) {

        String title=course.getTitle();
        String body=course.getDescription();
        ChooseQuePopUpLayout newdialog1=ChooseQuePopUpLayout.dataSeeker(title,body);
        newdialog1.show(getFragmentManager(),"dialog1");

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater m_inflater=getMenuInflater();
        m_inflater.inflate(R.menu.cm_choose_que,menu);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_choose_que, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings){
            Toast.makeText(ChooseQue.this, "you choose Settings", Toast.LENGTH_LONG).show();
            return true;
        }
        else{
            if (id == R.id.action_imp){
                Toast.makeText(ChooseQue.this,"you choose Important",Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);
            }
            return super.onOptionsItemSelected(item);
        }
    }

}
