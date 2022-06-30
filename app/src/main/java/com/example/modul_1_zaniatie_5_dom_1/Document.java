package com.example.modul_1_zaniatie_5_dom_1;

import android.util.Log;

public class Document {
    public String title;
    public String text;

    public Document(String title, String text){
        this.title = title;
        this.text = text;
    }

    public void print(){
        Log.d("MYLOG", title);
        Log.d("MYLOG", text);
    }

    public void saveDocument(){
        Log.d("MYLOG", "Document <" + title + "> saved");
    }
}
