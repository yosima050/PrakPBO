package Jobsheet10.Praktikum10;

public class Demo {
    public static void main(String[] args) {
        // 1. Instansiasi objek Pegawai murni
        Pegawai pegawaiAsli = new Pegawai("123", "Budi");

        // 2. Mencoba memaksa (downcast) menjadi Dosen
        try {
            Dosen dosenPalsu = (Dosen) pegawaiAsli; 
            dosenPalsu.displayInfo();
        } catch (ClassCastException e) {
            System.out.println("Gagal melakukan downcasting!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}