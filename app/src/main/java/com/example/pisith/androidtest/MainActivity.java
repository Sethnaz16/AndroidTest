package com.example.pisith.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pisith.androidtest.collector.Name;

import org.jdom2.Document;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name name = new Name("Pisith");
        name.doSomething();
    }

}
