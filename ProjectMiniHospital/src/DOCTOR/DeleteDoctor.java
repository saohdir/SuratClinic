/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOCTOR;

import ADMIN.Admin_Activity;
import DB.Connector;
import static DOCTOR.UpdateDoctor.sql;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author surap
 */
public class DeleteDoctor extends javax.swing.JFrame {

    Connection connection = null;
    static Statement st;
    static ResultSet rs;
    static PreparedStatement ps;
    static String sql;
    int flag = 0;

    /**
     * Creates new form DeleteDoctor
     */
    public DeleteDoctor() {
        initComponents();
        loadtable();
        jPanel1.setFocusable(true);
tblDokter.getTableHeader().setDefaultRenderer(new HeaderColor());
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

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDokter = new javax.swing.JTable();
        btnhapus = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(246, 255, 233));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("COCOMAT", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hapus Dokter");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(697, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(619, 619, 619))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tblDokter = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colndex) {
                return false;
            }
        };
        tblDokter.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Count", "Tanggal", "Id_Dokter", "Nama_Dokter", "Usia", "Jenis_Kelamin", "Spesialis", "Nomor_Telepon", "Email", "Alamat", "Ruangan", "username", "password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDokter.setFocusable(false);
        tblDokter.setRowHeight(25);
        tblDokter.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tblDokter.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblDokter.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDokter.getTableHeader().setReorderingAllowed(false);
        tblDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDokterMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDokter);
        if (tblDokter.getColumnModel().getColumnCount() > 0) {
            tblDokter.getColumnModel().getColumn(0).setResizable(false);
            tblDokter.getColumnModel().getColumn(1).setResizable(false);
            tblDokter.getColumnModel().getColumn(2).setResizable(false);
            tblDokter.getColumnModel().getColumn(3).setResizable(false);
            tblDokter.getColumnModel().getColumn(4).setResizable(false);
            tblDokter.getColumnModel().getColumn(5).setResizable(false);
            tblDokter.getColumnModel().getColumn(6).setResizable(false);
            tblDokter.getColumnModel().getColumn(7).setResizable(false);
            tblDokter.getColumnModel().getColumn(8).setResizable(false);
            tblDokter.getColumnModel().getColumn(9).setResizable(false);
            tblDokter.getColumnModel().getColumn(10).setResizable(false);
            tblDokter.getColumnModel().getColumn(11).setResizable(false);
            tblDokter.getColumnModel().getColumn(12).setResizable(false);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(641, 641, 641)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(607, 607, 607)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnkembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static public class HeaderColor extends DefaultTableCellRenderer{
        public HeaderColor(){
                setOpaque(true);
    }public Component getTableCellRendererComponent(JTable tblDokter, Object value, boolean selected, boolean focused, int row, int column){
        super.getTableCellRendererComponent(tblDokter,value,selected,focused,row,column);
                setBackground(new java.awt.Color(204, 255, 204));
                return this;
    }
    }
    private void tblDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDokterMouseClicked
        int i = tblDokter.getSelectedRow();
        TableModel model = tblDokter.getModel();
        txtcari.setText(model.getValueAt(i, 3).toString());

    }//GEN-LAST:event_tblDokterMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int ops = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus Data Ini?", "Information", JOptionPane.YES_NO_OPTION);
        if (ops == JOptionPane.NO_OPTION) {

            DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();
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
                    sql = "Delete from tbl_dokter where Nama_Dokter ='" + search + "'";
                    ps = connection.prepareStatement(sql);
                    int data = ps.executeUpdate();
                    if (data != 0) {
                        flag = 0;
                        JOptionPane.showMessageDialog(null, "Dokter " + search + " Sudah Dihapus");
                        DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();
                        dtm.setRowCount(0);
                        loadtable();

                    } else {
                        JOptionPane.showMessageDialog(null, "Nama Dokter " + search + " Tidak Ditemukan");

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Nama Dokter " + search + " Tidak Ditemukan");

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
        DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();
        dtm.setRowCount(0);
        loadtable();  
        }
    }//GEN-LAST:event_txtcariKeyReleased

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();

        connection = Connector.ConnectDb();
        try {
            sql = "SELECT *FROM tbl_dokter WHERE Nama_Dokter = ? ";
            ps = connection.prepareStatement(sql);
            ps.setString(1, txtcari.getText());
            rs = ps.executeQuery();
            tblDokter.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        Admin_Activity AA = new Admin_Activity();
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
            java.util.logging.Logger.getLogger(DeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkembali;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblDokter;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables

    private void loadtable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();

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
}
