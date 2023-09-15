package com.example.helperhtmlcss.Design;

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

import com.example.helperhtmlcss.Posts.D;
import com.example.helperhtmlcss.Posts.D2;
import com.example.helperhtmlcss.R;


public class DesignColorConversion extends Fragment {
    Button buttonnext;

    int point = 1;

    Activity activity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_design_color_conversion, container, false);
        int newProgress2 = 40;

        SharedPreferences preferences = getActivity().getSharedPreferences("Design", Context.MODE_PRIVATE);
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress2", newProgress2);
        editors.apply();


        buttonnext = view.findViewById(R.id.buttonnext);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new DesignContrast();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeDesign, fragment2).commit();
                try {
                    ((D2) activity).changePoint(point);

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