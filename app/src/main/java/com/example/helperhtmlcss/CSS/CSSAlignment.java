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

import com.example.helperhtmlcss.CSS.CSSCurrentColor;
import com.example.helperhtmlcss.CSS.CSSFirstLine;
import com.example.helperhtmlcss.CSS.CSSLineBreak;
import com.example.helperhtmlcss.CSS.CSSLineBreak2;
import com.example.helperhtmlcss.CSS.CSSText;
import com.example.helperhtmlcss.Posts.CSS4;
import com.example.helperhtmlcss.R;


public class CSSAlignment extends Fragment {

    Button buttonnext, buttonback;

    int point = 7;

    Activity activity;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_c_s_s_alignment, container, false);
        int newProgress4 = 70;

        SharedPreferences preferences = getActivity().getSharedPreferences("CSS", Context.MODE_PRIVATE);
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress4", newProgress4);
        editors.apply();

        buttonnext = view.findViewById(R.id.buttonnext6);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new CSSFirstLine();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeCSS, fragment2).commit();
                try {
                    ((CSS4) activity).changePoint7(point);

                } catch (ClassCastException ignored) {
                }
            }
        });

        buttonback = view.findViewById(R.id.buttonback6);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new CSSLineBreak2();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeCSS, fragment2).commit();
                try {
                    ((CSS4) activity).changePointback6(point);

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