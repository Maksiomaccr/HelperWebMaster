package com.example.helperhtmlcss;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.helperhtmlcss.Posts.Post2;


public class ConsoleText extends Fragment {
    Button buttonnext, buttonback;
    public int point = 5;
    Activity activity;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_console_text, container, false);

        int newProgress2 = 40;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress2", newProgress2);
        editors.apply();


        buttonnext = view.findViewById(R.id.buttonnext5);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Citata();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place2, fragment).commit();
                try {
                    ((Post2) activity).change2Point4(point);
                } catch (ClassCastException ignored) {}
            }
        });
        buttonback = view.findViewById(R.id.buttonback4);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Perenos();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place2, fragment).commit();
                try {
                    ((Post2) activity).change2PointBack4(point);
                } catch (ClassCastException ignored) {}
            }
        });

        return view;
    }
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
    }
}