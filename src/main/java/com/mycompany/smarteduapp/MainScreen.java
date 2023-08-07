/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.smarteduapp;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ethan
 */
public class MainScreen extends javax.swing.JFrame {
    GraphicsPanel gPanMon,gPanTue,gPanWed,gPanThu,gPanFri,gPanSat,gPanSun;

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        /*JPanel monPan = new JPanel();
        JPanel tuePan = new JPanel();
        JPanel wedPan = new JPanel();
        JPanel thuPan = new JPanel();
        JPanel friPan = new JPanel();
        JPanel satPan = new JPanel();
        JPanel sunPan = new JPanel();*/
        
        sched.setLayout(new GridLayout(1,7));
        sched.setSize(910, 433);
        
        /*sched.add(monPan);
        sched.add(tuePan);
        sched.add(wedPan);
        sched.add(thuPan);
        sched.add(friPan);
        sched.add(satPan);
        sched.add(sunPan);*/
        
        // Create and add graphics panels.
        gPanMon = new GraphicsPanel();
        gPanTue = new GraphicsPanel();
        gPanWed = new GraphicsPanel();
        gPanThu = new GraphicsPanel();
        gPanFri = new GraphicsPanel();
        gPanSat = new GraphicsPanel();
        gPanSun = new GraphicsPanel();
        
        sched.add(gPanMon);
        sched.add(gPanTue);
        sched.add(gPanWed);
        sched.add(gPanThu);
        sched.add(gPanFri);
        sched.add(gPanSat);
        sched.add(gPanSun);
        
        /*monPan.add(gPanMon);
        tuePan.add(gPanTue);
        wedPan.add(gPanWed);
        thuPan.add(gPanThu);
        friPan.add(gPanFri);
        satPan.add(gPanSat);
        sunPan.add(gPanSun);*/
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
        jPanel2 = new javax.swing.JPanel();
        scheduleButton = new javax.swing.JButton();
        assignmentButton = new javax.swing.JButton();
        fileButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sched = new javax.swing.JPanel();
        addCourseButton = new javax.swing.JButton();
        deleteCourseButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 196, 15));

        jPanel2.setBackground(new java.awt.Color(34, 116, 165));

        scheduleButton.setBackground(new java.awt.Color(34, 116, 165));
        scheduleButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        scheduleButton.setForeground(new java.awt.Color(255, 255, 255));
        scheduleButton.setText("Schedule");
        scheduleButton.setBorderPainted(false);
        scheduleButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        scheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleButtonActionPerformed(evt);
            }
        });

        assignmentButton.setBackground(new java.awt.Color(34, 116, 165));
        assignmentButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        assignmentButton.setForeground(new java.awt.Color(255, 255, 255));
        assignmentButton.setText("Assignments");
        assignmentButton.setBorderPainted(false);
        assignmentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        assignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignmentButtonActionPerformed(evt);
            }
        });

        fileButton.setBackground(new java.awt.Color(34, 116, 165));
        fileButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        fileButton.setForeground(new java.awt.Color(255, 255, 255));
        fileButton.setText("Files");
        fileButton.setBorderPainted(false);
        fileButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 196, 174));
        jLabel2.setText("SmartEDU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scheduleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignmentButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(25, 25, 25)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(scheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel2)
                    .addContainerGap(483, Short.MAX_VALUE)))
        );

        sched.setBackground(new java.awt.Color(255, 255, 255));
        sched.setMinimumSize(new java.awt.Dimension(910, 420));

        javax.swing.GroupLayout schedLayout = new javax.swing.GroupLayout(sched);
        sched.setLayout(schedLayout);
        schedLayout.setHorizontalGroup(
            schedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        schedLayout.setVerticalGroup(
            schedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        addCourseButton.setBackground(new java.awt.Color(34, 116, 165));
        addCourseButton.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        addCourseButton.setForeground(new java.awt.Color(255, 255, 255));
        addCourseButton.setText("Add Course");
        addCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseButtonActionPerformed(evt);
            }
        });

        deleteCourseButton.setBackground(new java.awt.Color(34, 116, 165));
        deleteCourseButton.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        deleteCourseButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteCourseButton.setText("Delete Course");
        deleteCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monday");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tuesday");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Wednesday");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Thursday");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Friday");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Saturday");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sunday");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sched, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(deleteCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel7)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel8)
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sched, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleButtonActionPerformed

    private void assignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignmentButtonActionPerformed
        this.setVisible(false);
        SmartEDUApp.assign.setVisible(true);
    }//GEN-LAST:event_assignmentButtonActionPerformed

    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileButtonActionPerformed

    private void addCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseButtonActionPerformed
        new AddClassScreen().setVisible(true);
    }//GEN-LAST:event_addCourseButtonActionPerformed

    private void deleteCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseButtonActionPerformed
        new DeleteClassScreen().setVisible(true);
    }//GEN-LAST:event_deleteCourseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseButton;
    private javax.swing.JButton assignmentButton;
    private javax.swing.JButton deleteCourseButton;
    private javax.swing.JButton fileButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel sched;
    private javax.swing.JButton scheduleButton;
    // End of variables declaration//GEN-END:variables
}
