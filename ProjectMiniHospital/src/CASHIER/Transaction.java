/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CASHIER;

import ADMIN.Admin_Activity;
import DB.Connector;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author surap
 */
public class Transaction extends javax.swing.JFrame {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection connection = null;
    int total, harga, jumlah;
    int flag = 0;

    /**
     * Creates new form Transaction
     */
    public Transaction() {
        initComponents();
        txtnamaobat.setEnabled(false);
        txttipeobat.setEnabled(false);
        txtharga.setEnabled(false);
        tblObat.getTableHeader().setDefaultRenderer(new HeaderColor());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidobat = new javax.swing.JTextField();
        txtnamaobat = new javax.swing.JTextField();
        txttipeobat = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        spjumlah = new javax.swing.JSpinner();
        btntambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblObat = new javax.swing.JTable();
        btncari = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbltotalharga = new javax.swing.JLabel();
        btnhapustabel = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();
        txtbayar = new javax.swing.JTextField();
        lblkembalian = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnbayar = new javax.swing.JButton();
        btnhapussemua = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Main.setBackground(new java.awt.Color(246, 255, 233));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(113, 165, 93));
        jLabel1.setText("Id Obat");
        Main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 165, 93));
        jLabel2.setText("Nama Obat");
        Main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(113, 165, 93));
        jLabel3.setText("Tipe Obat");
        Main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(113, 165, 93));
        jLabel4.setText("Harga");
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(113, 165, 93));
        jLabel5.setText("Jumlah");
        Main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, -1, -1));

        txtidobat.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Main.add(txtidobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 169, -1));

        txtnamaobat.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtnamaobat.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        Main.add(txtnamaobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 290, 32));

        txttipeobat.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txttipeobat.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        Main.add(txttipeobat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 169, 32));

        txtharga.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtharga.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        Main.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 166, 32));

        spjumlah.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        spjumlah.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Main.add(spjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 169, 32));

        btntambah.setBackground(new java.awt.Color(113, 165, 93));
        btntambah.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btntambah.setForeground(new java.awt.Color(51, 51, 51));
        btntambah.setText("TAMBAH");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        Main.add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, 107, 48));

        tblObat = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colndex) {
                return false;
            }
        };
        tblObat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Obat", "Harga", "Tipe Obat", "Jumlah", "Total Harga"
            }
        ));
        tblObat.setFocusable(false);
        tblObat.setRowHeight(25);
        tblObat.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tblObat.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblObat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblObat.getTableHeader().setResizingAllowed(false);
        tblObat.getTableHeader().setReorderingAllowed(false);
        tblObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblObat);

        Main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 790, 370));

        btncari.setBackground(new java.awt.Color(113, 165, 93));
        btncari.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btncari.setForeground(new java.awt.Color(51, 51, 51));
        btncari.setText("CARI");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        Main.add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 70, 30));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("COCOMAT", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Transaksi");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(773, 773, 773)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(783, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Main.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1750, 90));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("TOTAL BAYAR :");
        Main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, -1, 40));

        lbltotalharga.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbltotalharga.setForeground(new java.awt.Color(113, 165, 93));
        lbltotalharga.setText("0");
        Main.add(lbltotalharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, 210, 40));

        btnhapustabel.setBackground(new java.awt.Color(153, 0, 0));
        btnhapustabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnhapustabel.setForeground(new java.awt.Color(204, 204, 204));
        btnhapustabel.setText("HAPUS TABEL");
        btnhapustabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapustabelActionPerformed(evt);
            }
        });
        btnhapustabel.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                btnhapustabelVetoableChange(evt);
            }
        });
        Main.add(btnhapustabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 720, 170, 50));

        btnkembali.setBackground(new java.awt.Color(51, 51, 51));
        btnkembali.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnkembali.setForeground(new java.awt.Color(204, 204, 204));
        btnkembali.setText("KEMBALI");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        Main.add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 120, 50));

        txtbayar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtbayar.setText("0");
        txtbayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbayarMouseClicked(evt);
            }
        });
        txtbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbayarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbayarKeyTyped(evt);
            }
        });
        Main.add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 610, 330, 40));

        lblkembalian.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblkembalian.setForeground(new java.awt.Color(153, 0, 0));
        lblkembalian.setText("0");
        Main.add(lblkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 170, 140, 40));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel9.setText("KEMBALIAN    :");
        Main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 160, 230, 60));

        btnbayar.setBackground(new java.awt.Color(113, 165, 93));
        btnbayar.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnbayar.setForeground(new java.awt.Color(51, 51, 51));
        btnbayar.setText("BAYAR");
        btnbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayarActionPerformed(evt);
            }
        });
        Main.add(btnbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 610, -1, 40));

        btnhapussemua.setBackground(new java.awt.Color(153, 0, 0));
        btnhapussemua.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnhapussemua.setForeground(new java.awt.Color(204, 204, 204));
        btnhapussemua.setText("RESET");
        btnhapussemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapussemuaActionPerformed(evt);
            }
        });
        Main.add(btnhapussemua, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 710, 110, 50));

        jButton1.setBackground(new java.awt.Color(113, 165, 93));
        jButton1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("STRUK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Main.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 710, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static public class HeaderColor extends DefaultTableCellRenderer{
        public HeaderColor(){
                setOpaque(true);
    }public Component getTableCellRendererComponent(JTable tblObat, Object value, boolean selected, boolean focused, int row, int column){
        super.getTableCellRendererComponent(tblObat,value,selected,focused,row,column);
                setBackground(new java.awt.Color(204, 255, 204));
                return this;
    }
    }
    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        if (txtidobat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan ID Obat", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {

            connection = Connector.ConnectDb();

            try {
                flag = 0;
                String sql = "SELECT *FROM tbl_obatobatan WHERE id_obat = ? ";
                ps = connection.prepareStatement(sql);
                ps.setString(1, txtidobat.getText());
                rs = ps.executeQuery();

                while (rs.next()) {
                    flag = 1;
                    txtnamaobat.setText(rs.getString(3));
                    txttipeobat.setText(rs.getString(4));
                    txtharga.setText(rs.getString(5));

                }
                if (flag == 0) {
                    txtidobat.setText("");
                    txtnamaobat.setText("");
                    txttipeobat.setText("");
                    txtharga.setText("");

                    JOptionPane.showMessageDialog(null, "ID Obat Tidak DItemukan", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException e) {
                txtidobat.setText("");
                txtnamaobat.setText("");
                txttipeobat.setText("");
                txtharga.setText("");

                JOptionPane.showMessageDialog(null, "ID Obat Tidak DItemukan", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btncariActionPerformed

    public int getSum() {
        int rowsCount = tblObat.getRowCount();
        int sum = 0;
        for (int i = 0; i < rowsCount; i++) {
            sum = sum + Integer.parseInt(tblObat.getValueAt(i, 4).toString());
        }
        return sum;
    }

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        try {
            if (txtidobat.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Masukkan ID Obat Terlebih Dahulu", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
            if (spjumlah.getValue().equals(0)) {
                JOptionPane.showMessageDialog(null, "Masukkan Jumlah Obat Terlebih Dahulu", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                harga = Integer.parseInt(txtharga.getText());
                jumlah = Integer.parseInt(spjumlah.getValue().toString());
                total = harga * jumlah;

                DefaultTableModel dtm = (DefaultTableModel) tblObat.getModel();
                dtm.insertRow(dtm.getRowCount(), new Object[]{txtnamaobat.getText(), txtharga.getText(), txttipeobat.getText(), spjumlah.getValue(), total});
                lbltotalharga.setText(Integer.toString(getSum()));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ID Obat Tidak Ditenukan", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            txtidobat.setText("");
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void tblObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblObatMouseClicked

    private void btnhapustabelVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_btnhapustabelVetoableChange

    }//GEN-LAST:event_btnhapustabelVetoableChange

    private void btnhapustabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapustabelActionPerformed
        lblkembalian.setText("0");
        DefaultTableModel dtm = (DefaultTableModel) tblObat.getModel();
        try {
            int SelectedRowIndex = tblObat.getSelectedRow();
            dtm.removeRow(SelectedRowIndex);
            lbltotalharga.setText(Integer.toString(getSum()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pilih Data Tabel Terlebih Dahulu", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnhapustabelActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        Cashier_Activity AA = new Cashier_Activity();
        AA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void btnbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayarActionPerformed
        if (lbltotalharga.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Masukkan Data Terlebih Dahulu", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            int jumlahby = Integer.parseInt(txtbayar.getText());
            int kembalian = Integer.parseInt(lblkembalian.getText());
            int total = Integer.parseInt(lbltotalharga.getText());

            if (jumlahby < total) {
                JOptionPane.showMessageDialog(null, "Uang Yang Dimasukan Tidak Cukup");
            } else {
                kembalian = jumlahby - total;
                lblkembalian.setText(Integer.toString(kembalian));

            }
        }
    }//GEN-LAST:event_btnbayarActionPerformed

    private void txtbayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarKeyReleased

    private void txtbayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbayarMouseClicked

    }//GEN-LAST:event_txtbayarMouseClicked

    private void txtbayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }

    }//GEN-LAST:event_txtbayarKeyTyped

    private void btnhapussemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapussemuaActionPerformed
        int ops = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus?", "Information", JOptionPane.YES_NO_OPTION);
        if (ops == JOptionPane.NO_OPTION) {

        }
        if (ops == JOptionPane.YES_OPTION) {
            txtidobat.setText("");
            txtnamaobat.setText("");
            txttipeobat.setText("");
            txtharga.setText("");
            spjumlah.setValue(0);
            lbltotalharga.setText("0");
            lblkembalian.setText("0");
            DefaultTableModel dtm = (DefaultTableModel) tblObat.getModel();
            dtm.setRowCount(0);
        }
    }//GEN-LAST:event_btnhapussemuaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Receipt RR = new Receipt();
        RR.setVisible(true);
        dispose();
        receipt();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JButton btnbayar;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapussemua;
    private javax.swing.JButton btnhapustabel;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    public static javax.swing.JLabel lblkembalian;
    public static javax.swing.JLabel lbltotalharga;
    private javax.swing.JSpinner spjumlah;
    private javax.swing.JTable tblObat;
    public static javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidobat;
    private javax.swing.JTextField txtnamaobat;
    private javax.swing.JTextField txttipeobat;
    // End of variables declaration//GEN-END:variables

    private void receipt() {
    try{
        int rowsCount = tblObat.getRowCount();
        for(int i = 0 ; i<rowsCount ; i++){
            Receipt.txt_struk_baru.setText(Receipt.txt_struk_baru.getText()+tblObat.getValueAt(i,0).toString());
            Receipt.txt_struk_baru.setText(Receipt.txt_struk_baru.getText()+"\t"+tblObat.getValueAt(i,1).toString());
            Receipt.txt_struk_baru.setText(Receipt.txt_struk_baru.getText()+"\t"+tblObat.getValueAt(i,2).toString());
            Receipt.txt_struk_baru.setText(Receipt.txt_struk_baru.getText()+"\t"+tblObat.getValueAt(i,3).toString());
            Receipt.txt_struk_baru.setText(Receipt.txt_struk_baru.getText()+"\t"+tblObat.getValueAt(i,4).toString()+"\n");
        }
        
        
    }catch(Exception e){
        
    }
    }
}
