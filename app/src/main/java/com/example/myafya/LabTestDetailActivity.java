package com.example.myafya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LabTestDetailActivity extends AppCompatActivity {

    ImageView btn1;
    TextView tvPackageName,tvTotalCost;
    EditText edDetails;
    Button btnAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test_detail);

        btn1 = findViewById(R.id.imageViewBackNowNow);
        tvPackageName = findViewById(R.id.textViewLDPackageName);
        tvTotalCost = findViewById(R.id.textViewLDTotalCost);
        edDetails = findViewById(R.id.editTextLDTextMultiline);
        btnAddToCart = findViewById(R.id.buttonLTDCart);

        edDetails.setKeyListener(null);

        Intent intent =getIntent();
        tvPackageName.setText(intent.getStringExtra("text1"));
        edDetails.setText(intent.getStringExtra("text2"));
        tvTotalCost.setText("Total Cost : "+intent.getStringExtra("text3")+"/=");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LabTestDetailActivity.this,LabTestActivity.class));
            }
        });
        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
                String username = sharedPreferences.getString("username","").toString();
                String product = tvPackageName.getText().toString();
                float price = Float.parseFloat(intent.getStringExtra("text3").toString());

                Database db = new Database(getApplicationContext(),"healthcare",null,1);

                if (db.checkCart(username,product)==1){
                    Toast.makeText(getApplicationContext(), "Product Already Inserted!", Toast.LENGTH_SHORT).show();
                }else {
                    db.addCart(username,product,price,"lab");
                    Toast.makeText(getApplicationContext(), "Record Inserted Successfully!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LabTestDetailActivity.this,LabTestActivity.class));
                }

            }
        });
    }
}