package com.example.helperhtmlcss.Tests;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helperhtmlcss.HTMLCource;
import com.example.helperhtmlcss.R;

public class TableTest extends AppCompatActivity implements View.OnClickListener {
    TextView question6, totalQuestionText6;
    Button ansA, ansB, ansC, ansD;
    Button submit;
    public static int total6 = 1;
    int score;
    int currentQuestionIndex = 0;
    int totalQuestion6 = QuestionsAnswers6.question.length;
    String selectedAnswer = "";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_test);
        question6 = findViewById(R.id.question6);
        ansA = findViewById(R.id.AnswerA);
        ansB = findViewById(R.id.AnswerB);
        ansC = findViewById(R.id.AnswerC);
        ansD = findViewById(R.id.AnswerD);
        submit = findViewById(R.id.submit6);
        totalQuestionText6 = findViewById(R.id.totalQuestionText6);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submit.setOnClickListener(this);


        loadNewQuestion();
    }

    @Override
    public void onClick(View v) {
        ansA.setBackgroundResource(R.color.gray);
        ansB.setBackgroundResource(R.color.gray);
        ansC.setBackgroundResource(R.color.gray);
        ansD.setBackgroundResource(R.color.gray);
        ansA.setTextColor(Color.parseColor("#FF000000"));
        ansB.setTextColor(Color.parseColor("#FF000000"));
        ansC.setTextColor(Color.parseColor("#FF000000"));
        ansD.setTextColor(Color.parseColor("#FF000000"));


        Button clickedButton = (Button) v;
        if (clickedButton.getId() == R.id.submit6) {
            total6++;
            if (selectedAnswer.equals(QuestionsAnswers6.correctAnswers[currentQuestionIndex])) {
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();
        } else {
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundResource(R.color.purple);
            clickedButton.setTextColor(Color.parseColor("#FFFFFFFF"));
        }
    }
    @SuppressLint("SetTextI18n")
    void loadNewQuestion() {
        if (currentQuestionIndex == totalQuestion6) {
            finishTest6();
            return;
        }
        totalQuestionText6.setText(total6 + "/" + totalQuestion6);
        question6.setText(QuestionsAnswers6.question[currentQuestionIndex]);
        ansA.setText(QuestionsAnswers6.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionsAnswers6.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionsAnswers6.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionsAnswers6.choices[currentQuestionIndex][3]);
    }

    private void finishTest6() {
        String passStatus = "";
        if (score >= totalQuestion6) {
            passStatus = "Правильно";
            int prog = 100;
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("newProgress6", prog);
            editor.apply();
            new AlertDialog.Builder(this)
                    .setTitle(passStatus).
                    setMessage("Правильных ответов " + score + " из " + totalQuestion6)
                    .setPositiveButton("Завершить", (dialogInterface, which) -> finTest())
                    .setCancelable(false)
                    .show();
        } else {
            passStatus = "Неправильно";
            new AlertDialog.Builder(this)
                    .setTitle(passStatus).
                    setMessage("Правильных ответов " + score + " из " + totalQuestion6)
                    .setPositiveButton("Повторить попытку", (dialogInterface, which) -> restartTest())
                    .setCancelable(false)
                    .show();
        }

    }

    private void finTest() {
        Intent intent = new Intent(this, HTMLCource.class);
        startActivity(intent);
    }

    private void restartTest() {
        score = 0;
        total6 = 1;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }

    public void back(View view) {
        Intent intent = new Intent(this, HTMLCource.class);
        startActivity(intent);
    }
}