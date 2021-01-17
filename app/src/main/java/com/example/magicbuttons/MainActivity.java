package com.example.magicbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonBlue, buttonPink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBlue = (Button) findViewById(R.id.buttonblueInvisible);
        buttonPink = (Button) findViewById(R.id.buttonpinkpather);
    }
    public void ToDo(View v){
        if(v.equals(buttonBlue))
            //Invisibility
            v.setVisibility(View.INVISIBLE);
        if(v.equals(buttonPink))
            // Pop-Up
            Toast.makeText(getApplicationContext(),"Hi there!",Toast.LENGTH_SHORT).show();

    }

}