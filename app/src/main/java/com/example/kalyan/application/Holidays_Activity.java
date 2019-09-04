package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class Holidays_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holidays_);
        WebView mywebview = (WebView) findViewById(R.id.webView1);
        mywebview.getSettings().setBuiltInZoomControls(true);
        mywebview.loadUrl("https://veravasi.000webhostapp.com/holidays_list.html");

    }
    public void onclick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.iitbbs.ac.in/holidays-list.php"));
        startActivity(intent);

    }
}
