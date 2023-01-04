package Praktikum1;
public class Lingkaran {
    double r;
    double keliling;
    double phi = 3.14;
    
    public void LuasLingkaran(double r)
    {
      this.r = r;
      double luas = 0.5 * phi * r * r;
        System.out.println("-- Luas Lingkaran adalah = " + luas);
    }
    
    public void KelilingLingkaran(double r)
    {
        this.r = r;
       this.keliling = 2 * phi * r;
        System.out.println("-- Keliling Lingkaran adalah = " + this.keliling);
    }
    
    public double DiameterLingkaran(){
        double diameter = this.keliling / this.phi;
        return diameter;
    }
}
