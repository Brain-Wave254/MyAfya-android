package com.example.myafya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class HealthArticlesActivity extends AppCompatActivity {

    private String[][] health_details =
            {
                    {"How to Stay Healthy","","","","Click For More Details"},
                    {"Medical Times","","","","Click For More Details"},
                    {"Health and Medical","","","","Click For More Details"},
                    {"All you Need to know about Health","","","","Click For More Details"},
                    {"Women Health Issues","","","","Click For More Details"}
            };
    private int[] images = {
            R.drawable.health1,
            R.drawable.health2,
            R.drawable.health3,
            R.drawable.health4,
            R.drawable.health5
    };

    ImageView bacHealth;
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_articles);

        bacHealth = findViewById(R.id.imageViewBackHealth);
        lst = findViewById(R.id.listViewHA);

        bacHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HealthArticlesActivity.this,MainActivity.class));
            }
        });
        list = new ArrayList();
        for (int i=0;i<health_details.length;i++){
            item = new HashMap<String,String>();
            item.put("line1", health_details[i][0]);
            item.put("line2", health_details[i][1]);
            item.put("line3", health_details[i][2]);
            item.put("line4", health_details[i][3]);
            item.put("line5", health_details[i][4]);
            list.add(item);
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e});
        lst.setAdapter(sa);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(HealthArticlesActivity.this,HealthArticlesDetailActivity.class);
                it.putExtra("text1",health_details[i][0]);
                it.putExtra("text2",images[i]);
                startActivity(it);
            }
        });
    }
}