package com.example.helperhtmlcss;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PracticalTask extends AppCompatActivity {

    WebView webView;
    Button send, task, instr;
    ImageButton back;
    EditText mail, link;
    TextView title;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_task);

        mail = findViewById(R.id.mail);
        mail.setText("maxcraft.vjugov@yandex.ru");
        link = findViewById(R.id.link);
        title = findViewById(R.id.HTMLTitle);

        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendMain();
                int newProgress8 = 100;
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(PracticalTask.this);
                SharedPreferences.Editor editors = preferences.edit();
                editors.putInt("newProgress8", newProgress8);
                editors.apply();

            }
        });
        back = findViewById(R.id.bBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalTask.this, HTMLCource.class);
                startActivity(intent);
            }
        });

        webView = findViewById(R.id.wev_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.tutorialspoint.com/online_html_editor.php");
        webView.setWebViewClient(new PracticalTask.webViewClient());

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
            Toast.makeText(PracticalTask.this, "Введите ссылку", Toast.LENGTH_SHORT).show();
        } else if (putLink.contains("http://")) {
            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Выберите почту"));
        } else {
            Toast.makeText(PracticalTask.this, "Введите ссылку", Toast.LENGTH_SHORT).show();
        }

    }

    private void showTask() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Практическое задание")
                .setMessage("\tВам необходимо разработать идею сайта (например сайт с заказами услуг или товаров) и реализовать HTML страницу, используя всё изученное в курсе.\n" +
                        "\t1. Создайте главный заголовок по центру страницы.\n" +
                        "\t2. Поместите по центру любое изображение (скопируйте url картинки с интернета).\n" +
                        "\t3. Создайте заголовок второго уровня и под ним напишите информацию о странице.\n" +
                        "\t4. Создайте список предлагаемых услуг или товаров.\n" +
                        "\t5. Создайте таблицу с перечнем услуг или товаров, их стоимостью, количеством и примечанием.\n" +
                        "\t6. Создайте форму с вводом имени, почты, номера телефона, выбором товара или услуги посредством всплывающего списка.\n" +
                        "\t7. Добавьте под форму нопку \"Отправить\"\n" +
                        "\t После выполнения задания, скопируйте ссылку на код, вставьте её в поле ввода ссылки, в поле вводы почты впишите почту преподавателя, затем нажмите кнопку \"Отправить\"")
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
        Intent intent = new Intent(this, HTMLCource.class);
        startActivity(intent);
    }
}