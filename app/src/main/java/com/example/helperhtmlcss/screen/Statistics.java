package com.example.helperhtmlcss.screen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.helperhtmlcss.R;


public class Statistics extends Fragment {

    TextView progressText, countText, doneText;
    TextView progressText2, countText2, doneText2;
    TextView progressText3, countText3, doneText3;
    ProgressBar progressBar, progressBar2, progressBar3;
    int progress, progress2, progress3;

    int count = 0, count2 = 0, count3 = 0;
    int done, done2, done3;

    CardView html, css, design;
    TextView no;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_statistics, container, false);

        no = view.findViewById(R.id.no_cource);

        html = view.findViewById(R.id.card_html);
        css = view.findViewById(R.id.card_CSS);
        design = view.findViewById(R.id.card_design);
        SharedPreferences preferences = getActivity().getSharedPreferences("updateCount", Context.MODE_PRIVATE);
        count = preferences.getInt("count", 0);

        if (count > 0) {
            html.setVisibility(View.VISIBLE);
        }
        SharedPreferences pref = getActivity().getSharedPreferences("updateCountCSS", Context.MODE_PRIVATE);
        count2 = pref.getInt("countCSS", 0);
        if (count2 > 0) {
            css.setVisibility(View.VISIBLE);
        }
        SharedPreferences prefs = getActivity().getSharedPreferences("updateCountDesign", Context.MODE_PRIVATE);
        count3 = prefs.getInt("countDesign", 0);
        if (count3 > 0) {
            design.setVisibility(View.VISIBLE);
        }
        if(count > 0 || count2 > 0 || count3 > 0){
            no.setVisibility(View.GONE);
        }


        progressBar = view.findViewById(R.id.progress_bar_html);
        progressText = view.findViewById(R.id.text_view_progress_html);
        updateProgressStat();
        countText = view.findViewById(R.id.counter);
        updateCountText();
        doneText = view.findViewById(R.id.done);
        updateDoneText();

        progressBar2 = view.findViewById(R.id.progress_bar_css);
        progressText2 = view.findViewById(R.id.text_view_progress_css);
        updateProgressStat2();
        countText2 = view.findViewById(R.id.counter2);
        updateCountText2();
        doneText2 = view.findViewById(R.id.done2);
        updateDoneText2();

        progressBar3 = view.findViewById(R.id.progress_bar_design);
        progressText3 = view.findViewById(R.id.text_view_progress_design);
        updateProgressStat3();
        countText3 = view.findViewById(R.id.counter3);
        updateCountText3();
        doneText3 = view.findViewById(R.id.done3);
        updateDoneText3();


        if (progress == 100) {
            ImageView done = (ImageView) view.findViewById(R.id.doneHTML);
            done.setVisibility(View.VISIBLE);
        }
        if (progress2 == 100) {
            ImageView done2 = (ImageView) view.findViewById(R.id.doneCSS);
            done2.setVisibility(View.VISIBLE);
        }
        if (progress3 == 100) {
            ImageView done3 = (ImageView) view.findViewById(R.id.doneDesign);
            done3.setVisibility(View.VISIBLE);
        }
        return view;
    }

    private void updateProgressStat() {
        SharedPreferences pref = this.getActivity().getSharedPreferences("updateStatistics", Context.MODE_PRIVATE);
        int prog = pref.getInt("stat", 0);
        progress = prog;
        progressBar.setProgress(progress);
        progressText.setText(String.valueOf(progress + "%"));
    }

    private void updateCountText() {
        SharedPreferences pref = this.getActivity().getSharedPreferences("updateCount", Context.MODE_PRIVATE);
        int counter = pref.getInt("count", 0);
        count = counter;
        countText.setText(String.valueOf("Кол-во посещений курса: " + count));
    }

    private void updateDoneText() {
        SharedPreferences preferences = this.getActivity().getSharedPreferences("updateDone", Context.MODE_PRIVATE);
        int fin = preferences.getInt("done", 0);
        done = fin;
        doneText.setText(String.valueOf("Пройдено тем " + done + " из 7"));

    }

    private void updateProgressStat2() {
        SharedPreferences pref = this.getActivity().getSharedPreferences("updateStatisticsCSS", Context.MODE_PRIVATE);
        int prog = pref.getInt("statCSS", 0);
        progress2 = prog;
        progressBar2.setProgress(progress2);
        progressText2.setText(String.valueOf(progress2 + "%"));
    }

    private void updateCountText2() {
        SharedPreferences pref = this.getActivity().getSharedPreferences("updateCountCSS", Context.MODE_PRIVATE);
        int counter = pref.getInt("countCSS", 0);
        count2 = counter;
        countText2.setText(String.valueOf("Кол-во посещений курса: " + count2));
    }

    private void updateDoneText2() {
        SharedPreferences preferences = this.getActivity().getSharedPreferences("updateDoneCSS", Context.MODE_PRIVATE);
        int fin = preferences.getInt("doneCSS", 0);
        done2 = fin;
        doneText2.setText(String.valueOf("Пройдено тем " + done2 + " из 5"));

    }

    private void updateProgressStat3() {
        SharedPreferences pref = this.getActivity().getSharedPreferences("updateStatisticsDesign", Context.MODE_PRIVATE);
        int prog = pref.getInt("statDesign", 0);
        progress3 = prog;
        progressBar3.setProgress(progress3);
        progressText3.setText(String.valueOf(progress3 + "%"));
    }

    private void updateCountText3() {
        SharedPreferences pref = this.getActivity().getSharedPreferences("updateCountDesign", Context.MODE_PRIVATE);
        int counter = pref.getInt("countDesign", 0);
        count3 = counter;
        countText3.setText(String.valueOf("Кол-во посещений курса: " + count3));
    }

    private void updateDoneText3() {
        SharedPreferences preferences = this.getActivity().getSharedPreferences("updateDoneDesign", Context.MODE_PRIVATE);
        int fin = preferences.getInt("doneDesign", 0);
        done3 = fin;
        doneText3.setText(String.valueOf("Пройдено тем " + done3 + " из 4"));

    }


}