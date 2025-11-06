package Tugas;

public class Merpati extends Burung implements IBisaTerbang {

    public Merpati(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara... Bekur! Bekur!");
    }

    @Override
    public void terbang() {
        System.out.println(getNama() + " sedang terbang di langit.");
    }
}