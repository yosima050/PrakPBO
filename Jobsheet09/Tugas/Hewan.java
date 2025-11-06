package Tugas;

public abstract class Hewan {
    private String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public abstract void bersuara();

    public String getNama() {
        return this.nama;
    }
}