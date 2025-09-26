package PrakPBO.Quiz;

public class DemoKasir {
    public static void main(String[] args) {
        Produk produk1 = new Produk("M01", "Nasi Ayam Geprek", 18000.0);
        Produk produk2 = new Produk("M02", "Soto Ayam", 15000.0);
        Produk produk3 = new Produk("N01", "Es Jeruk", 6000.0);

        Transaksi transaksi1 = new Transaksi("26-09-2025");

        transaksi1.tambahItem(produk1, 2);
        transaksi1.tambahItem(produk3, 5);
        transaksi1.tambahItem(produk2, 3);
        
        transaksi1.tampilNota();
    }
}