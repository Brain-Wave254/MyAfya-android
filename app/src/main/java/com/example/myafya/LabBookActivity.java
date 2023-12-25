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

public class LabBookActivity extends AppCompatActivity {

    ImageView but1;
    EditText edname,edaddress,edpincode,edcontact;
    ImageButton btnLBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_book);

        but1 = findViewById(R.id.imageViewBack4);
        edname = findViewById(R.id.editTextLBookFullName);
        edaddress = findViewById(R.id.editTextLBookAddress);
        edpincode = findViewById(R.id.editTextLBookPin);
        edcontact= findViewById(R.id.editTextLBookNumber);
        btnLBook = findViewById(R.id.submitLBookButton);

        Intent intent =getIntent();
        String[] price = intent.getStringExtra("price").toString().split(java.util.regex.Pattern.quote(":"));
        String date = intent.getStringExtra("date");
        String time = intent.getStringExtra("time");

        btnLBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
                String username = sharedPreferences.getString("username","").toString();

                Database db = new Database(getApplicationContext(),"healthcare",null,1);
                db.addOrder(username,edname.getText().toString(),edaddress.getText().toString(),edcontact.getText().toString(),Integer.parseInt(edpincode.getText().toString()),date.toString(),time.toString(),Float.parseFloat(price[1].toString()),"lab");
                db.removeCart(username,"lab");
                Toast.makeText(getApplicationContext(), "Booking Done Successfully!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LabBookActivity.this,MainActivity.class));
            }
        });

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LabBookActivity.this,CartActivity.class));
            }
        });
    }
}