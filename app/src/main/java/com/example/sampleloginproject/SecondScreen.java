package com.example.sampleloginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends Activity
{
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        tv=findViewById(R.id.tv2);

        Intent ii=getIntent();

        String user=ii.getStringExtra("msg");
        tv.setText("WEL-COME AUTHORIZED USER :"+user);
    }
}
