package com.example.helperhtmlcss;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

import com.example.helperhtmlcss.Posts.Post5;


public class Formats extends Fragment {

    Button buttonend, buttonback;
    public int point = 4;
    Activity activity;

    VideoView video;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_formats, container, false);

        int newProgress5 = 75;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress5", newProgress5);
        editors.apply();

        buttonend = view.findViewById(R.id.buttonend);
        buttonend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HTMLCource.class);
                startActivity(intent);
            }
        });
        buttonback = view.findViewById(R.id.buttonback3);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new AtributesImage2();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place2, fragment).commit();
                try {
                    ((Post5) activity).change5PointBack3(point);
                } catch (ClassCastException ignored) {}
            }
        });

        video = view.findViewById(R.id.video);
        video.setVideoPath("android.resource://" + activity.getPackageName() + "/" + R.raw.image);

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