/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencatatan.admin;

import pencatatan.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agus.S
 */
public class dataOperator extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    DefaultTableModel model;
    public dataOperator() {
        initComponents();
        String [] judul = {"Id","Nama","Username","Password"};
        model = new DefaultTableModel(judul,0);
        tabel.setModel(model);
        tampilkan();
    }
    
    private void reset(){
        id.setText("");
        nama.setText("");
        username.setText("");
        password.setText("");
        
    }

    dataOperator(Object object, boolean b) {
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
        tetx_kembali = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        buat = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        text_administrator.setText("Administrator");
        text_administrator.setFocusable(false);
        nav.add(text_administrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, -1));

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
        jLabel8.setText("Home > Data Operator");
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        bg.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 690, 30));

        tetx_kembali.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tetx_kembali.setForeground(new java.awt.Color(35, 63, 116));
        tetx_kembali.setText("   Kembali");
        tetx_kembali.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(35, 63, 116)));
        tetx_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tetx_kembaliMouseClicked(evt);
            }
        });
        bg.add(tetx_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 70, 28));

        id.setBackground(new java.awt.Color(204, 204, 204));
        id.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        bg.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 300, 30));

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        bg.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 300, 30));

        username.setBackground(new java.awt.Color(204, 204, 204));
        username.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        bg.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 300, 30));

        buat.setBackground(new java.awt.Color(255, 255, 255));
        buat.setForeground(new java.awt.Color(0, 0, 0));
        buat.setText("Buat");
        buat.setFocusable(false);
        buat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatActionPerformed(evt);
            }
        });
        bg.add(buat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        ubah.setBackground(new java.awt.Color(255, 255, 255));
        ubah.setForeground(new java.awt.Color(0, 0, 0));
        ubah.setText("Ubah");
        ubah.setFocusable(false);
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        bg.add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        hapus.setBackground(new java.awt.Color(255, 255, 255));
        hapus.setForeground(new java.awt.Color(0, 0, 0));
        hapus.setText("Hapus");
        hapus.setFocusable(false);
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        bg.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        batal.setBackground(new java.awt.Color(255, 255, 255));
        batal.setForeground(new java.awt.Color(0, 0, 0));
        batal.setText("Batal");
        batal.setFocusable(false);
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        bg.add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));

        tabel.setBackground(new java.awt.Color(255, 255, 255));
        tabel.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabel.setForeground(new java.awt.Color(0, 0, 0));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 690, 160));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Id");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Password");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Username");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, 20));

        nama.setBackground(new java.awt.Color(204, 204, 204));
        nama.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        nama.setForeground(new java.awt.Color(0, 0, 0));
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        bg.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 300, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nama");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Home");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Version 0.0");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 76, -1, -1));

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

    private void tetx_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tetx_kembaliMouseClicked
        // TODO add your handling code here:
        new HomePage().show();
        this.dispose();
    }//GEN-LAST:event_tetx_kembaliMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void buatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/pencatatan","root","");
            cn.createStatement().executeUpdate("insert into operator value"+"('"+id.getText()+"','"+nama.getText()+"','"+username.getText()+"','"+password.getText()+"')");
            tampilkan();
            JOptionPane.showMessageDialog(null,"Berhasil dibuat....!!");
            reset();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data Required / id sama");
        }
    }//GEN-LAST:event_buatActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/pencatatan","root","");
            cn.createStatement().executeUpdate("update operator set nama ='"+nama.getText()+"',username ='"+username.getText()+"',password ='"+password.getText()+"' where id ='"+id.getText()+"'");
            tampilkan();
            JOptionPane.showMessageDialog(null,"Berhasil diubah....!!");
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(dataTernak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/pencatatan","root","");
            cn.createStatement().executeUpdate("delete from operator where id='"+id.getText()+"'");
            tampilkan();
            JOptionPane.showMessageDialog(null,"Berhasil dihapus....!!");
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(dataTernak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_batalActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int i = tabel.getSelectedRow();

        if(i>-1){
            id.setText(model.getValueAt(i, 0).toString());
            nama.setText(model.getValueAt(i, 1).toString());
            username.setText(model.getValueAt(i, 2).toString());
            password.setText(model.getValueAt(i, 3).toString());
            

        }
    }//GEN-LAST:event_tabelMouseClicked

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JPanel bg;
    private javax.swing.JButton buat;
    private javax.swing.JButton hapus;
    private javax.swing.JPanel home_nav;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon_add;
    private javax.swing.JLabel icon_add2;
    private javax.swing.JLabel icon_home;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JPanel nav;
    private javax.swing.JTextField password;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel tetx_kembali;
    private javax.swing.JLabel text_administrator;
    private javax.swing.JLabel text_dashboard;
    private javax.swing.JLabel text_profil;
    private javax.swing.JLabel text_tentang;
    private javax.swing.JButton ubah;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        //To change body of generated methods, choose Tools | Templates.
        int row = tabel.getRowCount();
        for(int a = 0; a<row;a++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/pencatatan","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM operator");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pencatatan.operator.dataTernak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
