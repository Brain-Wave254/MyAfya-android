package com.example.myafya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DoctorDetailActivity extends AppCompatActivity {
        private String[][] doctor_details1 = {
                {"Doctor Name: John David", "Hospital Address: Thika_lv4", "Exp: 4 yrs", "Tel no. 0187543901", "600"},
                {"Doctor Name: Wambui Stacy", "Hospital Address: Kiambu_lv4", "Exp: 8 yrs", "Tel no. 0187543901", "900"},
                {"Doctor Name: Koech Bruce", "Hospital Address: Nairobi_h", "Exp: 10 yrs", "Tel no. 0187543901", "1200"},
                {"Doctor Name: Wayne Mwaura", "Hospital Address: Kenyatta_n", "Exp: 2 yrs", "Tel no. 0187543901", "300"},
                {"Doctor Name: Faith Aketch", "Hospital Address: Aga_khan", "Exp: 7 yrs", "Tel no. 0187543901", "700"}
        };

        private String[][] doctor_details2 = {
                {"Doctor Name: Emily Johnson", "Hospital Address: Eldoret_City", "Exp: 6 yrs", "Tel no. 0187543901", "800"},
                {"Doctor Name: Samuel Okoth", "Hospital Address: Kakamega_h", "Exp: 5 yrs", "Tel no. 0187543901", "550"},
                {"Doctor Name: Catherine Kimani", "Hospital Address: Kisumu_Memorial", "Exp: 9 yrs", "Tel no. 0187543901", "950"},
                {"Doctor Name: Andrew Omondi", "Hospital Address: Machakos_Clinic", "Exp: 3 yrs", "Tel no. 0187543901", "450"},
                {"Doctor Name: Grace Otieno", "Hospital Address: Nakuru_General", "Exp: 12 yrs", "Tel no. 0187543901", "1500"}
        };

        private String[][] doctor_details3 = {
                {"Doctor Name: Robert Kimani", "Hospital Address: Nyeri_Medical", "Exp: 11 yrs", "Tel no. 0187543901", "1400"},
                {"Doctor Name: Brenda Kamau", "Hospital Address: Mombasa_Care", "Exp: 7 yrs", "Tel no. 0187543901", "700"},
                {"Doctor Name: Jackson Mwangi", "Hospital Address: Kisii_Health", "Exp: 4 yrs", "Tel no. 0187543901", "600"},
                {"Doctor Name: Esther Njoroge", "Hospital Address: Thika_Royal", "Exp: 8 yrs", "Tel no. 0187543901", "850"},
                {"Doctor Name: Kevin Ouma", "Hospital Address: Murang'a_Hearts", "Exp: 5 yrs", "Tel no. 0187543901", "550"}
        };

        private String[][] doctor_details4 = {
                {"Doctor Name: Susan Chepkoech", "Hospital Address: Kericho_Care", "Exp: 9 yrs", "Tel no. 0187543901", "950"},
                {"Doctor Name: Isaac Kiptoo", "Hospital Address: Bungoma_General", "Exp: 6 yrs", "Tel no. 0187543901", "800"},
                {"Doctor Name: Veronica Ochieng", "Hospital Address: Homa_Bay_Clinic", "Exp: 10 yrs", "Tel no. 0187543901", "1100"},
                {"Doctor Name: Simon Njeru", "Hospital Address: Nairobi_Children", "Exp: 2 yrs", "Tel no. 0187543901", "300"},
                {"Doctor Name: Mercy Wanjiku", "Hospital Address: Ruiru_Maternity", "Exp: 7 yrs", "Tel no. 0187543901", "700"}
        };

        private String[][] doctor_details5 = {
                {"Doctor Name: Charles Omondi", "Hospital Address: Kisumu_Cardiac", "Exp: 8 yrs", "Tel no. 0187543901", "850"},
                {"Doctor Name: Sarah Mutheu", "Hospital Address: Naivasha_City", "Exp: 4 yrs", "Tel no. 0187543901", "600"},
                {"Doctor Name: Josephine Ouma", "Hospital Address: Embu_Surgical", "Exp: 7 yrs", "Tel no. 0187543901", "700"},
                {"Doctor Name: Michael Kimani", "Hospital Address: Nanyuki_Memorial", "Exp: 5 yrs", "Tel no. 0187543901", "550"},
                {"Doctor Name: Brenda Atieno", "Hospital Address: Kerugoya_Care", "Exp: 9 yrs", "Tel no. 0187543901", "950"}
        };

        private String[][] doctor_details6 = {
                {"Doctor Name: Patrick Wanjohi", "Hospital Address: Kitui_Hearts", "Exp: 3 yrs", "Tel no. 0187543901", "450"},
                {"Doctor Name: Agnes Muthoni", "Hospital Address: Nyeri_Surgical", "Exp: 11 yrs", "Tel no. 0187543901", "1400"},
                {"Doctor Name: Philip Kibet", "Hospital Address: Kericho_Children", "Exp: 6 yrs", "Tel no. 0187543901", "800"},
                {"Doctor Name: Cynthia Oduor", "Hospital Address: Thika_Maternity", "Exp: 8 yrs", "Tel no. 0187543901", "900"},
                {"Doctor Name: Dennis Kamande", "Hospital Address: Kiambu_Ortho", "Exp: 7 yrs", "Tel no. 0187543901", "700"}
        };

        private String[][] doctor_details7 = {
                {"Doctor Name: Beatrice Musyoka", "Hospital Address: Nairobi_Medical", "Exp: 2 yrs", "Tel no. 0187543901", "300"},
                {"Doctor Name: Felix Ochieng", "Hospital Address: Kakamega_Hearts", "Exp: 5 yrs", "Tel no. 0187543901", "550"},
                {"Doctor Name: Lilian Wairimu", "Hospital Address: Kisumu_Care", "Exp: 10 yrs", "Tel no. 0187543901", "1100"},
                {"Doctor Name: Martin Kiarie", "Hospital Address: Mombasa_Cardiac", "Exp: 7 yrs", "Tel no. 0187543901", "700"},
                {"Doctor Name: Christine Ong'ondo", "Hospital Address: Eldoret_Children", "Exp: 9 yrs", "Tel no. 0187543901", "950"}
        };

        private String[][] doctor_details8 = {
                {"Doctor Name: Humphrey Kiprono", "Hospital Address: Nakuru_Clinic", "Exp: 4 yrs", "Tel no. 0187543901", "600"},
                {"Doctor Name: Lydia Akinyi", "Hospital Address: Thika_General", "Exp: 8 yrs", "Tel no. 0187543901", "900"},
                {"Doctor Name: Victor Mwangi", "Hospital Address: Kiambu_Cardiac", "Exp: 10 yrs", "Tel no. 0187543901", "1200"},
                {"Doctor Name: Beatrice Akoth", "Hospital Address: Nairobi_Surgical", "Exp: 2 yrs", "Tel no. 0187543901", "300"},
                {"Doctor Name: Derrick Odhiambo", "Hospital Address: Kenyatta_Maternity", "Exp: 7 yrs", "Tel no. 0187543901", "700"}
        };

        private String[][] doctor_details9 = {
                {"Doctor Name: Emily Johnson", "Hospital Address: Eldoret_City", "Exp: 6 yrs", "Tel no. 0187543901", "800"},
                {"Doctor Name: Samuel Okoth", "Hospital Address: Kakamega_h", "Exp: 5 yrs", "Tel no. 0187543901", "550"},
                {"Doctor Name: Catherine Kimani", "Hospital Address: Kisumu_Memorial", "Exp: 9 yrs", "Tel no. 0187543901", "950"},
                {"Doctor Name: Andrew Omondi", "Hospital Address: Machakos_Clinic", "Exp: 3 yrs", "Tel no. 0187543901", "450"},
                {"Doctor Name: Grace Otieno", "Hospital Address: Nakuru_General", "Exp: 12 yrs", "Tel no. 0187543901", "1500"}
        };

        private String[][] doctor_details10 = {
                {"Doctor Name: Stephen Ouma", "Hospital Address: Nairobi_Surgical", "Exp: 2 yrs", "Tel no. 0187543901", "300"},
                {"Doctor Name: Esther Njeri", "Hospital Address: Thika_Maternity", "Exp: 8 yrs", "Tel no. 0187543901", "900"},
                {"Doctor Name: Kevin Omondi", "Hospital Address: Mombasa_Cardiac", "Exp: 6 yrs", "Tel no. 0187543901", "800"},
                {"Doctor Name: Mary Wangari", "Hospital Address: Kiambu_Clinic", "Exp: 10 yrs", "Tel no. 0187543901", "1200"},
                {"Doctor Name: Brian Kamau", "Hospital Address: Kisumu_Ortho", "Exp: 7 yrs", "Tel no. 0187543901", "700"}
        };

    TextView dv;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);

        dv = findViewById(R.id.textViewDDTitle);
        Intent it = getIntent();
        String title = it.getStringExtra("title");
        dv.setText(title);

        if(title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Optician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details4;
        else
        if(title.compareTo("Radiologist")==0)
            doctor_details = doctor_details5;
        else
        if(title.compareTo("Psychiatrist")==0)
            doctor_details = doctor_details6;
        else
        if(title.compareTo("Gastroenterologist")==0)
            doctor_details = doctor_details7;
        else
        if(title.compareTo("Pediatrician")==0)
            doctor_details = doctor_details8;
        else
        if(title.compareTo("Obstetrician")==0)
            doctor_details = doctor_details9;
        else
            doctor_details = doctor_details10;

        ImageView bag = findViewById(R.id.imageViewBackAgain);
        bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailActivity.this,FindDoctorActivity.class));
            }
        });

        list = new ArrayList();
        for (int i=0;i<doctor_details.length;i++){
            item = new HashMap<String,String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Cons Fees: "+doctor_details[i][4]+"/=");
            list.add(item);
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
                );
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(DoctorDetailActivity.this,BookAppointmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][3]);
                it.putExtra("text5",doctor_details[i][4]);
                startActivity(it);
            }
        });
    }
}