package com.example.helperhtmlcss.Tests;

public class QuestionsAnswersCSS3 {
    public static String question[] = {
            "Какое из этих значений НЕ может быть значением для font-size?",
            "Какого размера будет текст в теге <p>, если к документу относится стиль из кода ниже? \n" +
                    "body{font-size: 14pt;}\n" +
                    "p{font-size: 2em;}\n",
            "Как задать цвет шрифту?",
            "Какой пример описания шрифтов написан корректно?",
            "Какое свойство позволяет задать цвет текста?",
            "Какое свойство позволяет управлять выравниванием?"
    };
    public static String choices[][] = {
            {"50%", "2 mm", "4", "xx-large"},
            {"2em", "28pt", "14pt", "2pt"},
            {"font-color: #FF0000;", "font-color: red;", "color: red;", "font: #FF0000;"},
            {"p { font: status }", "p {font-family: arial}", "font { oblique arial }", "h1 { font: italic 200 arial }"},
            {"color", "text", "textcolor", "colortext"},
            {"text-indent", "text-shadow", "word-spacing", "text-align"}

    };
    public static String correctAnswers[] = {
            "4",
            "28pt",
            "color: red;",
            "h1 { font: italic 200 arial }",
            "color",
            "text-align"

    };
}
