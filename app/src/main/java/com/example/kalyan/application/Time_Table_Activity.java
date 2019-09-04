package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Time_Table_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time__table_);




    }
    public void firstsem(View view) {
        Intent intent1=new Intent(getApplicationContext(),First_Sem_Activity.class);
        startActivity(intent1);
    }

    public void sbs(View view) {
        Intent intent1=new Intent(getApplicationContext(),sbs_tt_Activity.class);
        startActivity(intent1);
    }
    public void seocs(View view) {
        Intent intent1=new Intent(getApplicationContext(),seocs_tt_Activity.class);
        startActivity(intent1);
    }
    public void ece(View view) {
        Intent intent1=new Intent(getApplicationContext(),ece_tt_Activity.class);
        startActivity(intent1);
    }
    public void cse(View view) {
        Intent intent1=new Intent(getApplicationContext(),cse_tt_Activity.class);
        startActivity(intent1);
    }
    public void ee(View view) {
        Intent intent1=new Intent(getApplicationContext(),ee_tt_Activity.class);
        startActivity(intent1);
    }
    public void sif(View view) {
        Intent intent1=new Intent(getApplicationContext(),sif_tt_Activity.class);
        startActivity(intent1);
    }
    public void smmme(View view) {
        Intent intent1=new Intent(getApplicationContext(),smmme_tt_Activity.class);
        startActivity(intent1);
    }
    public void sms(View view) {
        Intent intent1=new Intent(getApplicationContext(),sms_tt_Activity.class);
        startActivity(intent1);
    }
    public void phd(View view) {
        Intent intent1=new Intent(getApplicationContext(),phd_tt_Activity.class);
        startActivity(intent1);
    }
    public void exam(View view) {
        Intent intent1=new Intent(getApplicationContext(),exam_tt_Activity.class);
        startActivity(intent1);
    }

    public void onclick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.iitbbs.ac.in/time-table.php"));
        startActivity(intent);
    }
}
