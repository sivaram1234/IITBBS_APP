package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AcademicCalender_Activity extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_calender_);

        button1 = (Button) findViewById(R.id.button1_cc);
        button2 = (Button) findViewById(R.id.button2_cc);
        button3 = (Button) findViewById(R.id.button3_cc);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AcademicCalender_Activity.this, AcademicCalenderView_Activity.class);
                i.putExtra("filenumber", 1);
                startActivity(i);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AcademicCalender_Activity.this, AcademicCalenderView_Activity.class);
                i.putExtra("filenumber", 2);
                startActivity(i);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AcademicCalender_Activity.this, AcademicCalenderView_Activity.class);
                i.putExtra("filenumber", 3);
                startActivity(i);
            }
        });

    }

    public void www_ac(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.iitbbs.ac.in/academic-calender.php"));
        startActivity(intent);
    }

}

