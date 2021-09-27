/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro1e.UI.chill;

import com.pro1e.DAO.nhiemvuDAO;
import com.pro1e.UI.TAOnhiemvu;
import com.pro1e.utils.magbox;
import duan1.model.NhiemVu;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huyNQph11019
 */
public class PNlisstfile extends javax.swing.JDialog {

    /**
     * Creates new form PNlisstfile
     */
    nhiemvuDAO nvDAO = new nhiemvuDAO();
    NhiemVu taoNv;

    public PNlisstfile(NhiemVu nv) {
        initComponents();
        this.taoNv = nv;
        this.setLocationRelativeTo(null);
        txtfile.setText(nv.getFileIn());
    }

    void openFile(String str) {
        try {
            Desktop.getDesktop().browse(new URI(str));
        } catch (IOException e) {
            magbox.mgbox(this, "không mở được");
        } catch (URISyntaxException ex) {
            Logger.getLogger(PNlisstfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtfile = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(240, 150));
        setSize(new java.awt.Dimension(240, 150));
        getContentPane().setLayout(null);

        txtfile.setColumns(20);
        txtfile.setRows(5);
        txtfile.setWrapStyleWord(true);
        txtfile.setPreferredSize(new java.awt.Dimension(150, 94));
        jScrollPane2.setViewportView(txtfile);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(2, 0, 230, 90);

        jButton2.setBackground(new java.awt.Color(0, 255, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 90, 105, 21);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 90, 97, 21);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        taoNv.setFileIn(txtfile.getText());
        System.out.println(taoNv.toString());
        if (nvDAO.update(taoNv) > 0) {
            this.dispose();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
                 openFile(taoNv.getFileIn());
        } catch (Exception e) {
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PNlisstfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PNlisstfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PNlisstfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PNlisstfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                PNlisstfile dialog = new PNlisstfile(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtfile;
    // End of variables declaration//GEN-END:variables
}
