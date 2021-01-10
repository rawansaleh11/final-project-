package com.example.onlinelawyer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {


    TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
         textView = (TextView) findViewById(R.id.text1);

         String para = "تطبيق online lawyer يتضمن بالعديد من المزايا ويسهل على المستخدم العثور على إستشارة سريعة وبسهولة في أسرع وقت ممكن ويسمح التطبيق بتواصل الموكلين مع محامينهم عبر الرسائل النصية. \n" +
                 "\n" +
                 " \n" +
                 "يتميز التطبيق بالعديد من المزايا منها:\n" +
                 "\n" +
                 " ⁃ وجود عدد كبير من المستشارين والمحامين المختصين في شتى المجالات وسهولة العثور على المستشار المناسب.\n" +
                 "\n" +
                 "⁃ يحتوي التطبيق على جميع أنواع الاستشارات ( إجتماعية وأسرية - قانونية - عقارية  - إدارية - طبية وأخرى).\n" +
                 "\n" +
                 " ⁃ إمكانية إستشارة محامي اونلاين وحجز موعد بسهولة.\n" +
                 "\n" +
                 " ⁃ إمكانية التواصل مع المحامي برسائل خاصة لمعرفة آخر مستجدات القضية.";

         textView.setText(para);
         textView.setMovementMethod(new ScrollingMovementMethod());



    }
}