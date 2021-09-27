/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro1e.UI.chill;

import com.pro1e.UI.HomeMenu;
import com.pro1e.UI.LoginForm;
import com.pro1e.UI.MainF;
import com.pro1e.utils.auth;
import com.pro1e.utils.magbox;
import java.awt.Color;

/**
 *
 * @author huyNQph11019
 */
public class listMenu extends javax.swing.JPanel {
    
    /**
     * Creates new form listMenu
     */
    MainF pa ;
    public listMenu(MainF pa) {
        initComponents();
        this.pa = pa;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnsetting = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlogout = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnexit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnhome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 102, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnsetting.setBackground(new java.awt.Color(0, 102, 204));
        pnsetting.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro1e/icon/icons8_settings_24px.png"))); // NOI18N
        pnsetting.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" SETTING");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        pnsetting.add(jLabel6, java.awt.BorderLayout.CENTER);

        add(pnsetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 50));

        pnlogout.setBackground(new java.awt.Color(0, 102, 204));
        pnlogout.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro1e/icon/icons8_exit_sign_24px.png"))); // NOI18N
        pnlogout.add(jLabel3, java.awt.BorderLayout.LINE_START);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" ĐĂNG XUẤT");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel4KeyReleased(evt);
            }
        });
        pnlogout.add(jLabel4, java.awt.BorderLayout.CENTER);

        add(pnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 50));

        pnexit.setBackground(new java.awt.Color(0, 102, 204));
        pnexit.setLayout(new java.awt.BorderLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro1e/icon/icons8_logout_rounded_left_24px.png"))); // NOI18N
        pnexit.add(jLabel7, java.awt.BorderLayout.LINE_START);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" EXIT");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        pnexit.add(jLabel8, java.awt.BorderLayout.CENTER);

        add(pnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 50));

        pnhome.setBackground(new java.awt.Color(0, 102, 204));
        pnhome.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" TRANG CHỦ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        pnhome.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro1e/icon/icons8_home_24px.png"))); // NOI18N
        pnhome.add(jLabel2, java.awt.BorderLayout.LINE_START);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        pnhome.add(jSeparator1, java.awt.BorderLayout.PAGE_START);

        add(pnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
      MainF.changeOnE(pnhome,jLabel1, new Color(96, 156 , 235), Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
      MainF.changeOnE(pnhome, jLabel1, new Color(0,102, 204), Color.white);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4KeyPressed

    private void jLabel4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4KeyReleased

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
         MainF.changeOnE(pnsetting,jLabel6, new Color(96, 156 , 235), Color.red);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
         MainF.changeOnE(pnsetting,jLabel6, new Color(0,102, 204), Color.white);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
          MainF.changeOnE(pnlogout,jLabel4, new Color(96, 156 , 235), Color.red);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
         MainF.changeOnE(pnlogout,jLabel4, new Color(0,102, 204), Color.white);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        MainF.changeOnE(pnexit,jLabel8, new Color(96, 156 , 235), Color.red);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
         MainF.changeOnE(pnexit,jLabel8, new Color(0,102, 204), Color.white);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        pa.openForm(new HomeMenu(pa));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       pa.dispose();
        auth.curentNVien = null;
       new LoginForm().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (magbox.confirm(pa, "bạn muốn thoát")) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnexit;
    private javax.swing.JPanel pnhome;
    private javax.swing.JPanel pnlogout;
    private javax.swing.JPanel pnsetting;
    // End of variables declaration//GEN-END:variables
}
