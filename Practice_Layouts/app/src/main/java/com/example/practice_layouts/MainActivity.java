package com.example.practice_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String myStringArray[] = {"Amazon","FlipKart","Myntra"};
    ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_listview);

       listView = (ListView) findViewById(R.id.listview1);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myStringArray);
        //You can add data items manually without using array list.
//       adapter.add("Amazon");
//       adapter.add("Flipkart");
//       adapter.add("Myntra");

       listView.setAdapter(adapter);
       listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String str = adapter.getItem(position);
        Toast.makeText(this,str, Toast.LENGTH_SHORT).show();
    }
}