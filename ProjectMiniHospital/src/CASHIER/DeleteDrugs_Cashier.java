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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author surap
 */
public class DeleteDrugs_Cashier extends javax.swing.JFrame {

    Connection connection = null;
    static Statement st;
    static ResultSet rs;
    static PreparedStatement ps;
    static String sql;
    int flag = 0;

    /**
     * Creates new form DeleteDrugs
     */
    public DeleteDrugs_Cashier() {
        initComponents();
        loadtable();
        Main.setFocusable(true);
tblObat.getTableHeader().setDefaultRenderer(new HeaderColor());
        TextPrompt cari = new TextPrompt("Berdasarkan Nama", txtcari);
        
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
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblObat = new javax.swing.JTable();
        btnhapus = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Main.setBackground(new java.awt.Color(246, 255, 233));
        Main.setForeground(new java.awt.Color(153, 153, 153));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("COCOMAT", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hapus Obat");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(670, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(646, 646, 646))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addContainerGap(18, Short.MAX_VALUE))
        );

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
                "Count", "id_obat", "Nama_Obat", "Tipe_Obat", "Harga_Obat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        jScrollPane2.setViewportView(tblObat);
        if (tblObat.getColumnModel().getColumnCount() > 0) {
            tblObat.getColumnModel().getColumn(0).setResizable(false);
            tblObat.getColumnModel().getColumn(1).setResizable(false);
            tblObat.getColumnModel().getColumn(2).setResizable(false);
            tblObat.getColumnModel().getColumn(3).setResizable(false);
            tblObat.getColumnModel().getColumn(4).setResizable(false);
        }

        btnhapus.setBackground(new java.awt.Color(153, 0, 0));
        btnhapus.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(204, 204, 204));
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        txtcari.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtcari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcariFocusLost(evt);
            }
        });
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

        btncari.setBackground(new java.awt.Color(113, 165, 93));
        btncari.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btncari.setForeground(new java.awt.Color(51, 51, 51));
        btncari.setText("CARI");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        btnkembali.setBackground(new java.awt.Color(51, 51, 51));
        btnkembali.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnkembali.setForeground(new java.awt.Color(204, 204, 204));
        btnkembali.setText("KEMBALI");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MainLayout.createSequentialGroup()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(641, 641, 641)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(613, 613, 613)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnkembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private void tblObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObatMouseClicked
        txtcari.setForeground(new Color(0, 0, 0));
        int i = tblObat.getSelectedRow();
        TableModel model = tblObat.getModel();
        txtcari.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_tblObatMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int ops = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus Data Ini?", "Information", JOptionPane.YES_NO_OPTION);
        if (ops == JOptionPane.NO_OPTION) {

            DefaultTableModel dtm = (DefaultTableModel) tblObat.getModel();
            dtm.setRowCount(0);
            loadtable();

        }
        if (ops == JOptionPane.YES_OPTION) {
            if (txtcari.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Pilih atau Masukkan Nama Terlebih Dahulu", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                connection = Connector.ConnectDb();
                String search = txtcari.getText();

                try {
                    sql = "Delete from tbl_obatobatan where id_obat ='" + search + "'";
                    ps = connection.prepareStatement(sql);
                    int data = ps.executeUpdate();
                    if (data != 0) {
                        flag = 0;
                        JOptionPane.showMessageDialog(null, "Obat " + search + " Sudah Dihapus");
                        DefaultTableModel dtm = (DefaultTableModel) tblObat.getModel();
                        dtm.setRowCount(0);
                        loadtable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Obat " + search + " Tidak Ditemukan");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Obat " + search + " Tidak Ditemukan");
                }
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void txtcariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcariFocusGained

    }//GEN-LAST:event_txtcariFocusGained

    private void txtcariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcariFocusLost

    }//GEN-LAST:event_txtcariFocusLost

    private void txtcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseClicked

    }//GEN-LAST:event_txtcariMouseClicked

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        if(txtcari.getText().equals("")){
        DefaultTableModel dtm = (DefaultTableModel) tblObat.getModel();
        dtm.setRowCount(0);
        loadtable();  
        }
    }//GEN-LAST:event_txtcariKeyReleased

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblObat.getModel();

        connection = Connector.ConnectDb();
        try {
            sql = "SELECT *FROM tbl_obatobatan WHERE id_obat = ? ";
            ps = connection.prepareStatement(sql);
            ps.setString(1, txtcari.getText());
            rs = ps.executeQuery();
            tblObat.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        Cashier_Activity AA = new Cashier_Activity();
        AA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteDrugs_Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDrugs_Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteDrugs_Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteDrugs_Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDrugs_Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkembali;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblObat;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables

    private void loadtable() {
        DefaultTableModel dtm = (DefaultTableModel) tblObat.getModel();

        connection = Connector.ConnectDb();
        try {
            sql = "SELECT *FROM tbl_obatobatan";

            st = connection.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
