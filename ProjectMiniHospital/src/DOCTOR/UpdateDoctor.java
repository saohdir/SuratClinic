/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOCTOR;

import ADMIN.Admin_Activity;
import CASHIER.UpdateCashier;
import DB.Connector;
import static DOCTOR.AddDoctor.dob;
import static DOCTOR.AddDoctor.sql;
import com.toedter.calendar.JDateChooser;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author surap
 */
public class UpdateDoctor extends javax.swing.JFrame {

    Connection connection = null;
    static Statement st;
    static ResultSet rs;
    static PreparedStatement ps;
    static String sql, uId, uName, ruangan,spesialis,
            addrs, gender, dob, usia, phone, email, user1, pass1;
    int flag =0;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    /**
     * Creates new form UpdateDoctor
     */

    public UpdateDoctor() {
        initComponents();

        Object columns[] = {"Count", "Tanggal", "id_dokter", "Nama_Dokter", "Usia", "Jenis_Kelamin", "Spesialis", "Nomor_Telepon", "Email", "Alamat", "Ruangan", "username", "password"};
        defaultTableModel.setColumnIdentifiers(columns);
        tblDokter.setModel(defaultTableModel);
        txtiddokter.setEnabled(false);
        TextPrompt cari = new TextPrompt("Berdasarkan Nama", txtcari);
tblDokter.getTableHeader().setDefaultRenderer(new HeaderColor());
        JTextFieldDateEditor jd;
        jd = (JTextFieldDateEditor) jDateChooser.getDateEditor();
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
        btnubah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDokter = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();
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
        jLabel1.setText("Id Dokter");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 165, 93));
        jLabel2.setText("Nama Dokter");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(113, 165, 93));
        jLabel3.setText("Jenis Kelamin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

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
        jLabel7.setText("Spesialis");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(113, 165, 93));
        jLabel8.setText("Ruangan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(113, 165, 93));
        jLabel9.setText("Tanggal");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        txtiddokter.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtiddokter.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jPanel1.add(txtiddokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 189, -1));

        txtnamadokter.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtnamadokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 189, -1));

        buttonGroup1.add(rbpria);
        rbpria.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        rbpria.setText("Pria");
        jPanel1.add(rbpria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        buttonGroup1.add(rbwanita);
        rbwanita.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        rbwanita.setText("Wanita");
        jPanel1.add(rbwanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        txtusia.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtusia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusiaKeyTyped(evt);
            }
        });
        jPanel1.add(txtusia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 189, -1));

        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 230, -1));

        txtnomortelepon.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtnomortelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomorteleponKeyTyped(evt);
            }
        });
        jPanel1.add(txtnomortelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 230, -1));

        txtruangan.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtruangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 230, -1));

        jDateChooser.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 190, 30));

        btnubah.setBackground(new java.awt.Color(113, 165, 93));
        btnubah.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnubah.setForeground(new java.awt.Color(51, 51, 51));
        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });
        jPanel1.add(btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 390, 120, 47));

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
                "Count", "Tanggal", "Id_dokter", "Nama_Dokter", "Usia", "Jenis_Kelamin", "Spesialis", "Nomor_Telepon", "Email", "Alamat", "Ruangan", "username", "password"
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
        tblDokter.getTableHeader().setResizingAllowed(false);
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 1510, 160));

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
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 560, 200, 30));

        btncari.setBackground(new java.awt.Color(113, 165, 93));
        btncari.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btncari.setForeground(new java.awt.Color(51, 51, 51));
        btncari.setText("CARI");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        jPanel1.add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 560, 90, -1));

        btnkembali.setBackground(new java.awt.Color(51, 51, 51));
        btnkembali.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnkembali.setForeground(new java.awt.Color(204, 204, 204));
        btnkembali.setText("KEMBALI");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 390, 130, 47));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("COCOMAT", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ubah Dokter");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(616, 616, 616)
                .addComponent(jLabel10)
                .addContainerGap(695, Short.MAX_VALUE))
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
        jPanel1.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 390, 120, 50));

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(113, 165, 93));
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 220, -1, -1));

        txtusername.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 210, 230, -1));

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(113, 165, 93));
        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 290, -1, -1));

        txtpassword.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 280, 230, -1));

        jLabel13.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(113, 165, 93));
        jLabel13.setText("Email");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 160, -1, -1));

        txtemail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 150, 230, -1));

        cbspesialis.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cbspesialis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Spesialis", "Gigi", "THT", "Jantung" }));
        jPanel1.add(cbspesialis, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 230, 40));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        int ops = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Mengubah Data Ini?", "Information", JOptionPane.YES_NO_OPTION);
        if (ops == JOptionPane.NO_OPTION) {

            DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();
            dtm.setRowCount(0);
            loadtable();

        }
        if (ops == JOptionPane.YES_OPTION) {
            if (txtalamat.getText().equals("") || txtnamadokter.getText().equals("")
                    || txtnomortelepon.getText().equals("") || cbspesialis.getSelectedItem().toString().equals("Pilih Spesialis")
                    || txtruangan.getText().equals("") || txtusia.getText().equals("") || txtusername.getText().equals("") || txtpassword.getText().equals("") || txtemail.getText().equals("")
                    || buttonGroup1.isSelected(null) || jDateChooser.getDate().equals(null)) {
                JOptionPane.showMessageDialog(null, "Form Pengisian Tidak Boleh Kosong", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
            String emailp = "^[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z]{1,20}$";
            Pattern pattern = Pattern.compile(emailp);
            Matcher regexMatcher = pattern.matcher(txtemail.getText());
            if (!regexMatcher.matches()) {
                JOptionPane.showMessageDialog(null, "Email Bermasalah", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();
                dtm.setRowCount(0);
                loadtable();

            } else {

                getfield();
                connection = Connector.ConnectDb();
                try {
                    sql = "UPDATE tbl_dokter SET Tanggal = ?, Nama_Dokter = ?, Usia = ?,Jenis_Kelamin = ?,Spesialis = ?, Nomor_Telepon = ?,Email = ?,Alamat = ?,Ruangan = ?, username = ?, password = ? WHERE Id_dokter = ?";
                    ps = connection.prepareStatement(sql);

                    ps.setString(1, dob);
                    ps.setString(2, uName);
                    ps.setString(3, usia);
                    ps.setString(4, gender);
                    ps.setString(5, spesialis);
                    ps.setString(6, phone);
                    ps.setString(7, email);
                    ps.setString(8, addrs);
                    ps.setString(9, ruangan);
                    ps.setString(10, user1);
                    ps.setString(11, pass1);
                    ps.setString(12, uId);
                    int rs = ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Sudah Terperbaharui");
                    DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();
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

    private void tblDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDokterMouseClicked

        int i = tblDokter.getSelectedRow();
        TableModel model = tblDokter.getModel();
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(i, 1));
            jDateChooser.setDate(date);
        } catch (Exception e) {

        }
        txtiddokter.setText(model.getValueAt(i, 2).toString());
        txtnamadokter.setText(model.getValueAt(i, 3).toString());
        txtusia.setText(model.getValueAt(i, 4).toString());
        String sex = model.getValueAt(i, 5).toString();
        if (sex.equals("Pria")) {
            rbpria.setSelected(true);
        } else {
            rbwanita.setSelected(true);
        }
        txtemail.setText(model.getValueAt(i, 8).toString());
        txtnomortelepon.setText(model.getValueAt(i, 7).toString());
        String penyakit = model.getValueAt(i, 6).toString();
        switch (penyakit) {
            case "Pilih Spesialis":
                cbspesialis.setSelectedIndex(0);
                break;
            case "Gigi":
                cbspesialis.setSelectedIndex(1);
                break;
            case "THT":
                cbspesialis.setSelectedIndex(2);
                break;
            case "Jantung":
                cbspesialis.setSelectedIndex(3);
                break;
        }
        txtruangan.setText(model.getValueAt(i, 10).toString());
        txtusername.setText(model.getValueAt(i, 11).toString());
        txtpassword.setText(model.getValueAt(i, 12).toString());
        txtalamat.setText(model.getValueAt(i, 9).toString());

    }//GEN-LAST:event_tblDokterMouseClicked

    private void txtcariInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtcariInputMethodTextChanged

    }//GEN-LAST:event_txtcariInputMethodTextChanged

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        if(txtcari.getText().equals("")){
        DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();
        dtm.setRowCount(0);
        loadtable();  
        }
    }//GEN-LAST:event_txtcariKeyReleased

    private void txtcariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyTyped

    }//GEN-LAST:event_txtcariKeyTyped

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        flag = 1;
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String search = txtcari.getText().toString();
        connection = Connector.ConnectDb();
        try {
            flag = 0;
            sql = "select Count,Tanggal,id_dokter,Nama_Dokter,Usia,Jenis_Kelamin,Spesialis,Nomor_Telepon,Email,Alamat,Ruangan,username,password from tbl_dokter where Nama_Dokter = '" + search + "'";

            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[14];
            while (rs.next()) {
                flag = 1;
                columnData[0] = rs.getString("Count");
                columnData[1] = rs.getString("Tanggal");
                columnData[2] = rs.getString("id_dokter");
                columnData[3] = rs.getString("Nama_Dokter");
                columnData[4] = rs.getString("Usia");
                columnData[5] = rs.getString("Jenis_Kelamin");
                columnData[6] = rs.getString("Spesialis");
                columnData[7] = rs.getString("Nomor_Telepon");
                columnData[8] = rs.getString("Email");
                columnData[9] = rs.getString("Alamat");
                columnData[10] = rs.getString("Ruangan");
                columnData[11] = rs.getString("username");
                columnData[12] = rs.getString("password");
                defaultTableModel.addRow(columnData);
            }
            if (flag == 0) {
                DefaultTableModel dtm = (DefaultTableModel) tblDokter.getModel();
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
        Admin_Activity AA = new Admin_Activity();
        AA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        clear();
    }//GEN-LAST:event_btnresetActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

    }//GEN-LAST:event_jPanel1MouseMoved

    private void txtcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseClicked

    }//GEN-LAST:event_txtcariMouseClicked

    private void txtcariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseEntered

    }//GEN-LAST:event_txtcariMouseEntered

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
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnubah;
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
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton rbpria;
    private javax.swing.JRadioButton rbwanita;
    private javax.swing.JTable tblDokter;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
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
