package com.example.helperhtmlcss.CSS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.helperhtmlcss.Posts.CSS3;
import com.example.helperhtmlcss.R;

public class Color extends AppCompatActivity implements CSS3 {
    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        Fragment fragment = new CSSPriorityColor();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.fr_placeCSS, fragment).commit();


        textView = findViewById(R.id.point1);
        textView.setBackgroundResource(R.drawable.style_point_active);


        ImageButton button_back = (ImageButton) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Color.this, CSSCource.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }


            }
        });
    }

    @Override
    public void changePoint(int point) {
        TextView tvpoint2 = findViewById(R.id.point22);
        tvpoint2.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void changePointback(int point) {
        TextView tvpoint2 = findViewById(R.id.point22);
        tvpoint2.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void changePointback2(int point) {
        TextView tvpoint3 = findViewById(R.id.point3);
        tvpoint3.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void changePoint2(int point) {
        TextView tvpoint3 = findViewById(R.id.point3);
        tvpoint3.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void changePointback3(int point) {
        TextView tvpoint4 = findViewById(R.id.point4);
        tvpoint4.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void changePoint3(int point) {
        TextView tvpoint4 = findViewById(R.id.point4);
        tvpoint4.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void changePointback4(int point) {
        TextView tvpoint5 = findViewById(R.id.point5);
        tvpoint5.setBackgroundResource(R.drawable.style_points);
    }

    @Override
    public void changePoint4(int point) {
        TextView tvpoint5 = findViewById(R.id.point5);
        tvpoint5.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void changePoint5(int point) {
        TextView tvpoint6 = findViewById(R.id.point6);
        tvpoint6.setBackgroundResource(R.drawable.style_point_active);
    }

    @Override
    public void changePointback5(int point) {
        TextView tvpoint6 = findViewById(R.id.point6);
        tvpoint6.setBackgroundResource(R.drawable.style_points);
    }
}