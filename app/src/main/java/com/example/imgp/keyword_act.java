package com.example.imgp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class keyword_act extends AppCompatActivity {

   String key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        EditText keyword=(EditText)findViewById(R.id.plain_text_input);
        Button bb = (Button) findViewById(R.id.submit_key);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key=keyword.getText().toString();

            }
        });
    }

}