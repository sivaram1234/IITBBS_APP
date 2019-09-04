package com.example.kalyan.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class hostelOfiice_Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel_ofiice__contacts);
        final WebView mywebview = (WebView) findViewById(R.id.hostelOfficewebbview);
        mywebview.getSettings().setBuiltInZoomControls(true);
        mywebview.loadUrl("https://veravasi.000webhostapp.com/hostelOfficeContacts.html");
        mywebview.setWebViewClient(new WebViewClient(){
            public void onReceivedError(WebView view, int errorCode, String description , String failingUrl){
                mywebview.loadUrl("file:///android_asset/error.html");
            }
        });


    }

}
