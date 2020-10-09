package com.example.implicitintentreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        Uri uri=intent.getData();
        if(uri!=null){
            TextView textView=findViewById(R.id.text_uri_message);
            textView.setText("URI: "+uri.toString());
        }
    }
}
