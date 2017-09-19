package com.example.hajar_000.medicalzone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class Grid extends AppCompatActivity {
    Button b;
    private GridAdapter mAdapter;
    private ArrayList<String> listPharmacy;
    private ArrayList<Integer> listIcon;
    private Button signOut;

    private GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        prepareList();

        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridAdapter(this,listPharmacy, listIcon);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter((GridAdapter) mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                // Toast.makeText(Welcome.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                Intent sc=new Intent(Grid.this,Second.class);
                sc.putExtra("PharmacyName",gridView.getItemAtPosition(position).toString());
                startActivity(sc);

            }
        });

    }

    public void prepareList()
    {
        listPharmacy = new ArrayList<String>();

        listPharmacy.add("1mg");
        listPharmacy.add("Apollo");
        listPharmacy.add("Ayurvedacart");
        listPharmacy.add("Colmed");
        listPharmacy.add("Easymedico");
        listPharmacy.add("Homeomart");
        listPharmacy.add("Just Relief");
        listPharmacy.add("Kamaayurveda");
        listPharmacy.add("Mediplusmart");
        listPharmacy.add("Netmeds");
        listPharmacy.add("Patanjali");
        listPharmacy.add("SchwenIndia");


        listIcon = new ArrayList<Integer>();
        listIcon.add(R.drawable.mg);
        listIcon.add(R.drawable.appolo);
        listIcon.add(R.drawable.ayurvedacart);
        listIcon.add(R.drawable.colmed);
        listIcon.add(R.drawable.easymedico);
        listIcon.add(R.drawable.homeomart);
        listIcon.add(R.drawable.jr);
        listIcon.add(R.drawable.kamaayurveda);
        listIcon.add(R.drawable.mediplusmart);
        listIcon.add(R.drawable.netmeds);
        listIcon.add(R.drawable.patanjali);
        listIcon.add(R.drawable.schwenindia);


    }


}
