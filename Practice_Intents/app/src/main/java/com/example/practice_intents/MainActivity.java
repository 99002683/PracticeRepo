package com.example.practice_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv1;
    Button toastButton ;
    Button dialerButton;
    Button showLocationButton;
    Button showWebPage;
    Button viewIntent;
    Button proIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textview1);
        toastButton = (Button) findViewById(R.id.toast);
        dialerButton = (Button) findViewById(R.id.dialer_number);
        showLocationButton = (Button) findViewById(R.id.show_location);
        showWebPage = (Button) findViewById(R.id.show_Webpage);
        viewIntent = (Button) findViewById(R.id.view_intents);
        proIntent = (Button) findViewById(R.id.pro_intents);


        toastButton.setOnClickListener(this);
        dialerButton.setOnClickListener(this);
        showLocationButton.setOnClickListener(this);
        showWebPage.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        proIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.toast:
                Intent intent = new Intent(MainActivity.this,OtherActivity.class);
                startActivity(intent);
                break;

//            case R.id.show_location:
//                break;

            //to give service to other activity
            //To make a phone call at a given number 91-000-000-0000, you need to specify tel: as URI using setData() method.
            case R.id.dialer_number:
                //first method
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234569870"));
                startActivity(intent1);

                //second method
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:0377778888"));
                break;
             //but instead declare a general action to perform, which allows a component from another app to handle it.
            case R.id.show_location:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:19.1681917,72.9916759"));
                startActivity(intent2);
                break;

            case R.id.show_Webpage:
                Intent intent3 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://aosp.opersys.com/xref/android-10.0.0_r47/"));
                startActivity(intent3);
                break;

            case R.id.view_intents:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                startActivity(intent4);
                break;

            case R.id.pro_intents:
                //Using Component:  You'll typically use an explicit intent to start a component in your own app, because you know the class name of the activity or service you want to start.
//                Intent intent5 = new Intent("com.example.practice_intents.OtherActivity");
//                startActivity(intent5);

                //Using ACTION.VIEW in manifest file.
//                Intent intent6 = new Intent(Intent.ACTION_VIEW);
//                startActivity(intent6);

                //Using putExtra sending data to next activity, where that data will be stored in bundle in that activity.
                Intent intent7 = new Intent(Intent.ACTION_VIEW);
                intent7.putExtra("Key","Time is Money");
                startActivity(intent7);
                break;
        }
    }
}