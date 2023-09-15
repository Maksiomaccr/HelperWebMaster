package com.example.helperhtmlcss;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.helperhtmlcss.favorite.html.AtributeAdapter;
import com.example.helperhtmlcss.favorite.html.AtributeItem;

import java.util.ArrayList;
import java.util.List;

public class DirectoryCSS extends AppCompatActivity {

    private Button currentButton;
    private ArrayList<AtributeItem> atributeItems = new ArrayList<>();
    private ArrayList<AtributeItem> fullItem = new ArrayList<>();
    AtributeAdapter atributeAdapter = new AtributeAdapter(atributeItems, this);
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_css);

        ImageButton btn_back = findViewById(R.id.button_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DirectoryCSS.this, MainActivity.class);
                startActivity(intent);

            }
        });




        btn1 = findViewById(R.id.CSSbtn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                show("7");
                handleButtonClicked(btn1);
            }
        });
        btn2 = findViewById(R.id.CSSbtn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show("8");
                handleButtonClicked(btn2);
            }
        });
        btn3 = findViewById(R.id.CSSbtn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show("9");
                handleButtonClicked(btn3);
            }
        });
        btn4 = findViewById(R.id.CSSbtn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show("10");
                handleButtonClicked(btn4);
            }
        });
        btn5 = findViewById(R.id.CSSbtn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show("11");
                handleButtonClicked(btn5);
            }
        });
        btn6 = findViewById(R.id.CSSbtn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show("12");
                handleButtonClicked(btn6);
            }
        });





        recyclerView = findViewById(R.id.rvcss);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new AtributeAdapter(atributeItems, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "*", "Выбирает абсолютно все элементы.", "90", "0", "\tВыбирает абсолютно все элементы. Например, такой код обнуляет внутренние и внешние отступы у всех элементов на странице:\n" +
                "\t* { margin:0; padding:0; }\n" +
                "\t* можно использовать в связке с другими селекторами. Например, выделим все дочерние элементы #container сплошной черной рамкой шириной 1px.\n" +
                "\t#container * { border: 1px solid black; }", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "#id", "Выбирает элемент, у которого есть атрибут id с указанным значением.", "91", "0", "\tВыбирает элемент у которого есть атрибут id с указанным значением: id=\"myid\".\n" +
                "\tИдентификатор может быть присвоен только одному элементу на странице (если присвоить несколько, то мир не рухнет, но так делать не принято).\n" +
                "\tИдентификатор должен состоять из латинских букв (a-zA-Z), цифр (0-9), символа дефиса или подчеркивания: - _. Начинается он только с буквы!.", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, ".class", "Выбирает элемент, у которого есть атрибут class с указанным значением.", "92", "0", "\tВыбирает элемент у которого есть атрибут class с указанным значением: class=\"myclass\".\n" +
                "\tНазвание класса, может состоять из латинских букв (a-zA-Z), цифр (0-9), символа дефиса и подчеркивания (- _).\n" +
                "\tУ одного элемента может быть несколько классов (через пробел): <div class=\"error myclass\">.", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "tag", "Селектор HTML-тэга", "93", "0", "\tСелектор HTML тега. Применяться ко всем указанным элементам в документе. Часто используется для задания цвета, фона, шрифта и др.\n" +
                "\tСледующий код задает цвет текста для всех ссылок и отступы для UL списков:\n" +
                "\ta { color: red; }\n" +
                "\tul { margin-left: 0; }", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "tag1 tag2", "Выбирает элементы второго тэга, который являются дочерними к первому тэгу.", "94", "0", "\tВыбирает элементы второго тэга, которые являются дочерними к первому тэгу. Может состоять из нескольких селекторов: tag1 tag2 tag3. Сначала обязательно указывается родитель, а после него дочерние элементы. Их количество может быть любым. Свойства стилей будут применены только к последнему элементу.\n" +
                "\tНапример, следующий код выбирает любой элемент <а>, являющийся потомком элемента\n" +
                "\tHTML:" +
                "\t(<li><a href=\"ссылка\">текст</a></li>):\n" +
                "\tCSS: \n" +
                "\tli a { text-decoration: none; }", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "tag1, tag2", "Объединяет несколько селекторов", "95", "0", "\tОбъединяет несколько селекторов, так чтобы указать всем выбранным селекторам одинаковые стили.\n" +
                "\tСледующий код задает цвет текста для заголовков h2 и ссылок в теге LI:\n" +
                "\th2,\n" +
                "\tli a { color: red; }", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "tag1 > tag2", "Выбирает элементы второго тэга, которые являются дочерними к первому тэгу.", "96", "0", "\tВыбирает элементы второго тэга, которые являются дочерними к первому тэгу. Выбирается только первый уровень дочерних элементов.\n" +
                "\tПример:\n" +
                "\tCSS: \n" +
                "\t.parent > li{ border: 1px solid red; }\n" +
                "\tHTML: \n" +
                "\t<ul class=\"parent\">\n" +
                "\t\t<li> список1\n" +
                "\t\t\t<ul class=\"child\">\n" +
                "\t\t\t\t<li>список11</li>\n" +
                "\t\t\t\t<li>список12</li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</li><!-- затронет -->\n" +
                "\t\t<li>список2</li><!-- затронет -->\n" +
                "\t\t<li>список3</li><!-- затронет -->\n" +
                "\t</ul>", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "tag1 ~ tag2", "Выбираются все элементы второго тэга, которые расположены после первого тэга.", "97", "0", "\tВыбирает все элементы второго тэга, которые расположены после первого тэга (на том же уровне). По поведению похож на tag1 + tag2. Разница в том, что будут выбраны все следующие элементы, а не только первый.\n" +
                "\tНапример, в указанном коде будут выбраны все элементы p, которые расположены после div:\n" +
                "\tCSS: \n" +
                "\tdiv ~ p { color: red; }\n" +
                "\tHTML: \n" +
                "\t<div>текст</div>\n" +
                "\t<p>текст 2</p><!-- color: red; -->\n" +
                "\t<p>текст 3</p><!-- color: red; -->", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "tag1 + tag2", "Выбирается первый элемент второго тэга, который находится после первого тэга.", "98", "0", "\tВыбирает первый элемент второго тэга, который находится после первого тэга (не вложен, а рядом). Стили будут применяться только к последнему элементу первого тэга.\n" +
                "\tНапример, следующий код устанавливает красный цвет текста в абзаце p, который расположен сразу после div:\n" +
                "\tCSS: \n" +
                "\tdiv + p { color: red; }\n" +
                "\tHTML: \n" +
                "\t<div>текст</div>\n" +
                "\t<p>текст 2</p><!-- color: red; -->\n" +
                "\t<p>текст 3</p>", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "a:link", "Выбирает не посещённую ссылку", "99", "0", "\tВыбирает обычную (не посещенную) ссылку. Обычно этот селектор записывается просто как a.\n" +
                "\ta:link   { color: red; }    /* можно просто а{  } */ /* все не посещенные ссылки */", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "a:visited", "Выбирает уже посещённую ссылку", "100", "0", "\ta:visted { color: purple; } /* все посещенные ссылки */", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "a:hover", "Выбирает ссылку, на которую наведена мышка", "101", "0", "\ta:hover  { color: green; }  /* ссылка под курсором */", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "a:active", "Выбирает активную ссылку", "102", "0", "\ta:active { color: blue; }   /* нажатая ссылка */", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "a:focus", "Выбирает активную ссылку, в момент нажатия", "103", "0", "\ta:focus  { color: dark; }   /* ссылка в момент нажатия */", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, ":target", "Выделяет активный якорь в HTML", "104", "0", "\tВыделяет активный якорь в HTML. Допустим у нас ссылка ссылается на внутренний якорь <a href=\"#anchor\"> на странице, тогда при клике по этой ссылке этот селектор выделить элемент имеющий атрибут id=\"anchor\".\n" +
                "\tCSS: \n" +
                "\t:target { color: red; }\n" +
                "\tHTML:\n" +
                "\t<a href=\"#anchor1\">Перейти на якорь 1</a>\n" +
                "\t<a href=\"#anchor2\">Перейти на якорь 2</a>\n" +
                "\t<!-- При клике по этим ссылкам выберется соответствующий элемент ниже -->\n" +
                "\t<p id=\"anchor1\">Элемент 1</p>\n" +
                "\t<p id=\"anchor2\">Элемент 2</p>", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, ":checked", "Стилизует выбранные переключатели.", "105", "0", "\tСтилизует выбранные radio / checkbox. Может использоваться с тегом input или option или без них: input:checked, option:checked или :checked.\n" +
                "\tНапример, следующий код выделяет сплошной черной рамкой в 1px область возле включенного флажка:\n" +
                "\tinput[type=radio]:checked { border:1px solid black; }", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, ":default", "Выбирает элемент формы, который считается элементом по умолчанию.", "106", "0", "\tВыбирает элемент формы, который считается элементом по умолчанию. Работает с тегами <button>, <input>, <option>.\n" +
                "\t<form>\n" +
                "\t\t<input type=\"submit\"><!-- будет выбран -->\n" +
                "\t\t<input type=\"submit\">\n" +
                "\t\t<input type=\"reset\">\n" +
                "\t</form>\n" +
                "\t<option> считается дефолтным (:default), если это элемент с атрибутом selected или первый enabled (NOT disabled) элемент по порядку DOM элементов. Для <select multiple> каждый selected элемент будет считаться дефолтным.\n" +
                "\t<input type=\"checkbox\"> и <input type=\"radio\"> считаются дефолтными, если они выбраны (имеют атрибут checked).\n" +
                "\t<button> считается дефолтной, если это базовая кнопка сабмита формы (<form>) — это первая в форме кнопка по порядку DOM элементов. Это также справедливо и для типов <input type=\"submit\">.", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, ":empty", "Выбирает любой пустой элемент.", "107", "0", "\tВыбирает любой пустой элемент. Пустой значит в нём не должно быть ничего (ни одной node): ни пробелов, ни текста, ни других элементов. HTML комментарии, CSS код не повлияют на то что элемент будет считать не пустой.\n" +
                "\tCSS:\n" +
                "\t.box {\n" +
                "\t\tbackground: red;\n" +
                "\t\theight: 200px;\n" +
                "\t\twidth: 200px;\n" +
                "\t}\n" +
                "\n" +
                "\t.box:empty {\n" +
                "\t\tbackground: lime;\n" +
                "\t}\n" +
                "\t HTML: \n" +
                "\t<div class=\"box\"><!-- пустой --></div>\n" +
                "\t<div class=\"box\">Я буду красным</div>\n" +
                "\t<div class=\"box\">\n" +
                "\t\t<!-- Я буду красным, так как перед комментарием стоят пробелы -->\n" +
                "\t</div>", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "::before", "Добавляет псевдо-элемент в начало тэга.", "108", "0", "\tтэг::before добавляет псевдо-элемент в начало тэга (внутрь тэга). Работает вместе со свойством тэг::before{ content:'' }, которое указывает содержание добавленного элемента. content нужно указывать даже если содержание пустое (content:''), т.к. элемент должен хоть что-то содержать.\n" +
                "\tНапример с помощью таких стилей, можно указать значок для LI списка:\n" +
                "\tli:before {\n" +
                "\t\tcontent: '-';\n" +
                "\t\tdisplay: inline-block;\n" +
                "\t\tmargin-right: .5em;\n" +
                "\t}", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssselectors, "::after", "Добавляет псевдо-элемент в конец тэга.", "109", "0", "\tтэг:after добавляет псевдо-элемент в конец тэга (внутрь тэга). Работать только совместно со свойством тэг::after{ content:'' }, которое указывает содержание добавленного элемента. content нужно указывать даже если содержание пустое (content:''), т.к. элемент должен хоть что-то содержать.\n" +
                "\tНапример с помощью таких стилей, можно создать блок который будет очищать все вышестоящие обтекающие элементы. Частый прием в верстке:\n" +
                "\t.clear:after {\n" +
                "\t\tcontent: '';\n" +
                "\t\tdisplay: table;\n" +
                "\t\tclear: both;\n" +
                "\t}", "", "7"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "border", "Указывает границы элемента.", "110", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "border-color", "Задаёт цвет границ элемента.", "111", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "color", "Задаёт цвет элементу.", "112", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "cursor", "Обращается к курсору.", "113", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "display", "Задаёт вид отображаемого элемента.", "114", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "float", "Задаёт стороны смещения и обтекания элемента.", "115", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "height", "Задаёт высоту элементе.", "116", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "margin", "Задаёт внешний отступ.", "117", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "max-height", "Задаёт максимальную высоту.", "118", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "max-width", "Задаёт максимальную ширину.", "119", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "min-width", "Задаёт минимальную ширину.", "119", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "min-height", "Задаёт минимальную высоту.", "120", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "overlow", "Управление выводом содержания блочного элемента.", "121", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "padding", "Задаёт внутренний отступ.", "122", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "position", "Задаёт положение элемента.", "123", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "right", "Задаёт расстояние от правого края.", "124", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "top", "Задаёт расстояние от верхнего края.", "125", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "bottom", "Задаёт расстояние от нижнего края.", "126", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "left", "Задаёт расстояние от левого края.", "127", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "vertical-align", "Задаёт выравнивание по вертикали.", "128", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "visibility", "Задаёт видимость элемента.", "129", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "width", "Задаёт ширину элемента.", "130", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssglobal, "z-index", "Задаёт порядок вывода слоёв.", "131", "0", "\t", "", "8"));
        atributeItems.add(new AtributeItem(R.drawable.cssbackground, "background-attachment", "Указывает поведение фона при прокручивании страницы.", "132", "0", "\t", "", "9"));
        atributeItems.add(new AtributeItem(R.drawable.cssbackground, "background-color", "Указывает фона.", "133", "0", "\t", "", "9"));
        atributeItems.add(new AtributeItem(R.drawable.cssbackground, "background-image", "Указывает фоновое изображение.", "134", "0", "\t", "", "9"));
        atributeItems.add(new AtributeItem(R.drawable.cssbackground, "background-position", "Указывает положение фонового изображения.", "135", "0", "\t", "", "9"));
        atributeItems.add(new AtributeItem(R.drawable.cssbackground, "background-repeat", "Указывает повторение фона.", "136", "0", "\t", "", "9"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "clear", "Отмена обтекания элемента текстом.", "137", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "direction", "Указывает напрваление вывода текста.", "138", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "font", "Задаёт шрифт текста.", "139", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "font-family", "Задаёт семейство шрифта текста.", "140", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "font-size", "Задаёт размер шрифта текста.", "141", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "font-style", "Задаёт начертание шрифта текста.", "142", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "font-variant", "Указывает тексту малые прописные буквы.", "143", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "font-weight", "Задаёт насыщеность шрифта текста.", "144", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "letter-spacing", "Задаёт межсимвольный интервал.", "145", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "line-height", "Задаёт межстрочный интервал.", "146", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "text-align", "Устанавливает выравнивание по горизонтали.", "147", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "text-decoration", "Указывает оформление текста.", "148", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "text-indent", "Указывает красную строку.", "149", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "text-transform", "Указывает преобразование текста.", "150", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "white-space", "Отделяет слова друг от друга.", "151", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstext, "word-spacing", "Задаёт интервал между словами.", "152", "0", "\t", "", "10"));
        atributeItems.add(new AtributeItem(R.drawable.csstable, "border-collapse", "Указывает слияние границ таблицы.", "153", "0", "\t", "", "11"));
        atributeItems.add(new AtributeItem(R.drawable.csstable, "border-spacing", "Указывает расстояние между границами ячеек таблицы.", "154", "0", "\t", "", "11"));
        atributeItems.add(new AtributeItem(R.drawable.csstable, "border-style", "Указывает вид рамки элемента.", "155", "0", "\t", "", "11"));
        atributeItems.add(new AtributeItem(R.drawable.csstable, "border-width", "Указывает ширину линии рамки.", "156", "0", "\t", "", "11"));
        atributeItems.add(new AtributeItem(R.drawable.csstable, "caption-side", "Указывает положение заголовка таблицы.", "157", "0", "\t", "", "11"));
        atributeItems.add(new AtributeItem(R.drawable.csstable, "empty-cells", "Указывает границы и фон пустых ячеек таблицы.", "158", "0", "\t", "", "11"));
        atributeItems.add(new AtributeItem(R.drawable.csstable, "table-layout", "Устанавливает подгонку ячеек таблицы по высоте и ширине.", "159", "0", "\t", "", "11"));
        atributeItems.add(new AtributeItem(R.drawable.csslist, "list-style", "Указывает вид списочного маркера.", "160", "0", "\t", "", "12"));
        atributeItems.add(new AtributeItem(R.drawable.csslist, "list-style-image", "Указывает адрес файла картинки, используемой в качестве списочного маркера.", "161", "0", "\t", "", "12"));
        atributeItems.add(new AtributeItem(R.drawable.csslist, "list-style-position", "Указывает положение маркера.", "162", "0", "\t", "", "12"));
        atributeItems.add(new AtributeItem(R.drawable.csslist, "list-style-type", "Указывает вид маркера.", "163", "0", "\t", "", "12"));


        fullItem.addAll(atributeItems);
    }

    @SuppressLint("NotifyDataSetChanged")
    public void show(String category) {

        atributeItems.clear();
        atributeItems.addAll(fullItem);

        ArrayList<AtributeItem> filter = new ArrayList<>();
        for (AtributeItem c : atributeItems) {
            if (c.getCategory().equals(category)) {
                filter.add(c);
            }
        }
        atributeItems.clear();
        atributeItems.addAll(filter);
        recyclerView.setAdapter(atributeAdapter);
    }
    private void handleButtonClicked(Button clickedButton) {
        if (currentButton != null) {
            currentButton.setBackgroundResource(R.drawable.category_item);
        }

        clickedButton.setBackgroundResource(R.drawable.category_item_active);

        currentButton = clickedButton;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}