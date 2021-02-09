package com.example.practice_popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MenuItem.OnMenuItemClickListener, PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopup(View v){
        PopupMenu popupMenu = new PopupMenu(this,v);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menu_file);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1:
                Toast.makeText(this,"This is Option One",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.option2:
                Toast.makeText(this,"This is Option Two",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.option3:
                Toast.makeText(this,"This is Option Three",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.option4:
                Toast.makeText(this,"This is Option Four",Toast.LENGTH_LONG).show();
                return  true;
            default:
                return false;
        }
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}