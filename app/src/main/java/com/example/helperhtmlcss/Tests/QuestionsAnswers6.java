package com.example.helperhtmlcss.Tests;

public class QuestionsAnswers6 {
    public static String question[] = {
            "В каком коде допущена ошибка? ",
            "Что будет создано данным кодом?\n<table>\n" +
                    "<tr>\n" +
                    "<td></td>\n" +
                    "<td></td>\n" +
                    "</tr>\n" +
                    "</table>\n",
            "Какой атрибут позволяет объединить ячейки таблицы по вертикали?",
            "С помощью какого атрибута можно изменить основной цвет фона ячеек?",
            "Какой тэг создаёт заголовок столбца?"


    };
    public static String choices[][] = {
            {"<table> <tr><td>а</td></tr></table>", "<table><td><tr>a, b</tr></td></table>", "<table border=”1”><td>a<tr></tr></td></table>", "<table><td><tr>a</tr></td></table>"},
            {"Таблицы, состоящая из 1 строки и 2 ячейки", "Таблица, состоящая из 2 строк и 1 ячейки", "Таблица, с маркированным списком из двух элементов", "Таблица, состоящая из 4 строк"},
            {"union", "colspan", "rowspan", "span"},
            {"style", "color", "background", "headers"},
            {"<tr>", "<caption>", "<th>", "<td>"}


    };
    public static String correctAnswers[] = {
            "<table><td><tr>a</tr></td></table>",
            "Таблицы, состоящая из 1 строки и 2 ячейки",
            "rowspan",
            "background",
            "<caption>"

    };
}
