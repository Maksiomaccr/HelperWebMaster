package com.example.helperhtmlcss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.helperhtmlcss.Posts.Post;

public class BaseHTML extends AppCompatActivity implements Post {


    TextView textView, text;






    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_html);





        Fragment fragment = new HTMLBase();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.fr_place, fragment).commit();


        textView = findViewById(R.id.point1);
        textView.setBackgroundResource(R.drawable.style_point_active);


        ImageButton button_back = (ImageButton) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(BaseHTML.this, HTMLCource.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }


            }
        });

    }

    @Override
    public void changePoint(int point) {
        TextView tvpont1 = findViewById(R.id.point2);
        tvpont1.setBackgroundResource(R.drawable.style_point_active);


    }

    public void changePointback(int point) {
        TextView tvpoint2 = findViewById(R.id.point2);
        tvpoint2.setBackgroundResource(R.drawable.style_points);

    }

    public void changePointback2(int point) {
        TextView tvpoint3 = findViewById(R.id.point3);
        tvpoint3.setBackgroundResource(R.drawable.style_points);

    }

    @Override
    public void changePoint2(int point) {
        TextView tvpont2 = findViewById(R.id.point3);
        tvpont2.setBackgroundResource(R.drawable.style_point_active);

    }

    public void changePointback3(int point) {
        TextView tvpoint4 = findViewById(R.id.point4);
        tvpoint4.setBackgroundResource(R.drawable.style_points);

    }

    public void changePoint3(int point) {
        TextView tvpont2 = findViewById(R.id.point4);
        tvpont2.setBackgroundResource(R.drawable.style_point_active);

    }

    public void changePointback4(int point) {
        TextView tvpoint4 = findViewById(R.id.point5);
        tvpoint4.setBackgroundResource(R.drawable.style_points);

    }

    public void changePoint4(int point) {
        TextView tvpont2 = findViewById(R.id.point5);
        tvpont2.setBackgroundResource(R.drawable.style_point_active);


    }




}
