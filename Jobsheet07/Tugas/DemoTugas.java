package PrakPBO.Jobsheet07.Tugas;

public class DemoTugas {
    public static void main(String[] args) {
        
        Mobil mobil1 = new Mobil("Toyota Avanza", 180, 4, true);

        System.out.println(mobil1.getInfo());
        
        Mobil mobil2 = new Mobil();
        mobil2.merek = "Honda Brio";
        mobil2.memilikiAC = true;
        
        System.out.println(mobil2.getInfo());
    }
}