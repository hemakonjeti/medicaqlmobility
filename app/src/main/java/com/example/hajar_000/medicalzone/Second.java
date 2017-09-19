package com.example.hajar_000.medicalzone;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class Second extends AppCompatActivity {
    Toolbar mToolbar;
    WebView webView;
    ImageView imageView;

    String[] PharmacyArray = {"1mg","Apollo","Ayurvedacart","Colmed","Easymedico","Homeomart","Just Rellief","Kamaayurveda",
            "Mediplusmart","Netmeds","Patanjali","SchwenIndia"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mToolbar = (Toolbar) findViewById(R.id.toolbar1);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("PharmacyName"));
            if (mToolbar.getTitle().toString().equalsIgnoreCase("1mg")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("https://www.1mg.com/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Apollo")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("https://www.apollopharmacy.in/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Ayurvedacart")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("http://ayurvedacart.in/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Colmed")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("http://www.colmed.in/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Easymedico")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("https://www.easymedico.com/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Homeomart")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("https://homeomart.net/about/buy-a-to-z-of-homeopathy-online-top-homeopathic-medicine-online-store/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Just Relief")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("http://www.justrelief.com/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Kamaayurveda")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("https://www.kamaayurveda.com/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Medipluscart")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("http://www.kiet.edu/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Netmeds")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("http://www.netmeds.com/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Patanjali")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("https://www.patanjaliayurved.net/");

            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("SchwenIndia")) {
                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_grid_adapter, PharmacyArray);
                webView=(WebView)findViewById(R.id.webView);
                webView.loadUrl("http://www.schwabeindia.com");

            }
        }
    }


}

