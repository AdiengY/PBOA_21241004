class Mahasiswa{ //default, bisa dibaca dan ditulis oleh class di luar 
    public String nama; // Public, bisa dibaca dan ditulis oleh class lain
    private double nilai; //private, hanya bisa dibaca oleh classnya saja

    Mahasiswa (String nama, double nilai){
        this.nama= nama;
        this.nilai=nilai;
    }
    void dislay (){
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Nilai\t\t: " + this.nilai);
    }

}



public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa("Ding", 8.5);

        mhs.dislay();
    }
}