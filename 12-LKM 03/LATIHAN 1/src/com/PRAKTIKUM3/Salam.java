package com.PRAKTIKUM3;

public class Salam {
    String slm = "Assalamualaikum...";
    public void info1() {
        System.out.println(slm);
    }
}

class panggilSalam extends Salam {
    String salamku = "Salam Sejahtera Untuk Kita Semua";
    public void info2() {
        System.out.println(salamku);
    }
    
    public static void main(String[] args) throws Exception {
        panggilSalam obj = new panggilSalam();
        obj.info1();
        obj.info2();
    }
}
