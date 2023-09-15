package com.example.helperhtmlcss.Tests;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helperhtmlcss.CSS.CSSCource;
import com.example.helperhtmlcss.R;

public class CSSTest2 extends AppCompatActivity implements View.OnClickListener {
    TextView question, totalQuestionText;
    Button ansA, ansB, ansC, ansD;
    Button submit;
    public static int total = 1;
    int score;
    int currentQuestionIndex = 0;
    int totalQuestion = QuestionsAnswersCSS2.question.length;
    String selectedAnswer = "";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csstest2);
        question = findViewById(R.id.question2);
        ansA = findViewById(R.id.AnswerA);
        ansB = findViewById(R.id.AnswerB);
        ansC = findViewById(R.id.AnswerC);
        ansD = findViewById(R.id.AnswerD);
        submit = findViewById(R.id.submit2);
        totalQuestionText = findViewById(R.id.totalQuestionText2);

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
        if (clickedButton.getId() == R.id.submit2) {
            total++;
            if (selectedAnswer.equals(QuestionsAnswersCSS2.correctAnswers[currentQuestionIndex])) {
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
    void loadNewQuestion() {
        if (currentQuestionIndex == totalQuestion) {
            finishTest();
            return;
        }
        totalQuestionText.setText(total + "/" + totalQuestion);
        question.setText(QuestionsAnswersCSS2.question[currentQuestionIndex]);
        ansA.setText(QuestionsAnswersCSS2.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionsAnswersCSS2.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionsAnswersCSS2.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionsAnswersCSS2.choices[currentQuestionIndex][3]);
    }

    private void finishTest() {
        String passStatus = "";
        if (score >= totalQuestion) {
            passStatus = "Правильно";
            int prog = 100;
            SharedPreferences prefs = getSharedPreferences("CSS", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("newProgress2", prog);
            editor.apply();
            new AlertDialog.Builder(this)
                    .setTitle(passStatus).
                    setMessage("Правильных ответов " + score + " из " + totalQuestion)
                    .setPositiveButton("Завершить", (dialogInterface, which) -> finTest())
                    .setCancelable(false)
                    .show();
        } else {
            passStatus = "Неправильно";
            new AlertDialog.Builder(this)
                    .setTitle(passStatus).
                    setMessage("Правильных ответов " + score + " из " + totalQuestion)
                    .setPositiveButton("Повторить попытку", (dialogInterface, which) -> restartTest())
                    .setCancelable(false)
                    .show();
        }

    }

    private void finTest() {
        Intent intent = new Intent(this, CSSCource.class);
        startActivity(intent);
    }

    private void restartTest() {
        score = 0;
        total = 1;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }

    public void back(View view) {
        Intent intent = new Intent(this, CSSCource.class);
        startActivity(intent);
    }
}