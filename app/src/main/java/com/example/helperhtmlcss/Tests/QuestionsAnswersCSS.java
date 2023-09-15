package com.example.helperhtmlcss.Tests;

public class QuestionsAnswersCSS {
    public static String question[] = {
            "Как правильно писать комментарии в CSS файле?",
            "Как правильно задать тег, который будет описывать класс стиля для элемента div?",
            "Как правильно подключить документ с css-стилем в html-файл?",
            "Как объявить стиль для печати?"
    };
    public static String choices[][] = {
            {"// Комментарий", "<!--Комментарий-->", "/* Комментарий */", "*** Комментарий ***"},
            {"class:div", "#class", ".class", "div:class"},
            {"<head><link href=”http://site.ru/style.css></head>", "<body><link rel =”stylesheet” href =”http://site.ru/style.css”></body>", "<head><link rel =”stylesheet” href =”http://site.ru/style.css”></head>", "<body><link href=”http://site.ru/style.css></body>"},
            {"@media print { }", ".print { }", "print { }", "print ()"}

    };
    public static String correctAnswers[] = {
            "/* Комментарий */",
            "class:div",
            "<head><link rel =”stylesheet” href =”http://site.ru/style.css”></head>",
            "@media print { }"

    };
}
