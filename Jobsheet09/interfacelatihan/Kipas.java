package interfacelatihan;

public class Kipas extends AlatElektronik {

    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public String getInfo() {
        return String.format("KIPAS\nMerk\t: %s\nWarna\t: %s\nHarga\t: Rp %.0f\nJenis\t: %s",
                getMerk(), getWarna(), getHarga(), this.jenis);
    }
}