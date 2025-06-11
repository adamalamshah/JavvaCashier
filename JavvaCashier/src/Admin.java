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
                DefaultTableModel modelHome = (DefaultTableModel) tableProdukDashboard.getModel();
                model.addRow(new Object[]{id, nama, harga});
                modelHome.addRow(new Object[]{id, nama, harga});

                JOptionPane.showMessageDialog(null, "Produk berhasil ditambahkan", "Message", JOptionPane.INFORMATION_MESSAGE);

                CashierSystem.saveProdukToFile(tableProduk);
                CashierSystem.getProdukList().clear();
                CashierSystem.loadProdukFromFile(tableProduk, tableProdukDashboard);
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
       
        CashierSystem.saveProdukToFile(tableProduk);
        CashierSystem.getProdukList().clear();
        CashierSystem.loadProdukFromFile(tableProduk, tableProdukDashboard);
    }
    
    public void tambahKasir(JTable tableKasir, JTable tableKasirDashboard, JTextField tfUsername, JTextField tfPassword){
        String username = tfUsername.getText();
        String password = tfPassword.getText();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Isi semua field", "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            Kasir kasir = new Kasir(username, password);
            CashierSystem.addKasir(kasir);
            JOptionPane.showMessageDialog(null, "Kasir berhasil ditambahkan", "Message", JOptionPane.INFORMATION_MESSAGE);
            
            DefaultTableModel model = (DefaultTableModel) tableKasir.getModel();
            DefaultTableModel modelHome = (DefaultTableModel) tableKasirDashboard.getModel();
            model.addRow(new Object[]{username});
            modelHome.addRow(new Object[]{username});

            CashierSystem.saveKasirToFile(tableKasir);
            CashierSystem.getKasirList().clear();
            CashierSystem.loadKasirFromFile(tableKasir, tableKasirDashboard);
        }
    }
    
    public void hapusKasir(JTable tableKasir, JTable tableKasirDashboard, JTextField tfHapusKasir){
        DefaultTableModel model = (DefaultTableModel) tableKasir.getModel();
        DefaultTableModel modelHome = (DefaultTableModel) tableKasirDashboard.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(tfHapusKasir.getText())) {
                model.removeRow(i);
                modelHome.removeRow(i);
                JOptionPane.showMessageDialog(null, "Kasir berhasil dihapus", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            else if (i == model.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "Kasir tidak ditemukan", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        CashierSystem.saveKasirToFile(tableKasir);
        CashierSystem.getKasirList().clear();
        CashierSystem.loadKasirFromFile(tableKasir, tableKasirDashboard);
    }  
}
