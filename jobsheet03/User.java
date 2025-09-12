package jobsheet03;

public class User {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    private static User instance;

    private User(String username, String nama, String email) {
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

        public static User getInstance() {
        if (instance == null) {
            instance = new User("admin", "Administrator", "admin@web.com");
        }
        return instance;
    }

    public void cetakInfo() {
        System.out.println("Username: " + username);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("======================");
    }
}
