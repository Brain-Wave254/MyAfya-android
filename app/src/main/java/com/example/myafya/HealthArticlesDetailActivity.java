package com.example.myafya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HealthArticlesDetailActivity extends AppCompatActivity {

    ImageView bacHealth2,img;
    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_articles_detail);

        bacHealth2 = findViewById(R.id.imageViewBackHealthDet);
        img = findViewById(R.id.imageViewHAD);
        tv2 = findViewById(R.id.textViewHADTitle);

        Intent intent =getIntent();
        tv2.setText(intent.getStringExtra("text1"));

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            int resId = bundle.getInt("text2");
            img.setImageResource(resId);
        }

        bacHealth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HealthArticlesDetailActivity.this,HealthArticlesActivity.class));
            }
        });
    }
}