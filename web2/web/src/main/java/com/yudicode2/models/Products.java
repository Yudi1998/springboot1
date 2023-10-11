package com.yudicode2.models;

public class Products {
    private int id;
    private String namaproduct;
    private int harga;
    private int stok;

    
    public Products(int id, String namaproduct, int harga, int stok) {
        this.id = id;
        this.namaproduct = namaproduct;
        this.harga = harga;
        this.stok = stok;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNamaproduct() {
        return namaproduct;
    }
    public void setNamaproduct(String namaproduct) {
        this.namaproduct = namaproduct;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    
    


}
