package PrakPBO.Jobsheet07.Tugas;

public class Mobil extends Kendaraan {
    
    public boolean memilikiAC;

    public Mobil() {
        this.memilikiAC = false;
        System.out.println("-> Constructor Mobil (default) dieksekusi.");
    }

    public Mobil(String merek, int kecepatanMaks, int jumlahRoda, boolean memilikiAC) {
        super(merek, kecepatanMaks, jumlahRoda); 
        this.memilikiAC = memilikiAC;
        System.out.println("-> Constructor Mobil (berparameter) dieksekusi.");
    }

    @Override 
    public String getInfo() {
        String infoParent = super.getInfo(); 
        
        String infoChild = "--- INFO MOBIL (CHILD) ---\n";
        infoChild += "Jenis  : Mobil Penumpang\n";
        infoChild += "Status AC: " + (this.memilikiAC ? "Ya, Ada" : "Tidak Ada") + "\n";
        
        return infoParent + infoChild;
    }
}