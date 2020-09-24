package com.example.sampleloginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText etUser,etPass;
    Button btnLogin,btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser=findViewById(R.id.etUser);
        etPass=findViewById(R.id.etPass);

        btnLogin=findViewById(R.id.btnLogin);
        btnCancel=findViewById(R.id.btnCancel);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String user=etUser.getText().toString();
                String pass=etPass.getText().toString();

                if(user.equals("PRIYANKA") && pass.equals("ANDROID"))
                {
                    Toast.makeText(getApplicationContext(),"WEL-COME AUTHORIZED USER",Toast.LENGTH_LONG).show();
                    Intent ii=new Intent(getApplicationContext(),SecondScreen.class);
                    ii.putExtra("msg",user);
                    startActivity(ii);
                    finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"YOU ARE UNAUTHORIZED USER",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                etUser.setText(" ");
                etPass.setText(" ");
            }
        });
    }
}
