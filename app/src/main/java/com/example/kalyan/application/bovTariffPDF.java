package com.example.kalyan.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class bovTariffPDF extends AppCompatActivity {
    PDFView book2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "Opening BOV Tariff pdf", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bov_tariff_pdf);
        book2=(PDFView)findViewById(R.id.book2);
        book2.fromAsset("bov_tariff.pdf").load();
    }
}
