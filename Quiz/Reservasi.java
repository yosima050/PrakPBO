package PrakPBO.Quiz;
import java.util.ArrayList;

public class Reservasi {
    private String tanggal;
    private int durasi;

    private Ruangan ruangan;

    private ArrayList<Mahasiswa> daftarMahasiswa;

    public Reservasi(String tanggal, int durasi, Ruangan ruangan) {
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.ruangan = ruangan;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        this.daftarMahasiswa.add(mahasiswa);
    }

    public void tampilReservasi() {
        System.out.println("======= DETAIL RESERVASI RUANGAN =======");
        System.out.println("Tanggal Reservasi : " + tanggal);
        System.out.println("Durasi (jam)      : " + durasi);
        System.out.println("\n--- Detail Ruangan ---");
        System.out.println("Kode Ruangan      : " + ruangan.getKodeRuangan());
        System.out.println("Nama Ruangan      : " + ruangan.getNamaRuangan());
        System.out.println("Kapasitas         : " + ruangan.getKapasitas() + " orang");
        System.out.println("Status            : " + ruangan.getStatus());

        System.out.println("\n--- Daftar Mahasiswa ---");
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada mahasiswa yang ditambahkan.");
        } else {
            int nomor = 1;
            for (Mahasiswa mhs : daftarMahasiswa) {
                System.out.println(nomor + ". NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                nomor++;
            }
        }
        System.out.println("========================================");
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
}