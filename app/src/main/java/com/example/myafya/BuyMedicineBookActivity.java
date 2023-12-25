package com.example.myafya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class BuyMedicineBookActivity extends AppCompatActivity {

    ImageView imgBook;
    EditText edname,edaddress,edpincode,edcontact;
    ImageButton btnLBook2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicine_book);

        imgBook = findViewById(R.id.imageViewBackBMBook);
        edname = findViewById(R.id.editTextBMBookFullName);
        edaddress = findViewById(R.id.editTextBMBookAddress);
        edpincode = findViewById(R.id.editTextBMBookPin);
        edcontact= findViewById(R.id.editTextBMBookNumber);
        btnLBook2 = findViewById(R.id.submitBMBookButton);

        Intent intent =getIntent();
        String[] price = intent.getStringExtra("price").toString().split(java.util.regex.Pattern.quote(":"));
        String date = intent.getStringExtra("date");

        btnLBook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
                String username = sharedPreferences.getString("username","").toString();

                Database db = new Database(getApplicationContext(),"healthcare",null,1);
                db.addOrder(username,edname.getText().toString(),edaddress.getText().toString(),edcontact.getText().toString(),Integer.parseInt(edpincode.getText().toString()),date.toString(),"",Float.parseFloat(price[1].toString()),"medicine");
                db.removeCart(username,"medicine");
                Toast.makeText(getApplicationContext(), "Booking Done Successfully!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(BuyMedicineBookActivity.this,MainActivity.class));
            }
        });

        imgBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuyMedicineBookActivity.this,BuyMedicineCartActivity.class));
            }
        });
    }
}