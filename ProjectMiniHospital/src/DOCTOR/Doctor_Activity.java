/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOCTOR;

import DB.Connector;
import MAIN.Main_Menu;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author surap
 */
public class Doctor_Activity extends javax.swing.JFrame {

    String sql;
    static Statement st;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection connection = null;
    public String sendName;
    String findName;

    /**
     * Creates new form Doctor_Activity
     */
    public Doctor_Activity(String pName) {
        initComponents();
        findName = pName;
        Ubah_Password.setVisible(false);
        ListJanji.setVisible(false);
        loadtable();


        TextPrompt cari = new TextPrompt("Siliahkan Cari Data", txtcari);
tblJanji.getTableHeader().setDefaultRenderer(new HeaderColor());
    }

    public Doctor_Activity() {
        initComponents();
        Ubah_Password.setVisible(false);

    }
    String active = "dashboard";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Sidebar = new javax.swing.JPanel();
        panel_halaman_utama = new javax.swing.JPanel();
        label_halaman_utama = new javax.swing.JLabel();
        panel_ubah_password = new javax.swing.JPanel();
        label_ubahpassword = new javax.swing.JLabel();
        panel_list_janji = new javax.swing.JPanel();
        label_listjanji = new javax.swing.JLabel();
        Mainbar = new javax.swing.JPanel();
        Halaman_Utama = new javax.swing.JPanel();
        LihatJanji = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ubah_Password = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtoldpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtnewpass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtconfirmpass = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnubah = new javax.swing.JButton();
        ListJanji = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJanji = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        Main.setBackground(new java.awt.Color(177, 205, 166));
        Main.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MainMouseMoved(evt);
            }
        });
        Main.setLayout(null);

        Sidebar.setBackground(new java.awt.Color(101, 145, 106));
        Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_halaman_utama.setBackground(new java.awt.Color(113, 165, 93));
        panel_halaman_utama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_halaman_utamaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_halaman_utamaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_halaman_utamaMousePressed(evt);
            }
        });

        label_halaman_utama.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        label_halaman_utama.setForeground(new java.awt.Color(255, 255, 255));
        label_halaman_utama.setText("Halama Utama");

        javax.swing.GroupLayout panel_halaman_utamaLayout = new javax.swing.GroupLayout(panel_halaman_utama);
        panel_halaman_utama.setLayout(panel_halaman_utamaLayout);
        panel_halaman_utamaLayout.setHorizontalGroup(
            panel_halaman_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_halaman_utamaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(label_halaman_utama)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panel_halaman_utamaLayout.setVerticalGroup(
            panel_halaman_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_halaman_utama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Sidebar.add(panel_halaman_utama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 50));

        panel_ubah_password.setBackground(new java.awt.Color(101, 145, 106));
        panel_ubah_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_ubah_passwordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_ubah_passwordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_ubah_passwordMousePressed(evt);
            }
        });

        label_ubahpassword.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        label_ubahpassword.setForeground(new java.awt.Color(204, 255, 204));
        label_ubahpassword.setText("Ubah Password");

        javax.swing.GroupLayout panel_ubah_passwordLayout = new javax.swing.GroupLayout(panel_ubah_password);
        panel_ubah_password.setLayout(panel_ubah_passwordLayout);
        panel_ubah_passwordLayout.setHorizontalGroup(
            panel_ubah_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ubah_passwordLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(label_ubahpassword)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panel_ubah_passwordLayout.setVerticalGroup(
            panel_ubah_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ubah_passwordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_ubahpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Sidebar.add(panel_ubah_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 290, 50));

        panel_list_janji.setBackground(new java.awt.Color(101, 145, 106));
        panel_list_janji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_list_janjiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_list_janjiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_list_janjiMousePressed(evt);
            }
        });

        label_listjanji.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        label_listjanji.setForeground(new java.awt.Color(204, 255, 204));
        label_listjanji.setText("List Janji");

        javax.swing.GroupLayout panel_list_janjiLayout = new javax.swing.GroupLayout(panel_list_janji);
        panel_list_janji.setLayout(panel_list_janjiLayout);
        panel_list_janjiLayout.setHorizontalGroup(
            panel_list_janjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_list_janjiLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(label_listjanji)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        panel_list_janjiLayout.setVerticalGroup(
            panel_list_janjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_list_janjiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_listjanji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Sidebar.add(panel_list_janji, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 290, 50));

        Main.add(Sidebar);
        Sidebar.setBounds(0, 0, 290, 770);

        Mainbar.setBackground(new java.awt.Color(102, 102, 102));
        Mainbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Halaman_Utama.setBackground(new java.awt.Color(246, 255, 233));

        LihatJanji.setBackground(new java.awt.Color(101, 145, 106));
        LihatJanji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LihatJanjiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LihatJanjiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LihatJanjiMouseExited(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/planner_80px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lihat Janji");

        javax.swing.GroupLayout LihatJanjiLayout = new javax.swing.GroupLayout(LihatJanji);
        LihatJanji.setLayout(LihatJanjiLayout);
        LihatJanjiLayout.setHorizontalGroup(
            LihatJanjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LihatJanjiLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LihatJanjiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(55, 55, 55))
        );
        LihatJanjiLayout.setVerticalGroup(
            LihatJanjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LihatJanjiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Halaman_UtamaLayout = new javax.swing.GroupLayout(Halaman_Utama);
        Halaman_Utama.setLayout(Halaman_UtamaLayout);
        Halaman_UtamaLayout.setHorizontalGroup(
            Halaman_UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Halaman_UtamaLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(LihatJanji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(915, 915, 915))
        );
        Halaman_UtamaLayout.setVerticalGroup(
            Halaman_UtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Halaman_UtamaLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(LihatJanji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );

        Mainbar.add(Halaman_Utama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 730));

        Ubah_Password.setBackground(new java.awt.Color(246, 255, 233));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 165, 93));
        jLabel2.setText("Old Password");

        txtoldpass.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(113, 165, 93));
        jLabel6.setText("New Password");

        txtnewpass.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(113, 165, 93));
        jLabel7.setText("Confirm Password");

        txtconfirmpass.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jCheckBox1.setFont(new java.awt.Font("COCOMAT", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnubah.setBackground(new java.awt.Color(113, 165, 93));
        btnubah.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        btnubah.setForeground(new java.awt.Color(51, 51, 51));
        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ubah_PasswordLayout = new javax.swing.GroupLayout(Ubah_Password);
        Ubah_Password.setLayout(Ubah_PasswordLayout);
        Ubah_PasswordLayout.setHorizontalGroup(
            Ubah_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ubah_PasswordLayout.createSequentialGroup()
                .addGroup(Ubah_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Ubah_PasswordLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))
                    .addGroup(Ubah_PasswordLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(Ubah_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Ubah_PasswordLayout.createSequentialGroup()
                                .addGroup(Ubah_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(118, 118, 118)
                                .addGroup(Ubah_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Ubah_PasswordLayout.createSequentialGroup()
                                        .addComponent(txtoldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtnewpass)))
                            .addGroup(Ubah_PasswordLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(513, 513, 513))
            .addGroup(Ubah_PasswordLayout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(btnubah)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Ubah_PasswordLayout.setVerticalGroup(
            Ubah_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ubah_PasswordLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(Ubah_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtoldpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(Ubah_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(Ubah_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnubah)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        Mainbar.add(Ubah_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 730));

        ListJanji.setBackground(new java.awt.Color(246, 255, 233));

        tblJanji.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblJanji.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "pName", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJanji.setEnabled(false);
        tblJanji.setRowHeight(25);
        tblJanji.getTableHeader().setResizingAllowed(false);
        tblJanji.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblJanji);

        txtcari.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcariMouseClicked(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout ListJanjiLayout = new javax.swing.GroupLayout(ListJanji);
        ListJanji.setLayout(ListJanjiLayout);
        ListJanjiLayout.setHorizontalGroup(
            ListJanjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
            .addGroup(ListJanjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ListJanjiLayout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(141, Short.MAX_VALUE)))
            .addGroup(ListJanjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ListJanjiLayout.createSequentialGroup()
                    .addGap(467, 467, 467)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(467, Short.MAX_VALUE)))
        );
        ListJanjiLayout.setVerticalGroup(
            ListJanjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(ListJanjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ListJanjiLayout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGap(126, 126, 126)))
            .addGroup(ListJanjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ListJanjiLayout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(626, Short.MAX_VALUE)))
        );

        Mainbar.add(ListJanji, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 730));

        Main.add(Mainbar);
        Mainbar.setBounds(290, 80, 1260, 690);

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELAMAT DATANG");
        Main.add(jLabel1);
        jLabel1.setBounds(310, 20, 260, 30);

        lblUser.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("USER");
        Main.add(lblUser);
        lblUser.setBounds(550, 20, 100, 30);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 45, 45));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/exit_26px.png"))); // NOI18N
        jLabel11.setText(" KELUAR");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        Main.add(jLabel11);
        jLabel11.setBounds(1380, 20, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, 1550, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static public class HeaderColor extends DefaultTableCellRenderer{
        public HeaderColor(){
                setOpaque(true);
    }public Component getTableCellRendererComponent(JTable tblJanji, Object value, boolean selected, boolean focused, int row, int column){
        super.getTableCellRendererComponent(tblJanji,value,selected,focused,row,column);
                setBackground(new java.awt.Color(204, 255, 204));
                return this;
    }
    }
    private void panel_halaman_utamaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_halaman_utamaMouseEntered
    }//GEN-LAST:event_panel_halaman_utamaMouseEntered

    private void panel_halaman_utamaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_halaman_utamaMouseExited
    }//GEN-LAST:event_panel_halaman_utamaMouseExited

    private void panel_halaman_utamaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_halaman_utamaMousePressed
        active = "dashboard";
        Halaman_Utama.setVisible(true);
        panel_halaman_utama.setBackground(new Color(113, 165, 93));
        label_halaman_utama.setForeground(new Color(255, 255, 255));
        panel_ubah_password.setBackground(new Color(101, 145, 106));
        label_ubahpassword.setForeground(new Color(204, 255, 204));
        panel_list_janji.setBackground(new Color(101, 145, 106));
        label_listjanji.setForeground(new Color(204, 255, 204));

        try {
            Mainbar.removeAll();
            Mainbar.repaint();
            Mainbar.revalidate();

            Mainbar.add(Halaman_Utama);
            Mainbar.repaint();
            Mainbar.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_panel_halaman_utamaMousePressed

    private void panel_ubah_passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ubah_passwordMouseEntered
    }//GEN-LAST:event_panel_ubah_passwordMouseEntered

    private void panel_ubah_passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ubah_passwordMouseExited
    }//GEN-LAST:event_panel_ubah_passwordMouseExited

    private void panel_ubah_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ubah_passwordMousePressed
        Ubah_Password.setVisible(true);
        active = "ubahpassword";
        panel_ubah_password.setBackground(new Color(113, 165, 93));
        label_ubahpassword.setForeground(new Color(255, 255, 255));
        panel_halaman_utama.setBackground(new Color(101, 145, 106));
        label_halaman_utama.setForeground(new Color(204, 255, 204));
        panel_list_janji.setBackground(new Color(101, 145, 106));
        label_listjanji.setForeground(new Color(204, 255, 204));

        try {
            Mainbar.removeAll();
            Mainbar.repaint();
            Mainbar.revalidate();

            Mainbar.add(Ubah_Password);
            Mainbar.repaint();
            Mainbar.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_panel_ubah_passwordMousePressed

    private void MainMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMouseMoved
        lblUser.setText(findName.toUpperCase());
    }//GEN-LAST:event_MainMouseMoved

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Main_Menu MM = new Main_Menu();
        MM.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void LihatJanjiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatJanjiMouseClicked
        connection = Connector.ConnectDb();
        String sql = "SELECT pName FROM tbl_perjanjian WHERE dName = '" + findName + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.first();
            String getPname = rs.getString("pName");
            sendName = getPname;
            Appointment appointment = new Appointment(sendName);
            appointment.setVisible(true);
            dispose();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak Ada Janji");
        }

    }//GEN-LAST:event_LihatJanjiMouseClicked

    private void LihatJanjiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatJanjiMouseEntered
        LihatJanji.setBackground(new Color(113, 165, 93));
    }//GEN-LAST:event_LihatJanjiMouseEntered

    private void LihatJanjiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatJanjiMouseExited
        LihatJanji.setBackground(new Color(101, 145, 106));        
    }//GEN-LAST:event_LihatJanjiMouseExited

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        boolean cb = jCheckBox1.isSelected();
        if (cb == true) {
            txtoldpass.setEchoChar((char) 0);
            txtnewpass.setEchoChar((char) 0);
            txtconfirmpass.setEchoChar((char) 0);
        } else {
            txtoldpass.setEchoChar('*');
            txtnewpass.setEchoChar('*');
            txtconfirmpass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        String pass = String.valueOf(txtnewpass.getPassword());
        String oldpass = String.valueOf(txtoldpass.getPassword());
        connection = Connector.ConnectDb();
        if (!txtnewpass.getText().equals(txtconfirmpass.getText())) {
            JOptionPane.showMessageDialog(null, "Kedua Password Harus Sama!", "Information",
                    JOptionPane.INFORMATION_MESSAGE);
            txtoldpass.setText(null);
            txtnewpass.setText(null);
            txtconfirmpass.setText(null);
        } else {
            try {
                String sql = "select username, password from tbl_dokter where username='" + findName + "'";
                ps = connection.prepareStatement(sql);
                rs = ps.executeQuery();
                rs.first();
                if (oldpass.equals(rs.getString("password"))) {

                    try {
                        sql = "UPDATE tbl_dokter SET password = ? WHERE username = '" + findName + "'";
                        ps = connection.prepareStatement(sql);
                        ps.setString(1, pass);

                        int rs = ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Password Berhasil Diubah");
                    } catch (Exception e) {
                        System.out.println("Error " + e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password Salah");
                    txtoldpass.setText(null);
                    txtnewpass.setText(null);
                    txtconfirmpass.setText(null);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Password Salah");
                txtoldpass.setText(null);
                txtnewpass.setText(null);
                txtconfirmpass.setText(null);
            }
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void txtcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseClicked

    }//GEN-LAST:event_txtcariMouseClicked

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        try {
            DefaultTableModel table = (DefaultTableModel) tblJanji.getModel();
            String search = txtcari.getText().toString();
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
            tblJanji.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Simbol");
            txtcari.setText(null);

        }
    }//GEN-LAST:event_txtcariKeyReleased

    private void panel_list_janjiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_list_janjiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_list_janjiMouseEntered

    private void panel_list_janjiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_list_janjiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_list_janjiMouseExited

    private void panel_list_janjiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_list_janjiMousePressed
        ListJanji.setVisible(true);
        Main.setFocusable(true);
        active = "listjanji";
        panel_list_janji.setBackground(new Color(113, 165, 93));
        label_listjanji.setForeground(new Color(255, 255, 255));
        panel_halaman_utama.setBackground(new Color(101, 145, 106));
        label_halaman_utama.setForeground(new Color(204, 255, 204));
        panel_ubah_password.setBackground(new Color(101, 145, 106));
        label_ubahpassword.setForeground(new Color(204, 255, 204));
        

        try {
            Mainbar.removeAll();
            Mainbar.repaint();
            Mainbar.revalidate();

            Mainbar.add(ListJanji);
            Mainbar.repaint();
            Mainbar.revalidate();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_panel_list_janjiMousePressed

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
            java.util.logging.Logger.getLogger(Doctor_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_Activity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Halaman_Utama;
    private javax.swing.JPanel LihatJanji;
    private javax.swing.JPanel ListJanji;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Mainbar;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JPanel Ubah_Password;
    private javax.swing.JButton btnubah;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_halaman_utama;
    private javax.swing.JLabel label_listjanji;
    private javax.swing.JLabel label_ubahpassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panel_halaman_utama;
    private javax.swing.JPanel panel_list_janji;
    private javax.swing.JPanel panel_ubah_password;
    private javax.swing.JTable tblJanji;
    private javax.swing.JTextField txtcari;
    private javax.swing.JPasswordField txtconfirmpass;
    private javax.swing.JPasswordField txtnewpass;
    private javax.swing.JPasswordField txtoldpass;
    // End of variables declaration//GEN-END:variables

    private void loadtable() {
        DefaultTableModel dtm = (DefaultTableModel) tblJanji.getModel();

        connection = Connector.ConnectDb();
        try {
            sql = "select pName,Tanggal from tbl_perjanjian where dName = '" + findName + "'";

            st = connection.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
