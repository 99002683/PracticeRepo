package com.example.practice_notificationsone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.practice_notificationsone.Notification.CHANNEL_1_ID;
import static com.example.practice_notificationsone.Notification.CHANNEL_2_ID;

public class MainActivity extends AppCompatActivity {
    EditText editTextTitle, editTextMessage;
    Button button1, button2;
    private NotificationManagerCompat notificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTitle = (EditText)findViewById(R.id.editText1);
        editTextMessage = (EditText)findViewById(R.id.editText2);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);

        notificationManager = NotificationManagerCompat.from(this);

    }
    public void sendOnChannel1(View view){
        String title = editTextTitle.getText().toString();
        String Message = editTextMessage.getText().toString();
        android.app.Notification notification = new NotificationCompat.Builder(this,CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_one)
                .setContentTitle(title)
                .setContentText(Message)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationManager.notify(1,notification);
    }

    public void sendOnChannel2(View view) {
        String title = editTextTitle.getText().toString();
        String Message = editTextMessage.getText().toString();
        android.app.Notification notification = new NotificationCompat.Builder(this,CHANNEL_2_ID)
                .setSmallIcon(R.drawable.ic_two)
                .setContentTitle(title)
                .setContentText(Message)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationManager.notify(2,notification);
    }
}