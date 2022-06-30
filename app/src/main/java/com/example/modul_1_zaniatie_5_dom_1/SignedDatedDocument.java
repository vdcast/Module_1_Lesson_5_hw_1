package com.example.modul_1_zaniatie_5_dom_1;

import android.util.Log;

public class SignedDatedDocument extends DatedDocument{
    String sign;


    public SignedDatedDocument(String title, String text, String date, String sign) {
        super(title, text, date);
        this.sign = sign;
    }

    @Override
    public void print(){
        super.print();
        Log.d("MYLOG", sign);
    }
}
