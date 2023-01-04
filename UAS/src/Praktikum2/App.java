package Praktikum2;

class Pegawai {
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajipokok;
    private double gajibersih;

    Pegawai (String Inputnama, String Inputjabatan, double d){
        nama = Inputnama;
        jabatan = Inputjabatan;
        pajak = d;
     
    }

public double getgajibersih(){
    return this.gajibersih;
}
public void setgajipokok(double gajipokok){
    this.gajibersih = gajipokok - (gajipokok*pajak);
}

void display(){
    System.out.println("Nama Pegawai : "+this.nama);
    System.out.println("Jabatan : "+this.jabatan);
    System.out.println("Gaji Bersih : "+this.gajibersih);
}

}



public class App {
    public static void main(String[] args) throws Exception {
        Pegawai pegawai = new Pegawai("Adam", "Dierektur", 9000000.0);
        pegawai.display();
    }
}
