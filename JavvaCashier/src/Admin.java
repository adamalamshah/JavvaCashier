import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Admin extends User {
    public Admin() {
        super("admin", "admin");
    }

    @Override
    public void login(JTextField tfUsername, JPasswordField pfPassword) {  
        if(tfUsername.getText().isEmpty()||pfPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Username atau password tidak boleh kosong", "Message", JOptionPane.INFORMATION_MESSAGE);
            tfUsername.setText("");
            tfUsername.setText("");
        } else if(getUsername().equals(tfUsername.getText()) && getPassword().equals(new String(pfPassword.getPassword()))){
            Main.adminPage.setVisible(true);
            Main.loginPage.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Username atau password salah", "Message", JOptionPane.INFORMATION_MESSAGE);
            tfUsername.setText("");
            pfPassword.setText("");
        }
    }
    
    public void logout() {
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        Main.adminPage.dispose();
    }
    
    public void tambahProduk(JTable tableProduk, JTable tableProdukDashboard, JTextField tfIDProduk, JTextField tfNamaProduk, JTextField tfHargaProduk){
        try{
            String id = tfIDProduk.getText();
            String nama = tfNamaProduk.getText();
            
            if (nama.isEmpty()||id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isi semua field", "Message", JOptionPane.ERROR_MESSAGE);        
            }
            else{
                double harga = Double.parseDouble(tfHargaProduk.getText());

                DefaultTableModel model = (DefaultTableModel) tableProduk.getModel();
                DefaultTableModel modelDashboard = (DefaultTableModel) tableProdukDashboard.getModel();
                
                int rowCount = model.getRowCount();
                
                for(int i = 0; i < rowCount; i++) {
                    if(id.equals(model.getValueAt(i, 0).toString())) {
                        JOptionPane.showMessageDialog(null, "ID produk duplikat: " + id, "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                
                model.addRow(new Object[]{id, nama, harga});
                modelDashboard.addRow(new Object[]{id, nama, harga});

                JOptionPane.showMessageDialog(null, "Produk berhasil ditambahkan", "Message", JOptionPane.INFORMATION_MESSAGE);

                CashierSystem.saveProdukToFile();
                CashierSystem.getProdukList().clear();
                model.setRowCount(0);
                modelDashboard.setRowCount(0);
                CashierSystem.loadProdukFromFile(tableProduk, tableProdukDashboard);
                Main.adminPage.getLblTotalProduk().setText(String.valueOf(CashierSystem.getProdukList().size()));
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Masukkan harga yang valid (angka)", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusProduk(JTable tableProduk, JTable tableProdukDashboard, JTextField tfHapusProduk){
        DefaultTableModel model = (DefaultTableModel) tableProduk.getModel();
        DefaultTableModel modelDashboard = (DefaultTableModel) tableProdukDashboard.getModel();
        
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(tfHapusProduk.getText())) {
                model.removeRow(i);
                modelDashboard.removeRow(i);

                JOptionPane.showMessageDialog(null, "Produk berhasil dihapus", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            else if (i == model.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "Produk tidak ditemukan", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
       
        CashierSystem.saveProdukToFile();
        CashierSystem.getProdukList().clear();
        model.setRowCount(0);
        modelDashboard.setRowCount(0);
        CashierSystem.loadProdukFromFile(tableProduk, tableProdukDashboard);
        Main.adminPage.getLblTotalProduk().setText(String.valueOf(CashierSystem.getProdukList().size()));
    }
    
    public void tambahKasir(JTable tableKasir, JTable tableKasirDashboard, JTextField tfUsername, JTextField tfPassword){
        String username = tfUsername.getText();
        String password = tfPassword.getText();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Isi semua field", "Message", JOptionPane.ERROR_MESSAGE);
        } else { 
            DefaultTableModel model = (DefaultTableModel) tableKasir.getModel();
            DefaultTableModel modelDashboard = (DefaultTableModel) tableKasirDashboard.getModel(); 
            
            int rowCount = model.getRowCount();

            for(int i = 0; i < rowCount; i++) {
                if(username.equals(model.getValueAt(i, 0).toString())) {
                    JOptionPane.showMessageDialog(null, "Username kasir duplikat: " + username, "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            model.setRowCount(0);
            modelDashboard.setRowCount(0);
            
            Kasir kasir = new Kasir(username, password);
            CashierSystem.addKasir(kasir);
            CashierSystem.saveKasirToFile();
            CashierSystem.getKasirList().clear();
            CashierSystem.loadKasirFromFile(tableKasir, tableKasirDashboard);
            Main.adminPage.updateTotalKasir();
            
            JOptionPane.showMessageDialog(null, "Kasir berhasil ditambahkan", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void hapusKasir(JTable tableKasir, JTable tableKasirDashboard, JTextField tfHapusKasir){
        DefaultTableModel model = (DefaultTableModel) tableKasir.getModel();
        DefaultTableModel modelDashboard = (DefaultTableModel) tableKasirDashboard.getModel();
        
        List<Kasir> kasirList = CashierSystem.getKasirList();
        boolean ditemukan = false;

        for (int i = 0; i < kasirList.size(); i++) {
            if (kasirList.get(i).getUsername().equals(tfHapusKasir.getText())) {
                kasirList.remove(i);
                ditemukan = true;
                break;
            }
        }
        
        if (ditemukan) {
            JOptionPane.showMessageDialog(null, "Kasir berhasil dihapus", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Kasir tidak ditemukan", "Message", JOptionPane.ERROR_MESSAGE);
        }
        
        CashierSystem.saveKasirToFile();
        CashierSystem.getKasirList().clear();
        model.setRowCount(0);
        modelDashboard.setRowCount(0);
        CashierSystem.loadKasirFromFile(tableKasir, tableKasirDashboard);
        Main.adminPage.updateTotalKasir();
    }  
}
