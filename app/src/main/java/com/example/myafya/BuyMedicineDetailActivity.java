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

public class BuyMedicineDetailActivity extends AppCompatActivity {

    ImageView btnBMD;
    TextView tvPackageName,tvTotalCost;
    EditText edDetails;
    Button btnAddToCartB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicine_detail);

        btnBMD = findViewById(R.id.imageViewBackBMD);
        tvPackageName = findViewById(R.id.textViewBMDPackageName);
        tvTotalCost = findViewById(R.id.textViewBMDTotalCost);
        edDetails = findViewById(R.id.editTextBMDTextMultiline);
        btnAddToCartB = findViewById(R.id.buttonBMDCart);

        edDetails.setKeyListener(null);

        Intent intent =getIntent();
        tvPackageName.setText(intent.getStringExtra("text1"));
        edDetails.setText(intent.getStringExtra("text2"));
        tvTotalCost.setText("Total Cost : "+intent.getStringExtra("text3")+"/=");

        btnBMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuyMedicineDetailActivity.this,BuyMedicineActivity.class));
            }
        });
        btnAddToCartB.setOnClickListener(new View.OnClickListener() {
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
                    db.addCart(username,product,price,"medicine");
                    Toast.makeText(getApplicationContext(), "Record Inserted Successfully!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(BuyMedicineDetailActivity.this,BuyMedicineActivity.class));
                }
            }
        });
    }
}