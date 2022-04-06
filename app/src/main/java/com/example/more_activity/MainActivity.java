package com.example.more_activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity
{
    // Array of strings...
    String[] selection = {"User Profile", "Terms of Service", "Contact Us", "Log Out"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.activity_listview, selection);

        ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adapter);
    }
}