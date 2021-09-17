package com.example.lab6_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    // Устанавливаем значение текстовому полю
    public void setSelectedItem(String nameObject) {
        TextView view = (TextView) getView().findViewById(R.id.textView);
        view.setText(nameObject);
    }
}