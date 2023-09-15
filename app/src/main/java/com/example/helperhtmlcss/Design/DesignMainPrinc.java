package com.example.helperhtmlcss.Design;

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

import com.example.helperhtmlcss.CSS.CSSStruct;
import com.example.helperhtmlcss.Posts.CSS;
import com.example.helperhtmlcss.Posts.D;
import com.example.helperhtmlcss.R;

public class DesignMainPrinc extends Fragment {

    Button buttonnext;

    int point = 1;

    Activity activity;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_design_main_princ, container, false);
        int newProgress = 40;

        SharedPreferences preferences = getActivity().getSharedPreferences("Design", Context.MODE_PRIVATE);
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress", newProgress);
        editors.apply();


        buttonnext = view.findViewById(R.id.buttonnext);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new DesignScript();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeDesign, fragment2).commit();
                try {
                    ((D) activity).changePoint(point);

                } catch (ClassCastException ignored) {
                }}});

        return view;
    }
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            activity = (Activity) context;
        }

    }
}