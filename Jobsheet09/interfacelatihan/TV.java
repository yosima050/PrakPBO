package interfacelatihan;

public class TV extends AlatElektronik implements Audible {

    private String jenisLayar;
    private int volume;

    public TV(String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public void naikkanVolume(int increment) {
        this.volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        this.volume -= decrement; 
    }

    @Override
    public String getInfo() {
        return String.format("TV\nMerk\t: %s\nWarna\t: %s\nHarga\t: Rp %.0f\nLayar\t: %s\nVolume\t: %d",
                getMerk(), getWarna(), getHarga(), this.jenisLayar, this.volume);
    }
}