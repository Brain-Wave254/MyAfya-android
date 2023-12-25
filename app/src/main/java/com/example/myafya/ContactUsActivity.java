package com.example.myafya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ContactUsActivity extends AppCompatActivity {

    ImageView bacContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        bacContact = findViewById(R.id.imageViewBackContact);

        bacContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContactUsActivity.this,MainActivity.class));
            }
        });
    }
}