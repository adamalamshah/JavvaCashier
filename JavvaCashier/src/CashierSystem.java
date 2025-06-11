import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class CashierSystem {
    private static List<Kasir> kasirList = new ArrayList<>();
    private static List<Produk> produkList = new ArrayList<>();
    private static List<Keranjang> keranjangList = new ArrayList<>();

    public static void loadUserData() {
        kasirList.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader("DataAccount.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] dataAccount = line.split(",");
                if (dataAccount.length == 2) {
                    String username = dataAccount[0].trim();
                    String password = dataAccount[1].trim();
                    kasirList.add(new Kasir(username, password));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan dalam membaca file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void addKasir(Kasir kasir) {
        kasirList.add(kasir);
    }
    public static Kasir getKasir(String id) {
        for (Kasir kasir : kasirList) {
            if (kasir.getUsername().equals(id)) {
                return kasir;
            }
        }
        return null;
    }
    public static List<Kasir> getKasirList() {
        return kasirList;
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
    public static Produk getProdukByNama(String nama) {
        for (Produk produk : produkList) {
            if (produk.getNama().equals(nama)) {
                return produk;
            }
        }
        return null;
    }
    
    public static void addKeranjang(Keranjang keranjang){
        keranjangList.add(keranjang);
    }
    public static Keranjang getKeranjangByID(String id) {
        for (Keranjang keranjang : keranjangList) {
            if (keranjang.getId().equals(id)) {
                return keranjang;
            }
        }
        return null;
    }
    static void clearKeranjang() {
        keranjangList.clear();
        Keranjang.setTotal(0.0);
    }
    static List<Keranjang> getKeranjangList() {
        return keranjangList;
    }
    
    static boolean cekAkunKasir(String username, String password){
        for (Kasir kasir : kasirList) {
            if (kasir.getUsername().equals(username) && kasir.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    static void saveProdukToFile() {
        try {
            FileWriter fw = new FileWriter("DataProduk.txt");
            PrintWriter pw = new PrintWriter(fw);
            
            DefaultTableModel model = (DefaultTableModel) Main.adminPage.getTableProduk().getModel();
            int rowCount = model.getRowCount();
            
            for(int i = 0; i < rowCount; i++) {
                String id = model.getValueAt(i, 0).toString();
                String nama = model.getValueAt(i, 1).toString();
                String harga = model.getValueAt(i, 2).toString();
                
                pw.println(id + "," + nama + "," + harga);
            }
            
            pw.close();
        } catch(IOException ex) {
            JOptionPane.showMessageDialog(null, "Error saving to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    static void loadProdukFromFile(JTable tableProduk, JTable tableProdukDashboard) {
        try {
            File file = new File("DataProduk.txt");
            if (!file.exists()) {
                return;
            }
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            DefaultTableModel model = (DefaultTableModel) tableProduk.getModel();
            DefaultTableModel modelHome = (DefaultTableModel) tableProdukDashboard.getModel();
            model.setRowCount(0);
            modelHome.setRowCount(0);
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String id = data[0];
                    String nama = data[1];
                    double harga = Double.parseDouble(data[2]);
                    
                    model.addRow(new Object[]{id, nama, harga});
                    modelHome.addRow(new Object[]{id, nama, harga});
                    
                    Produk produk = new Produk(id, nama, harga);
                    CashierSystem.addProduk(produk);
                }
            }
            
            br.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error loading produk data: " + ex.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    static void saveKasirToFile() {
        try {
            FileWriter fw = new FileWriter("DataAccount.txt");
            PrintWriter pw = new PrintWriter(fw);
            
            for (User user : CashierSystem.getKasirList()) {
                String username = user.getUsername();
                String password = user.getPassword();
                pw.println(username + "," + password);
            }

            
            pw.close();
            
        } catch(IOException ex) {
            JOptionPane.showMessageDialog(null, "Error saving to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    static void loadKasirFromFile(JTable tableKasir, JTable tableKasirDashboard) {
        try {
            File file = new File("DataAccount.txt");
            if (!file.exists()) {
                return;
            }
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            DefaultTableModel model = (DefaultTableModel) tableKasir.getModel();
            DefaultTableModel modelHome = (DefaultTableModel) tableKasirDashboard.getModel();
            model.setRowCount(0);
            modelHome.setRowCount(0);
            CashierSystem.getKasirList().clear();
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    String username = data[0].trim();
                    String password = data[1].trim();

                    model.addRow(new Object[]{username});
                    modelHome.addRow(new Object[]{username});

                    Kasir kasir = new Kasir(username, password);
                    CashierSystem.addKasir(kasir);
                }
            }
            
            br.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error loading kasir data: " + ex.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
