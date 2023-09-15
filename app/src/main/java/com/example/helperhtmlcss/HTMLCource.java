package com.example.helperhtmlcss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.helperhtmlcss.Tests.FormsTest;
import com.example.helperhtmlcss.Tests.HTMLBaseTest;
import com.example.helperhtmlcss.Tests.ImageTest;
import com.example.helperhtmlcss.Tests.LinksTest;
import com.example.helperhtmlcss.Tests.ListsTest;
import com.example.helperhtmlcss.Tests.TableTest;
import com.example.helperhtmlcss.Tests.TextTest;


import java.util.ArrayList;
import java.util.List;

public class HTMLCource extends AppCompatActivity {

    TextView theory1, theory2, theory3, theory4, theory5, theory6, theory7, practic;
    TextView progressText, progressText2, progressText3, progressText4, progressText5, progressText6, progressText7, progressText8;
    TextView test1, test2, test3, test4, test5, test6, test7;
    ImageView done1, done2, done3, done4, done5, done6, done7, done8, donetest1, donetest2, donetest3, donetest4, donetest5, donetest6, donetest7;

    ProgressBar progressBar, progressBar2, progressBar3, progressBar4, progressBar5, progressBar6, progressBar7, progressBar8;
    int stat;
    int done;
    int newProgress1 = 0, oldProgress1 = 0;
    int newProgress2 = 0, oldProgress2 = 0;
    int newProgress3 = 0, oldProgress3 = 0;
    int newProgress4 = 0, oldProgress4 = 0;
    int newProgress5 = 0, oldProgress5 = 0;
    int newProgress6 = 0, oldProgress6 = 0;
    int newProgress7 = 0, oldProgress7 = 0;
    int newProgress8 = 0, oldProgress8 = 0;



    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlcource);


//themes1

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        newProgress1 = preferences.getInt("newProgress", 0);
        oldProgress1 = preferences.getInt("oldProgress", 0);
        if (newProgress1 >= oldProgress1) {
            updateProgressNew1();
            updateProgress();
        } else if (newProgress1 < oldProgress1) {
            updateProgressOld1();
        }
        if (oldProgress1 == 100) {
            stat += 10;
            SharedPreferences pref = getSharedPreferences("updateStatistics", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putInt("stat", stat);
            editor.apply();
            done += 1;
            SharedPreferences preferences1 = getSharedPreferences("updateDone", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = preferences1.edit();
            editor1.putInt("done", done);
            editor1.apply();
        }
        done1 = findViewById(R.id.done1);
        donetest1 = findViewById(R.id.donetest1);
        if(oldProgress1 >= 75){
            done1.setVisibility(View.VISIBLE);
        }
        if (oldProgress1 >= 100){
            donetest1.setVisibility(View.VISIBLE);
        }
//themes2
        progressBar2 = findViewById(R.id.progress_bar2);
        progressText2 = findViewById(R.id.text_view_progress2);
        SharedPreferences preferences1 = PreferenceManager.getDefaultSharedPreferences(this);
        newProgress2 = preferences1.getInt("newProgress2", 0);
        oldProgress2 = preferences1.getInt("oldProgress2", 0);
        if(newProgress2 >= oldProgress2){
            updateProgressNew2();
            updateProgress2();
        } else if (newProgress2 < oldProgress2){
            updateProgressOld2();
        }
        if (oldProgress2 == 100) {
            stat += 10;
            SharedPreferences pref = getSharedPreferences("updateStatistics", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putInt("stat", stat);
            editor.apply();
            done += 1;
            SharedPreferences prefs = getSharedPreferences("updateDone", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("done", done);
            editor1.apply();

        }
        done2 = findViewById(R.id.done2);
        donetest2 = findViewById(R.id.donetest2);
        if(oldProgress2 >= 75){
            done2.setVisibility(View.VISIBLE);
        }
        if (oldProgress2 >= 100){
            donetest2.setVisibility(View.VISIBLE);
        }
        //themes3
        progressBar3 = findViewById(R.id.progress_bar3);
        progressText3 = findViewById(R.id.text_view_progress3);
        SharedPreferences preferences2 = PreferenceManager.getDefaultSharedPreferences(this);
        newProgress3 = preferences2.getInt("newProgress3", 0);
        oldProgress3 = preferences2.getInt("oldProgress3", 0);
        if(newProgress3 >= oldProgress3){
            progressBar3.setProgress(newProgress3);
            progressText3.setText(String.valueOf(newProgress3 + "%"));
            updateProgress3();
        } else if (newProgress3 < oldProgress3){
            progressBar3.setProgress(oldProgress3);
            progressText3.setText(String.valueOf(oldProgress3 + "%"));
        }
        if(oldProgress3 == 100){
            stat += 10;
            SharedPreferences pref2 = getSharedPreferences("updateStatistics", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("stat", stat);
            editor.apply();
            done += 1;
            SharedPreferences prefs = getSharedPreferences("updateDone", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("done", done);
            editor1.apply();
        }
        done3 = findViewById(R.id.done3);
        donetest3 = findViewById(R.id.donetest3);
        if(oldProgress3 >= 75){
            done3.setVisibility(View.VISIBLE);
        }
        if (oldProgress3 >= 100){
            donetest3.setVisibility(View.VISIBLE);
        }
        //themes4
        progressBar4 = findViewById(R.id.progress_bar4);
        progressText4 = findViewById(R.id.text_view_progress4);
        SharedPreferences preferences3 = PreferenceManager.getDefaultSharedPreferences(this);
        newProgress4 = preferences3.getInt("newProgress4", 0);
        oldProgress4 = preferences3.getInt("oldProgress4", 0);
        if(newProgress4 >= oldProgress4){
            progressBar4.setProgress(newProgress4);
            progressText4.setText(String.valueOf(newProgress4 + "%"));
            updateProgress4();
        } else if (newProgress4 < oldProgress4){
            progressBar4.setProgress(oldProgress4);
            progressText4.setText(String.valueOf(oldProgress4 + "%"));
        }
        if(oldProgress4 == 100){
            stat += 10;
            SharedPreferences pref2 = getSharedPreferences("updateStatistics", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("stat", stat);
            editor.apply();
            done += 1;
            SharedPreferences prefs = getSharedPreferences("updateDone", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("done", done);
            editor1.apply();
        }
        done4 = findViewById(R.id.done4);
        donetest4 = findViewById(R.id.donetest4);
        if(oldProgress4 >= 75){
            done4.setVisibility(View.VISIBLE);
        }
        if (oldProgress4 >= 100){
            donetest4.setVisibility(View.VISIBLE);
        }
        //themes5
        progressBar5 = findViewById(R.id.progress_bar5);
        progressText5 = findViewById(R.id.text_view_progress5);
        SharedPreferences preferences4 = PreferenceManager.getDefaultSharedPreferences(this);
        newProgress5 = preferences4.getInt("newProgress5", 0);
        oldProgress5 = preferences4.getInt("oldProgress5", 0);
        if(newProgress5 >= oldProgress5){
            progressBar5.setProgress(newProgress5);
            progressText5.setText(String.valueOf(newProgress5 + "%"));
            updateProgress5();
        } else if (newProgress5 < oldProgress5){
            progressBar5.setProgress(oldProgress5);
            progressText5.setText(String.valueOf(oldProgress5 + "%"));
        }
        if(oldProgress5 == 100){
            stat += 10;
            SharedPreferences pref2 = getSharedPreferences("updateStatistics", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("stat", stat);
            editor.apply();
            done += 1;
            SharedPreferences prefs = getSharedPreferences("updateDone", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("done", done);
            editor1.apply();
        }
        done5 = findViewById(R.id.done5);
        donetest5 = findViewById(R.id.donetest5);
        if(oldProgress5 >= 75){
            done5.setVisibility(View.VISIBLE);
        }
        if (oldProgress5 >= 100){
            donetest5.setVisibility(View.VISIBLE);
        }
        //theme6
        progressBar6 = findViewById(R.id.progress_bar6);
        progressText6 = findViewById(R.id.text_view_progress6);
        SharedPreferences preferences5 = PreferenceManager.getDefaultSharedPreferences(this);
        newProgress6 = preferences5.getInt("newProgress6", 0);
        oldProgress6 = preferences5.getInt("oldProgress6", 0);
        if(newProgress6 >= oldProgress6){
            progressBar6.setProgress(newProgress6);
            progressText6.setText(String.valueOf(newProgress6 + "%"));
            updateProgress6();
        } else if (newProgress6 < oldProgress6){
            progressBar6.setProgress(oldProgress6);
            progressText6.setText(String.valueOf(oldProgress6 + "%"));
        }
        if(oldProgress6 == 100){
            stat += 10;
            SharedPreferences pref2 = getSharedPreferences("updateStatistics", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("stat", stat);
            editor.apply();
            done += 1;
            SharedPreferences prefs = getSharedPreferences("updateDone", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("done", done);
            editor1.apply();
        }
        done6 = findViewById(R.id.done6);
        donetest6 = findViewById(R.id.donetest6);
        if(oldProgress6 >= 75){
            done6.setVisibility(View.VISIBLE);
        }
        if (oldProgress6 >= 100){
            donetest6.setVisibility(View.VISIBLE);
        }
        //theme7
        progressBar7 = findViewById(R.id.progress_bar7);
        progressText7 = findViewById(R.id.text_view_progress7);
        SharedPreferences preferences6 = PreferenceManager.getDefaultSharedPreferences(this);
        newProgress7 = preferences6.getInt("newProgress7", 0);
        oldProgress7 = preferences6.getInt("oldProgress7", 0);
        if(newProgress7 >= oldProgress7){
            progressBar7.setProgress(newProgress7);
            progressText7.setText(String.valueOf(newProgress7 + "%"));
            updateProgress7();
        } else if (newProgress7 < oldProgress7){
            progressBar7.setProgress(oldProgress7);
            progressText7.setText(String.valueOf(oldProgress7 + "%"));
        }
        if(oldProgress7 == 100){
            stat += 10;
            SharedPreferences pref2 = getSharedPreferences("updateStatistics", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("stat", stat);
            editor.apply();
            done += 1;
            SharedPreferences prefs = getSharedPreferences("updateDone", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("done", done);
            editor1.apply();
        }
        done7 = findViewById(R.id.done7);
        donetest7 = findViewById(R.id.donetest7);
        if(oldProgress7 >= 75){
            done7.setVisibility(View.VISIBLE);
        }
        if (oldProgress7 >= 100){
            donetest7.setVisibility(View.VISIBLE);
        }
        //theme8
        progressBar8 = findViewById(R.id.progress_bar8);
        progressText8 = findViewById(R.id.text_view_progress8);
        SharedPreferences preferences7 = PreferenceManager.getDefaultSharedPreferences(this);
        newProgress8 = preferences7.getInt("newProgress8", 0);
        oldProgress8 = preferences7.getInt("oldProgress8", 0);
        if(newProgress8 >= oldProgress8){
            progressBar8.setProgress(newProgress8);
            progressText8.setText(String.valueOf(newProgress8 + "%"));
            updateProgress8();
        } else if (newProgress8 < oldProgress8){
            progressBar8.setProgress(oldProgress8);
            progressText8.setText(String.valueOf(oldProgress8 + "%"));
        }
        if(oldProgress8 == 100){
            stat += 30;
            SharedPreferences pref2 = getSharedPreferences("updateStatistics", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("stat", stat);
            editor.apply();

        }
        done8 = findViewById(R.id.done8);
        if(oldProgress8 >= 100){
            done8.setVisibility(View.VISIBLE);
        }
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton button_back = (ImageButton) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(HTMLCource.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        theory1 = findViewById(R.id.theory1);
        theory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, BaseHTML.class);
                startActivity(intent);

            }
        });
        theory2 = findViewById(R.id.theory2);
        theory2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, Text.class);
                startActivity(intent);
            }
        });
        theory3 = findViewById(R.id.theory3);
        theory3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, Spiski.class);
                startActivity(intent);
            }
        });
        theory4 = findViewById(R.id.theory4);
        theory4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, Links.class);
                startActivity(intent);
            }
        });
        theory5 = findViewById(R.id.theory5);
        theory5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, Image.class);
                startActivity(intent);
            }
        });
        theory6 = findViewById(R.id.theory6);
        theory6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, Table.class);
                startActivity(intent);
            }
        });
        theory7 = findViewById(R.id.theory7);
        theory7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, Forms.class);
                startActivity(intent);
            }
        });
        test1 = findViewById(R.id.test1);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, HTMLBaseTest.class);
                startActivity(intent);
            }
        });
        test2 = findViewById(R.id.test2);
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, TextTest.class);
                startActivity(intent);
            }
        });
        test3 = findViewById(R.id.test3);
        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, ListsTest.class);
                startActivity(intent);
            }
        });
        test4 = findViewById(R.id.test4);
        test4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, LinksTest.class);
                startActivity(intent);
            }
        });
        test5 = findViewById(R.id.test5);
        test5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, ImageTest.class);
                startActivity(intent);
            }
        });
        test6 = findViewById(R.id.test6);
        test6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, TableTest.class);
                startActivity(intent);
            }
        });
        test7 = findViewById(R.id.test7);
        test7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, FormsTest.class);
                startActivity(intent);
            }
        });
        practic = findViewById(R.id.practic);
        practic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HTMLCource.this, PracticalTask.class);
                startActivity(intent);
            }
        });


    }

    private void updateProgress() {
        oldProgress1 = newProgress1;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress", oldProgress1);
        editors.apply();

    }
    private void updateProgress2() {
        oldProgress2 = newProgress2;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress2", oldProgress2);
        editors.apply();

    }
    private void updateProgress3() {
        oldProgress3 = newProgress3;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress3", oldProgress3);
        editors.apply();

    }
    private void updateProgress4() {
        oldProgress4 = newProgress4;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress4", oldProgress4);
        editors.apply();

    }
    private void updateProgress5() {
        oldProgress5 = newProgress5;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress5", oldProgress5);
        editors.apply();

    }
    private void updateProgress6() {
        oldProgress6 = newProgress6;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress6", oldProgress6);
        editors.apply();

    }
    private void updateProgress7() {
        oldProgress7 = newProgress7;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress7", oldProgress7);
        editors.apply();

    }
    private void updateProgress8() {
        oldProgress8 = newProgress8;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress8", oldProgress8);
        editors.apply();

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void updateProgressNew1(){
        progressBar = findViewById(R.id.progress_bar1);
        progressText = findViewById(R.id.text_view_progress1);
        progressBar.setProgress(newProgress1);
        progressText.setText(String.valueOf(newProgress1 + "%"));
    }
    public void updateProgressOld1(){
        progressBar = findViewById(R.id.progress_bar1);
        progressText = findViewById(R.id.text_view_progress1);
        progressBar.setProgress(oldProgress1);
        progressText.setText(String.valueOf(oldProgress1 + "%"));
    }
    public void updateProgressNew2(){
        progressBar2 = findViewById(R.id.progress_bar2);
        progressText2 = findViewById(R.id.text_view_progress2);
        progressBar2.setProgress(newProgress2);
        progressText2.setText(String.valueOf(newProgress2 + "%"));
    }
    public void updateProgressOld2(){
        progressBar2 = findViewById(R.id.progress_bar2);
        progressText2 = findViewById(R.id.text_view_progress2);
        progressBar2.setProgress(oldProgress2);
        progressText2.setText(String.valueOf(oldProgress2 + "%"));
    }
}