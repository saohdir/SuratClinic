/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOCTOR;

import ADMIN.Admin_Activity;
import DB.Connector;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author surap
 */
public class AddDoctor extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    static ResultSet rs;
    static Statement st;
    static String sql, uId, uName, ruangan,spesialis,
            addrs,  gender, dob, usia, phone, email, user1, pass1;

    /**
     * Creates new form AddDoctor
     */
    public AddDoctor() {
        initComponents();
        loadtable();
        autoid();
        txtiddokter.setEnabled(false);
        JTextFieldDateEditor jd;
        jd = (JTextFieldDateEditor) jDateChooser.getDateEditor();
        jd.setEditable(false);
        jd.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtiddokter = new javax.swing.JTextField();
        txtnamadokter = new javax.swing.JTextField();
        rbpria = new javax.swing.JRadioButton();
        rbwanita = new javax.swing.JRadioButton();
        txtusia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        txtnomortelepon = new javax.swing.JTextField();
        txtruangan = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        btntambah = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        cbspesialis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(246, 255, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(113, 165, 93));
        jLabel1.setText("Tanggal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 165, 93));
        jLabel2.setText("Nama Dokter");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(113, 165, 93));
        jLabel3.setText("Jenis Kelamin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(113, 165, 93));
        jLabel4.setText("Usia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(113, 165, 93));
        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(113, 165, 93));
        jLabel6.setText("Nomor Telepon");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(113, 165, 93));
        jLabel7.setText("Spesialis");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(113, 165, 93));
        jLabel8.setText("Ruangan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(113, 165, 93));
        jLabel9.setText("ID Dokter");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 122, -1));

        txtiddokter.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtiddokter.setDisabledTextColor(new java.awt.Color(255, 0, 51));
        jPanel1.add(txtiddokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 223, 40));

        txtnamadokter.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtnamadokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 223, 40));

        buttonGroup1.add(rbpria);
        rbpria.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        rbpria.setText("Pria");
        jPanel1.add(rbpria, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 80, -1));

        buttonGroup1.add(rbwanita);
        rbwanita.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        rbwanita.setText("Wanita");
        jPanel1.add(rbwanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 120, -1));

        txtusia.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtusia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusiaKeyTyped(evt);
            }
        });
        jPanel1.add(txtusia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 223, 40));

        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 220, 111));

        txtnomortelepon.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtnomortelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomorteleponKeyTyped(evt);
            }
        });
        jPanel1.add(txtnomortelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 220, 40));

        txtruangan.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtruangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 440, 220, 40));

        jDateChooser.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 180, 220, 30));

        btntambah.setBackground(new java.awt.Color(113, 165, 93));
        btntambah.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btntambah.setForeground(new java.awt.Color(51, 51, 51));
        btntambah.setText("TAMBAH");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        jPanel1.add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 750, 110, 47));

        btnkembali.setBackground(new java.awt.Color(51, 51, 51));
        btnkembali.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnkembali.setForeground(new java.awt.Color(204, 204, 204));
        btnkembali.setText("KEMBALI");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 750, 107, 47));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Count", "Tanggal", "Id Pasien", "Nama Pasien", "Usia", "Jenis Kelamin", "Alamat", "Nomor Telepon", "Penyakit", "Ruangan"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1486, 601, 0, 0));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("COCOMAT", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tambah Dokter");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(607, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(568, 568, 568))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1547, 90));

        btnreset.setBackground(new java.awt.Color(153, 0, 0));
        btnreset.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 750, 120, 50));

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(113, 165, 93));
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, -1, -1));

        txtusername.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 530, 220, 40));

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(113, 165, 93));
        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, -1, 30));

        txtpassword.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 600, 220, 40));

        jLabel13.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(113, 165, 93));
        jLabel13.setText("Email");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, 40));

        txtemail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 220, 40));

        cbspesialis.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cbspesialis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Spesialis", "Gigi", "THT", "Jantung" }));
        jPanel1.add(cbspesialis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 340, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        if (txtalamat.getText().equals("") || txtnamadokter.getText().equals("")
                || txtnomortelepon.getText().equals("") || cbspesialis.getSelectedItem().toString().equals("Pilih Spesialis")
                || txtruangan.getText().equals("") || txtusername.getText().equals("") || txtusia.getText().equals("")
                || buttonGroup1.isSelected(null) || txtpassword.getText().equals("") || txtemail.getText().equals("") || jDateChooser.getDate().equals(null)) {
            JOptionPane.showMessageDialog(null, "Form Pengisian Tidak Boleh Kosong", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            adddoctor();
        }

    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        Admin_Activity AA = new Admin_Activity();
        AA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        clear();
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtusiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusiaKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtusiaKeyTyped

    private void txtnomorteleponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomorteleponKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnomorteleponKeyTyped

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
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbspesialis;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton rbpria;
    private javax.swing.JRadioButton rbwanita;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtiddokter;
    private javax.swing.JTextField txtnamadokter;
    private javax.swing.JTextField txtnomortelepon;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtruangan;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtusia;
    // End of variables declaration//GEN-END:variables

    private void loadtable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        connection = Connector.ConnectDb();
        try {
            sql = "SELECT *FROM tbl_dokter";

            st = connection.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)});
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    private void autoid() {
        try {
            String sql = "SELECT MAX(right(id_dokter,3)) AS no FROM tbl_dokter";
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.first() == false) {
                    txtiddokter.setText("D0001");
                } else {
                    rs.last();
                    int auto_id = rs.getInt(1) + 1;
                    String no = String.valueOf(auto_id);
                    int noLong = no.length();
                    for (int a = 0; a < 3 - noLong; a++) {
                        no = "0" + no;
                    }
                    txtiddokter.setText("D" + no);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void clear() {
        txtalamat.setText("");
        txtnamadokter.setText("");
        txtusia.setText("");
        txtnomortelepon.setText("");
        cbspesialis.setSelectedIndex(0);
        txtruangan.setText("");
        rbpria.setSelected(false);
        rbwanita.setSelected(false);
        jDateChooser.setDate(null);
        txtusername.setText("");
        txtpassword.setText("");
        txtemail.setText("");
    }

    private void adddoctor() {
        getfield();
        String emailp = "^[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z]{1,20}$";
        Pattern pattern = Pattern.compile(emailp);
        Matcher regexMatcher = pattern.matcher(txtemail.getText());
        if (!regexMatcher.matches()) {
            JOptionPane.showMessageDialog(null, "Email Bermasalah", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            loadtable();

        } else {
            connection = Connector.ConnectDb();
            try {
                sql = "INSERT INTO tbl_dokter(Tanggal,id_dokter,Nama_Dokter,Usia,Jenis_Kelamin,Spesialis,Nomor_Telepon,Email,Alamat,Ruangan,username,password) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?)";
                ps = connection.prepareStatement(sql);
                ps.setString(1, dob);
                ps.setString(2, uId);
                ps.setString(3, uName);
                ps.setString(4, usia);
                ps.setString(5, gender);
                ps.setString(6, spesialis);
                ps.setString(7, phone);
                ps.setString(8, email);
                ps.setString(9, addrs);
                ps.setString(10, ruangan);
                ps.setString(11, user1);
                ps.setString(12, pass1);

                int rt = ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data Tersimpan");

                autoid();

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                loadtable();
                clear();
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }

    private void getfield() {
        java.util.Date d = jDateChooser.getDate();
        if (d == null) {
            System.out.println("No date specified!");
        } else {
            SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy/MM/dd");
            dob = Date_Format.format(jDateChooser.getDate());
        }
        uId = txtiddokter.getText();
        uName = txtnamadokter.getText();
        spesialis = cbspesialis.getSelectedItem().toString();
        ruangan = txtruangan.getText();
        usia = txtusia.getText();
        phone = txtnomortelepon.getText();
        addrs = txtalamat.getText();

        if (rbpria.isSelected()) {
            gender = "Pria";
        } else if (rbwanita.isSelected()) {
            gender = "Wanita";
        }
        email = txtemail.getText();
        user1 = txtusername.getText();
        pass1 = txtpassword.getText();
    }
}
