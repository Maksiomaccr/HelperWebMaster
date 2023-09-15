package com.example.helperhtmlcss.Design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.helperhtmlcss.CSS.CSSCource;
import com.example.helperhtmlcss.CSS.CSSPriorityColor;
import com.example.helperhtmlcss.CSS.Color;
import com.example.helperhtmlcss.Posts.D;
import com.example.helperhtmlcss.R;

public class DPrinciple extends AppCompatActivity implements D {
    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dprinciple);
        Fragment fragment = new DesignMainPrinc();
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.fr_placeDesign, fragment).commit();


        textView = findViewById(R.id.point1);
        textView.setBackgroundResource(R.drawable.style_point_active);


        ImageButton button_back = (ImageButton) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(DPrinciple.this, DesignCource.class);
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


}