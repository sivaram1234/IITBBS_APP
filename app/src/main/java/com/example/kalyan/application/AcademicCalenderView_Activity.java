package com.example.kalyan.application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class AcademicCalenderView_Activity extends AppCompatActivity {

PDFView book1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_calender_view_);

    Intent i=getIntent();
    int no=i.getIntExtra("filenumber",0);

    if(no==1) {
        book1 = (PDFView) findViewById(R.id.book1);
        book1.fromAsset("Academic Calendar 2019-20.pdf").load();
       // Toast.makeText(this, "Opening file "+no, Toast.LENGTH_SHORT).show();
    }
    else if(no==2){
        //Toast.makeText(this, "Opening file "+no, Toast.LENGTH_SHORT).show();
        book1 = (PDFView) findViewById(R.id.book1);
        book1.fromAsset("Monthly Schedule Autumn (2019-20)_2.pdf").load();
    }else if(no==3){
       // Toast.makeText(this, "Opening file "+no, Toast.LENGTH_SHORT).show();
        book1 = (PDFView) findViewById(R.id.book1);
        book1.fromAsset("Monthly Schedule Spring (2019-20).pdf").load();
    }
    }
}
