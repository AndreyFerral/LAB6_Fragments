package com.example.lab6_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnFragmentSendDataListener {

    @Override
    // Метод, который вызывается, когда приложение создает и отображает Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // вызов метода родительского класса
        setContentView(R.layout.activity_main); // устанавливаем содержимое Activity из layout-файла
    }

    @Override
    public void onSendData(String nameObject) {

        // Определяем фрагмент, который получит данные
        FragmentTwo fragment = (FragmentTwo) getSupportFragmentManager()
                .findFragmentById(R.id.fragment2);

        // Отправляем данные
        if (fragment != null) fragment.setSelectedItem(nameObject);
    }
}