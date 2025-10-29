package PrakPBO.Jobsheet08.Tugas;

public class Main {
    public static void main(String[] args) {
        System.out.println("SEPEDA GUNUNG");
        SepedaGunung sg = new SepedaGunung();
        sg.merek = "MountainPro";
        sg.tambahKecepatan(10);
        sg.aksiSpesial();
        sg.tampilkanInfoSpesifik();

        System.out.println("\n" + "SEPEDA LIPAT");
        
        SepedaLipat sl = new SepedaLipat();
        sl.merek = "CityFold";
        sl.tambahKecepatan(5);
        sl.aksiSpesial();
        sl.tampilkanInfoSpesifik();
    }
}
