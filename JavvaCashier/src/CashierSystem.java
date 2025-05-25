import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Galih
 */
public class CashierSystem {
    private static List<User> users = new ArrayList<>();
    private static List<Produk> produkList = new ArrayList<>();

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
    private String id;
    private String nama;
    private String username;
    private String password;
    private String role;

    public User(String id, String nama, String username, String password, String role) {
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
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
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
class Admin extends User {
    public Admin(String id, String nama, String username, String password) {
        super(id, nama, username, password, "admin");
    }
}
class Kasir extends User {
    public Kasir(String id, String nama, String username, String password) {
        super(id, nama, username, password, "kasir");
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