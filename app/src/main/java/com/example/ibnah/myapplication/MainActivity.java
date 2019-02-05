package com.example.ibnah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity  extends AppCompatActivity {

    EditText nama, npm, kelas, nilaiharian, nilaiuts, nilaiuas;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama= (EditText) findViewById(R.id.enama);
        npm= (EditText) findViewById(R.id.enpm);
        kelas= (EditText) findViewById(R.id.ekelas);
        nilaiharian= (EditText) findViewById(R.id.eharian);
        nilaiuts=(EditText) findViewById(R.id.euts);
        nilaiuas=(EditText)findViewById(R.id.euas);
    }

    public void btnhitung(View view) {
        if (nama.getText().toString().trim().equalsIgnoreCase("")) {
            nama.setError("This field can not be blank");
        }else if (npm.getText().toString().trim().equalsIgnoreCase("")){
            npm.setError("This field can not be blank");
        }else if (kelas.getText().toString().trim().equalsIgnoreCase("")){
            kelas.setError("This field can not be blank");
        }else if (nilaiharian.getText().toString().trim().equalsIgnoreCase("")) {
            nilaiharian.setError("This field can not be blank");
        }else if (nilaiuts.getText().toString().trim().equalsIgnoreCase("")){
            nilaiuts.setError("This field can not be blank");
        }else if (nilaiuas.getText().toString().trim().equalsIgnoreCase("")) {
            nilaiuas.setError("This field can not be blank");
        }else {
            Intent i = new Intent(this, HitungActivity.class);
            i.putExtra("data1", nama.getText().toString());
            i.putExtra("data1", npm.getText().toString());
            i.putExtra("data2", kelas.getText().toString());
            i.putExtra("data3", nilaiharian.getText().toString());
            i.putExtra("data4", nilaiuts.getText().toString());
            i.putExtra("data5", nilaiuas.getText().toString());

            startActivity(i);
        }
    }
}