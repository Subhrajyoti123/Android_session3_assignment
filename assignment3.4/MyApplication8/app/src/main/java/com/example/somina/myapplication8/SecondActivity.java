package com.example.somina.myapplication8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity{


    TextView textView;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.reference);
        textView= (TextView) findViewById(R.id.textView);
        Intent intent= getIntent();
        Bundle bundle= intent.getExtras();
        String username=bundle.getString("username");
        textView.setText("Welcome " + username);
    }
}
