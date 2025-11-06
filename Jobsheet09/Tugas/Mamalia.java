package Tugas;

public class Mamalia extends Hewan {

    public Mamalia(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara... (Suara Mamalia)");
    }
}