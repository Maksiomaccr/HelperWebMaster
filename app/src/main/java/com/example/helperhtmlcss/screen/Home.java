package com.example.helperhtmlcss.screen;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;


import com.example.helperhtmlcss.CSS.CSSCource;
import com.example.helperhtmlcss.Design.DesignCource;
import com.example.helperhtmlcss.Directory;
import com.example.helperhtmlcss.DirectoryCSS;
import com.example.helperhtmlcss.HTMLCource;
import com.example.helperhtmlcss.R;


public class Home extends Fragment {


    Button btn1, btn2, btn3, btn4, btn5;

    static int count = 0, count2 = 0, count3 = 0;



    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btn1 = view.findViewById(R.id.htmlCource);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HTMLCource.class);
                startActivity(intent);
                updateCount();


            }
        });
        btn2 = view.findViewById(R.id.cssCource);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CSSCource.class);
                startActivity(intent);
                updateCount2();
            }
        });
        btn3 = view.findViewById(R.id.designCource);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DesignCource.class);
                startActivity(intent);
                updateCount3();
            }
        });
        btn4 = view.findViewById(R.id.buttondirect);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Directory.class);
                startActivity(intent);
            }
        });

        btn5 = view.findViewById(R.id.buttondirectcss);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DirectoryCSS.class);
                startActivity(intent);
            }
        });

        return view;


    }

    public void updateCount() {
        SharedPreferences prefs = this.getActivity().getSharedPreferences("updateCount", Context.MODE_PRIVATE);
        count = prefs.getInt("count", 0);
        count++;
        SharedPreferences pref = this.getActivity().getSharedPreferences("updateCount", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("count", count);
        editor.apply();
    }
    public void updateCount2() {
        SharedPreferences prefs = this.getActivity().getSharedPreferences("updateCountCSS", Context.MODE_PRIVATE);
        count2 = prefs.getInt("countCSS", 0);
        count2++;
        SharedPreferences pref = this.getActivity().getSharedPreferences("updateCountCSS", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("countCSS", count2);
        editor.apply();
    }
    public void updateCount3() {
        SharedPreferences prefs = this.getActivity().getSharedPreferences("updateCountDesign", Context.MODE_PRIVATE);
        count3 = prefs.getInt("countDesign", 0);
        count3++;
        SharedPreferences pref = this.getActivity().getSharedPreferences("updateCountDesign", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("countDesign", count3);
        editor.apply();
    }


}

