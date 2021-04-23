/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Shipping;

import Business.ManifacturingWarehouse.ManufacturingWarehouse;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShippingOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ShippingManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShippingManJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private ManufacturingWarehouse manufacturingWarehouse;
    
    public ShippingManJPanel(JPanel userProcessContainer, UserAccount useraccount, ManufacturingWarehouse manufacturingWarehouse) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.manufacturingWarehouse = manufacturingWarehouse;
        
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblWorkRequest.getModel();
        model.setRowCount(0);
        
        ArrayList<WorkRequest> wr = manufacturingWarehouse.getWorkQueue().getWorkRequestList();
        
        for(int i=wr.size()-1; i>=0;i--){
            ShippingOrderWorkRequest req = (ShippingOrderWorkRequest)wr.get(i);
            
            if(req.getReceiver()!=useraccount){
                continue;
            }
            if(req.getStatus().equals("Completed")){
                continue;
            }
            Object[] row = new Object[4];
            row[0] = req;
            row[1] = req.getSender().getEmployee().getName();
            row[2] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getName();
            row[3] = req.getStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        btnViewOrder = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(224, 251, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrders.setBackground(new java.awt.Color(152, 193, 217));
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 334, -1, 148));

        btnViewOrder.setBackground(new java.awt.Color(152, 193, 217));
        btnViewOrder.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });
        add(btnViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 244, 137, 46));

        btnProcess.setBackground(new java.awt.Color(152, 193, 217));
        btnProcess.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnProcess.setText("Process Order");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 170, -1, 42));

        tblWorkRequest.setBackground(new java.awt.Color(152, 193, 217));
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Reciever", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblWorkRequest);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 170, -1, 120));

        jPanel1.setBackground(new java.awt.Color(152, 193, 217));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        jLabel1.setText("Shipping Man Manage Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 701, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWorkRequest.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
        
        ShippingOrderWorkRequest req = (ShippingOrderWorkRequest)tblWorkRequest.getValueAt(selectedRowIndex, 0);
        
        model.setRowCount(0);
        for(Product product: req.getOrders().getItems()){
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = product.getPrice();
            row[2] = product.getQuantity();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblWorkRequest.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to process this order");
            return;
        }
        
        ShippingOrderWorkRequest request = (ShippingOrderWorkRequest)tblWorkRequest.getValueAt(selectedRow, 0);
        
        if(!request.getStatus().equals("On the way")){
            if(request.getStatus().equals("Processing")){
                
            }
            else{
                JOptionPane.showMessageDialog(this, "This order has been processed before");
                return;
            }
            
        }
     
        request.setStatus("Processing");
        
        ProcessShippingOrderJPanel pocessShippingOrderJPanel = new ProcessShippingOrderJPanel(userProcessContainer, request);
        userProcessContainer.add("ProcessShippingOrderJPanel", pocessShippingOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
