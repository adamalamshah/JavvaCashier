public class Keranjang {
    private String id;
    private String nama;
    private double harga;
    private int qty;
    private double subtotal;
    private static double total = 0.0;

    public Keranjang(String id, String nama, double harga, int qty, double subtotal) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.qty = qty;
        this.subtotal = subtotal;
    }

    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    public int getQty() {
        return qty;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public static double getTotal() {
        return total;
    }
    public static void setTotal(double total) {
        Keranjang.total = total;
    }   
}
