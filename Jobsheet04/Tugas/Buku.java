package Jobsheet04.Tugas;

public class Buku {
    private String isbn;
    private String judul;
    private String penulis;
    private boolean isDipinjam;

    public Buku(String isbn, String judul, String penulis) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
        this.isDipinjam = false;
    }

    public void pinjamBuku() {
        if (!isDipinjam) {
            isDipinjam = true;
            System.out.println(judul + " berhasil dipinjam.");
        } else {
            System.out.println(judul + " sudah dipinjam!");
        }
    }

    public void kembalikanBuku() {
        if (isDipinjam) {
            isDipinjam = false;
            System.out.println(judul + " berhasil dikembalikan.");
        } else {
            System.out.println(judul + " belum dipinjam.");
        }
    }

    public boolean getStatusDipinjam() {
        return isDipinjam;
    }

    public String getInfo() {
        return "ISBN: " + isbn + ", Judul: " + judul + ", Penulis: " + penulis + 
               ", Status: " + (isDipinjam ? "Dipinjam" : "Tersedia");
    }
}
