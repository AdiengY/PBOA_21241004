package com.PRAKTIKUM3;

class Identitas {
    private String universitas = "Universitas Pendidikan Mandalika";
    private String jurusan = "Pendidikan Teknologi Informasi";
    private String name;
    private String nim;

// Konstruktor
public Identitas(String nama, String nim){
    this.name = nama;
    this.nim = nim;
}

// Method
public void info() {
    System.out.println("Perguruan Tinggi : "+universitas);
    System.out.println("Jurusan : "+jurusan);
    System.out.println("Nama : "+name);
    System.out.println("Nim : "+nim);
}
}
// Klass extends
class Keterangan extends Identitas {
    protected String angkatan;
    protected String alamat;

    // Konstruktor
    public Keterangan(String nama, String nim, String angkatan, String alamat){
        super(nama, nim);
        this.angkatan = angkatan;
        this.alamat = alamat;
    }

    // Method
    public void info(){
        super.info();
        System.out.println("Angkatan : "+angkatan);
        System.out.println("Alamat : "+alamat);
    }
}
// Main Class
class ConstruktorSuperKlass {
    public static void main(String[] args) throws Exception {
        Keterangan mahasiswa = new Keterangan("Alfatih", "24051453", "Tahun 1453", "Istanbul/Konstatinopel");
        mahasiswa.info();
    }
}
