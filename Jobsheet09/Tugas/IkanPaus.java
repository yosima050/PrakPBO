package Tugas;

public class IkanPaus extends Mamalia implements IBisaBerenang {

    public IkanPaus(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara... ");
    }

    @Override
    public void berenang() {
        System.out.println(getNama() + " sedang berenang di lautan luas.");
    }
}