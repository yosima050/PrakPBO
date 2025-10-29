package PrakPBO.Jobsheet08.Tugas;

public abstract class Sepeda {

    public String merek;
    public int kecepatan;
    public int gear;

    public abstract void aksiSpesial();

    public abstract void tampilkanInfoSpesifik();


    public void tambahKecepatan(int tambahan) {
        this.kecepatan += tambahan;
        System.out.println(this.merek + " melaju. Kecepatan: " + this.kecepatan + " km/j.");
    }

}