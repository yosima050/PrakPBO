package interfacelatihan;

public class MainDemo {

    public static void main(String[] args) {
        Kipas kipas = new Kipas("Duduk", 350000, "Biru", "Maspion");
        TV tv = new TV("OLED", 10, 7500000, "Hitam", "Sony");
        Kulkas kulkasBiasa = new Kulkas(2, 4000000, "Silver", "Panasonic");
        SmartFridge smartFridge = new SmartFridge(5, 2, 12000000, "Dark Gray", "Samsung");

        AlatElektronik[] semuaAlat = {kipas, tv, kulkasBiasa, smartFridge};
        
        System.out.println("======= INFO SEMUA ALAT ELEKTRONIK =======");
        
        for (AlatElektronik alat : semuaAlat) {
            System.out.println(alat.getInfo());
            System.out.println("------------------------------------------");
        }
        
        System.out.println("\n======= TES INTERFACE AUDIBLE =======");
        System.out.println("Volume TV awal: " + tv.getVolume());
        tv.naikkanVolume(7);
        System.out.println("Volume TV setelah dinaikkan: " + tv.getVolume());
        
        System.out.println("\nVolume Kulkas awal: " + smartFridge.getVolume());
        smartFridge.turunkanVolume(3);
        System.out.println("Volume Kulkas setelah diturunkan: " + smartFridge.getVolume());
    }
}