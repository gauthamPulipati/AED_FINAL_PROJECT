/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalEnterpriseAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class HospitalEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalEnterpriseAdminJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem business;
    
    public HospitalEnterpriseAdminJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateHospAdmin = new javax.swing.JButton();
        btnCreateHospital = new javax.swing.JButton();
        btnCreateLabAdmin = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(155, 231, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreateHospAdmin.setFont(new java.awt.Font("Georgia", 1, 17)); // NOI18N
        btnCreateHospAdmin.setText("Create Lab Technician");
        btnCreateHospAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospAdminActionPerformed(evt);
            }
        });
        add(btnCreateHospAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 357, -1, 107));

        btnCreateHospital.setFont(new java.awt.Font("Georgia", 1, 17)); // NOI18N
        btnCreateHospital.setText("Create Hospital");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });
        add(btnCreateHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 195, 227, 107));

        btnCreateLabAdmin.setFont(new java.awt.Font("Georgia", 1, 17)); // NOI18N
        btnCreateLabAdmin.setText("Create Lab Admin");
        btnCreateLabAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLabAdminActionPerformed(evt);
            }
        });
        add(btnCreateLabAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 357, 216, 107));

        btnCreateDoctor.setFont(new java.awt.Font("Georgia", 1, 17)); // NOI18N
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });
        add(btnCreateDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 195, 216, 107));

        jPanel1.setBackground(new java.awt.Color(121, 83, 210));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 39, 160), 10, true));

        jLabel3.setBackground(new java.awt.Color(69, 39, 160));
        jLabel3.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hospital Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateHospAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospAdminActionPerformed
        // TODO add your handling code here:
        CreateLabTechnicianJPanel addhadmin = new CreateLabTechnicianJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("CreateNewRestaurant", addhadmin);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateHospAdminActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:
        CreateHospitalJPanel addhosp = new CreateHospitalJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("CreateNewRestaurant", addhosp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnCreateLabAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLabAdminActionPerformed
        // TODO add your handling code here:
        CreateLabAdminJPanel addlabadmin = new CreateLabAdminJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("CreateNewRestaurant", addlabadmin);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateLabAdminActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctorJPanel addDoc = new CreateDoctorJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("CreateNewRestaurant", addDoc);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreateHospAdmin;
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnCreateLabAdmin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
