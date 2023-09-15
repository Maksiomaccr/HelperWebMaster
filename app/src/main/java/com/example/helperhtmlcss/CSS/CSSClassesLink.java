package com.example.helperhtmlcss.CSS;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.helperhtmlcss.Posts.CSS4;
import com.example.helperhtmlcss.Posts.CSS5;
import com.example.helperhtmlcss.R;


public class CSSClassesLink extends Fragment {

    Button buttonnext;

    int point = 1;

    Activity activity;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_c_s_s_classes_link, container, false);
        int newProgress5 = 25;

        SharedPreferences preferences = getActivity().getSharedPreferences("CSS", Context.MODE_PRIVATE);
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress5", newProgress5);
        editors.apply();



        buttonnext = view.findViewById(R.id.buttonnext);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new CSSLineLinks();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeCSS, fragment2).commit();
                try {
                    ((CSS5) activity).changePoint(point);

                } catch (ClassCastException ignored) {
                }
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