package Tugas;

public class Bebek extends Burung implements IBisaTerbang, IBisaBerenang {

    public Bebek(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara... Kwek! Kwek!");
    }

    @Override
    public void terbang() {
        System.out.println(getNama() + " terbang rendah di atas air.");
    }

    @Override
    public void berenang() {
        System.out.println(getNama() + " sedang asik berenang di danau.");
    }
}