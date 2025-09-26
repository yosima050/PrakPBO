package PrakPBO.Quiz;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;

public class Transaksi {
    private String tanggal;
    
    private ArrayList<ItemTransaksi> daftarItem;

    public Transaksi(String tanggal) {
        this.tanggal = tanggal;
        this.daftarItem = new ArrayList<>();
    }

    public void tambahItem(Produk produk, int jumlah) {
        ItemTransaksi itemBaru = new ItemTransaksi(produk, jumlah);
        this.daftarItem.add(itemBaru);
    }
    
    public double hitungTotal() {
        double total = 0;
        for (ItemTransaksi item : daftarItem) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void tampilNota() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        
        System.out.println("===== NOTA PEMBELIAN =====");
        System.out.println("Tanggal: " + this.tanggal);
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s %-5s %-12s %-12s%n", "Produk", "Jml", "Harga", "Subtotal");
        System.out.println("-------------------------------------------------");

        for (ItemTransaksi item : daftarItem) {
            System.out.printf("%-20s %-5d %-12s %-12s%n",
                item.getProduk().getNamaProduk(),
                item.getJumlah(),
                formatter.format(item.getProduk().getHarga()),
                formatter.format(item.getSubtotal())
            );
        }

        System.out.println("-------------------------------------------------");
        System.out.printf("%-38s %-12s%n", "TOTAL", formatter.format(this.hitungTotal()));
        System.out.println("=================================================");
        System.out.println("Terima kasih telah berbelanja!");
    }
}