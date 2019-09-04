package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AmbulanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        Button button =(Button)findViewById(R.id.button_ambulance1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7064419568"));
                startActivity(intent);
            }
        });

        Button button3 =(Button)findViewById(R.id.button_ambulance3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9337413152"));
                startActivity(intent);
            }
        });

        Button button2 =(Button)findViewById(R.id.button_ambulance2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.in/maps/place/Dispensary,+IIT+Bhubaneswar/@20.1528089,85.6590285,510m/data=!3m1!1e3!4m5!3m4!1s0x3a19ac4150645141:0xe7dfd3b55c9abd9a!8m2!3d20.1531776!4d85.65941"));
                startActivity(intent);
            }
        });
    }

    public void www_ambulance(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.iitbbs.ac.in/health-center.php"));
        startActivity(intent);
    }


}
