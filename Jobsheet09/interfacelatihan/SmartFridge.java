package interfacelatihan;

public class SmartFridge extends Kulkas implements Audible {

    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
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

    public String getInfo() {
        return String.format("SMART FRIDGE\nMerk\t: %s\nWarna\t: %s\nHarga\t: Rp %.0f\nJml Pintu: %d\nVolume\t: %d",
                getMerk(), getWarna(), getHarga(), getJumlahPintu(), this.volume);
    }
}