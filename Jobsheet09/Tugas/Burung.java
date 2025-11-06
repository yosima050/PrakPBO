package Tugas;

public class Burung extends Hewan {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara... Cuit! Cuit!");
    }
}