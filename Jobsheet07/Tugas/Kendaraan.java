package PrakPBO.Jobsheet07.Tugas;

public class Kendaraan {
    public String merek;
    public int kecepatanMaks;
    public int jumlahRoda;

    public Kendaraan() {
        this.merek = "Belum Ditentukan";
        this.kecepatanMaks = 0;
        this.jumlahRoda = 0;
        System.out.println("-> Constructor Kendaraan (default) dieksekusi.");
    }

    public Kendaraan(String merek, int kecepatanMaks, int jumlahRoda) {
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
        this.jumlahRoda = jumlahRoda;
        System.out.println("-> Constructor Kendaraan (berparameter) dieksekusi.");
    }

    public String getInfo() {
        String info = "\n--- INFO KENDARAAN (PARENT) ---\n";
        info += "Jenis  : Kendaraan Umum\n";
        info += "Merek  : " + this.merek + "\n";
        info += "Speed  : " + this.kecepatanMaks + " km/jam\n";
        info += "Roda   : " + this.jumlahRoda + "\n";
        return info;
    }
}