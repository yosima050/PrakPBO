package Jobsheet04.Tugas;
import java.util.ArrayList;

public class Anggota {
    private String idAnggota;
    private String nama;
    private ArrayList<Buku> bukuPinjaman;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.bukuPinjaman = new ArrayList<>();
    }

    public void pinjamBuku(Buku buku) {
        if (!buku.getStatusDipinjam()) {
            buku.pinjamBuku();
            bukuPinjaman.add(buku);
        } else {
            System.out.println("Buku " + buku.getInfo() + " sudah dipinjam orang lain.");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (bukuPinjaman.contains(buku)) {
            buku.kembalikanBuku();
            bukuPinjaman.remove(buku);
        } else {
            System.out.println("Buku ini tidak ada dalam daftar pinjaman " + nama);
        }
    }

    public String getInfo() {
        String info = "ID Anggota: " + idAnggota + ", Nama: " + nama + "\n";
        if (bukuPinjaman.isEmpty()) {
            info += "Tidak ada buku yang sedang dipinjam.";
        } else {
            info += "Buku yang dipinjam:\n";
            for (Buku b : bukuPinjaman) {
                info += "- " + b.getInfo() + "\n";
            }
        }
        return info;
    }
}