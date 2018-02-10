package com.codepath.mycustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        UserAdapter adapter = new UserAdapter(this, arrayOfUsers);
        ListView listView = (ListView) findViewById(R.id.lvItems);
        listView.setAdapter(adapter);

        User newUser = new User("Anicet", "Carrefour");
        adapter.add(newUser);
        adapter.add(new User("Arielle", "Delmas"));
        adapter.add(newUser);
        adapter.add(new User("Sarah", "Petionville"));
        adapter.add(newUser);
    }
}
