package com.example.helperhtmlcss;

import android.annotation.SuppressLint;
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

import com.example.helperhtmlcss.Posts.Post3;


public class NumList extends Fragment {

    Button buttonnext, buttonback;
    public int point = 3;
    Activity activity;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_num_list, container, false);

        int newProgress3 = 30;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor editors = preferences.edit();
        editors.putInt("newProgress3", newProgress3);
        editors.apply();

        buttonnext = view.findViewById(R.id.buttonnext2);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new AtributesNumList();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place2, fragment).commit();
                try {
                    ((Post3) activity).change3Point2(point);
                } catch (ClassCastException ignored) {}
            }
        });
        buttonback = view.findViewById(R.id.buttonback2);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new MarkList();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fr_place2, fragment).commit();
                try {
                    ((Post3) activity).change3PointBack2(point);
                } catch (ClassCastException ignored) {}
            }
        });

        TextView console = (TextView) view.findViewById(R.id.tv4);
        console.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage();
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
        imageView.setImageResource(R.drawable.list_2);
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