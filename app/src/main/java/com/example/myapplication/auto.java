package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class auto extends AppCompatActivity {

    private String[] os = { "Android", "Windows Vista", "Windows 7",
            "Windows 8", "Ubuntu 12.04", "Ubuntu 12.10", "Mac OSX", "iOS 5",
            "iOS 6", "Solaris", "Kubuntu", "Suse" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, os);

        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.txtOS);

        textView.setThreshold(3);
        textView.setAdapter(adapter);

    }



}
