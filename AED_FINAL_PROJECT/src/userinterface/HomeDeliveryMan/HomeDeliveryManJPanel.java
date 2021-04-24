/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HomeDeliveryMan;

import Business.Distribution.Distribution;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerOrderWorkRequest;
import Business.WorkQueue.ShippingOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Shipping.ProcessShippingOrderJPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class HomeDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomeDeliveryManJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private Distribution distribution;
    
    public HomeDeliveryManJPanel(JPanel userProcessContainer,UserAccount useraccount, Distribution distribution) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = useraccount;
        this.distribution = distribution;
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblWorkRequest.getModel();
        model.setRowCount(0);
        
        ArrayList<WorkRequest> wr = distribution.getWorkQueue().getWorkRequestList();
        
        for(int i=wr.size()-1; i>=0;i--){
            CustomerOrderWorkRequest req = (CustomerOrderWorkRequest)wr.get(i);
            
            if(req.getReceiver()!=account){
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(231, 207, 205));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 139));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, 164));

        btnProcess.setBackground(new java.awt.Color(204, 204, 204));
        btnProcess.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnProcess.setText("Process Order");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 217, -1, 50));

        btnViewOrder.setBackground(new java.awt.Color(204, 204, 204));
        btnViewOrder.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });
        add(btnViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 314, 140, 50));

        jPanel1.setBackground(new java.awt.Color(159, 154, 164));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 3, true));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel1.setText("Home Delivery Summary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 897, -1));

        btnRefresh.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 90, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequest.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to process this order");
            return;
        }

        CustomerOrderWorkRequest request = (CustomerOrderWorkRequest)tblWorkRequest.getValueAt(selectedRow, 0);

        if(!request.getStatus().equals("On the way")){
            if(request.getStatus().equals("Processing")){

            }
            else{
                JOptionPane.showMessageDialog(this, "This order has been processed before");
                return;
            }

        }

        request.setStatus("Processing");

        ProcessCustomerOrder processCustomerOrder = new ProcessCustomerOrder(userProcessContainer, request);
        userProcessContainer.add("ProcessCustomerOrder", processCustomerOrder);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWorkRequest.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);

        CustomerOrderWorkRequest req = (CustomerOrderWorkRequest)tblWorkRequest.getValueAt(selectedRowIndex, 0);

        model.setRowCount(0);
        for(Product product: req.getOrder().getItems()){
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = product.getPrice();
            row[2] = product.getQuantity();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
