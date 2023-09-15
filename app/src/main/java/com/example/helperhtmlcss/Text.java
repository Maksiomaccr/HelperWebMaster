package com.example.helperhtmlcss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.helperhtmlcss.Posts.Post2;

public class Text extends AppCompatActivity implements Post2 {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        Fragment fragment = new Paragraphs();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.fr_place2, fragment).commit();
        TextView textView = findViewById(R.id.point1);
        textView.setBackgroundResource(R.drawable.style_point_active);

        ImageButton button_back = (ImageButton) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Text.this, HTMLCource.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
    }


    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Text.this, HTMLCource.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }


    @Override
    public void change2Point(int point) {
        TextView tvpoint = findViewById(R.id.point2);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change2Point1(int point) {
        TextView tvpoint = findViewById(R.id.point3);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change2PointBack1(int point) {
        TextView tvpoint = findViewById(R.id.point2);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change2Point2(int point) {
        TextView tvpoint = findViewById(R.id.point4);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change2PointBack2(int point) {
        TextView tvpoint = findViewById(R.id.point3);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change2Point3(int point) {
        TextView tvpoint = findViewById(R.id.point5);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change2PointBack3(int point) {
        TextView tvpoint = findViewById(R.id.point4);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change2Point4(int point) {
        TextView tvpoint = findViewById(R.id.point6);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change2PointBack4(int point) {
        TextView tvpoint = findViewById(R.id.point5);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change2Point5(int point) {
        TextView tvpoint = findViewById(R.id.point7);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change2PointBack5(int point) {
        TextView tvpoint = findViewById(R.id.point6);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change2Point6(int point) {
        TextView tvpoint = findViewById(R.id.point8);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change2PointBack6(int point) {
        TextView tvpoint = findViewById(R.id.point7);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }
}