import java.awt.CardLayout;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

public class AdminPage extends javax.swing.JFrame {
  
    CardLayout cardLayout;
    public AdminPage() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

        btnDashboard.setUI(new BasicButtonUI());
        btnDashboard.setFocusPainted(false);
        btnAturProduk.setUI(new BasicButtonUI());
        btnAturProduk.setFocusPainted(false);
        btnAturKasir.setUI(new BasicButtonUI());
        btnAturKasir.setFocusPainted(false);
        btnLogout.setUI(new BasicButtonUI());
        btnLogout.setFocusPainted(false);

        cardLayout = (CardLayout)(pnlCards.getLayout());
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        pnlSideBar = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnAturProduk = new javax.swing.JButton();
        btnAturKasir = new javax.swing.JButton();
        lblAdmin = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        avatar = new javax.swing.JLabel();
        pnlCards = new javax.swing.JPanel();
        pnlDashboard = new javax.swing.JPanel();
        pnlHeaderDashboard = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        pnlTotalProduk = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lblTotalProduk = new javax.swing.JLabel();
        pnlTotalKasir = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        lblTotalKasir = new javax.swing.JLabel();
        pnlTabelProdukDashboard = new javax.swing.JScrollPane();
        tableProdukDashboard = new javax.swing.JTable();
        pnlTabelKasirDashboard = new javax.swing.JScrollPane();
        tableKasirDashboard = new javax.swing.JTable();
        pnlAturProduk = new javax.swing.JPanel();
        pnlHeaderProduk = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        pnlTambahProduk = new javax.swing.JPanel();
        lblTambahProduk = new javax.swing.JLabel();
        lblAddNama = new javax.swing.JLabel();
        tfIDProduk = new javax.swing.JTextField();
        lblAddID = new javax.swing.JLabel();
        tfNamaProduk = new javax.swing.JTextField();
        lblAddHarga = new javax.swing.JLabel();
        tfHargaProduk = new javax.swing.JTextField();
        btnTambahProduk = new javax.swing.JButton();
        pnlHapusProduk = new javax.swing.JPanel();
        lblHapusProduk = new javax.swing.JLabel();
        tfHapusProduk = new javax.swing.JTextField();
        lblDelByID = new javax.swing.JLabel();
        btnHapusProduk = new javax.swing.JButton();
        pnlTabelProduk = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        pnlAturKasir = new javax.swing.JPanel();
        pnlHeaderKasir = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        pnlTambahKasir = new javax.swing.JPanel();
        lblTambahKasir = new javax.swing.JLabel();
        lblAddUsername = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lblAddPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        btnTambahKasir = new javax.swing.JButton();
        pnlHapusKasir = new javax.swing.JPanel();
        lblHapusKasir = new javax.swing.JLabel();
        tfHapusKasir = new javax.swing.JTextField();
        lblDelByUsername = new javax.swing.JLabel();
        btnHapusKasir = new javax.swing.JButton();
        pnlTabelKasir = new javax.swing.JScrollPane();
        tableKasir = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(170);
        jSplitPane1.setDividerSize(1);

        pnlSideBar.setBackground(new java.awt.Color(40, 55, 86));
        pnlSideBar.setPreferredSize(new java.awt.Dimension(170, 480));

        btnDashboard.setBackground(new java.awt.Color(40, 55, 86));
        btnDashboard.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnAturProduk.setBackground(new java.awt.Color(40, 55, 86));
        btnAturProduk.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnAturProduk.setForeground(new java.awt.Color(255, 255, 255));
        btnAturProduk.setText("Atur Produk");
        btnAturProduk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAturProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAturProdukActionPerformed(evt);
            }
        });

        btnAturKasir.setBackground(new java.awt.Color(40, 55, 86));
        btnAturKasir.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnAturKasir.setForeground(new java.awt.Color(255, 255, 255));
        btnAturKasir.setText("Atur Kasir");
        btnAturKasir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAturKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAturKasirActionPerformed(evt);
            }
        });

        lblAdmin.setBackground(new java.awt.Color(255, 255, 255));
        lblAdmin.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setText("Admin");

        btnLogout.setBackground(new java.awt.Color(40, 55, 86));
        btnLogout.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout-icon.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatar.png"))); // NOI18N

        javax.swing.GroupLayout pnlSideBarLayout = new javax.swing.GroupLayout(pnlSideBar);
        pnlSideBar.setLayout(pnlSideBarLayout);
        pnlSideBarLayout.setHorizontalGroup(
            pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarLayout.createSequentialGroup()
                .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideBarLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdmin)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarLayout.createSequentialGroup()
                                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(pnlSideBarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAturKasir)
                            .addComponent(btnAturProduk)
                            .addComponent(btnDashboard)
                            .addComponent(btnLogout))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlSideBarLayout.setVerticalGroup(
            pnlSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(avatar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnDashboard)
                .addGap(18, 18, 18)
                .addComponent(btnAturProduk)
                .addGap(18, 18, 18)
                .addComponent(btnAturKasir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(21, 21, 21))
        );

        jSplitPane1.setLeftComponent(pnlSideBar);

        pnlCards.setBackground(new java.awt.Color(204, 204, 204));
        pnlCards.setPreferredSize(new java.awt.Dimension(550, 480));
        pnlCards.setLayout(new java.awt.CardLayout());

        pnlDashboard.setBackground(new java.awt.Color(239, 239, 239));
        pnlDashboard.setPreferredSize(new java.awt.Dimension(550, 480));

        pnlHeaderDashboard.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeaderDashboard.setPreferredSize(new java.awt.Dimension(87, 42));

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dashboard");

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title.png"))); // NOI18N

        javax.swing.GroupLayout pnlHeaderDashboardLayout = new javax.swing.GroupLayout(pnlHeaderDashboard);
        pnlHeaderDashboard.setLayout(pnlHeaderDashboardLayout);
        pnlHeaderDashboardLayout.setHorizontalGroup(
            pnlHeaderDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderDashboardLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(logo2)
                .addGap(22, 22, 22))
        );
        pnlHeaderDashboardLayout.setVerticalGroup(
            pnlHeaderDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderDashboardLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlHeaderDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pnlTotalProduk.setBackground(new java.awt.Color(58, 79, 124));
        pnlTotalProduk.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total produk");

        lblTotalProduk.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalProduk.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotalProduk.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalProduk.setText("0");

        javax.swing.GroupLayout pnlTotalProdukLayout = new javax.swing.GroupLayout(pnlTotalProduk);
        pnlTotalProduk.setLayout(pnlTotalProdukLayout);
        pnlTotalProdukLayout.setHorizontalGroup(
            pnlTotalProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalProdukLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlTotalProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalProduk)
                    .addComponent(jLabel17))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pnlTotalProdukLayout.setVerticalGroup(
            pnlTotalProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalProdukLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalProduk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTotalKasir.setBackground(new java.awt.Color(58, 79, 124));
        pnlTotalKasir.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Total kasir");

        lblTotalKasir.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalKasir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotalKasir.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalKasir.setText("0");

        javax.swing.GroupLayout pnlTotalKasirLayout = new javax.swing.GroupLayout(pnlTotalKasir);
        pnlTotalKasir.setLayout(pnlTotalKasirLayout);
        pnlTotalKasirLayout.setHorizontalGroup(
            pnlTotalKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalKasirLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlTotalKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalKasir)
                    .addComponent(jLabel21))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        pnlTotalKasirLayout.setVerticalGroup(
            pnlTotalKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalKasirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalKasir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableProdukDashboard.setBackground(new java.awt.Color(255, 255, 255));
        tableProdukDashboard.setForeground(new java.awt.Color(0, 0, 0));
        tableProdukDashboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlTabelProdukDashboard.setViewportView(tableProdukDashboard);

        tableKasirDashboard.setBackground(new java.awt.Color(255, 255, 255));
        tableKasirDashboard.setForeground(new java.awt.Color(0, 0, 0));
        tableKasirDashboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        pnlTabelKasirDashboard.setViewportView(tableKasirDashboard);

        javax.swing.GroupLayout pnlDashboardLayout = new javax.swing.GroupLayout(pnlDashboard);
        pnlDashboard.setLayout(pnlDashboardLayout);
        pnlDashboardLayout.setHorizontalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeaderDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTotalProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTabelProdukDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTotalKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTabelKasirDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlDashboardLayout.setVerticalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addComponent(pnlHeaderDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTotalKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTotalProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTabelProdukDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(pnlTabelKasirDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlCards.add(pnlDashboard, "cardDashboard");

        pnlAturProduk.setBackground(new java.awt.Color(239, 239, 239));
        pnlAturProduk.setPreferredSize(new java.awt.Dimension(550, 480));

        pnlHeaderProduk.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Atur Produk");

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title.png"))); // NOI18N

        javax.swing.GroupLayout pnlHeaderProdukLayout = new javax.swing.GroupLayout(pnlHeaderProduk);
        pnlHeaderProduk.setLayout(pnlHeaderProdukLayout);
        pnlHeaderProdukLayout.setHorizontalGroup(
            pnlHeaderProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderProdukLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo1)
                .addGap(24, 24, 24))
        );
        pnlHeaderProdukLayout.setVerticalGroup(
            pnlHeaderProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderProdukLayout.createSequentialGroup()
                .addGroup(pnlHeaderProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderProdukLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(pnlHeaderProdukLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(logo1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTambahProduk.setBackground(new java.awt.Color(58, 79, 124));

        lblTambahProduk.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblTambahProduk.setForeground(new java.awt.Color(255, 255, 255));
        lblTambahProduk.setText("Tambah Produk");

        lblAddNama.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblAddNama.setForeground(new java.awt.Color(255, 255, 255));
        lblAddNama.setText("Nama Produk");

        tfIDProduk.setBackground(new java.awt.Color(255, 255, 255));
        tfIDProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfIDProduk.setForeground(new java.awt.Color(0, 0, 0));
        tfIDProduk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfIDProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDProdukActionPerformed(evt);
            }
        });

        lblAddID.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblAddID.setForeground(new java.awt.Color(255, 255, 255));
        lblAddID.setText("ID Produk");

        tfNamaProduk.setBackground(new java.awt.Color(255, 255, 255));
        tfNamaProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfNamaProduk.setForeground(new java.awt.Color(0, 0, 0));
        tfNamaProduk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfNamaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaProdukActionPerformed(evt);
            }
        });

        lblAddHarga.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblAddHarga.setForeground(new java.awt.Color(255, 255, 255));
        lblAddHarga.setText("Harga Produk");

        tfHargaProduk.setBackground(new java.awt.Color(255, 255, 255));
        tfHargaProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfHargaProduk.setForeground(new java.awt.Color(0, 0, 0));
        tfHargaProduk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfHargaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHargaProdukActionPerformed(evt);
            }
        });

        btnTambahProduk.setBackground(new java.awt.Color(255, 255, 255));
        btnTambahProduk.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTambahProduk.setForeground(new java.awt.Color(0, 0, 0));
        btnTambahProduk.setText("Tambah");
        btnTambahProduk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTambahProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahProdukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTambahProdukLayout = new javax.swing.GroupLayout(pnlTambahProduk);
        pnlTambahProduk.setLayout(pnlTambahProdukLayout);
        pnlTambahProdukLayout.setHorizontalGroup(
            pnlTambahProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTambahProdukLayout.createSequentialGroup()
                .addGroup(pnlTambahProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTambahProdukLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlTambahProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfIDProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddHarga)
                            .addComponent(lblAddNama)
                            .addComponent(lblAddID)))
                    .addGroup(pnlTambahProdukLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnTambahProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTambahProdukLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTambahProduk)
                .addGap(44, 44, 44))
        );
        pnlTambahProdukLayout.setVerticalGroup(
            pnlTambahProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTambahProdukLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTambahProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAddID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfIDProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTambahProduk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHapusProduk.setBackground(new java.awt.Color(58, 79, 124));

        lblHapusProduk.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblHapusProduk.setForeground(new java.awt.Color(255, 255, 255));
        lblHapusProduk.setText("Hapus Produk");

        tfHapusProduk.setBackground(new java.awt.Color(255, 255, 255));
        tfHapusProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfHapusProduk.setForeground(new java.awt.Color(0, 0, 0));
        tfHapusProduk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfHapusProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHapusProdukActionPerformed(evt);
            }
        });

        lblDelByID.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblDelByID.setForeground(new java.awt.Color(255, 255, 255));
        lblDelByID.setText("ID Produk");

        btnHapusProduk.setBackground(new java.awt.Color(255, 255, 255));
        btnHapusProduk.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnHapusProduk.setForeground(new java.awt.Color(0, 0, 0));
        btnHapusProduk.setText("Hapus");
        btnHapusProduk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHapusProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusProdukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHapusProdukLayout = new javax.swing.GroupLayout(pnlHapusProduk);
        pnlHapusProduk.setLayout(pnlHapusProdukLayout);
        pnlHapusProdukLayout.setHorizontalGroup(
            pnlHapusProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHapusProdukLayout.createSequentialGroup()
                .addGroup(pnlHapusProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHapusProdukLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlHapusProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfHapusProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDelByID)))
                    .addGroup(pnlHapusProdukLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnHapusProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHapusProdukLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblHapusProduk)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlHapusProdukLayout.setVerticalGroup(
            pnlHapusProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHapusProdukLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblHapusProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDelByID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHapusProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapusProduk)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tableProduk.setBackground(new java.awt.Color(255, 255, 255));
        tableProduk.setForeground(new java.awt.Color(0, 0, 0));
        tableProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlTabelProduk.setViewportView(tableProduk);

        javax.swing.GroupLayout pnlAturProdukLayout = new javax.swing.GroupLayout(pnlAturProduk);
        pnlAturProduk.setLayout(pnlAturProdukLayout);
        pnlAturProdukLayout.setHorizontalGroup(
            pnlAturProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAturProdukLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(pnlAturProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTambahProduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHapusProduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTabelProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addComponent(pnlHeaderProduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlAturProdukLayout.setVerticalGroup(
            pnlAturProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAturProdukLayout.createSequentialGroup()
                .addComponent(pnlHeaderProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlAturProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlAturProdukLayout.createSequentialGroup()
                        .addComponent(pnlTambahProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlHapusProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlTabelProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlCards.add(pnlAturProduk, "cardAturProduk");

        pnlAturKasir.setBackground(new java.awt.Color(239, 239, 239));
        pnlAturKasir.setPreferredSize(new java.awt.Dimension(550, 480));

        pnlHeaderKasir.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Atur Kasir");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title.png"))); // NOI18N

        javax.swing.GroupLayout pnlHeaderKasirLayout = new javax.swing.GroupLayout(pnlHeaderKasir);
        pnlHeaderKasir.setLayout(pnlHeaderKasirLayout);
        pnlHeaderKasirLayout.setHorizontalGroup(
            pnlHeaderKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderKasirLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(24, 24, 24))
        );
        pnlHeaderKasirLayout.setVerticalGroup(
            pnlHeaderKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderKasirLayout.createSequentialGroup()
                .addGroup(pnlHeaderKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderKasirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(pnlHeaderKasirLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTambahKasir.setBackground(new java.awt.Color(58, 79, 124));
        pnlTambahKasir.setPreferredSize(new java.awt.Dimension(195, 254));

        lblTambahKasir.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblTambahKasir.setForeground(new java.awt.Color(255, 255, 255));
        lblTambahKasir.setText("Tambah Kasir");

        lblAddUsername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblAddUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblAddUsername.setText("Username");

        tfUsername.setBackground(new java.awt.Color(255, 255, 255));
        tfUsername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(0, 0, 0));
        tfUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        lblAddPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblAddPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblAddPassword.setText("Password");

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(0, 0, 0));
        tfPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        btnTambahKasir.setBackground(new java.awt.Color(255, 255, 255));
        btnTambahKasir.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTambahKasir.setForeground(new java.awt.Color(0, 0, 0));
        btnTambahKasir.setText("Tambah");
        btnTambahKasir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTambahKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKasirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTambahKasirLayout = new javax.swing.GroupLayout(pnlTambahKasir);
        pnlTambahKasir.setLayout(pnlTambahKasirLayout);
        pnlTambahKasirLayout.setHorizontalGroup(
            pnlTambahKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTambahKasirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTambahKasir)
                .addGap(52, 52, 52))
            .addGroup(pnlTambahKasirLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlTambahKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddUsername)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddPassword)
                    .addGroup(pnlTambahKasirLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnTambahKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlTambahKasirLayout.setVerticalGroup(
            pnlTambahKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTambahKasirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTambahKasir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAddUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTambahKasir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHapusKasir.setBackground(new java.awt.Color(58, 79, 124));

        lblHapusKasir.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblHapusKasir.setForeground(new java.awt.Color(255, 255, 255));
        lblHapusKasir.setText("Hapus Kasir");

        tfHapusKasir.setBackground(new java.awt.Color(255, 255, 255));
        tfHapusKasir.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfHapusKasir.setForeground(new java.awt.Color(0, 0, 0));
        tfHapusKasir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfHapusKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHapusKasirActionPerformed(evt);
            }
        });

        lblDelByUsername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblDelByUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblDelByUsername.setText("Username");

        btnHapusKasir.setBackground(new java.awt.Color(255, 255, 255));
        btnHapusKasir.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnHapusKasir.setForeground(new java.awt.Color(0, 0, 0));
        btnHapusKasir.setText("Hapus");
        btnHapusKasir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHapusKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKasirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHapusKasirLayout = new javax.swing.GroupLayout(pnlHapusKasir);
        pnlHapusKasir.setLayout(pnlHapusKasirLayout);
        pnlHapusKasirLayout.setHorizontalGroup(
            pnlHapusKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHapusKasirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHapusKasir)
                .addGap(57, 57, 57))
            .addGroup(pnlHapusKasirLayout.createSequentialGroup()
                .addGroup(pnlHapusKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHapusKasirLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlHapusKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfHapusKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDelByUsername)))
                    .addGroup(pnlHapusKasirLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnHapusKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlHapusKasirLayout.setVerticalGroup(
            pnlHapusKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHapusKasirLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblHapusKasir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDelByUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHapusKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapusKasir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tableKasir.setBackground(new java.awt.Color(255, 255, 255));
        tableKasir.setForeground(new java.awt.Color(0, 0, 0));
        tableKasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        pnlTabelKasir.setViewportView(tableKasir);

        javax.swing.GroupLayout pnlAturKasirLayout = new javax.swing.GroupLayout(pnlAturKasir);
        pnlAturKasir.setLayout(pnlAturKasirLayout);
        pnlAturKasirLayout.setHorizontalGroup(
            pnlAturKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeaderKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAturKasirLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(pnlAturKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTambahKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHapusKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTabelKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        pnlAturKasirLayout.setVerticalGroup(
            pnlAturKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAturKasirLayout.createSequentialGroup()
                .addComponent(pnlHeaderKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlAturKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlAturKasirLayout.createSequentialGroup()
                        .addComponent(pnlTambahKasir, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlHapusKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlTabelKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlCards.add(pnlAturKasir, "cardAturKasir");

        jSplitPane1.setRightComponent(pnlCards);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public JLabel getLblTotalProduk() {
        return lblTotalProduk;
    }
    public JLabel getLblTotalKasir() {
        return lblTotalProduk;
    }
    public JTable getTableProduk(){
        return tableProduk;
    }
    public JTable getTableProdukDashboard(){
        return tableProdukDashboard;
    }
    public JTable getTableKasir(){
        return tableKasir;
    }
    public JTable getTableKasirDashboard(){
        return tableKasirDashboard;
    }
    
    public void loadData(){
        CashierSystem.loadProdukFromFile(tableProduk, tableProdukDashboard);
        CashierSystem.loadKasirFromFile(tableKasir, tableKasirDashboard);
        lblTotalProduk.setText(String.valueOf(CashierSystem.getProdukList().size()));
        lblTotalKasir.setText(String.valueOf(CashierSystem.getKasirList().size()));
    }
    public void updateTotalKasir() {
        lblTotalKasir.setText(String.valueOf(CashierSystem.getKasirList().size()));
    }
    
    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        cardLayout.show(pnlCards, "cardDashboard");
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnAturProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAturProdukActionPerformed
        cardLayout.show(pnlCards, "cardAturProduk");
    }//GEN-LAST:event_btnAturProdukActionPerformed

    private void btnAturKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAturKasirActionPerformed
        cardLayout.show(pnlCards, "cardAturKasir");
    }//GEN-LAST:event_btnAturKasirActionPerformed

    private void btnHapusProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusProdukActionPerformed
        Main.admin.hapusProduk(tableProduk, tableProdukDashboard, tfHapusProduk);
        tfHapusProduk.setText("");
    }//GEN-LAST:event_btnHapusProdukActionPerformed

    private void btnHapusKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKasirActionPerformed
        Main.admin.hapusKasir(tableKasir, tableKasirDashboard, tfHapusKasir);
        tfHapusKasir.setText("");
    }//GEN-LAST:event_btnHapusKasirActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Main.admin.logout();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void tfIDProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDProdukActionPerformed
        tfNamaProduk.requestFocus();
    }//GEN-LAST:event_tfIDProdukActionPerformed

    private void btnTambahProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahProdukActionPerformed
        Main.admin.tambahProduk(tableProduk, tableProdukDashboard, tfIDProduk, tfNamaProduk, tfHargaProduk);
        tfIDProduk.setText("");
        tfNamaProduk.setText("");
        tfHargaProduk.setText("");
    }//GEN-LAST:event_btnTambahProdukActionPerformed

    private void tfHapusProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHapusProdukActionPerformed
        btnHapusProduk.doClick();
    }//GEN-LAST:event_tfHapusProdukActionPerformed

    private void btnTambahKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKasirActionPerformed
        Main.admin.tambahKasir(tableKasir, tableKasirDashboard, tfUsername, tfPassword);
        tfUsername.setText("");
        tfPassword.setText("");
    }//GEN-LAST:event_btnTambahKasirActionPerformed

    private void tfNamaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaProdukActionPerformed
        tfHargaProduk.requestFocus();
    }//GEN-LAST:event_tfNamaProdukActionPerformed

    private void tfHargaProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHargaProdukActionPerformed
        btnTambahProduk.doClick();
    }//GEN-LAST:event_tfHargaProdukActionPerformed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        tfPassword.requestFocus();
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        btnTambahKasir.doClick();
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfHapusKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHapusKasirActionPerformed
        btnHapusKasir.doClick();
    }//GEN-LAST:event_tfHapusKasirActionPerformed
                        
    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(() -> {
//            new AdminPage().setVisible(true);
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.JButton btnAturKasir;
    private javax.swing.JButton btnAturProduk;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnHapusKasir;
    private javax.swing.JButton btnHapusProduk;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambahKasir;
    private javax.swing.JButton btnTambahProduk;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblAddHarga;
    private javax.swing.JLabel lblAddID;
    private javax.swing.JLabel lblAddNama;
    private javax.swing.JLabel lblAddPassword;
    private javax.swing.JLabel lblAddUsername;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblDelByID;
    private javax.swing.JLabel lblDelByUsername;
    private javax.swing.JLabel lblHapusKasir;
    private javax.swing.JLabel lblHapusProduk;
    private javax.swing.JLabel lblTambahKasir;
    private javax.swing.JLabel lblTambahProduk;
    private javax.swing.JLabel lblTotalKasir;
    private javax.swing.JLabel lblTotalProduk;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JPanel pnlAturKasir;
    private javax.swing.JPanel pnlAturProduk;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlHapusKasir;
    private javax.swing.JPanel pnlHapusProduk;
    private javax.swing.JPanel pnlHeaderDashboard;
    private javax.swing.JPanel pnlHeaderKasir;
    private javax.swing.JPanel pnlHeaderProduk;
    private javax.swing.JPanel pnlSideBar;
    private javax.swing.JScrollPane pnlTabelKasir;
    private javax.swing.JScrollPane pnlTabelKasirDashboard;
    private javax.swing.JScrollPane pnlTabelProduk;
    private javax.swing.JScrollPane pnlTabelProdukDashboard;
    private javax.swing.JPanel pnlTambahKasir;
    private javax.swing.JPanel pnlTambahProduk;
    private javax.swing.JPanel pnlTotalKasir;
    private javax.swing.JPanel pnlTotalProduk;
    private javax.swing.JTable tableKasir;
    private javax.swing.JTable tableKasirDashboard;
    private javax.swing.JTable tableProduk;
    private javax.swing.JTable tableProdukDashboard;
    private javax.swing.JTextField tfHapusKasir;
    private javax.swing.JTextField tfHapusProduk;
    private javax.swing.JTextField tfHargaProduk;
    private javax.swing.JTextField tfIDProduk;
    private javax.swing.JTextField tfNamaProduk;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
