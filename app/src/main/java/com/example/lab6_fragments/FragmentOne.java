package com.example.lab6_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class FragmentOne extends Fragment {

    interface OnFragmentSendDataListener {
        void onSendData(String data);
    }

    private OnFragmentSendDataListener fragmentSendDataListener;
    private Button button;
    private ToggleButton toggleButton;
    private CheckBox checkBox;
    private ImageButton imageButton;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            fragmentSendDataListener = (OnFragmentSendDataListener) context;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " должен реализовывать интерфейс OnFragmentInteractionListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        button = view.findViewById(R.id.button2);
        toggleButton = view.findViewById(R.id.toggleButton2);
        checkBox = view.findViewById(R.id.checkBox);
        imageButton = view.findViewById(R.id.imageButton6);

        button.setOnClickListener(onClickListener(1));
        toggleButton.setOnClickListener(onClickListener(2));
        checkBox.setOnClickListener(onClickListener(3));
        imageButton.setOnClickListener(onClickListener(4));

        return view;
    }

    private View.OnClickListener onClickListener(final int style) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameObject = "";
                if (style == 1) { nameObject = button.getText().toString(); }
                else if (style == 2) { nameObject = toggleButton.getText().toString(); }
                else if (style == 3) { nameObject = checkBox.getText().toString(); }
                else if (style == 4) { nameObject = "Изображение"; }
                fragmentSendDataListener.onSendData(nameObject);
            }
        };
    }
}