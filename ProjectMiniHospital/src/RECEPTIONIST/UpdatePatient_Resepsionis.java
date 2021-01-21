/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RECEPTIONIST;

import ADMIN.Admin_Activity;
import DB.Connector;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author surap
 */
public class UpdatePatient_Resepsionis extends javax.swing.JFrame {

    Connection connection = null;
    static Statement st;
    static ResultSet rs;
    static PreparedStatement ps;
    static String sql, uId, uName, penyakit,addrs, gender, dob, usia, phone;
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    int flag = 0;
    /**
     * Creates new form UpdatePatient
     */
    public UpdatePatient_Resepsionis() {
        initComponents();

        Object columns[] = {"Count", "Tanggal", "id_pasien", "Nama_Pasien", "Usia", "Jenis_Kelamin", "Alamat", "Nomor_Telepon", "Penyakit"};
        defaultTableModel.setColumnIdentifiers(columns);
        tblpasien.setModel(defaultTableModel);
        txtidpasien.setEnabled(false);
            tblpasien.getTableHeader().setDefaultRenderer(new HeaderColor());
        TextPrompt cari = new TextPrompt("Berdasarkan Nama", txtcari);

        JTextFieldDateEditor jd;
        jd = (JTextFieldDateEditor) jDateChooser1.getDateEditor();
        jd.setEditable(false);
        jd.setBackground(Color.WHITE);
        loadtable();

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
        jLabel9 = new javax.swing.JLabel();
        txtidpasien = new javax.swing.JTextField();
        txtnamapasien = new javax.swing.JTextField();
        rbpria = new javax.swing.JRadioButton();
        rbwanita = new javax.swing.JRadioButton();
        txtusia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        txtpenyakit = new javax.swing.JTextField();
        txtnomortelepon = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnubah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpasien = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(246, 255, 233));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(113, 165, 93));
        jLabel1.setText("Id Pasien");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 165, 93));
        jLabel2.setText("Nama Pasien");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(113, 165, 93));
        jLabel3.setText("Jenis Kelamin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(113, 165, 93));
        jLabel4.setText("Usia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(113, 165, 93));
        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(113, 165, 93));
        jLabel6.setText("Nomor Telepon");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(113, 165, 93));
        jLabel7.setText("Penyakit");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(113, 165, 93));
        jLabel9.setText("Tanggal");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        txtidpasien.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtidpasien.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jPanel1.add(txtidpasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 189, 40));

        txtnamapasien.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtnamapasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 189, 40));

        buttonGroup1.add(rbpria);
        rbpria.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        rbpria.setText("Pria");
        jPanel1.add(rbpria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        buttonGroup1.add(rbwanita);
        rbwanita.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        rbwanita.setText("Wanita");
        jPanel1.add(rbwanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        txtusia.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtusia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusiaKeyTyped(evt);
            }
        });
        jPanel1.add(txtusia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 189, 40));

        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 230, -1));

        txtpenyakit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtpenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 230, 40));

        txtnomortelepon.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtnomortelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomorteleponKeyTyped(evt);
            }
        });
        jPanel1.add(txtnomortelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 230, 40));

        jDateChooser1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 230, 30));

        btnubah.setBackground(new java.awt.Color(113, 165, 93));
        btnubah.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnubah.setForeground(new java.awt.Color(51, 51, 51));
        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });
        jPanel1.add(btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 280, 120, 47));

        tblpasien = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colndex) {
                return false;
            }
        };
        tblpasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Count", "Tanggal", "Id_pasien", "Nama_Pasien", "Usia", "Jenis_Kelamin", "Alamat", "Nomor_Telepon", "Penyakit", "Ruangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblpasien.setFocusable(false);
        tblpasien.setRowHeight(25);
        tblpasien.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tblpasien.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblpasien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblpasien.setShowHorizontalLines(false);
        tblpasien.setShowVerticalLines(false);
        tblpasien.getTableHeader().setResizingAllowed(false);
        tblpasien.getTableHeader().setReorderingAllowed(false);
        tblpasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpasienMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblpasienMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(tblpasien);
        if (tblpasien.getColumnModel().getColumnCount() > 0) {
            tblpasien.getColumnModel().getColumn(0).setResizable(false);
            tblpasien.getColumnModel().getColumn(1).setResizable(false);
            tblpasien.getColumnModel().getColumn(2).setResizable(false);
            tblpasien.getColumnModel().getColumn(3).setResizable(false);
            tblpasien.getColumnModel().getColumn(4).setResizable(false);
            tblpasien.getColumnModel().getColumn(5).setResizable(false);
            tblpasien.getColumnModel().getColumn(6).setResizable(false);
            tblpasien.getColumnModel().getColumn(7).setResizable(false);
            tblpasien.getColumnModel().getColumn(8).setResizable(false);
            tblpasien.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 1510, 160));

        txtcari.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        txtcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcariMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtcariMouseEntered(evt);
            }
        });
        txtcari.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtcariInputMethodTextChanged(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcariKeyTyped(evt);
            }
        });
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 560, 200, 30));

        btncari.setBackground(new java.awt.Color(113, 165, 93));
        btncari.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btncari.setForeground(new java.awt.Color(51, 51, 51));
        btncari.setText("CARI");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        jPanel1.add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 560, 80, -1));

        btnkembali.setBackground(new java.awt.Color(51, 51, 51));
        btnkembali.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnkembali.setForeground(new java.awt.Color(204, 204, 204));
        btnkembali.setText("KEMBALI");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 280, 130, 47));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("COCOMAT", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ubah Pasien");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(616, 616, 616)
                .addComponent(jLabel10)
                .addContainerGap(700, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 90));

        btnreset.setBackground(new java.awt.Color(153, 0, 0));
        btnreset.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 280, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static public class HeaderColor extends DefaultTableCellRenderer{
        public HeaderColor(){
                setOpaque(true);
    }public Component getTableCellRendererComponent(JTable tblpasien, Object value, boolean selected, boolean focused, int row, int column){
        super.getTableCellRendererComponent(tblpasien,value,selected,focused,row,column);
                setBackground(new java.awt.Color(204, 255, 204));
                return this;
    }
    }

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        int ops = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Mengubah Data Ini?", "Information", JOptionPane.YES_NO_OPTION);
        if (ops == JOptionPane.NO_OPTION) {

            DefaultTableModel dtm = (DefaultTableModel) tblpasien.getModel();
            dtm.setRowCount(0);
            loadtable();

        }
        if (ops == JOptionPane.YES_OPTION) {
            if (txtalamat.getText().equals("") || txtnamapasien.getText().equals("")
                    || txtnomortelepon.getText().equals("") || txtpenyakit.getText().equals("")
                    || txtusia.getText().equals("")
                    || buttonGroup1.isSelected(null) || jDateChooser1.getDate().equals(null)) {
                JOptionPane.showMessageDialog(null, "Form Pengisian Tidak Boleh Kosong", "Warning",
                        JOptionPane.WARNING_MESSAGE);

            } else {

                getfield();
                connection = Connector.ConnectDb();
                try {
                    sql = "UPDATE tbl_pasien SET Tanggal = ?, Nama_Pasien = ?, Usia = ?,Jenis_Kelamin = ?,Alamat = ?, Nomor_Telepon = ?, Penyakit = ? WHERE Id_Pasien = ?";
                    ps = connection.prepareStatement(sql);

                    ps.setString(1, dob);
                    ps.setString(2, uName);
                    ps.setString(3, usia);
                    ps.setString(4, gender);
                    ps.setString(5, addrs);
                    ps.setString(6, phone);
                    ps.setString(7, penyakit);
                    ps.setString(8, uId);
                    int rs = ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Sudah Terperbaharui");
                    DefaultTableModel dtm = (DefaultTableModel) tblpasien.getModel();
                    dtm.setRowCount(0);
                    loadtable();
                } catch (Exception e) {
                    System.out.println("Error " + e.getMessage());
                }
            }
        } else {
            clear();
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void tblpasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpasienMouseClicked
        int i = tblpasien.getSelectedRow();
        TableModel model = tblpasien.getModel();
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(i, 1));
            jDateChooser1.setDate(date);
        } catch (Exception e) {

        }
        txtidpasien.setText(model.getValueAt(i, 2).toString());
        txtnamapasien.setText(model.getValueAt(i, 3).toString());
        txtusia.setText(model.getValueAt(i, 4).toString());
        String sex = model.getValueAt(i, 5).toString();
        if (sex.equals("Pria")) {
            rbpria.setSelected(true);
        } else {
            rbwanita.setSelected(true);
        }
        txtalamat.setText(model.getValueAt(i, 6).toString());
        txtnomortelepon.setText(model.getValueAt(i, 7).toString());
        txtpenyakit.setText(model.getValueAt(i, 8).toString());


    }//GEN-LAST:event_tblpasienMouseClicked

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        flag = 1;
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String search = txtcari.getText().toString();
        connection = Connector.ConnectDb();
        try {
            flag = 0;
            sql = "select Count,Tanggal,id_pasien,Nama_Pasien,Usia,Jenis_Kelamin,Alamat,Nomor_Telepon,Penyakit from tbl_pasien where Nama_Pasien = '" + search + "'";

            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[14];
            while (rs.next()) {
                flag = 1;
                columnData[0] = rs.getString("Count");
                columnData[1] = rs.getString("Tanggal");
                columnData[2] = rs.getString("id_pasien");
                columnData[3] = rs.getString("Nama_Pasien");
                columnData[4] = rs.getString("Usia");
                columnData[5] = rs.getString("Jenis_Kelamin");
                columnData[6] = rs.getString("Alamat");
                columnData[7] = rs.getString("Nomor_Telepon");
                columnData[8] = rs.getString("Penyakit");
                defaultTableModel.addRow(columnData);
            }
            if (flag == 0) {
                DefaultTableModel dtm = (DefaultTableModel) tblpasien.getModel();
                dtm.setRowCount(0);
                loadtable();
                JOptionPane.showMessageDialog(null, "Nama Tidak Ditemukan", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }            

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        Receptionist_Activity AA = new Receptionist_Activity();
        AA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void txtcariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyTyped

    }//GEN-LAST:event_txtcariKeyTyped

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        if(txtcari.getText().equals("")){
        DefaultTableModel dtm = (DefaultTableModel) tblpasien.getModel();
        dtm.setRowCount(0);
        loadtable();  
        }
    }//GEN-LAST:event_txtcariKeyReleased

    private void txtcariInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtcariInputMethodTextChanged

    }//GEN-LAST:event_txtcariInputMethodTextChanged

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

    }//GEN-LAST:event_jPanel1MouseMoved

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        clear();
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseClicked

    }//GEN-LAST:event_txtcariMouseClicked

    private void txtcariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseEntered

    }//GEN-LAST:event_txtcariMouseEntered

    private void tblpasienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpasienMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tblpasienMouseExited

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
            java.util.logging.Logger.getLogger(UpdatePatient_Resepsionis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient_Resepsionis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient_Resepsionis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatient_Resepsionis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatient_Resepsionis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnubah;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton rbpria;
    private javax.swing.JRadioButton rbwanita;
    private javax.swing.JTable tblpasien;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtidpasien;
    private javax.swing.JTextField txtnamapasien;
    private javax.swing.JTextField txtnomortelepon;
    private javax.swing.JTextField txtpenyakit;
    private javax.swing.JTextField txtusia;
    // End of variables declaration//GEN-END:variables

    private void loadtable() {

        DefaultTableModel dtm = (DefaultTableModel) tblpasien.getModel();

        connection = Connector.ConnectDb();
        try {
            sql = "SELECT *FROM tbl_pasien";

            st = connection.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)});
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }

    private void getfield() {
        java.util.Date d = jDateChooser1.getDate();
        if (d == null) {
            System.out.println("No date specified!");
        } else {
            SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy/MM/dd");
            dob = Date_Format.format(jDateChooser1.getDate());
        }
        uId = txtidpasien.getText();
        uName = txtnamapasien.getText();
        penyakit = txtpenyakit.getText();
        usia = txtusia.getText();
        phone = txtnomortelepon.getText();
        addrs = txtalamat.getText();

        if (rbpria.isSelected()) {
            gender = "Pria";
        } else if (rbwanita.isSelected()) {
            gender = "Wanita";
        }
    }

    private void clear() {
        txtalamat.setText("");
        txtnamapasien.setText("");
        txtusia.setText("");
        txtnomortelepon.setText("");
        txtpenyakit.setText("");
        rbpria.setSelected(false);
        rbwanita.setSelected(false);
        jDateChooser1.setDate(null);
        txtidpasien.setText("");
    }

    private void selected() {
        int i = tblpasien.getSelectedRow();
        TableModel model = tblpasien.getModel();
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(i, 1));
            jDateChooser1.setDate(date);
        } catch (Exception e) {

        }
        txtidpasien.setText(model.getValueAt(i, 2).toString());
        txtnamapasien.setText(model.getValueAt(i, 3).toString());
        txtusia.setText(model.getValueAt(i, 4).toString());
        String sex = model.getValueAt(i, 5).toString();
        if (sex.equals("Pria")) {
            rbpria.setSelected(true);
        } else {
            rbwanita.setSelected(true);
        }
        txtalamat.setText(model.getValueAt(i, 6).toString());
        txtnomortelepon.setText(model.getValueAt(i, 7).toString());
        txtpenyakit.setText(model.getValueAt(i, 8).toString());
    }

}