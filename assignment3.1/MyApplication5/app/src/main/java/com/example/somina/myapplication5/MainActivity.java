package com.example.somina.myapplication5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.search);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          String dataSearch = editText.getText().toString();
                                          Intent intent = new Intent();
                                          intent.setAction(Intent.ACTION_VIEW);
                                          try {
                                              dataSearch = URLEncoder.encode(dataSearch, "UTF-8");
                                          } catch (UnsupportedEncodingException e) {
                                              e.printStackTrace();
                                          }
                                          intent.setData(Uri.parse("https://www.google.co.in/#q=" + dataSearch));
                                          startActivity(intent);

                                      }
                                  }
            );

    }
}






