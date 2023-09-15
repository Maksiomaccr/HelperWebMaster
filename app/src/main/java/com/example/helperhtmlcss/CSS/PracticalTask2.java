package com.example.helperhtmlcss.CSS;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helperhtmlcss.R;

public class PracticalTask2 extends AppCompatActivity {
    WebView webView;
    Button send, instr, task;
    ImageButton back;
    EditText mail, link;
    TextView title;
    @SuppressLint({"MissingInflatedId", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_task2);
        mail = findViewById(R.id.mail);
        mail.setText("maxcraft.vjugov@yandex.ru");
        mail.setTextColor(R.color.black);
        link = findViewById(R.id.link);
        title = findViewById(R.id.HTMLTitle);

        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendMain();
                int newProgress6 = 100;
                SharedPreferences preferences = getSharedPreferences("CSS", MODE_PRIVATE);
                SharedPreferences.Editor editors = preferences.edit();
                editors.putInt("newProgress6", newProgress6);
                editors.apply();

            }
        });
        back = findViewById(R.id.bBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalTask2.this, CSSCource.class);
                startActivity(intent);
            }
        });

        webView = findViewById(R.id.wev_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.tutorialspoint.com/online_html_editor.php");
        webView.setWebViewClient(new PracticalTask2.webViewClient());
        task = findViewById(R.id.task);
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTask();
            }
        });
        instr = findViewById(R.id.instruction);
        instr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInstruct();
            }
        });

    }


    public class webViewClient extends android.webkit.WebViewClient {
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    private void sendMain() {
        String putMail = mail.getText().toString();
        String[] put = putMail.split(",");
        String putTitle = title.getText().toString();
        String putLink = link.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, put);
        intent.putExtra(Intent.EXTRA_SUBJECT, putTitle);
        intent.putExtra(Intent.EXTRA_TEXT, putLink);

        if (TextUtils.isEmpty(putLink)) {
            Toast.makeText(PracticalTask2.this, "Введите ссылку", Toast.LENGTH_SHORT).show();
        }else if (putLink.contains("http://tpcg")){
            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Выберите почту"));}
        else{
            Toast.makeText(PracticalTask2.this, "Введите ссылку", Toast.LENGTH_SHORT).show();
        }

    }
    private void showTask() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Практическое задание")
                .setMessage("\tВам необходимо разработать сайт, используя глобальные или внутренние стили, в соответствии с правилами веб-дизайна\n" +
                        "\t1. Измените цвет фона страницы сайта.\n" +
                        "\t2. Напшиите заголовок, выбрав ему цвет и шрифт\n" +
                        "\t3. Разместите таблицу с фамилиями, именами, отчествами и должностями каждого сотрудника. Измените толщину рамки и цвета ячеек\n" +
                        "\t4. Разместите несколько ссылок на различные сайты, отредактируйте их цвета в неактивном состоянии и активном, укажите цвет при наведении на ссылку.\n" +
                        "\t5. Напишите текст, указав ему шрифт, размер и цвет.\n")
                .setPositiveButton("Закрыть", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showInstruct() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Инструкция пользования редактором")
                .setMessage("\tВ вкладке Source Code можно писать код.\n" +
                        "\t Чтобы смотреть результат кода, необходимо перейти на вкладку Output, либо нажать на кнопку Preview, который обновит результат и покажет Вам.\n" +
                        "\t Чтобы отправить ссылку на код, необходимо её получить в вкладке Share, где нужно ввести номер с кратинки, а затем нажать на кнопку Get Shareable Link, далее Get Link. Ссылка скопируется автоматически.")
                .setPositiveButton("Закрыть", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, CSSCource.class);
        startActivity(intent);
    }
}