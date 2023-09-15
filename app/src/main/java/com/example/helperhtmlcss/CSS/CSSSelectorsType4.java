package com.example.helperhtmlcss.CSS;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.helperhtmlcss.Posts.CSS;
import com.example.helperhtmlcss.Posts.CSS2;
import com.example.helperhtmlcss.R;

public class CSSSelectorsType4 extends Fragment {
    Button buttonnext, buttonback;

    int point = 4;

    Activity activity;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_c_s_s_selectors_type4, container, false);
        int newProgress2 = 55;

        SharedPreferences preferences = getActivity().getSharedPreferences("CSS", Context.MODE_PRIVATE);
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress2", newProgress2);
        editors.apply();

        buttonnext = view.findViewById(R.id.buttonnext3);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new CSSGroup();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeCSS, fragment2).commit();
                try {
                    ((CSS2) activity).changePoint4(point);

                } catch (ClassCastException ignored) {
                }
            }
        });

        buttonback = view.findViewById(R.id.buttonback3);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new CSSSelectorsType3();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeCSS, fragment2).commit();
                try {
                    ((CSS2) activity).changePointback3(point);

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