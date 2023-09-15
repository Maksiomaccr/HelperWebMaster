package com.example.helperhtmlcss.CSS;

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

import com.example.helperhtmlcss.MainActivity;
import com.example.helperhtmlcss.R;
import com.example.helperhtmlcss.Tests.CSSTest1;
import com.example.helperhtmlcss.Tests.CSSTest2;
import com.example.helperhtmlcss.Tests.CSSTest3;

public class CSSCource extends AppCompatActivity {

    TextView theory1, theory2, theory3, theory4, theory5, practic;
    TextView progressText, progressText2, progressText3, progressText4, progressText5, progressText6;
    TextView test1, test2, test3;
    ImageView done1, done2, done3, done4, done5, done6, donetest1, donetest2, donetest3;
    ProgressBar progressBar, progressBar2, progressBar3, progressBar4, progressBar5, progressBar6;
    int statCSS;
    int doneCSS;
    int newProgress1 = 0, oldProgress1 = 0;
    int newProgress2 = 0, oldProgress2 = 0;
    int newProgress3 = 0, oldProgress3 = 0;
    int newProgress4 = 0, oldProgress4 = 0;
    int newProgress5 = 0, oldProgress5 = 0;
    int newProgress6 = 0, oldProgress6 = 0;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csscource);
        //themes1
        progressBar = findViewById(R.id.progress_bar1);
        progressText = findViewById(R.id.text_view_progress1);
        SharedPreferences preferences = getSharedPreferences("CSS", MODE_PRIVATE);
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
            statCSS += 15;
            SharedPreferences pref = getSharedPreferences("updateStatisticsCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putInt("statCSS", statCSS);
            editor.apply();
            doneCSS += 1;
            SharedPreferences preferences1 = getSharedPreferences("updateDoneCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = preferences1.edit();
            editor1.putInt("doneCSS", doneCSS);
            editor1.apply();
        }
        done1 = findViewById(R.id.done1);
        donetest1 = findViewById(R.id.donetest1);
        if(newProgress1 >= 75){
            done1.setVisibility(View.VISIBLE);
        }
        if (newProgress1 >= 100){
            donetest1.setVisibility(View.VISIBLE);
        }


//themes2
        progressBar2 = findViewById(R.id.progress_bar2);
        progressText2 = findViewById(R.id.text_view_progress2);
        SharedPreferences preferences1 = getSharedPreferences("CSS", MODE_PRIVATE);
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
            statCSS += 15;
            SharedPreferences pref = getSharedPreferences("updateStatisticsCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putInt("statCSS", statCSS);
            editor.apply();
            doneCSS += 1;
            SharedPreferences prefs = getSharedPreferences("updateDoneCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("doneCSS", doneCSS);
            editor1.apply();

        }
        done2 = findViewById(R.id.done2);
        donetest2 = findViewById(R.id.donetest2);
        if(newProgress2 >= 75){
            done2.setVisibility(View.VISIBLE);
        }
        if (newProgress2 >= 100){
            donetest2.setVisibility(View.VISIBLE);
        }
        //themes3
        progressBar3 = findViewById(R.id.progress_bar3);
        progressText3 = findViewById(R.id.text_view_progress3);
        SharedPreferences preferences2 = getSharedPreferences("CSS", MODE_PRIVATE);
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
            statCSS += 15;
            SharedPreferences pref2 = getSharedPreferences("updateStatisticsCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("statCSS", statCSS);
            editor.apply();
            doneCSS += 1;
            SharedPreferences prefs = getSharedPreferences("updateDoneCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("doneCSS", doneCSS);
            editor1.apply();
        }
        done3 = findViewById(R.id.done3);
        if(newProgress3 == 100){
            done3.setVisibility(View.VISIBLE);}
        //themes4
        progressBar4 = findViewById(R.id.progress_bar4);
        progressText4 = findViewById(R.id.text_view_progress4);
        SharedPreferences preferences3 = getSharedPreferences("CSS", MODE_PRIVATE);
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
            statCSS += 15;
            SharedPreferences pref2 = getSharedPreferences("updateStatisticsCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("statCSS", statCSS);
            editor.apply();
            doneCSS += 1;
            SharedPreferences prefs = getSharedPreferences("updateDoneCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("doneCSS", doneCSS);
            editor1.apply();
        }
        done4 = findViewById(R.id.done4);
        donetest3 = findViewById(R.id.donetest3);
        if(newProgress4 >= 75){
            done4.setVisibility(View.VISIBLE);
        }
        if (newProgress4 >= 100){
            donetest3.setVisibility(View.VISIBLE);
        }
        //themes5
        progressBar5 = findViewById(R.id.progress_bar5);
        progressText5 = findViewById(R.id.text_view_progress5);
        SharedPreferences preferences4 = getSharedPreferences("CSS", MODE_PRIVATE);
        newProgress5 = preferences4.getInt("newProgress5", newProgress5);
        oldProgress5 = preferences4.getInt("oldProgress5", oldProgress5);
        if(newProgress5 >= oldProgress5){
            progressBar5.setProgress(newProgress5);
            progressText5.setText(String.valueOf(newProgress5 + "%"));
            updateProgress5();
        } else if (newProgress5 < oldProgress5){
            progressBar5.setProgress(oldProgress5);
            progressText5.setText(String.valueOf(oldProgress5 + "%"));
        }
        if(oldProgress5 == 100){
            statCSS += 15;
            SharedPreferences pref2 = getSharedPreferences("updateStatisticsCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("statCSS", statCSS);
            editor.apply();
            doneCSS += 1;
            SharedPreferences prefs = getSharedPreferences("updateDoneCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefs.edit();
            editor1.putInt("doneCSS", doneCSS);
            editor1.apply();
        }
        done5 = findViewById(R.id.done5);
        if(newProgress5 == 100){
            done5.setVisibility(View.VISIBLE);}
        //theme6
        progressBar6 = findViewById(R.id.progress_bar6);
        progressText6 = findViewById(R.id.text_view_progress6);
        SharedPreferences preferences5 = getSharedPreferences("CSS", MODE_PRIVATE);
        newProgress6 = preferences5.getInt("newProgress6", newProgress6);
        oldProgress6 = preferences5.getInt("oldProgress6", oldProgress6);
        if(newProgress6 >= oldProgress6){
            progressBar6.setProgress(newProgress6);
            progressText6.setText(String.valueOf(newProgress6 + "%"));
            updateProgress6();
        } else if (newProgress6 < oldProgress6){
            progressBar6.setProgress(oldProgress6);
            progressText6.setText(String.valueOf(oldProgress6 + "%"));
        }
        if(oldProgress6 == 100){
            statCSS += 25;
            SharedPreferences pref2 = getSharedPreferences("updateStatisticsCSS", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref2.edit();
            editor.putInt("statCSS", statCSS);
            editor.apply();

        }
        done6 = findViewById(R.id.done6);
        if(newProgress6 == 100){
            done6.setVisibility(View.VISIBLE);}
        //theory1
        theory1 = findViewById(R.id.theory1);
        theory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSSCource.this, CSSBase.class);
                startActivity(intent);
            }
        });
        //theory2
        theory2 = findViewById(R.id.theory2);
        theory2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSSCource.this, Selectors.class);
                startActivity(intent);
            }
        });
        //theory3
        theory3 = findViewById(R.id.theory3);
        theory3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSSCource.this, Color.class);
                startActivity(intent);
            }
        });
        //theory4
        theory4 = findViewById(R.id.theory4);
        theory4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSSCource.this, TextCSS.class);
                startActivity(intent);
            }
        });
        //theory5
        theory5 = findViewById(R.id.theory5);
        theory5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSSCource.this, LinksCSS.class);
                startActivity(intent);
            }
        });
        //test1
        test1 = findViewById(R.id.test1);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSSCource.this, CSSTest1.class);
                startActivity(intent);
            }
        });
        //test2
        test2 = findViewById(R.id.test2);
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSSCource.this, CSSTest2.class);
                startActivity(intent);
            }
        });
        //test3
        test3 = findViewById(R.id.test4);
        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSSCource.this, CSSTest3.class);
                startActivity(intent);
            }
        });
        //practic
        practic = findViewById(R.id.practic);
        practic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSSCource.this, PracticalTask2.class);
                startActivity(intent);
            }
        });
        ImageButton button_back = (ImageButton) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(CSSCource.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

    }
    private void updateProgress() {
        oldProgress1 = newProgress1;
        SharedPreferences prefs = getSharedPreferences("CSS", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress", oldProgress1);
        editors.apply();

    }
    private void updateProgress2() {
        oldProgress2 = newProgress2;
        SharedPreferences prefs = getSharedPreferences("CSS", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress2", oldProgress2);
        editors.apply();

    }
    private void updateProgress3() {
        oldProgress3 = newProgress3;
        SharedPreferences prefs = getSharedPreferences("CSS", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress3", oldProgress3);
        editors.apply();

    }
    private void updateProgress4() {
        oldProgress4 = newProgress4;
        SharedPreferences prefs = getSharedPreferences("CSS", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress4", oldProgress4);
        editors.apply();

    }
    private void updateProgress5() {
        oldProgress5 = newProgress5;
        SharedPreferences prefs = getSharedPreferences("CSS", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress5", oldProgress5);
        editors.apply();

    }
    private void updateProgress6() {
        oldProgress6 = newProgress6;
        SharedPreferences prefs = getSharedPreferences("CSS", MODE_PRIVATE);
        SharedPreferences.Editor editors = prefs.edit();
        editors.putInt("oldProgress6", oldProgress6);
        editors.apply();

    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}