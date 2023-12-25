package com.example.myafya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedpreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedpreferences.getString("username","").toString();
        Toast.makeText(getApplicationContext(), "Welcome "+username, Toast.LENGTH_SHORT).show();

        log = findViewById(R.id.imageViewLogout);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
            }
        });
        CardView doc = findViewById(R.id.cardFindDoctor);
        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FindDoctorActivity.class));
            }
        });
        CardView cart = findViewById(R.id.cardCartItems);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CartActivity.class));
            }
        });
        CardView lab = findViewById(R.id.cardLabTest);
        lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LabTestActivity.class));
            }
        });
        CardView orderDetail = findViewById(R.id.cardOrderDetails);
        orderDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,OrderDetailActivity.class));
            }
        });
        CardView buyMeds = findViewById(R.id.cardBuyProducts);
        buyMeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,BuyMedicineActivity.class));
            }
        });
        CardView buyMDItems = findViewById(R.id.cardBMCart);
        buyMDItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,BuyMedicineCartActivity.class));
            }
        });
        CardView health = findViewById(R.id.cardHealthArticles);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,HealthArticlesActivity.class));
            }
        });
        CardView contact = findViewById(R.id.cardContactUs);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ContactUsActivity.class));
            }
        });
    }
}