/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Athariq Adam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        CashierSystem.loadUserData();
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }
}
