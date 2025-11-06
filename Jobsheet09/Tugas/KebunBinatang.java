package Tugas;

public class KebunBinatang {

    public static void main(String[] args) {
        Bebek donald = new Bebek("Donald");
        Merpati sky = new Merpati("Sky");
        IkanPaus willy = new IkanPaus("Willy");

        System.out.println("======= UJI COBA BEBEK =======");
        System.out.println("Nama hewan: " + donald.getNama());
        donald.bersuara();
        donald.terbang();
        donald.berenang();

        System.out.println("\n======= UJI COBA MERPATI =======");
        System.out.println("Nama hewan: " + sky.getNama());
        sky.bersuara();
        sky.terbang();

        System.out.println("\n======= UJI COBA IKAN PAUS =======");
        System.out.println("Nama hewan: " + willy.getNama());
        willy.berenang();
    }
}