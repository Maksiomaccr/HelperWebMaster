package com.example.helperhtmlcss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.helperhtmlcss.Posts.Post7;

public class Forms extends AppCompatActivity implements Post7 {


    public int progress = 0;

    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);

        Fragment fragment = new HTMLForms();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.fr_place, fragment).commit();
        textView = findViewById(R.id.point1);
        textView.setBackgroundResource(R.drawable.style_point_active);

        ImageButton button_back = (ImageButton) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Forms.this, HTMLCource.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
    }

    @Override
    public void change7Point(int point) {
        TextView tvpoint = findViewById(R.id.point2);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change7Point1(int point) {
        TextView tvpoint = findViewById(R.id.point3);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change7PointBack1(int point) {
        TextView tvpoint = findViewById(R.id.point2);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change7Point2(int point) {
        TextView tvpoint = findViewById(R.id.point4);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change7PointBack2(int point) {
        TextView tvpoint = findViewById(R.id.point3);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change7PointBack3(int point) {
        TextView tvpoint = findViewById(R.id.point4);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change7Point3(int point) {
        TextView tvpoint = findViewById(R.id.point5);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change7PointBack4(int point) {
        TextView tvpoint = findViewById(R.id.point5);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change7Point4(int point) {
        TextView tvpoint = findViewById(R.id.point6);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change7PointBack5(int point) {
        TextView tvpoint = findViewById(R.id.point6);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change7Point5(int point) {
        TextView tvpoint = findViewById(R.id.point7);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change7Point6(int point) {
        TextView tvpoint = findViewById(R.id.point8);
        tvpoint.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void change7PointBack6(int point) {
        TextView tvpoint = findViewById(R.id.point7);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void change7PointBack7(int point) {
        TextView tvpoint = findViewById(R.id.point8);
        tvpoint.setBackgroundResource(R.drawable.style_points);
    }
}