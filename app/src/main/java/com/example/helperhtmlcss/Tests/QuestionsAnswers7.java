package com.example.helperhtmlcss.Tests;

public class QuestionsAnswers7 {
    public static String question[] = {
            "О чем говорит следующая запись: <form action=\"url\" method=\"POST\">?",
            "Какое значение следует задать атрибуту type, чтобы оно превращало входной тэг в форму отправки?",
            "Какая запись для создания флажка корректна?",
            "Какое значение атрибута type используется для создания переключателя?",
            "За что отвечает атрибут readonly в текстовом поле ввода?",
            "Какое значение атрибута type создаёт ползунок?"


    };
    public static String choices[][] = {
            {"Создается форма, при заполнении которой вводимые данные будут отображаться", "Создается форма, при заполнении которой вводимые данные не будут отображаться", "Создается форма, которая будет служить для внесения информации, представленной в виде ссылки (URL)", "Создаётся форма, при заполнении которой определяется, должен ли текст сохранять переносы строк"},
            {"submit", "checkbox", "radiobutton", "email"},
            {"<input checkbox>", "<type input=\"checkbox\">", "<input type=\"checkbox\">", "<input = checkbox>"},
            {"checkbox", "button", "radiobutton", "radio"},
            {"Отключает возможность редактирования содержимого поля", "Выводит сообщение о том, что данное поле является обязательным для заполнения", "Отключает возможность редактирования и копирования содержимого поля", "Определяет короткую текстовую подсказку, которая описывает ожидаемое вводимое значение"},
            {"button", "range", "url", "reset"}


    };
    public static String correctAnswers[] = {
            "Создается форма, которая будет служить для внесения информации, представленной в виде ссылки (URL)",
            "submit",
            "<type input=\"checkbox\">",
            "radio",
            "Отключает возможность редактирования содержимого поля",
            "range"

    };
}
