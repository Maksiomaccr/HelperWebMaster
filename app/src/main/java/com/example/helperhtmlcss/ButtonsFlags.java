package com.example.helperhtmlcss;

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

import com.example.helperhtmlcss.Posts.Post7;


public class ButtonsFlags extends Fragment {
    Button buttonnext, buttonback;
    public int point = 7;
    Activity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_buttons_flags, container, false);

        int newProgress7 = 70;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress7", newProgress7);
        editors.apply();

        buttonnext = view.findViewById(R.id.buttonnext6);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new FormsEnd();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place, fragment2).commit();
                try {
                    ((Post7) activity).change7Point6(point);
                } catch (ClassCastException ignored) {
                }

            }
        });
        buttonback = view.findViewById(R.id.buttonback6);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new ExpandList();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place, fragment2).commit();
                try {
                    ((Post7) activity).change7PointBack6(point);
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