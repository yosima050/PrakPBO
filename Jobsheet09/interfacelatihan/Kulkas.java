package interfacelatihan;

public class Kulkas extends AlatElektronik {

    private int jumlahPintu;

    public Kulkas(int jumlahPint, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPint;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    @Override
    public String getInfo() {
        return String.format("KULKAS\nMerk\t: %s\nWarna\t: %s\nHarga\t: Rp %.0f\nJml Pintu: %d",
                getMerk(), getWarna(), getHarga(), this.jumlahPintu);
    }
}