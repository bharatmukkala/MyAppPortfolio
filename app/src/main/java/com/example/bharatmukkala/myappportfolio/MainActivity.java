package com.example.bharatmukkala.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void popularMovies(View v)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This will launch Popular Movies App", Toast.LENGTH_LONG);
        toast.show();
    }
    public void stockHawk(View v)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This will launch Stock Hawk App", Toast.LENGTH_LONG);
        toast.show();
    }
    public void buildItBigger(View v)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "Build It Bigger", Toast.LENGTH_LONG);
        toast.show();
    }
    public void makeMaterialApp(View v)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "Make your App Material ", Toast.LENGTH_LONG);
        toast.show();
    }
    public void goUbiquitous(View v)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "Go Ubiquitous", Toast.LENGTH_LONG);
        toast.show();
    }
    public void capstone(View v)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "Capstone Project", Toast.LENGTH_LONG);
        toast.show();
    }
}
