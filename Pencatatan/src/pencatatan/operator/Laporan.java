/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencatatan.operator;

import pencatatan.Login;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Agus.S
 */
public class Laporan extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    DefaultTableModel model;
    public Laporan() {
        initComponents();
        String [] judul = {"Nomer Ternak","Nomer Sapih","Tanggal Lahir / Jenis Kelamin","Jenis Hewan","Nomer Induk / Jantan","Status","Bobot","Kondisi Badan"};
        model = new DefaultTableModel(judul,0);
        tabel.setModel(model);
        tampilkan();
    }
    
    Laporan(Object object, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        text_administrator = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        home_nav = new javax.swing.JPanel();
        icon_home = new javax.swing.JLabel();
        text_dashboard = new javax.swing.JLabel();
        icon_add = new javax.swing.JLabel();
        text_profil = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        text_tentang = new javax.swing.JLabel();
        icon_add2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        text_kembali = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCetak = new javax.swing.JTextField();
        cetak = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(35, 63, 116));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_administrator.setBackground(new java.awt.Color(255, 255, 255));
        text_administrator.setFont(new java.awt.Font("Segoe UI Light", 0, 23)); // NOI18N
        text_administrator.setForeground(new java.awt.Color(204, 204, 204));
        text_administrator.setText("Operator");
        text_administrator.setFocusable(false);
        nav.add(text_administrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boss.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nav.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 54, -1, -1));

        home_nav.setBackground(new java.awt.Color(255, 255, 255));
        home_nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        home_nav.add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        text_dashboard.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        text_dashboard.setForeground(new java.awt.Color(0, 0, 0));
        text_dashboard.setText("Home");
        home_nav.add(text_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        nav.add(home_nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 212, 200, 43));

        icon_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        nav.add(icon_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 274, -1, -1));

        text_profil.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        text_profil.setForeground(new java.awt.Color(255, 255, 255));
        text_profil.setText("Profil");
        text_profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_profilMouseClicked(evt);
            }
        });
        nav.add(text_profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 273, -1, -1));

        jButton1.setBackground(new java.awt.Color(35, 63, 116));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log out");
        jButton1.setBorderPainted(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        nav.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        text_tentang.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        text_tentang.setForeground(new java.awt.Color(255, 255, 255));
        text_tentang.setText("Tentang");
        text_tentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_tentangMouseClicked(evt);
            }
        });
        nav.add(text_tentang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        icon_add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        nav.add(icon_add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        bg.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 570));

        jPanel2.setBackground(new java.awt.Color(35, 63, 116));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel4KeyPressed(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 760, 30));

        jPanel13.setBackground(new java.awt.Color(35, 63, 116));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Home > Laporan");
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        bg.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 690, 30));

        text_kembali.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        text_kembali.setForeground(new java.awt.Color(35, 63, 116));
        text_kembali.setText("   Kembali");
        text_kembali.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 63, 116)));
        text_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_kembaliMouseClicked(evt);
            }
        });
        bg.add(text_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 70, 28));

        tabel.setBackground(new java.awt.Color(255, 255, 255));
        tabel.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabel.setForeground(new java.awt.Color(0, 0, 0));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nomer Ternak", "Tanggal Sapih", "Tanggal lahir/tipe kelamin", "Jenis Hewan", "Nomor Induk/Jantan", "Bobot", "Status", "Keterangan"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 610, 230));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DATA TERNAK");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        txtCetak.setBackground(new java.awt.Color(255, 255, 255));
        txtCetak.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(txtCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 160, 30));

        cetak.setBackground(new java.awt.Color(255, 255, 255));
        cetak.setForeground(new java.awt.Color(0, 0, 0));
        cetak.setText("Cetak");
        cetak.setFocusPainted(false);
        cetak.setFocusable(false);
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        bg.add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 100, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Home");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Version 0.0");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 76, -1, -1));

        cari.setBackground(new java.awt.Color(255, 255, 255));
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });
        bg.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Search");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 70, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 570));

        setSize(new java.awt.Dimension(958, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void text_profilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_profilMouseClicked
        // TODO add your handling code here:
        new Profil().show();
        this.dispose();
    }//GEN-LAST:event_text_profilMouseClicked

    private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4KeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void text_tentangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_tentangMouseClicked
        // TODO add your handling code here:
        new About().show();
        this.dispose();
    }//GEN-LAST:event_text_tentangMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new Login().show();
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void text_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_kembaliMouseClicked
        // TODO add your handling code here:
        new HomepageOperator().show();
        this.dispose();
    }//GEN-LAST:event_text_kembaliMouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int i = tabel.getSelectedRow();
        
        if(i>-1){
            txtCetak.setText(model.getValueAt(i, 0).toString());
            
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ternak","root","");
            try {
                    String report = ("C:\\Users\\Agus.S\\Documents\\NetBeansProjects\\Pencatatan\\src\\pencatatan\\operator\\report.jrxml");
                    HashMap hash = new HashMap();
                    hash.put("kode", txtCetak.getText());
                    JasperReport JRpt = JasperCompileManager.compileReport(report);
                    JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, con);
                    JasperViewer.viewReport(JPrint, false);
                }catch (Exception rptexcpt) {
                    System.out.println("Laporan tidak bisa diliahat : " + rptexcpt);
                }
            }catch (Exception e){
                System.out.println(e);
            }
        //        try {
            //            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("report_ternak.jasper"), null, koneksi.getConnection());
            //            JasperViewer.viewReport(jp, false);
            //        } catch(Exception e) {
            //            JOptionPane.showMessageDialog(rootPane, e);
            //        }
    }//GEN-LAST:event_cetakActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        // TODO add your handling code here:
        String search = cari.getText();
        TableRowSorter tr = new TableRowSorter(model);
        tabel.setRowSorter(tr);
        //set kolom pencarian (indeks kolom)
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_cariKeyReleased

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
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JTextField cari;
    private javax.swing.JButton cetak;
    private javax.swing.JPanel home_nav;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon_add;
    private javax.swing.JLabel icon_add2;
    private javax.swing.JLabel icon_home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nav;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel text_administrator;
    private javax.swing.JLabel text_dashboard;
    private javax.swing.JLabel text_kembali;
    private javax.swing.JLabel text_profil;
    private javax.swing.JLabel text_tentang;
    private javax.swing.JTextField txtCetak;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        //To change body of generated methods, choose Tools | Templates.
        int row = tabel.getRowCount();
        for(int a = 0; a<row;a++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ternak","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM ternak");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pencatatan.operator.dataTernak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
