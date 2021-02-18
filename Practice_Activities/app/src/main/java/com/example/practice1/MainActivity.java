package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private static String TAG ="MainActivity";
    Button push;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView1);
        push = (Button)findViewById(R.id.button);

        //second method
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date date = new Date();

                textView.setText("Today is " +date);
                Log.i(TAG,"In ClickHandler");
            }
        });
    }
//First method
//    public void clickHandler(View view){
//        Date date = new Date();
//
//        textView.setText("Today is " +date);
//        Toast.makeText(this,"Button is clicked",Toast.LENGTH_LONG).show();
//        Log.i(TAG,"In ClickHandler");
//    }

}