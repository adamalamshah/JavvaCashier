import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Galih
 */
class CashierSystem {
    private static List<User> users = new ArrayList<>();
    private static List<Produk> produkList = new ArrayList<>();

    public static void loadUserData() {
        users.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader("DataAccount.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] dataAccount = line.split(",");
                if (dataAccount.length == 2) {
                    String username = dataAccount[0].trim();
                    String password = dataAccount[1].trim();
                    users.add(new User(username, password));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan dalam membaca file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void addUser(User user) {
        users.add(user);
    }

    public static User getUser(String id) {
        for (User user : users) {
            if (user.getUsername().equals(id)) {
                return user;
            }
        }
        return null;
    }
    public static List<User> getUsers() {
        return users;
    }

    public static void addProduk(Produk produk) {
        produkList.add(produk);
    }
    public static List<Produk> getProdukList() {
        return produkList;
    }
    public static Produk getProdukByID(String id) {
        for (Produk produk : produkList) {
            if (produk.getId().equals(id)) {
                return produk;
            }
        }
        return null;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
class Admin extends User {
    public Admin() {
        super("Admin", "Admin1234");
    }
}
class Kasir extends User {
    public Kasir(String username, String password) {
        super(username, password);
    }
}

class Produk {
    private String id;
    private String nama;
    private double harga;

    public Produk(String id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
}