package com.example.perhitunganrumus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtR, txtT;
    Button btnvlm;
    Button btnsl;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtR=findViewById(R.id.jari);
        txtT=findViewById(R.id.tinggi);
        btnvlm=findViewById(R.id.volume);
        btnsl=findViewById(R.id.selimut);
        tvhasil=findViewById(R.id.hasil);

        btnvlm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r;int t;
                float v;

                if(txtR.getText().toString().isEmpty()){
                    txtR.setError("isi kolom dahulu");
                    return;
                }
                if(txtT.getText().toString().isEmpty()){
                    txtT.setError("isi kolom dahulu");
                    return;
                }
                r=Integer.parseInt(txtR.getText().toString());
                t=Integer.parseInt(txtT.getText().toString());

                v= (float) (3.14*r*r*t);

                tvhasil.setText(String.valueOf(v));


            }
    });
        btnsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r;int t;
                float v;
                if(txtR.getText().toString().isEmpty()){
                    txtR.setError("harap diisi dahulu");
                    return;

            }
                if(txtT.getText().toString().isEmpty()) {
                    txtT.setError("harap diisi dahulu");
                    return;
                }
                r=Integer.parseInt(txtR.getText().toString());
                t=Integer.parseInt(txtT.getText().toString());

                v= (float) (2*3.14*r*t);

                tvhasil.setText(String.valueOf(v));
            }
        });
    }
}