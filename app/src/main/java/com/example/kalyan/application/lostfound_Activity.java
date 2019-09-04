package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class lostfound_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lostfound_);

    }
    public void lostform(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfyhAWodoMcdZSf82njkV7WCPDhKn3UeqrqHOKDNbbTovbGaQ/viewform?usp=sf_link"));
        startActivity(intent);
    }
    public void lostsheet(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://docs.google.com/spreadsheets/d/1BOiv0SQBsJzBp7KtROAP4VeSyqcmpxruskcVot_3YyY/edit?usp=sharing"));
        startActivity(intent);
    }
    public void foundform(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdhb2qubfhuiqxEWt8RGldlo6qpTG6lhQ5at2PltwLof4TYBA/viewform?usp=sf_link"));
        startActivity(intent);
    }
    public void foundsheet(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://docs.google.com/spreadsheets/d/1OUdTVw6dtLZgh_yZZfpRabb-dFql-SorRqTvIK_KWU8/edit?usp=sharing"));
        startActivity(intent);
    }

}
