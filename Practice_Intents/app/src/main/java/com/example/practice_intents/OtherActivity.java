package com.example.practice_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other2);

        Toast.makeText(this,"Landed in Other Activity",Toast.LENGTH_SHORT).show();

        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("Key");
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();

        
    }
}