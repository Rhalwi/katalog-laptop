package com.rizkaha.katalogproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAcer, btnAsus;
    public static final String JENIS_GALERI_KEY = "JENIS GALERY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnAcer = findViewById(R.id.btn_buka_acer);
        btnAsus = findViewById(R.id.btn_buka_asus);

        btnAcer.setOnClickListener(view -> bukaGalery("Acer"));
        btnAsus.setOnClickListener(view -> bukaGalery("Asus"));
    }
    private void bukaGalery(String jenisLaptop){
        Log.d("MAIN","Buka Activity Galery");
        Intent intent = new Intent(this, GaleryActivity.class);
        intent.putExtra(JENIS_GALERI_KEY,jenisLaptop);
        startActivity(intent);
    }
}