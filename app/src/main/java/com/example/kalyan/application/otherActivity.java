package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class otherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);


        Button b1 = (Button)findViewById(R.id.button1_aa);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://gymkhana.iitbbs.ac.in/"));
                startActivity(intent);
            }
        });
        Button b2 = (Button)findViewById(R.id.button2_aa);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.iitbbs.ac.in/cst/index.php"));
                startActivity(intent);
            }
        });
        Button b3 = (Button)findViewById(R.id.button3_aa);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.iitbbs.ac.in/e-cell.php"));
                startActivity(intent);
            }
        });
        Button b4 = (Button)findViewById(R.id.button4_aa);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.iitbbs.ac.in/cdc/index.php"));
                startActivity(intent);
            }
        });
        Button b5 = (Button)findViewById(R.id.button5_aa);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://alumni.iitbbs.ac.in/"));
                startActivity(intent);
            }
        });
        Button b6 = (Button)findViewById(R.id.button6_aa);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/groups/666985796764180/"));
                startActivity(intent);
            }
        });
        Button b7 = (Button)findViewById(R.id.button7_aa);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/PlacementInterviews/"));
                startActivity(intent);
            }
        });
        Button b8 = (Button)findViewById(R.id.button8_aa);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/iitbbsinternshipupdate/"));
                startActivity(intent);
            }
        });
        Button b9 = (Button)findViewById(R.id.button9_aa);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/humansofiitbbs/"));
                startActivity(intent);
            }
        });
        Button b10 = (Button)findViewById(R.id.button10_aa);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/groups/IITBhubaneswar/"));
                startActivity(intent);
            }
        });

    }
}