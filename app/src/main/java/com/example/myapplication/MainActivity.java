package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view) {
        Intent intent = new Intent(this, togglebutton.class);
        startActivity(intent);
    }

    public void enviar2(View view) {
        Intent intent = new Intent(this, auto.class);
        startActivity(intent);
    }


}
