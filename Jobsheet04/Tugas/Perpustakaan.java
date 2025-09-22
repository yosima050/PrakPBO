package Jobsheet04.Tugas;
import java.util.ArrayList;

public class Perpustakaan {
    private String namaPerpustakaan;
    private ArrayList<Buku> koleksiBuku;
    private ArrayList<Anggota> daftarAnggota;

    public Perpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.koleksiBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public String getInfo() {
        return "Perpustakaan: " + namaPerpustakaan +
               ", Jumlah Buku: " + koleksiBuku.size() +
               ", Jumlah Anggota: " + daftarAnggota.size();
    }
}