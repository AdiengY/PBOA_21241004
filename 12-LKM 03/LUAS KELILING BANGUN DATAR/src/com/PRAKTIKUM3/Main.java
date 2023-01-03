package com.PRAKTIKUM3;


public class Main {
    public static void main(String[] args) throws Exception {
        
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // membuat objek persegi dan mengisi nilai atribut
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        // membuat objek Lingkaran dan mengisi nilai atribut
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        // membuat objek Persegi Panjang dan mengisi nilai atribut
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        // membuat objek Segitiga dan mengisi nilai atribut
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
                
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
