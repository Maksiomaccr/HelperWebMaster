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

import com.example.helperhtmlcss.Posts.D3;
import com.example.helperhtmlcss.Posts.D4;
import com.example.helperhtmlcss.R;


public class RuleGrid extends Fragment {
    Button buttonnext, buttonback;

    int point = 2;

    Activity activity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rule_grid, container, false);
        int newProgress4 = 40;

        SharedPreferences preferences = getActivity().getSharedPreferences("Design", Context.MODE_PRIVATE);
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress4", newProgress4);
        editors.apply();


        buttonnext = view.findViewById(R.id.buttonnext1);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new RulePrint();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeDesign, fragment2).commit();
                try {
                    ((D4) activity).changePoint2(point);

                } catch (ClassCastException ignored) {
                }}});
        buttonback = view.findViewById(R.id.buttonback1);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new RuleInOut();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeDesign, fragment2).commit();
                try {
                    ((D4) activity).changePointback(point);

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