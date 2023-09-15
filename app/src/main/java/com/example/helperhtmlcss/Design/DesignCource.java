package com.example.helperhtmlcss.Design;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.helperhtmlcss.CSS.CSSCource;
import com.example.helperhtmlcss.CSS.LinksCSS;
import com.example.helperhtmlcss.MainActivity;
import com.example.helperhtmlcss.R;

public class DesignCource extends AppCompatActivity {
    TextView theory1, theory2, theory3, theory4;
    TextView progressText, progressText2, progressText3, progressText4;
    ImageView done1, done2, done3, done4;
    ProgressBar progressBar, progressBar2, progressBar3, progressBar4;
    int statDesign;
    int doneDesign;
    int newProgress1 = 0, oldProgress1 = 0;
    int newProgress2 = 0, oldProgress2 = 0;
    int newProgress3 = 0, oldProgress3 = 0;
    int newProgress4 = 0, oldProgress4 = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_cource);
        //themes1
        progressBar = findViewById(R.id.progress_bar1);
        progressText = findViewById(R.id.text_view_progress1);
        SharedPreferences preferences = getSharedPreferences("Design", MODE_PRIVATE);
        newProgress1 = preferences.getInt("newProgress", newProgress1);
        oldProgress1 = preferences.getInt("oldProgress", oldProgress1);
        if (newProgress1 >= oldProgress1) {
            progressBar.setProgress(newProgress1);
            progressText.setText(String.valueOf(newProgress1 + "%"));
            updateProgress();
        } else if (newProgress1 < oldProgress1) {
            progressBar.setProgress(oldProgress1);
            progressText.setText(String.valueOf(oldProgress1 + "%"));
        }
        if (oldProgress1 == 100) {
            statDesign += 25;
            SharedPreferences pref = getSharedPreferences("updateStatisticsDesign", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putInt("statDesign", statDesign);
            editor.apply();
            doneDesign += 1;
            SharedPreferences preferences1 = getSharedPreferences("updateDoneDesign", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = preferences1.edit();
            editor1.putInt("doneDesign", doneDesign);
            editor1.apply();
        }
        done1 = findViewById(R.id.done1);
        if(newProgress1 >= 100){
            done1.setVisibility(View.VISIBLE);
        }
        //themes2
        progressBar2 = findViewById(R.id.progress_bar2);
        progressText2 = findViewById(R.id.text_view_progress2);
        SharedPreferences preferences1 = getSharedPreferences("Design", MODE_PRIVATE);
        newProgress2 = preferences1.getInt("newProgress2", newProgress2);
        oldProgress2 = preferences1.getInt("oldProgress2", oldProgress2);
        if(newProgress2 >= oldProgress2){
            progressBar2.setProgress(newProgress2);
            progressText2.setText(String.valueOf(newProgress2 + "%"));
            updateProgress2();
        } else if (newProgress2 < oldProgress2){
            progressBar2.setProgress(oldProgress2);
            progressText2.setText(String.valueOf(oldProgress2 + "%"));
        }
        if (oldProgress2 == 100) {
            statDesign += 25;
            SharedPreferences pref = getSharedPreferences("updateStatisticsDesign", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putInt("statDesign", statDesign);
            editor.apply();
            doneDesign += 1;
            SharedPreferences prefs = getSharedPreferences("updateDoneDesign", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("doneDesign", doneDesign);
            editor1.apply();

        }
        done2 = findViewById(R.id.done2);
        if(newProgress2 >= 100){
            done2.setVisibility(View.VISIBLE);
        }
        //themes3
        progressBar3 = findViewById(R.id.progress_bar3);
        progressText3 = findViewById(R.id.text_view_progress3);
        SharedPreferences preferences2 = getSharedPreferences("Design", MODE_PRIVATE);
        newProgress3 = preferences2.getInt("newProgress3", newProgress3);
        oldProgress3 = preferences2.getInt("oldProgress3", oldProgress3);
        if(newProgress3 >= oldProgress3){
            progressBar3.setProgress(newProgress3);
            progressText3.setText(String.valueOf(newProgress3 + "%"));
            updateProgress3();
        } else if (newProgress3 < oldProgress3){
            progressBar3.setProgress(oldProgress3);
            progressText3.setText(String.valueOf(oldProgress3 + "%"));
        }
        if(oldProgress3 == 100){
            statDesign += 25;
            SharedPreferences pref2 = getSharedPreferences("updateStatisticsDesign", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("statDesign", statDesign);
            editor.apply();
            doneDesign += 1;
            SharedPreferences prefs = getSharedPreferences("updateDoneDesign", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("doneDesign", doneDesign);
            editor1.apply();
        }
        done3 = findViewById(R.id.done3);
        if(newProgress3 >= 100){
            done3.setVisibility(View.VISIBLE);
        }
        //themes4
        progressBar4 = findViewById(R.id.progress_bar4);
        progressText4 = findViewById(R.id.text_view_progress4);
        SharedPreferences preferences3 = getSharedPreferences("Design", MODE_PRIVATE);
        newProgress4 = preferences3.getInt("newProgress4", newProgress4);
        oldProgress4 = preferences3.getInt("oldProgress4", oldProgress4);
        if(newProgress4 >= oldProgress4){
            progressBar4.setProgress(newProgress4);
            progressText4.setText(String.valueOf(newProgress4 + "%"));
            updateProgress4();
        } else if (newProgress4 < oldProgress4){
            progressBar4.setProgress(oldProgress4);
            progressText4.setText(String.valueOf(oldProgress4 + "%"));
        }
        if(oldProgress4 == 100){
            statDesign += 25;
            SharedPreferences pref2 = getSharedPreferences("updateStatisticsDesign", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("statDesign", statDesign);
            editor.apply();
            doneDesign += 1;
            SharedPreferences prefs = getSharedPreferences("updateDoneDesign", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("doneDesign", doneDesign);
            editor1.apply();
        }
        done4 = findViewById(R.id.done4);
        if(newProgress4 >= 100){
            done4.setVisibility(View.VISIBLE);
        }

        //theory1
        theory1 = findViewById(R.id.theory1);
        theory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DesignCource.this, DPrinciple.class);
                startActivity(intent);
            }
        });
        //theory2
        theory2 = findViewById(R.id.theory2);
        theory2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DesignCource.this, DColors.class);
                startActivity(intent);
            }
        });
        //theory3
        theory3 = findViewById(R.id.theory3);
        theory3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DesignCource.this, DContent.class);
                startActivity(intent);
            }
        });
        //theory4
        theory4 = findViewById(R.id.theory4);
        theory4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DesignCource.this, DRules.class);
                startActivity(intent);
            }
        });

        ImageButton button_back = (ImageButton) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(DesignCource.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

    }
    private void updateProgress() {
        oldProgress1 = newProgress1;
        SharedPreferences prefs = getSharedPreferences("Design", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress", oldProgress1);
        editors.apply();

    }
    private void updateProgress2() {
        oldProgress2 = newProgress2;
        SharedPreferences prefs = getSharedPreferences("Design", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress2", oldProgress2);
        editors.apply();

    }
    private void updateProgress3() {
        oldProgress3 = newProgress3;
        SharedPreferences prefs = getSharedPreferences("Design", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress3", oldProgress3);
        editors.apply();

    }
    private void updateProgress4() {
        oldProgress4 = newProgress4;
        SharedPreferences prefs = getSharedPreferences("Design", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress4", oldProgress4);
        editors.apply();

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}