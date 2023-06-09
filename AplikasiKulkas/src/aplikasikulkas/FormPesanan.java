
package aplikasikulkas;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FormPesanan extends javax.swing.JFrame {

    private PreparedStatement cmd;
    private ResultSet result;
    private Kulkas kulkas;
    private Pesanan pesanan;
    private boolean struk = false;

    public Kulkas getKulkas() {
        return kulkas;
    }

    public void setKulkas(Kulkas kulkas) {
        this.kulkas = kulkas;
    }

    public Pesanan getPesanan() {
        return pesanan;
    }

    public void setPesanan(Pesanan pesanan) {
        this.pesanan = pesanan;
    }

    
    public FormPesanan() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblHalaman = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblGambar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblNama = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        lblTipeMerk = new javax.swing.JLabel();
        lblDeskripsi = new javax.swing.JTextArea();
        lblDimensi = new javax.swing.JLabel();
        lblKapasitas = new javax.swing.JLabel();
        lblStok = new javax.swing.JLabel();
        spinJumlah = new javax.swing.JSpinner();
        lblKapasitas1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMetode = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        spinTgl = new javax.swing.JSpinner();
        lblStatus = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 244, 246));

        jPanel2.setBackground(new java.awt.Color(144, 125, 255));

        lblHalaman.setBackground(java.awt.Color.white);
        lblHalaman.setFont(new java.awt.Font("Proxima Nova Rg", 1, 12)); // NOI18N
        lblHalaman.setForeground(java.awt.Color.white);
        lblHalaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHalaman.setText("Formulir Pesanan");
        lblHalaman.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHalaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHalaman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(243, 244, 246));

        lblGambar.setBackground(new java.awt.Color(255, 255, 255));
        lblGambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(243, 244, 246));

        lblNama.setFont(new java.awt.Font("Proxima Nova Rg", 1, 18)); // NOI18N
        lblNama.setText("Kulkas Ala Freezer (Silver)");

        lblHarga.setFont(new java.awt.Font("Proxima Nova Rg", 1, 15)); // NOI18N
        lblHarga.setText("Rp 1889000");

        lblTipeMerk.setFont(new java.awt.Font("Proxima Nova Rg", 0, 13)); // NOI18N
        lblTipeMerk.setText("Kulkas 2 Pintu | LG");

        lblDeskripsi.setBackground(new java.awt.Color(243, 244, 246));
        lblDeskripsi.setColumns(20);
        lblDeskripsi.setFont(new java.awt.Font("Proxima Nova Rg", 0, 13)); // NOI18N
        lblDeskripsi.setRows(5);
        lblDeskripsi.setBorder(null);

        lblDimensi.setFont(new java.awt.Font("Proxima Nova Rg", 0, 13)); // NOI18N
        lblDimensi.setText("Dimensi 100 x 50 x 300 cm");

        lblKapasitas.setFont(new java.awt.Font("Proxima Nova Rg", 0, 13)); // NOI18N
        lblKapasitas.setText("Kapasitas 500 L");

        lblStok.setFont(new java.awt.Font("Proxima Nova Rg", 0, 13)); // NOI18N
        lblStok.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStok.setText("Stok saat ini: 12");
        lblStok.setToolTipText("");

        spinJumlah.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N
        spinJumlah.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spinJumlah.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinJumlahStateChanged(evt);
            }
        });

        lblKapasitas1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 13)); // NOI18N
        lblKapasitas1.setText("Jumlah dibeli:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTipeMerk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDeskripsi)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDimensi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblKapasitas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStok, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblKapasitas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipeMerk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDimensi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKapasitas)
                    .addComponent(lblStok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKapasitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(243, 244, 246));

        jLabel3.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N
        jLabel3.setText("Nama Penerima");

        txtUsername.setBackground(new java.awt.Color(229, 225, 242));
        txtUsername.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N
        jLabel5.setText("Alamat");

        jLabel2.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N
        jLabel2.setText("Username Pembeli");

        txtAlamat.setBackground(new java.awt.Color(229, 225, 242));
        txtAlamat.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N

        txtNama.setBackground(new java.awt.Color(229, 225, 242));
        txtNama.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N
        jLabel7.setText("Total Pembayaran (Rp)");

        jLabel8.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N
        jLabel8.setText("Metode Pembayaran");

        txtMetode.setBackground(new java.awt.Color(229, 225, 242));
        txtMetode.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N

        txtTotal.setBackground(new java.awt.Color(229, 225, 242));
        txtTotal.setFont(new java.awt.Font("Proxima Nova Rg", 1, 12)); // NOI18N

        btnSimpan.setBackground(new java.awt.Color(144, 125, 255));
        btnSimpan.setFont(new java.awt.Font("Proxima Nova Rg", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Pesan Sekarang");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N
        jLabel9.setText("Tanggal Pesan");

        spinTgl.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N
        spinTgl.setModel(new javax.swing.SpinnerDateModel());
        spinTgl.setEditor(new javax.swing.JSpinner.DateEditor(spinTgl, "yyyy-MM-dd"));

        lblStatus.setFont(new java.awt.Font("Proxima Nova Rg", 1, 12)); // NOI18N
        lblStatus.setText(" ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMetode, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMetode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Proxima Nova Rg", 1, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Formulir Kulkas");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addGap(185, 185, 185)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void showKulkas() {
        Image gambar = Main.byteToImg(this.getKulkas().getGambar());
        lblGambar.setIcon(new ImageIcon(gambar));

        
        lblNama.setText(this.getKulkas().getNama() + " (" + this.getKulkas().getWarna() + ")");
        lblHarga.setText("Rp " + this.getKulkas().getHarga());
        lblTipeMerk.setText(this.getKulkas().getTipe() + " | " + this.getKulkas().getMerk());
        lblDimensi.setText(
            "Dimensi " + this.getKulkas().getPanjang() + " X " +
                        this.getKulkas().getTinggi() + " X " +
                        this.getKulkas().getLebar() + " cm"
        );
        lblKapasitas.setText("Kapasitas " + this.getKulkas().getKapasitas() + " L");
        lblStok.setText("Stok saat ini: " + this.getKulkas().getStok());
        lblDeskripsi.setText(this.getKulkas().getDeskripsi());
        lblDeskripsi.setEditable(false);
    }
    
    private void loadAkun() {
        try {
            
            String username;
            username = Main.username == "admin" ? this.getPesanan().getUsername().getUsername() : Main.username;
            
            cmd = Main.db.getConn().prepareStatement(
                "SELECT * FROM customer " +
                "WHERE username='" + username + "'"
            );
            result = cmd.executeQuery();
            
            while (result.next()) {
                txtUsername.setText(result.getString("username"));
                txtNama.setText(result.getString("nama_lengkap"));
                txtAlamat.setText(result.getString("alamat"));
            }
            
        } catch (Exception e) {
            Main.db.exceptionMsg(e);
        }
    }
    
    private boolean isCompleted() {
        
        if (
            txtNama.getText().isBlank() ||
            txtAlamat.getText().isBlank()
        ) {
            return false;
        }
        
        return true;
    }
    
    private void hitungTotal() {
        int jumlah, total;
        jumlah = Integer.parseInt(spinJumlah.getValue().toString());
        total = jumlah * this.getKulkas().getHarga();
        txtTotal.setText(Integer.toString(total));
    }
    
    private String createID() {
        String id, tgl;
        tgl = new SimpleDateFormat("yyyy-MM-dd").format(spinTgl.getValue());
        id = "HF" + new SimpleDateFormat("yyMMdd").format(spinTgl.getValue());

        try {
            cmd = Main.db.getConn().prepareStatement(
                "SELECT id FROM pesanan " +
                "WHERE tgl_pesanan='" + tgl + "'"
            );
            result = cmd.executeQuery();
            int n = 0;
            while (result.next()) {
                n += 1; 
            }

            id += Integer.toString(n+1);

        } catch (Exception e) {
            Main.db.exceptionMsg(e);
        }

        return id;
    }


    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        if (struk) {
            try {
                cmd = Main.db.getConn().prepareStatement(
                    "UPDATE pesanan SET status='Telah Dikirim' "+
                    "WHERE id='" + this.getPesanan().getId() + "'"
                );
                cmd.executeUpdate();
                
            } catch(Exception e) {
                Main.db.exceptionMsg(e);
            }
            
            JOptionPane.showMessageDialog(
                null,
                "Pesanan berhasil dikirimkan!",
                "Informasi",
                JOptionPane.INFORMATION_MESSAGE
            );
            
            this.dispose();
            
            return;
        }
        
        // jika isi kosong
        if (!isCompleted()) {
            JOptionPane.showMessageDialog(
                null,
                "Harap tidak mengosongkan formulir!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        
        String id, tgl;
        id = createID();
        tgl = new SimpleDateFormat("yyyy-MM-dd").format(spinTgl.getValue());
        
        try {
            
            cmd = Main.db.getConn().prepareStatement(
                "INSERT INTO pesanan VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            cmd.setString(1, id);
            cmd.setString(2, tgl);
            cmd.setString(3, spinJumlah.getValue().toString());
            cmd.setString(4, txtTotal.getText());
            cmd.setString(5, txtNama.getText());
            cmd.setString(6, txtAlamat.getText());            
            cmd.setString(7, "Sedang Dikemas");
            cmd.setInt(8, this.getKulkas().getId());
            cmd.setString(9, Main.username);
            cmd.executeUpdate();
            
            int sisaStok = this.getKulkas().getStok() - Integer.parseInt(spinJumlah.getValue().toString());
            cmd = Main.db.getConn().prepareStatement(
                "UPDATE kulkas SET stok='" + Integer.toString(sisaStok) + "' " +
                "WHERE id='" + this.getKulkas().getId() + "'"
            );
            cmd.executeUpdate();
            
            JOptionPane.showMessageDialog(
                null, 
                "Pesanan berhasil dibuat!", 
                "Informasi", 
                JOptionPane.INFORMATION_MESSAGE
            );
            this.dispose();
            new Produk().setVisible(true);
            
        } catch (Exception e) {
            Main.db.exceptionMsg(e);
        }
        

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        struk = this.getPesanan() != null ? true : false;
        
        showKulkas();
        spinTgl.setEnabled(false);
        txtUsername.setEditable(false);
        txtMetode.setEditable(false);
        txtTotal.setEditable(false);
        
        txtMetode.setText("COD (Bayar Di Tempat)");
        
        hitungTotal();
        loadAkun();
        
        // mode struk pesanan
        if (struk) {
            txtNama.setEditable(false);
            txtAlamat.setEditable(false);
            spinJumlah.setEnabled(false);
            spinJumlah.setValue(this.getPesanan().getJumlah());
            lblStatus.setText(this.getPesanan().getStatus());

            lblStok.setVisible(false);
            lblHalaman.setText("Pesanan " + this.getPesanan().getId());
            
            if (lblStatus.getText().equals("Sedang Dikemas") && Main.username.equals("admin")) {
                btnSimpan.setVisible(true);
                btnSimpan.setText("Kirim Pesanan");
            } else {
                btnSimpan.setVisible(false);
            }
            
        } else {
            txtNama.setEditable(true);
            txtAlamat.setEditable(true);
            spinJumlah.setEnabled(true);
            btnSimpan.setVisible(true);
            lblHalaman.setText("Formulir Pesanan");

        }
    }//GEN-LAST:event_formWindowOpened

    private void spinJumlahStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinJumlahStateChanged
        hitungTotal();
    }//GEN-LAST:event_spinJumlahStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextArea lblDeskripsi;
    private javax.swing.JLabel lblDimensi;
    private javax.swing.JLabel lblGambar;
    private javax.swing.JLabel lblHalaman;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblKapasitas;
    private javax.swing.JLabel lblKapasitas1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStok;
    private javax.swing.JLabel lblTipeMerk;
    private javax.swing.JSpinner spinJumlah;
    private javax.swing.JSpinner spinTgl;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtMetode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
