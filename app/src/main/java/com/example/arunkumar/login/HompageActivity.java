package com.example.arunkumar.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HompageActivity extends AppCompatActivity {

    private Button Agri_Implements_Store;
    private Button Agro_Industries;
    private Button Agro_Storage;
    private Button Bank;
    private Button Fertiliser_Depot;
    private Button Finance_Institutes;
    private Button KVK;
    private Button Market_Yard;
    private Button Pesticide_Shops;
    private Button Seeds_Centre;
    private Button Veternary_Clinics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hompage);

        Agri_Implements_Store = (Button) findViewById(R.id.btnAgrIS);
        Agro_Industries = (Button) findViewById(R.id.btnAgrInd);
        Agro_Storage = (Button) findViewById(R.id.btnAgrStorage);
        Bank = (Button) findViewById(R.id.btnBank);
        Fertiliser_Depot = (Button) findViewById(R.id.btnFertDepot);
        Finance_Institutes = (Button) findViewById(R.id.btnFinIns);
        KVK = (Button) findViewById(R.id.btnKVK);
        Market_Yard = (Button) findViewById(R.id.btnMarketYard);
        Pesticide_Shops = (Button) findViewById(R.id.btnPestShop);
        Seeds_Centre = (Button) findViewById(R.id.btnSeedCentre);
        Veternary_Clinics = (Button) findViewById(R.id.btnVetClinic);

        Agri_Implements_Store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HompageActivity.this, AgriImplementsActivity.class);
                startActivity(intent);
            }

        });
    }
}
