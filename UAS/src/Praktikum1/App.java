package Praktikum1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Lingkaran Lingkaran = new Lingkaran();
        double jari = input.nextDouble();
        System.out.println("Program Sederhana Lingkaran");
        System.out.println("Masukan Panjang jari-jari");
        Lingkaran.LuasLingkaran(jari);
        Lingkaran.KelilingLingkaran(jari);
        System.out.println("Diameter Lingkaran = "+Lingkaran.DiameterLingkaran());
    }
}
