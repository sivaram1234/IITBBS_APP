package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class bovActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bov);

        Button buttonPDF = (Button) findViewById(R.id.buttonForTariff);
        buttonPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(bovActivity.this, bovTariffPDF.class);
                startActivity(i);
            }
        });

        Button button1 =(Button)findViewById(R.id.button1_bov);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9022043998"));
                startActivity(intent);
            }
        });

        Button button2 =(Button)findViewById(R.id.button2_bov);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9611526651"));
                startActivity(intent);
            }
        });

        Button button3 =(Button)findViewById(R.id.button3_bov);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9853340919"));
                startActivity(intent);
            }
        });
    }

    public void onClickBOV(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.iitbbs.ac.in/transportation.php"));
        startActivity(intent);
    }
}