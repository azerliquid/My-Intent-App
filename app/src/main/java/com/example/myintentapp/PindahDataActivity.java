package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PindahDataActivity extends AppCompatActivity {
    public static final String EXTRA_NAMA="extra_nama";
    public static final String EXTRA_ALAMAT="extra_alamat";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_data);

        TextView txtNama=findViewById(R.id.txt_Nama);
        TextView txtAlamat=findViewById(R.id.txt_Alamat);

        String nama=getIntent().getStringExtra(EXTRA_NAMA);
        String alamat=getIntent().getStringExtra(EXTRA_ALAMAT);

        txtNama.setText("Namanya ==>"+nama);
        txtAlamat.setText("Alamatnya ==>"+alamat);

    }
}
