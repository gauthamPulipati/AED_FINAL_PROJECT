/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManifacturingEnterpriseAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ManifacturingWarehouse.ManufacturingWarehouse;
import Business.ManifacturingWarehouse.ManufacturingWarehouseDirectory;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrigesh
 */
public class ManageManufacturingWarehouseJPanel extends javax.swing.JPanel {

    private ManufacturingWarehouseDirectory warehouseDirectory;
    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private ManufacturingWarehouse warehouse;

    /**
     * Creates new form CreateManufacturingWarehouseJPanel
     */
    public ManageManufacturingWarehouseJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateWarehouseTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblwareHouse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtwarehouseName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnModiffy = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(131, 197, 190));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblwareHouse.setBackground(new java.awt.Color(131, 197, 190));
        tblwareHouse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 204), 3, true));
        tblwareHouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "WareHouse Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblwareHouse.setGridColor(new java.awt.Color(131, 197, 190));
        jScrollPane1.setViewportView(tblwareHouse);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 520, 180));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 18)); // NOI18N
        jLabel1.setText("Manufacturing Warehouse Name: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        txtwarehouseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwarehouseNameActionPerformed(evt);
            }
        });
        add(txtwarehouseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 195, -1));

        btnSubmit.setBackground(new java.awt.Color(0, 109, 119));
        btnSubmit.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        btnModiffy.setBackground(new java.awt.Color(0, 109, 119));
        btnModiffy.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnModiffy.setText("Modify");
        btnModiffy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiffyActionPerformed(evt);
            }
        });
        add(btnModiffy, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 120, 40));

        btnDelete.setBackground(new java.awt.Color(0, 109, 119));
        btnDelete.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 120, 40));

        btnCreate.setBackground(new java.awt.Color(0, 109, 119));
        btnCreate.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 120, 40));

        jPanel1.setBackground(new java.awt.Color(0, 109, 119));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 204), 5, true));

        jButton1.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        jButton1.setText("< back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Warehouse Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        String name = txtwarehouseName.getText();
        
        if(name.length()<1){
            JOptionPane.showMessageDialog(null, "Warehouse Name cannot be blank", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        warehouse.setWareHouseName(name);
        btnSubmit.setEnabled(false);
        btnModiffy.setEnabled(true);
        btnCreate.setEnabled(true);
        btnDelete.setEnabled(true);
        
        populateWarehouseTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtwarehouseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwarehouseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwarehouseNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManifacturingEnterpriseAdminJPanel manetn = (ManifacturingEnterpriseAdminJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblwareHouse.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ManufacturingWarehouse warehouse = (ManufacturingWarehouse) tblwareHouse.getValueAt(selectedRow, 0);

        this.enterprise.getManufacturingWarehouseDirectory().deleteWarehouse(warehouse);

        populateWarehouseTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModiffyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiffyActionPerformed
        
        btnCreate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnModiffy.setEnabled(false);
        btnSubmit.setEnabled(true);
        int selectedRow = tblwareHouse.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            btnModiffy.setEnabled(true);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblwareHouse.getModel();
        ManufacturingWarehouse wr = (ManufacturingWarehouse)model.getValueAt(selectedRow, 0);
        
        txtwarehouseName.setText(wr.getWareHouseName());
        warehouse =wr;
 
    }//GEN-LAST:event_btnModiffyActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String name = txtwarehouseName.getText();
        
        if(name.length()<1){
            JOptionPane.showMessageDialog(null, "Warehouse Name cannot be blank", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ManufacturingWarehouse ware = this.enterprise.createManifacturingWarehouse(name);

        populateWarehouseTable();
        txtwarehouseName.setText(" ");
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModiffy;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblwareHouse;
    private javax.swing.JTextField txtwarehouseName;
    // End of variables declaration//GEN-END:variables

    private void populateWarehouseTable() {

        DefaultTableModel model = (DefaultTableModel) tblwareHouse.getModel();
        model.setRowCount(0);

        for (ManufacturingWarehouse warehouse : enterprise.getManufacturingWarehouseDirectory().getWarehousedirectory()) {
            Object[] row = new Object[1];
            row[0] = warehouse;
            model.addRow(row);
        }
    }
}
