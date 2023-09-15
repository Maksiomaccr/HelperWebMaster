package com.example.helperhtmlcss;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.helperhtmlcss.Posts.Post;


public class HTMLBase extends Fragment {


    Button buttonnext;

    int point = 1;

    Activity activity;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_h_t_m_l_base, container, false);


        int newProgress = 10;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress", newProgress);
        editors.apply();

        buttonnext = view.findViewById(R.id.buttonnext1);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new Tags();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place, fragment2).commit();


                try {
                    ((Post) activity).changePoint(point);

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