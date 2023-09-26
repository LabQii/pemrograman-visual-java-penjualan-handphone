/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import control.pelanggan;
import control.utama;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class frmPelanggan extends javax.swing.JDialog {
    pelanggan pl;
    utama ut;
    /**
     * Creates new form frmInputBarang
     */
    public frmPelanggan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ut = new utama();
        this.setLocationRelativeTo(null);
        pl = new pelanggan();
        tampil();
       
    }

    public void tampil(){
         jTable1.setModel(pl.model);
        pl.model.setRowCount(0);
        pl.tampil();
    }
    public void clear(){
        txnomor.setText("");
        txid.setText("");
        txalamat.setText("");
        txnama.setText("");
        jTable1.clearSelection();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txid = new javax.swing.JTextField();
        txnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txalamat = new javax.swing.JTextField();
        txnomor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(51, 153, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 153));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 13, 575, 431));

        jPanel1.setBackground(new java.awt.Color(215, 215, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATA BARANG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setText("NAMA PELANGGAN");

        txid.setEditable(false);
        txid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txidKeyTyped(evt);
            }
        });

        txnama.setEditable(false);
        txnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txnamaKeyTyped(evt);
            }
        });

        jLabel2.setText("ID PELANGGAN");

        jLabel3.setText("ALAMAT PELANGGAN");

        txalamat.setEditable(false);
        txalamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txalamatKeyTyped(evt);
            }
        });

        txnomor.setEditable(false);
        txnomor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txnomorKeyTyped(evt);
            }
        });

        jLabel4.setText("NOMOR TELEPON");

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_35px.png"))); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.setEnabled(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(txalamat, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(txnomor)
                        .addComponent(txnama)
                        .addComponent(txid)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(txnomor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 431));

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_40px.png"))); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.setEnabled(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 451, 122, 36));

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_new_document_40px.png"))); // NOI18N
        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 451, 122, 36));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_35px_1.png"))); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 451, 122, 36));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_property_35px.png"))); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 451, 122, 36));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_back_to_70px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 451, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
          String kode = txid.getText();
        try {
            pl.hapus(kode);
                   JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL DI HAPUS");
            tampil();
            clear();
           
        } catch (SQLException ex) {
            Logger.getLogger(frmPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txid.setEditable(true);
        txnama.setEditable(true);
        txalamat.setEditable(true);
        txnomor.setEditable(true);
        btnSimpan.setEnabled(true);
        btnCancel.setEnabled(true);
        btnNew.setEnabled(false);
        txid.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
          txid.setEditable(false);
        txnama.setEditable(false);
        txalamat.setEditable(false);
        txnomor.setEditable(false);
        btnSimpan.setEnabled(false);
        btnCancel.setEnabled(false);
        btnHapus.setEnabled(false);
        btnEdit.setEnabled(false);
        btnNew.setEnabled(true);
        clear();
        jTable1.clearSelection();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        edit = true;
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
        btnSimpan.setEnabled(true);
         txnama.setEditable(true);
        txalamat.setEditable(true);
        txnomor.setEditable(true);
        txnama.requestFocus();
    }//GEN-LAST:event_btnEditActionPerformed
boolean edit = false;
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
       
        if(edit==true){
           String idpelanggan = txid.getText();
         String nama = txnama.getText();
         String alamat = txalamat.getText();
         String nomor = txnomor.getText();
            try {
                pl.edit(idpelanggan, nama, alamat, nomor);
                 JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL DI UPDATE");
           tampil();
            clear();
                txid.setEditable(false);
        txnama.setEditable(false);
        txalamat.setEditable(false);
        txnomor.setEditable(false);
        btnSimpan.setEnabled(false);
        btnCancel.setEnabled(false);
        btnNew.setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(frmPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
         String idpelanggan = txid.getText();
         String nama = txnama.getText();
         String alamat = txalamat.getText();
         String nomor = txnomor.getText();
         
        try {
            pl.simpan(idpelanggan, nama, alamat, nomor);
            JOptionPane.showMessageDialog(rootPane, "DATA BERHASIL DISIMPAN");
            tampil();
            
            clear();
            btnSimpan.setEnabled(false);
            btnCancel.setEnabled(false);
            btnNew.setEnabled(true);
                txid.setEditable(false);
        txnama.setEditable(false);
        txalamat.setEditable(false);
        txnomor.setEditable(false);
        btnSimpan.setEnabled(false);
        btnCancel.setEnabled(false);
        btnNew.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        txid.setText(jTable1.getValueAt(row, 0).toString());
        txnama.setText(jTable1.getValueAt(row, 1).toString());
        txalamat.setText(jTable1.getValueAt(row, 2).toString());
        txnomor.setText(jTable1.getValueAt(row, 3).toString());
        btnEdit.setEnabled(true);
        btnHapus.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ut.tampilCountBrg();
        ut.tampilCountPlg();
        ut.tampilCountTrx();
    }//GEN-LAST:event_formWindowClosing

    private void txidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txidKeyTyped
        // TODO add your handling code here:
        if(txid.getText().length()==5){
            evt.consume();
        }
    }//GEN-LAST:event_txidKeyTyped

    private void txnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txnamaKeyTyped
        // TODO add your handling code here:
          if(txnama.getText().length()==30){
            evt.consume();
        }
    }//GEN-LAST:event_txnamaKeyTyped

    private void txalamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txalamatKeyTyped
        // TODO add your handling code here:
          if(txalamat.getText().length()==40){
            evt.consume();
        }
    }//GEN-LAST:event_txalamatKeyTyped

    private void txnomorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txnomorKeyTyped
        // TODO add your handling code here:
          if(txnomor.getText().length()==16){
            evt.consume();
        }
    }//GEN-LAST:event_txnomorKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         FormUtama back = new FormUtama();
        dispose();
        back.setVisible(true);
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
            java.util.logging.Logger.getLogger(frmPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCariBarang dialog = new frmCariBarang(new javax.swing.JFrame(), true,"");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txalamat;
    public static javax.swing.JTextField txid;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txnomor;
    // End of variables declaration//GEN-END:variables
}
