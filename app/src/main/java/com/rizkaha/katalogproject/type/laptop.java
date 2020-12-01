package com.rizkaha.katalogproject.type;

public class laptop {
    private String jenis;
    private String tipe;
    private String harga;
    private String deskripsi;
    private int drawableRes;
    public laptop(String jenis, String tipe, String harga, String deskripsi,int drawableRes){
        this.jenis = jenis;
        this.tipe = tipe;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {
        return jenis;
    }

    public String getTipe() {
        return tipe;
    }

    public String getHarga() {
        return harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setHarga(String asal) {
        this.harga = harga;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
