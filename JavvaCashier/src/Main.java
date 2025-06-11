public class Main {

    static LoginPage loginPage = new LoginPage();
    static AdminPage adminPage = new AdminPage();
    static CashierPage cashierPage = new CashierPage();
    static Admin admin = new Admin();
    static Kasir kasir = new Kasir();
    
    public static void main(String args[]) {
        CashierSystem.loadUserData();
        javax.swing.SwingUtilities.invokeLater(() -> {
            adminPage.loadData();
            loginPage.setVisible(true);
        });
    }
}
