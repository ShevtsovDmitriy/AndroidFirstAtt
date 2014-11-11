package com.example.androidfirstatt;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ListViewActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.list_view);
        ArrayList<User> list = new ArrayList<User>();
        User usr = new User();
        usr.SetName("name_1");
        usr.SetInfo("Some info about user_1");
        usr.SetPic(R.drawable.ic_launcher);
        list.add(usr);
        usr.SetName("name_2");
        usr.SetInfo("Some info about user_2");
        usr.SetPic(R.drawable.ic_launcher);
        list.add(usr);
        usr.SetName("name_3");
        usr.SetInfo("Some info about user_3");
        usr.SetPic(R.drawable.ic_launcher);
        list.add(usr);
        usr.SetName("name_4");
        usr.SetInfo("Some info about user_4");
        usr.SetPic(R.drawable.ic_launcher);
        list.add(usr);
        usr.SetName("name_5");
        usr.SetInfo("Some info about user_5");
        usr.SetPic(R.drawable.ic_launcher);
        list.add(usr);
        usr.SetName("name_6");
        usr.SetInfo("Some info about user_6");
        usr.SetPic(R.drawable.ic_launcher);
        list.add(usr);
        usr.SetName("name_7");
        usr.SetInfo("Some info about user_7");
        usr.SetPic(R.drawable.ic_launcher);
        list.add(usr);
        usr.SetName("name_8");
        usr.SetInfo("Some info about user_8");
        usr.SetPic(R.drawable.ic_launcher);
        list.add(usr);usr.SetName("name_9");
        usr.SetInfo("Some info about user_9");
        usr.SetPic(R.drawable.ic_launcher);
        list.add(usr);

        listView.setAdapter(new MyAdapter(this, R.layout.list_item, list));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
