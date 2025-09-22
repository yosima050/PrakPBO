package Jobsheet04.Tugas;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Kota");

        Buku buku1 = new Buku("ISBN001", "Pemrograman Java", "Andi");
        Buku buku2 = new Buku("ISBN002", "Struktur Data", "Budi");
        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);

        Anggota anggota1 = new Anggota("A001", "Puspa");
        Anggota anggota2 = new Anggota("A002", "Yenny");
        perpus.tambahAnggota(anggota1);
        perpus.tambahAnggota(anggota2);

        System.out.println(perpus.getInfo());

        anggota1.pinjamBuku(buku1);
        anggota2.pinjamBuku(buku1);

        System.out.println(anggota1.getInfo());
        System.out.println(anggota2.getInfo());

        anggota1.kembalikanBuku(buku1);
        anggota2.pinjamBuku(buku1);
        System.out.println(anggota2.getInfo());
    }
}