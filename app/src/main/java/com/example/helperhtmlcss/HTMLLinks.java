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

import com.example.helperhtmlcss.Posts.Post3;
import com.example.helperhtmlcss.Posts.Post4;


public class HTMLLinks extends Fragment {
    Button buttonnext, buttonback;
    public int point = 1;
    Activity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_h_t_m_l_links, container, false);

        int newProgress4 = 10;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress4", newProgress4);
        editors.apply();

        buttonnext = view.findViewById(R.id.buttonnext);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new StructLink();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place2, fragment).commit();
                try {
                    ((Post4) activity).change4Point(point);
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