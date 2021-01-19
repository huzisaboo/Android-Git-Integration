package com.huzaifa.androidgitintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMeBtn = (Button) findViewById(R.id.clickmebutton);
        clickMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Welcome to Huzaifa Saboowala's App",Toast.LENGTH_SHORT).show();
            }
        });
    }
}