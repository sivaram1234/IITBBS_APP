package com.example.kalyan.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton reload = findViewById(R.id.reload);
        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final WebView webview = findViewById(R.id.webView_mainpage);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.setWebViewClient(new WebViewClient());
                webview.loadUrl("https://verasi.000webhostapp.com/");
                webview.setWebViewClient(new WebViewClient(){
                    public void onReceivedError(WebView view,int errorCode,String description ,String failingUrl){
                        webview.loadUrl("file:///android_asset/error.html");
                    }
                });
                Snackbar.make(view, "Refreshing page", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.iitbbs.ac.in/"));
                startActivity(intent);
                Snackbar.make(view, "Opening IIT BBS official website", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton erp = findViewById(R.id.erp);
        erp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://erp.iitbbs.ac.in/"));
                startActivity(intent);
                Snackbar.make(view, "Opening ERP IIT BBS", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        final WebView webview = findViewById(R.id.webView_mainpage);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://verasi.000webhostapp.com/");
        webview.setWebViewClient(new WebViewClient(){
            public void onReceivedError(WebView view,int errorCode,String description ,String failiongUrl){
                webview.loadUrl("file:///android_asset/error.html");
            }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent intent=new Intent(getApplicationContext(),about_Activity.class);
            startActivity(intent);

            return true;
        }
        else if (id == R.id.action_contact_us) {
            Intent intent=new Intent(getApplicationContext(),Contact_us_Activity.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void logoClick(View view){
        Toast.makeText(this, "Opening IIT BBS official website", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.iitbbs.ac.in/"));
        startActivity(intent);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_timetable) {
            Intent intent=new Intent(getApplicationContext(),Time_Table_Activity.class);
            startActivity(intent);
        } else if (id == R.id.nav_academic_calender) {
            Intent intent=new Intent(getApplicationContext(),AcademicCalender_Activity.class);
            startActivity(intent);


        } else if (id == R.id.nav_holidays_list) {
            Intent intent=new Intent(getApplicationContext(),Holidays_Activity.class);
            startActivity(intent);

        } else if (id == R.id.nav_curriculum) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.iitbbs.ac.in/academic-programms.php"));
            startActivity(intent);
        } else if (id == R.id.nav_ERP) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://erp.iitbbs.ac.in/"));
            startActivity(intent);
        } else if (id == R.id.nav_central_library) {
            Toast.makeText(this, "Opening Central Library IIT BBS page", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://library.iitbbs.ac.in/"));
            startActivity(intent);
        }else if (id == R.id.nav_bus_schedule) {
            Intent intent1=new Intent(getApplicationContext(),Bus_Schedule_Activity.class);
            startActivity(intent1);
        } else if (id == R.id.nav_bov) {
            Intent intent1=new Intent(getApplicationContext(),bovActivity.class);
            startActivity(intent1);
        } else if (id == R.id.nav_ambulance) {
            Intent intent1=new Intent(getApplicationContext(),AmbulanceActivity.class);
            startActivity(intent1);
        } else if (id == R.id.nav_auto_service){
            Intent intent=new Intent(getApplicationContext(),Auto_Service.class);
            startActivity(intent);
        }else if (id == R.id.nav_map){
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.co.in/maps/@20.148310,85.671175,3000m/data=!3m1!1e3"));
            startActivity(intent);
        }else if (id == R.id.nav_contacts){
            Intent intent=new Intent(getApplicationContext(),contactsActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_useful_websites_and_pages){
            Intent intent=new Intent(getApplicationContext(),otherActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_mess_menu) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://drive.google.com/drive/folders/1xgRdv4wzRA-0u7mtHtlPAhxectf5NYzu?usp=sharing"));
            startActivity(intent);
        }else if (id == R.id.lostAndFound) {
            Intent intent1=new Intent(getApplicationContext(),lostfound_Activity.class);
            startActivity(intent1);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}