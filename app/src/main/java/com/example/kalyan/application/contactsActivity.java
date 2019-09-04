package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class contactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);


        Button b1 = (Button)findViewById(R.id.hostel_contact);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),hostelOfiice_Contacts.class);
                startActivity(intent);
            }
        });

        Button b3 = (Button)findViewById(R.id.auto_contact);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Auto_Service.class);
                startActivity(intent);
            }
        });
        Button b4 = (Button)findViewById(R.id.ambulance_contact);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AmbulanceActivity.class);
                startActivity(intent);
            }
        });
        Button b5 = (Button)findViewById(R.id.bov_contact);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),bovActivity.class);
                startActivity(intent);
            }
        });
        Button b6 = (Button)findViewById(R.id.warden_contact);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.iitbbs.ac.in/warden.php"));
                startActivity(intent);
            }
        });

    }
}