package com.example.modul_1_zaniatie_5_dom_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Document datedDocument = new DatedDocument("Dated doc","Text","06/06/22");
        datedDocument.print();
        datedDocument.saveDocument();

        SignedDatedDocument signedDatedDocument = new SignedDatedDocument("Signed and Dated",
                "Text","06/06/22","Ivan");
        signedDatedDocument.print();
        signedDatedDocument.saveDocument();
    }
}