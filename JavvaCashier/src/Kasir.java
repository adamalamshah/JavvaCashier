import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Kasir extends User{

    public Kasir(String username, String password) {
        super(username, password);
    }
    public Kasir(){}

    @Override
    public void login(JTextField tfUsername, JPasswordField pfPassword) {
        if(tfUsername.getText().isEmpty()||pfPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Username atau password tidak boleh kosong", "Message", JOptionPane.INFORMATION_MESSAGE);
            tfUsername.setText("");
            pfPassword.setText("");
        } else if(CashierSystem.cekAkunKasir(tfUsername.getText(), new String(pfPassword.getPassword())) == true){
            Main.kasir = new Kasir(tfUsername.getText(), new String(pfPassword.getPassword()));
            Main.cashierPage.getLblUser().setText(Main.kasir.getUsername().trim());
            Main.cashierPage.setVisible(true);
            Main.loginPage.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Username atau password salah", "Message", JOptionPane.INFORMATION_MESSAGE);
            tfUsername.setText("");
            pfPassword.setText("");
        } 
    }
    
    public void logout() {
        CashierSystem.clearKeranjang();
        new LoginPage().setVisible(true);
        Main.cashierPage.dispose();
    }
    
    public void tambahProdukKeKeranjang(JTextField tfInputProduk, JTextField tfInputQty, JTable tabelKeranjang){
        String produk = tfInputProduk.getText().trim();
        String qty = tfInputQty.getText().trim();

        try {
            if (produk.isEmpty()||qty.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isi semua field", "Message", JOptionPane.ERROR_MESSAGE);        
            }
            else{
                DefaultTableModel model = (DefaultTableModel) tabelKeranjang.getModel();
                Produk item;
                if (Character.isDigit(produk.charAt(0))){
                    item = CashierSystem.getProdukByID(produk);
                }
                else {
                    item = CashierSystem.getProdukByNama(produk);
                }
                double subtotal = Double.parseDouble(qty) * item.getHarga();
                Keranjang.setTotal(Keranjang.getTotal() + subtotal);
                model.addRow(new Object[]{item.getId(), item.getNama(), item.getHarga(), qty, subtotal});
                                
                int quantity = Integer.parseInt(qty);
                CashierSystem.addKeranjang(new Keranjang(item.getId(), item.getNama(), item.getHarga(), quantity, subtotal));

                Main.cashierPage.getTfTotal().setText(String.format("%.2f", Keranjang.getTotal()));
                tfInputProduk.setText("");
                tfInputQty.setText("");
            }
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Produk tidak ditemukan", "Message", JOptionPane.ERROR_MESSAGE);
            tfInputProduk.setText("");
            tfInputQty.setText("");
        }
    }
    
    public void lakukanTransaksi(JComboBox cbInputMetode, JTextField tfInputJumlah){
        double pembayaran = 0;
        double kembalian = 0;
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String metodePembayaran = (String) cbInputMetode.getSelectedItem();
        
        if (metodePembayaran.equalsIgnoreCase("Cash")) {
            try {
                pembayaran = Double.parseDouble(tfInputJumlah.getText());
                if (pembayaran < Keranjang.getTotal()) {
                    JOptionPane.showMessageDialog(null, "Pembayaran kurang dari total belanja!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                kembalian = pembayaran - Keranjang.getTotal();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan pembayaran yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            pembayaran = Keranjang.getTotal();
            kembalian = 0;
        }

        buatNota(CashierSystem.getKeranjangList(), pembayaran, kembalian);
        simpanTransaksiKeFile(pembayaran, kembalian, metodePembayaran);
        CashierSystem.clearKeranjang();
    }
    
    public void buatNota(List<Keranjang> keranjangList, double pembayaran, double kembalian){
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        StringBuilder nota = new StringBuilder();
        String namaKasir = Main.cashierPage.getLblUser().getText();
        String tanggal = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));

        nota.append("================= JAVVA CASHIER =================\n");
        nota.append("Kasir   : ").append(namaKasir).append("\n");
        nota.append("Tanggal : ").append(tanggal).append("\n");
        nota.append("-------------------------------------------------\n");
        nota.append(String.format("%-5s%-20s%-10s%-5s%-10s\n", "ID", "Nama", "Harga", "Qty", "Subtotal"));
        nota.append("-------------------------------------------------\n");

        for (Keranjang item : keranjangList) {
            nota.append(String.format("%-5s%-20s%-10.2f%-5d%-10.2f\n",
                        item.getId(), item.getNama(), item.getHarga(), item.getQty(), item.getSubtotal()));
        }

        nota.append("-------------------------------------------------\n");
        nota.append(String.format("TOTAL      : %s\n", rupiah.format(Keranjang.getTotal())));
        nota.append(String.format("Pembayaran : %s\n", rupiah.format(pembayaran)));
        nota.append(String.format("Kembalian  : %s\n", rupiah.format(kembalian)));
        nota.append("================= TERIMA KASIH ==================");

        JTextArea textArea = new JTextArea(nota.toString());
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Nota Transaksi", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void simpanTransaksiKeFile(double pembayaran, double kembalian, String metodePembayaran){
        try {
            NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
            String tanggalWaktu = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss"));
            String namaFileTransaksi = "trancaction " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm")) + ".txt";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("log transaksi", namaFileTransaksi)))) {
                bw.write("Nama kasir        : " + Main.cashierPage.getLblUser().getText() + "\n");
                bw.write("Tanggal           : " + tanggalWaktu + "\n");
                bw.write("Metode Pembayaran : " + metodePembayaran + "\n");
                bw.write("Pembayaran        : " + rupiah.format(pembayaran) + "\n");
                bw.write("Kembalian         : " + rupiah.format(kembalian) + "\n");
                bw.write("=================================================================\n");
                bw.write(String.format("%-10s%-25s%-18s%-8s%-10s\n", "ID", "Nama Produk", "Harga Satuan", "QTY", "Subtotal"));
                
                for (Keranjang item : CashierSystem.getKeranjangList()) {
                    bw.write(String.format("%-10s%-25s%-18.2f%-8d%-10.2f", item.getId(), item.getNama(), item.getHarga(), item.getQty(), item.getSubtotal()));
                    bw.newLine();
                }
                
                bw.write("=================================================================\n");
                bw.write(String.format("TOTAL : Rp %.2f\n", Keranjang.getTotal()));
                bw.write("");
            } 
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error saving to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void batalkanTransaksi(){
        CashierSystem.clearKeranjang();
    }
}
