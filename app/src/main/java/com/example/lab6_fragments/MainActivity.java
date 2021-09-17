package com.example.lab6_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnFragmentSendDataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSendData(String selectedItem) {
        FragmentTwo fragment = (FragmentTwo) getSupportFragmentManager()
                .findFragmentById(R.id.fragment2);
        if (fragment != null)
            fragment.setSelectedItem(selectedItem);
    }
}