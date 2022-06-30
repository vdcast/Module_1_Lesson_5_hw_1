package com.example.modul_1_zaniatie_5_dom_1;

import android.util.Log;

public class DatedDocument extends Document{
    String date;

    public DatedDocument(String title, String text, String date){
        super(title, text);
        this.date = date;
    }

    @Override
    public void print(){
        super.print();
        Log.d("MYLOG", date);
    }
}
