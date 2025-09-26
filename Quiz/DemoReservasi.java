package PrakPBO.Quiz;

public class DemoReservasi {
    public static void main(String[] args) {
        Ruangan labKomputer = new Ruangan("LSI3", "Laboratorium Komputer", 40, "Tersedia");

        Mahasiswa mhs1 = new Mahasiswa("2341720001", "Andi Pratama");
        Mahasiswa mhs2 = new Mahasiswa("2341720002", "Citra Kirana");
        Mahasiswa mhs3 = new Mahasiswa("2341720003", "Bagus Wijaya");

        Reservasi reservasiAcara = new Reservasi("2025-10-10", 3, labKomputer);

        reservasiAcara.tambahMahasiswa(mhs1);
        reservasiAcara.tambahMahasiswa(mhs2);
        reservasiAcara.tambahMahasiswa(mhs3);

        reservasiAcara.tampilReservasi();
    }
}