/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    
    public ManageNetworkJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        
        populateNetworkTable();
    }
    
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
            model.addRow(row);
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

        lblName = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtNetworkName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 227));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        lblName.setText("Enter Network Name : ");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(255, 201, 185));
        btnSubmit.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, 40));

        txtNetworkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetworkNameActionPerformed(evt);
            }
        });
        add(txtNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 181, -1));

        networkJTable.setBackground(new java.awt.Color(255, 201, 185));
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Network Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 170, 390, 117));

        jPanel1.setBackground(new java.awt.Color(255, 201, 185));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 3, true));

        btnBack.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel1.setText("Create Network");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 644, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String name = txtNetworkName.getText();

        Network network = system.createAndAddNetwork();
        network.setName(name);

        populateNetworkTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNetworkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetworkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetworkNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField txtNetworkName;
    // End of variables declaration//GEN-END:variables
}
