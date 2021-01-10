package com.example.onlinelawyer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ArrayList<Lawyerslist> nameslibrary = new ArrayList<>();
        Lawyerslist aa = new Lawyerslist("المحامي/محمد خالد",2348764,R.drawable.avatar);
        Lawyerslist bb = new Lawyerslist("المحامية/كوثر الشمري",2348799,R.drawable.avatar);
        Lawyerslist cc = new Lawyerslist("المحامية/شهد ناصر",2348777,R.drawable.avatar);
        Lawyerslist dd = new Lawyerslist("المحامية/فاطمة الوزان",2348788,R.drawable.avatar);
        Lawyerslist ee = new Lawyerslist("المحامية/نورة المطيري",2348744,R.drawable.avatar);
        Lawyerslist ff = new Lawyerslist("المحامية/محمد صالح",2348744,R.drawable.avatar);
        Lawyerslist gg = new Lawyerslist("المحامية/سالم علي",2348744,R.drawable.avatar);


        nameslibrary.add(aa);
        nameslibrary.add(bb);
        nameslibrary.add(cc);
        nameslibrary.add(dd);
        nameslibrary.add(ee);
        nameslibrary.add(ff);
        nameslibrary.add(gg);


        RecyclerView lawyerslist = findViewById(R.id.rv);
        RecyclerView.LayoutManager LM =new LinearLayoutManager(this);
        lawyerslist.setHasFixedSize(true);
        lawyerslist.setLayoutManager(LM);

        Adapter la = new Adapter(nameslibrary,MainActivity3.this);
        lawyerslist.setAdapter(la);
    }
}