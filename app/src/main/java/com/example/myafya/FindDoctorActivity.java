package com.example.myafya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        ImageView bak = findViewById(R.id.imageViewBack);
        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindDoctorActivity.this,MainActivity.class));
            }
        });
        CardView family = findViewById(R.id.cardFDFamilyPhysician);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Family Physicians");
                startActivity(it);
            }
        });
        CardView optician = findViewById(R.id.cardFDOptician);
        optician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Optician");
                startActivity(it);
            }
        });
        CardView surgeon = findViewById(R.id.cardFDSurgeon);
        surgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Surgeon");
                startActivity(it);
            }
        });
        CardView dentist = findViewById(R.id.cardFDDentist);
        optician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Dentist");
                startActivity(it);
            }
        });
        CardView radiologist = findViewById(R.id.cardFDRadiologist);
        radiologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Radiologist");
                startActivity(it);
            }
        });
        CardView psy = findViewById(R.id.cardFDPsychiatrist);
        psy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Psychiatrist");
                startActivity(it);
            }
        });
        CardView gae = findViewById(R.id.cardFDGastroenterologist);
        gae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Gastroenterologist");
                startActivity(it);
            }
        });
        CardView ped = findViewById(R.id.cardFDPediatrician);
        ped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Pediatrician");
                startActivity(it);
            }
        });
        CardView obs = findViewById(R.id.cardFDObstetrician);
        obs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Obstetrician");
                startActivity(it);
            }
        });
        CardView end = findViewById(R.id.cardFDEndocrinologist);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Endocrinologist");
                startActivity(it);
            }
        });
    }
}