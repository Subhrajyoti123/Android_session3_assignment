package com.example.somina.myapplication6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(intent.ACTION_VIEW);
                intent.setData(Uri.parse("content://contacts/people"));
                startActivity(intent);

            }

        });

    }

}


