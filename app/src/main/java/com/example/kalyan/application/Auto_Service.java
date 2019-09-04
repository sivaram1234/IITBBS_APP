package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Auto_Service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto__service);

        Button button =(Button)findViewById(R.id.button_as);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8658442021"));
                startActivity(intent);
            }
        });
        Button button2 =(Button)findViewById(R.id.button2_as);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9777147620"));
                startActivity(intent);
            }
        });
        Button button3 =(Button)findViewById(R.id.button3_as);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8458018462"));
                startActivity(intent);
            }
        });
        Button button4 =(Button)findViewById(R.id.button4_as);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8658553825"));
                startActivity(intent);
            }
        });
        Button button5 =(Button)findViewById(R.id.button5_as);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9178109908"));
                startActivity(intent);
            }
        });
        Button button6 =(Button)findViewById(R.id.button6_as);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7894198764"));
                startActivity(intent);
            }
        });
        Button button7 =(Button)findViewById(R.id.button7_as);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9668846543"));
                startActivity(intent);
            }
        });
        Button button8 =(Button)findViewById(R.id.button8_as);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9556604708"));
                startActivity(intent);
            }
        });
        Button button9 =(Button)findViewById(R.id.button9_as);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9556909329"));
                startActivity(intent);
            }
        });
    }
}
