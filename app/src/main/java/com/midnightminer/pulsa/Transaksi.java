package com.midnightminer.pulsa;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class Transaksi extends AppCompatActivity{
    Spinner provider,jumlah,bayar;
    EditText telp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Transaksi Sudah Terkirim", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                finish();
            }
        });

        provider = (Spinner) findViewById(R.id.provider);
        jumlah   = (Spinner) findViewById(R.id.jumlah);
        bayar    = (Spinner) findViewById(R.id.bayar);
        telp     = (EditText) findViewById(R.id.notelp);

        String[] items1 = new String[]{
                "Telkomsel",
                "Indosat",
                "XL",
                "Smartfren",
                "Indosat",
                "Three"};
        ArrayAdapter<String> provider_a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        provider.setAdapter(provider_a);

        String[] items2 = new String[]{
                "5000",
                "10000",
                "15000",
                "20000",
                "25000",
                "50000",
                "100000"};
        ArrayAdapter<String> jumlah_a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        jumlah.setAdapter(jumlah_a);

        String[] items3 = new String[]{
                "Lunas",
                "Hutang"};
        ArrayAdapter<String> bayar_a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        bayar.setAdapter(bayar_a);
    }

}
