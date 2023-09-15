package com.example.helperhtmlcss.Design;

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

import com.example.helperhtmlcss.Posts.D3;
import com.example.helperhtmlcss.R;


public class DesignContentCreate extends Fragment {

    Button buttonend, buttonback;

    int point = 3;

    Activity activity;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_design_content_create, container, false);
        int newProgress3 = 100;

        SharedPreferences preferences = getActivity().getSharedPreferences("Design", Context.MODE_PRIVATE);
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress3", newProgress3);
        editors.apply();


        buttonend = view.findViewById(R.id.buttonend);
        buttonend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DesignCource.class);
                startActivity(intent);
            }
        });
        buttonback = view.findViewById(R.id.buttonback2);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment2 = new DesignContentPrinc();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_placeDesign, fragment2).commit();
                try {
                    ((D3) activity).changePointback2(point);

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