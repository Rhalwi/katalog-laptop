package com.rizkaha.katalogproject;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rizkaha.katalogproject.type.laptop;

import java.util.List;

public class GaleryActivity extends AppCompatActivity {

    List<laptop> laptops;
    int indeksTampil = 0;
    String jenisLaptop;
    Button btnPertama, btnTerakhir,btnSebelum,btnBerikut;
    TextView txJenis, txTipe, txHarga, txDeskripsi, txJudul;
    ImageView ivFotoLaptop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        Intent intent = getIntent();
        jenisLaptop= intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        laptops = DataProvider.getLaptopsByTipe(this,jenisLaptop);
        inisialisasiView();
        tampilkanProfile();
    }
    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelum = findViewById(R.id.btnSebelumnya);
        btnBerikut = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> hewanPertama());
        btnTerakhir.setOnClickListener(view -> hewanTerakhir());
        btnSebelum.setOnClickListener(view -> hewanSebelumnya());
        btnBerikut.setOnClickListener(view -> hewanBerikutnya());

        txJenis = findViewById(R.id.txJenis);
        txHarga = findViewById(R.id.txHarga);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoLaptop = findViewById(R.id.gambarLaptop);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai jenis "+jenisLaptop);
    }


    private void tampilkanProfile() {
       laptop k = laptops.get(indeksTampil);
        Log.d("ACER","Menampilkan acer "+k.getJenis());
        txJenis.setText(k.getJenis());
        txHarga.setText(k.getHarga());
        txDeskripsi.setText(k.getDeskripsi());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ivFotoLaptop.setImageDrawable(this.getDrawable(k.getDrawableRes()));
        }
    }

    private void hewanPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfile();
        }
    }

    private void hewanTerakhir() {
        int posAkhir = laptops.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfile();
        }
    }

    private void hewanBerikutnya() {
        if (indeksTampil == laptops.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfile();
        }
    }

    private void hewanSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfile();
        }
    }
}