package com.example.helperhtmlcss;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.helperhtmlcss.Posts.Post4;


public class Anchors extends Fragment {
    Button buttonend, buttonback;
    public int point = 7;
    Activity activity;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_anchors, container, false);

        int newProgress4 = 75;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress4", newProgress4);
        editors.apply();


        buttonend = view.findViewById(R.id.buttonend);
        buttonend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HTMLCource.class);
                startActivity(intent);

            }
        });
        buttonback = view.findViewById(R.id.buttonback6);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new OtnsPath2();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place2, fragment).commit();
                try {
                    ((Post4) activity).change4PointBack6(point);
                } catch (ClassCastException ignored) {}
            }
        });


        return view;
    }
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof Activity){
            activity = (Activity) context;
        }
    }
}