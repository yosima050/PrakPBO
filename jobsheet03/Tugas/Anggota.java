package jobsheet03.Tugas;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPeminjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPeminjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double nominal) {
        if (jumlahPinjaman + nominal > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    public void angsur(double nominal) {
        if (nominal < (0.1 * jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            if (nominal > jumlahPinjaman) {
                System.out.println("Maaf, angsuran melebihi jumlah pinjaman Anda.");
            } else {
                jumlahPinjaman -= nominal;
            }
        }
    }
}