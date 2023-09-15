package com.example.helperhtmlcss;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.helperhtmlcss.Posts.Post;


public class Elements extends Fragment {

    Button buttonnext, buttonback;
    public int point = 3;
    Activity activity;
    TextView console, console2;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_elements, container, false);


        int newProgress = 40;

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
            SharedPreferences.Editor editors = preferences.edit();
            editors.putInt("newProgress", newProgress);
            editors.apply();


        buttonback = view.findViewById(R.id.buttonback2);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point--;
                Fragment fragment3 = new Tags();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place, fragment3).commit();

                try {
                    ((Post) activity).changePointback2(point);
                } catch (ClassCastException ignored) {}



            }
        });
        buttonnext = view.findViewById(R.id.buttonnext3);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point++;
                Fragment fragment3 = new Atributes();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place, fragment3).commit();


                try {
                    ((Post) activity).changePoint3(point);
                } catch (ClassCastException ignored) {}

            }
        });

        console = view.findViewById(R.id.tv2);
        console.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage();
            }
        });
        console2 = view.findViewById(R.id.tv10);
        console2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage2();
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
    public void showImage() {
        Dialog builder = new Dialog(getContext());
        builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        builder.getWindow().setBackgroundDrawable(
                new ColorDrawable(android.graphics.Color.TRANSPARENT));
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {

            }
        });


        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.html_1);
        builder.addContentView(imageView, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.dismiss();
            }
        });
        builder.show();
    }
    public void showImage2() {
        Dialog builder = new Dialog(getContext());
        builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        builder.getWindow().setBackgroundDrawable(
                new ColorDrawable(android.graphics.Color.TRANSPARENT));
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {

            }
        });


        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.html_2);
        builder.addContentView(imageView, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.dismiss();
            }
        });
        builder.show();
    }


}