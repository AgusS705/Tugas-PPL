/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencatatan.operator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agus.S
 */
public class catat extends javax.swing.JFrame {

    /**
     * Creates new form catat
     */
    DefaultTableModel model;
    DefaultTableModel model1;
    public catat() {
        initComponents();
        String [] judul = {"Nomer Ternak","Nomer Sapih","Tanggal Lahir / Jenis Kelamin","Jenis Hewan","Nomer Induk / Jantan","Status","Bobot","Kondisi Badan"};
        String [] judul1 = {"Nomer Ternak","Tgl Penimbangan","Bobot","Keterangan"};
        model = new DefaultTableModel(judul,0);
        model1 = new DefaultTableModel(judul1,1);
        tabel.setModel(model);
        tabel1.setModel(model1);
        tampilkan();
        tampilkan1();
    }
    
//    private void reset(){
//        nomer_ternak1.setText("");
//        tgl_penimbangan.setDate(null);
//        bobot.setText("");
//        keterangan1.setText("");
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tetx_kembali = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ubah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        nomer_ternak = new javax.swing.JTextField();
        tanggal_penimbangan = new com.toedter.calendar.JDateChooser();
        bobot = new javax.swing.JTextField();
        keterangan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        jPanel13.setBackground(new java.awt.Color(35, 63, 116));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Home > Pencatatan");
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        bg.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 940, 30));

        tetx_kembali.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tetx_kembali.setForeground(new java.awt.Color(35, 63, 116));
        tetx_kembali.setText("   Kembali");
        tetx_kembali.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 63, 116)));
        tetx_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tetx_kembaliMouseClicked(evt);
            }
        });
        bg.add(tetx_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 520, 70, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Home");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Version 0.0");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 50, 50, 20));

        ubah.setBackground(new java.awt.Color(255, 255, 255));
        ubah.setForeground(new java.awt.Color(0, 0, 0));
        ubah.setText("Ubah");
        ubah.setFocusable(false);
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        bg.add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

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

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 520, 120));

        nomer_ternak.setBackground(new java.awt.Color(204, 204, 204));
        nomer_ternak.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        nomer_ternak.setForeground(new java.awt.Color(0, 0, 0));
        nomer_ternak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomer_ternakActionPerformed(evt);
            }
        });
        bg.add(nomer_ternak, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, 30));

        tanggal_penimbangan.setBackground(new java.awt.Color(204, 204, 204));
        tanggal_penimbangan.setForeground(new java.awt.Color(0, 0, 0));
        tanggal_penimbangan.setDateFormatString("dd-MM-yyyy");
        tanggal_penimbangan.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tanggal_penimbangan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggal_penimbanganPropertyChange(evt);
            }
        });
        bg.add(tanggal_penimbangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 180, 30));

        bobot.setBackground(new java.awt.Color(204, 204, 204));
        bobot.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        bobot.setForeground(new java.awt.Color(0, 0, 0));
        bobot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobotActionPerformed(evt);
            }
        });
        bg.add(bobot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 180, 30));

        keterangan.setBackground(new java.awt.Color(204, 204, 204));
        keterangan.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        keterangan.setForeground(new java.awt.Color(0, 0, 0));
        keterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keteranganActionPerformed(evt);
            }
        });
        bg.add(keterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 180, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Keterangan");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Bobot");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Tanggal Penimbangan");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nomer Ternak");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 20));

        tabel1.setBackground(new java.awt.Color(255, 255, 255));
        tabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabel1.setForeground(new java.awt.Color(0, 0, 0));
        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nomer Ternak", "Tgl Penimbangan", "Bobot", "Keterangan"
            }
        ));
        tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel1);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 320, 190));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Tabel riwayat bobot");
        bg.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4KeyPressed

    private void tetx_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tetx_kembaliMouseClicked
        // TODO add your handling code here:
        new HomepageOperator().show();
        this.dispose();
    }//GEN-LAST:event_tetx_kembaliMouseClicked

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        try {
            // TODO add your handling code here:
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ternak","root","");
            Connection cn1 = DriverManager.getConnection("jdbc:mysql://localhost/ternak","root","");

            cn.createStatement().executeUpdate("update riwayat_bobot set tanggal_penimbangan ='"+dateFormat.format(tanggal_penimbangan.getDate())+"'bobot='"+bobot.getText()+"'keterangan='"+keterangan.getText()+"'where nomer_ternak ='"+nomer_ternak.getText()+"'");
//            cn1.createStatement().executeUpdate("update riwayat_kesehatan set nomer_ternak ='"+nomer_ternak1.getText()+"' tanggal ='"+dateFormat1.format(tanggal.getDate())+"'gejala='"+gejala.getText()+"'diagnosa='"+diagnosa.getText()+"'tindakan='"+tindakan.getText()+"'keterangan1='"+keterangan1.getText()+"'");

            tampilkan1();
//            tampilkan2();
            JOptionPane.showMessageDialog(null,"Berhasil disimpan....!!");
//            reset();
//            reset1();
        } catch (SQLException ex) {
            Logger.getLogger(catat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int i = tabel.getSelectedRow();

        if(i>-1){
            nomer_ternak.setText(model.getValueAt(i, 0).toString());
//            nomer_ternak1.setText(model.getValueAt(i, 0).toString());

        }
    }//GEN-LAST:event_tabelMouseClicked

    private void nomer_ternakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomer_ternakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomer_ternakActionPerformed

    private void tanggal_penimbanganPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggal_penimbanganPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggal_penimbanganPropertyChange

    private void bobotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bobotActionPerformed

    private void keteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keteranganActionPerformed

    private void tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel1MouseClicked
        // TODO add your handling code here:
        int i = tabel1.getSelectedRow();

        if(i>-1){
            nomer_ternak.setText(model1.getValueAt(i, 0).toString());
            bobot.setText(model1.getValueAt(i, 2).toString());
            keterangan.setText(model1.getValueAt(i, 3).toString());
        }
        try {
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse((String)model1.getValueAt(i, 1).toString());
            tanggal_penimbangan.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(dataTernak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabel1MouseClicked

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
            java.util.logging.Logger.getLogger(catat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(catat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(catat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(catat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new catat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JTextField bobot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keterangan;
    private javax.swing.JTextField nomer_ternak;
    private javax.swing.JTable tabel;
    private javax.swing.JTable tabel1;
    private com.toedter.calendar.JDateChooser tanggal_penimbangan;
    private javax.swing.JLabel tetx_kembali;
    private javax.swing.JButton ubah;
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
    
    private void tampilkan1() {
        //To change body of generated methods, choose Tools | Templates.
        int row1 = tabel1.getRowCount();
        for(int a = 0; a<row1;a++){
            model1.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ternak","root","");
            ResultSet rs1 = cn.createStatement().executeQuery("SELECT * FROM riwayat_bobot");
            while(rs1.next()){
                String data1 [] = {rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4)};
                model1.addRow(data1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pencatatan.operator.dataTernak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
