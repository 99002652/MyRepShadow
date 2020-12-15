package com.ltts.shadowproject.fragments;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ltts.shadowproject.R;

public class Dialogue_Fragment extends DialogFragment {
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dialogue_, container, false);

        button = view.findViewById(R.id.button);
        final TextView cat = (TextView) view.findViewById((R.id.category));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Added", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}