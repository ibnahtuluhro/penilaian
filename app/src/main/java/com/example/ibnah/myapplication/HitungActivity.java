package com.example.ibnah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HitungActivity extends AppCompatActivity {

    String uts, uas, nilaiharian, nilaihuruf;
    double total, nUts, nUas, nNilaiharian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);
        TextView tvData1= (TextView) findViewById(R.id.tv_nama);
        TextView tvData2= (TextView) findViewById(R.id.tv_npm);
        TextView tvData3= (TextView) findViewById(R.id.tv_kelas);
        TextView tvData4= (TextView) findViewById(R.id.tv_nilairata2);
        TextView tvData5= (TextView) findViewById(R.id.tv_nilaihuruf);

        tvData1.setText("Nama " + getIntent().getStringExtra("data1"));
        tvData2.setText("NPM " +getIntent().getStringExtra("data2"));
        tvData3.setText("Kelas " + getIntent().getStringExtra("data3"));
        tvData4.setText("Nilai Rata-rata "+ getIntent().getStringExtra("data4"));
        tvData5.setText("Mendapatkan Nilai "+ getIntent().getStringExtra("data5"));

        nilaiharian = getIntent().getStringExtra( "nilaiharian");
        uts = getIntent().getStringExtra("uts");
        uas = getIntent().getStringExtra( "uas");

        nUts = Double.valueOf(uts);
        nUas = Double.valueOf(uas);
        nNilaiharian = Double.valueOf(nilaiharian);

        total = ((nUts*50/100) + (nUas*30/100) + (nNilaiharian*20/100));
        tvData4.setText(String.valueOf(total));

        if (total > 80 ) {
            tvData5.setText("grade anda A");
        }else if (total >70 && total <= 80) {
            tvData5.setText("grade anda B");
        }else if (total >60 && total <= 70) {
            tvData5.setText("grade anda C");
        }else if (total >50 && total <= 60){
            tvData5.setText("grade anda D");
        }
    }

    public void btnclear(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}