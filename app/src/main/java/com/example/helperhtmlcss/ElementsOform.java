package com.example.helperhtmlcss;

import android.annotation.SuppressLint;
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
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.helperhtmlcss.Posts.Post2;


public class ElementsOform extends Fragment {
    Button buttonnext, buttonback;
    public int point = 3;
    Activity activity;

    VideoView video;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_elements_oform, container, false);

        int newProgress2 = 20;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress2", newProgress2);
        editors.apply();

        buttonnext = view.findViewById(R.id.buttonnext3);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point++;
                Fragment fragment = new Perenos();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place2, fragment).commit();
                try {
                    ((Post2) activity).change2Point2(point);
                } catch (ClassCastException ignored) {}
            }
        });
        buttonback = view.findViewById(R.id.buttonback2);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point--;
                Fragment fragment = new Title();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place2, fragment).commit();
                try {
                    ((Post2) activity).change2PointBack2(point);
                } catch (ClassCastException ignored) {}
            }
        });

        video = view.findViewById(R.id.video);
        video.setVideoPath("android.resource://" + activity.getPackageName() + "/" + R.raw.format_text);

        MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(video);
        video.setMediaController(mediaController);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video.start();
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