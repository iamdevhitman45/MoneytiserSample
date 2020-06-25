package com.sample.moneytiser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.moneytise.Moneytiser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Moneytiser moneytiser = new Moneytiser.Builder().withPublisher("cineflix").loggable().build(this);
        moneytiser.start();
    }
}