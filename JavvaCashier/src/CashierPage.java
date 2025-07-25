import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CashierPage extends javax.swing.JFrame {

    public CashierPage() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBg = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        panelKiri = new javax.swing.JPanel();
        lblTambahProduk = new javax.swing.JLabel();
        lblInputProduk = new javax.swing.JLabel();
        tfInputProduk = new javax.swing.JTextField();
        lblInputQty = new javax.swing.JLabel();
        tfInputQty = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        panelKanan = new javax.swing.JPanel();
        jScrollPaneTabel = new javax.swing.JScrollPane();
        tabelKeranjang = new javax.swing.JTable();
        panelTotal = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        panelPembayaran = new javax.swing.JPanel();
        lblPembayaran = new javax.swing.JLabel();
        lblInputMetode = new javax.swing.JLabel();
        cbInputMetode = new javax.swing.JComboBox<>();
        lblInputJumlah = new javax.swing.JLabel();
        tfInputJumlah = new javax.swing.JTextField();
        btnKonfirmasi = new javax.swing.JButton();
        btnBatalkan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelBg.setBackground(new java.awt.Color(239, 239, 239));

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));
        panelHeader.setForeground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N

        lblUser.setBackground(new java.awt.Color(255, 255, 255));
        lblUser.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("User");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(119, 119, 119)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(13, 13, 13))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))))
        );

        panelKiri.setBackground(new java.awt.Color(56, 76, 120));
        panelKiri.setPreferredSize(new java.awt.Dimension(215, 385));

        lblTambahProduk.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lblTambahProduk.setForeground(new java.awt.Color(255, 255, 255));
        lblTambahProduk.setText("Tambah Produk");

        lblInputProduk.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblInputProduk.setForeground(new java.awt.Color(255, 255, 255));
        lblInputProduk.setText("ID produk / Nama produk");

        tfInputProduk.setBackground(new java.awt.Color(255, 255, 255));
        tfInputProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfInputProduk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfInputProduk.setPreferredSize(new java.awt.Dimension(64, 24));
        tfInputProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInputProdukActionPerformed(evt);
            }
        });

        lblInputQty.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblInputQty.setForeground(new java.awt.Color(255, 255, 255));
        lblInputQty.setText("QTY");

        tfInputQty.setBackground(new java.awt.Color(255, 255, 255));
        tfInputQty.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfInputQty.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfInputQty.setPreferredSize(new java.awt.Dimension(64, 24));
        tfInputQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInputQtyActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(255, 255, 255));
        btnTambah.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(0, 0, 0));
        btnTambah.setText("Tambah");
        btnTambah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(56, 76, 120));
        btnLogout.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout-icon.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKiriLayout = new javax.swing.GroupLayout(panelKiri);
        panelKiri.setLayout(panelKiriLayout);
        panelKiriLayout.setHorizontalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKiriLayout.createSequentialGroup()
                .addGroup(panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKiriLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblTambahProduk))
                    .addGroup(panelKiriLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInputProduk)
                            .addComponent(tfInputProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInputQty)
                            .addComponent(tfInputQty, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKiriLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        panelKiriLayout.setVerticalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKiriLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTambahProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInputProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfInputProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInputQty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfInputQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(15, 15, 15))
        );

        panelKanan.setBackground(new java.awt.Color(255, 255, 255));
        panelKanan.setPreferredSize(new java.awt.Dimension(444, 385));

        jScrollPaneTabel.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneTabel.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPaneTabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        tabelKeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID produk", "Nama produk", "Harga satuan", "Qty", "Subtotal"
            }
        ));
        jScrollPaneTabel.setViewportView(tabelKeranjang);

        panelTotal.setBackground(new java.awt.Color(56, 76, 120));
        panelTotal.setPreferredSize(new java.awt.Dimension(250, 33));

        lblTotal.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total");

        tfTotal.setEditable(false);
        tfTotal.setBackground(new java.awt.Color(255, 255, 255));
        tfTotal.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfTotal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfTotal.setPreferredSize(new java.awt.Dimension(64, 24));

        javax.swing.GroupLayout panelTotalLayout = new javax.swing.GroupLayout(panelTotal);
        panelTotal.setLayout(panelTotalLayout);
        panelTotalLayout.setHorizontalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        panelTotalLayout.setVerticalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panelPembayaran.setBackground(new java.awt.Color(56, 76, 120));
        panelPembayaran.setPreferredSize(new java.awt.Dimension(250, 80));

        lblPembayaran.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lblPembayaran.setForeground(new java.awt.Color(255, 255, 255));
        lblPembayaran.setText("Pembayaran");

        lblInputMetode.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblInputMetode.setForeground(new java.awt.Color(255, 255, 255));
        lblInputMetode.setText("Metode");

        cbInputMetode.setBackground(new java.awt.Color(255, 255, 255));
        cbInputMetode.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbInputMetode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cashless" }));
        cbInputMetode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        cbInputMetode.setPreferredSize(new java.awt.Dimension(72, 24));
        cbInputMetode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInputMetodeActionPerformed(evt);
            }
        });

        lblInputJumlah.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblInputJumlah.setForeground(new java.awt.Color(255, 255, 255));
        lblInputJumlah.setText("Jumlah");

        tfInputJumlah.setBackground(new java.awt.Color(255, 255, 255));
        tfInputJumlah.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tfInputJumlah.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        tfInputJumlah.setPreferredSize(new java.awt.Dimension(64, 24));
        tfInputJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInputJumlahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPembayaranLayout = new javax.swing.GroupLayout(panelPembayaran);
        panelPembayaran.setLayout(panelPembayaranLayout);
        panelPembayaranLayout.setHorizontalGroup(
            panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addComponent(lblInputMetode, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPembayaran)
                            .addComponent(cbInputMetode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addComponent(lblInputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfInputJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelPembayaranLayout.setVerticalGroup(
            panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPembayaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInputMetode)
                    .addComponent(cbInputMetode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfInputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInputJumlah))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnKonfirmasi.setBackground(new java.awt.Color(255, 255, 255));
        btnKonfirmasi.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnKonfirmasi.setForeground(new java.awt.Color(0, 0, 0));
        btnKonfirmasi.setText("Konfirmasi transaksi");
        btnKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonfirmasiActionPerformed(evt);
            }
        });

        btnBatalkan.setBackground(new java.awt.Color(255, 255, 255));
        btnBatalkan.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBatalkan.setForeground(new java.awt.Color(0, 0, 0));
        btnBatalkan.setText("Batalkan transaksi");
        btnBatalkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKananLayout = new javax.swing.GroupLayout(panelKanan);
        panelKanan.setLayout(panelKananLayout);
        panelKananLayout.setHorizontalGroup(
            panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKananLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addGroup(panelKananLayout.createSequentialGroup()
                        .addGroup(panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBatalkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKonfirmasi, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelKananLayout.setVerticalGroup(
            panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKananLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKananLayout.createSequentialGroup()
                        .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(panelPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(panelKananLayout.createSequentialGroup()
                        .addComponent(btnKonfirmasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBatalkan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelKanan, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addComponent(panelKiri, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getLblUser() {
        return lblUser;
    }
    public JTextField getTfTotal(){
        return tfTotal;
    }
    
    private void btnKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonfirmasiActionPerformed
        Main.kasir.lakukanTransaksi(cbInputMetode, tfInputJumlah);
        DefaultTableModel model = (DefaultTableModel) tabelKeranjang.getModel();
        model.setRowCount(0);
        tfTotal.setText("");
        tfInputJumlah.setText("");
    }//GEN-LAST:event_btnKonfirmasiActionPerformed

    private void btnBatalkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalkanActionPerformed
        Main.kasir.batalkanTransaksi();
        DefaultTableModel model = (DefaultTableModel) tabelKeranjang.getModel();
        model.setRowCount(0);
        tfTotal.setText("");
        tfInputJumlah.setText("");       
    }//GEN-LAST:event_btnBatalkanActionPerformed

    private void cbInputMetodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInputMetodeActionPerformed
        String metode = (String) cbInputMetode.getSelectedItem();
        if (metode.equalsIgnoreCase("Cashless")) {
            tfInputJumlah.setText(String.format("%.2f", Keranjang.getTotal()));
            tfInputJumlah.setEditable(false);
        } else {
            tfInputJumlah.setText("");
            tfInputJumlah.setEditable(true);
        }
    }//GEN-LAST:event_cbInputMetodeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnBatalkan.doClick();
        Main.kasir.logout();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void tfInputProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInputProdukActionPerformed
        tfInputQty.requestFocus();
    }//GEN-LAST:event_tfInputProdukActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        Main.kasir.tambahProdukKeKeranjang(tfInputProduk, tfInputQty, tabelKeranjang);
        tfInputProduk.setText("");
        tfInputQty.setText("");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tfInputJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInputJumlahActionPerformed
        btnKonfirmasi.doClick();
    }//GEN-LAST:event_tfInputJumlahActionPerformed

    private void tfInputQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInputQtyActionPerformed
        btnTambah.doClick();
        tfInputProduk.requestFocus();
    }//GEN-LAST:event_tfInputQtyActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CashierPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatalkan;
    private javax.swing.JButton btnKonfirmasi;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbInputMetode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPaneTabel;
    private javax.swing.JLabel lblInputJumlah;
    private javax.swing.JLabel lblInputMetode;
    private javax.swing.JLabel lblInputProduk;
    private javax.swing.JLabel lblInputQty;
    private javax.swing.JLabel lblPembayaran;
    private javax.swing.JLabel lblTambahProduk;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelKanan;
    private javax.swing.JPanel panelKiri;
    private javax.swing.JPanel panelPembayaran;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JTable tabelKeranjang;
    private javax.swing.JTextField tfInputJumlah;
    private javax.swing.JTextField tfInputProduk;
    private javax.swing.JTextField tfInputQty;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
