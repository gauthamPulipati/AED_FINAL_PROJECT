/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Manager;

import Business.Distribution.Distribution;
import Business.Enterprise.Enterprise;
import Business.ManifacturingWarehouse.ManufacturingWarehouse;
import Business.Order.Order;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ShippingOrderWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ManagerOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerOrderJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private ArrayList<Enterprise> warehouseEnterprises;
    private Distribution distribution;
    
    public ManagerOrderJPanel(JPanel userProcessContainer, UserAccount useraccount, ArrayList<Enterprise> warehouseEnterprises, Distribution distribution) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.warehouseEnterprises = warehouseEnterprises;
        this.distribution = distribution;
        txtQuantity.setText("1");
        txtTotal.setText("0");
        DefaultTableModel model1 = (DefaultTableModel) tblOrder.getModel();
        model1.setRowCount(0);
        populateJComboBox1();
    }
    
    private void populateJComboBox1(){
        enterpriseJComboBox.removeAllItems();
        int i=0;
        for(Enterprise enterprise: warehouseEnterprises){
            if(i==0){
                populateJComboBox(enterprise.getManufacturingWarehouseDirectory().getWarehousedirectory());
                i++;
            }
            enterpriseJComboBox.addItem(enterprise);
        }
    }
    
    private void populateJComboBox(ArrayList<ManufacturingWarehouse> mws){
        warehouseJComboBox.removeAllItems();
        int i=0;
        for(ManufacturingWarehouse mw :mws){
            if(i==0){
                populateTableProducts(mw);
                i++;
                System.out.println(mw.getWareHouseName());
            }
            warehouseJComboBox.addItem(mw);
        }
    }
    
    private void populateTableProducts(ManufacturingWarehouse mw){
        DefaultTableModel model = (DefaultTableModel)tblProducts.getModel();
        model.setRowCount(0);
        //String dm = "Business.Role.LabAdminRole";
        
        for(Product product:mw.getProductDirectory().getProducts()){
            if(product.getStatus().equals("Denied")){
                continue;
            }
            if(product.getStatus().equals("Waiting")){
                continue;
            }
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = product.getQuantity();
            row[2] = product.getPrice();
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
        tblProducts = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnPlaceOrder = new javax.swing.JButton();
        warehouseJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 236, 179));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Kit", "Available Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 192, 616, 131));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Kit", "Selected Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrder);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 363, 616, 146));

        btnAddToCart.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnAddToCart.setText("Add to cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 283, 121, 40));

        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtQuantity.setText("1");
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 224, 125, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("Quantity:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 192, 62, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("Total Price:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 523, -1, -1));

        txtTotal.setText("0");
        add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 520, 101, -1));

        btnPlaceOrder.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 551, -1, 40));

        warehouseJComboBox.setBackground(new java.awt.Color(180, 223, 229));
        warehouseJComboBox.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        warehouseJComboBox.setForeground(new java.awt.Color(48, 60, 108));
        warehouseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        warehouseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseJComboBoxActionPerformed(evt);
            }
        });
        add(warehouseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 142, 140, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("Select Warehouse:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, -1, -1));
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 395, 125, 57));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Message:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 363, 78, -1));

        enterpriseJComboBox.setBackground(new java.awt.Color(180, 223, 229));
        enterpriseJComboBox.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(48, 60, 108));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 142, 140, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setText("Select Enterprise:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 146, -1, -1));

        jPanel1.setBackground(new java.awt.Color(203, 186, 131));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 239, 239), 4));

        jLabel3.setFont(new java.awt.Font("ITF Devanagari", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Place Shipping Order");

        btnBack.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(25, 25, 25))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 821, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void warehouseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouseJComboBoxActionPerformed
        // TODO add your handling code here:
        ManufacturingWarehouse manufacturingWarehouse = (ManufacturingWarehouse) warehouseJComboBox.getSelectedItem();
        if(manufacturingWarehouse!=null){
            populateTableProducts(manufacturingWarehouse);
        }
    }//GEN-LAST:event_warehouseJComboBoxActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProducts.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to add");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        Product product = (Product) model.getValueAt(selectedRowIndex, 0);
        DefaultTableModel model1 = (DefaultTableModel) tblOrder.getModel();
        
        if(product.getQuantity()< Integer.parseInt(txtQuantity.getText())){
            JOptionPane.showMessageDialog(this, "Product unavailable");
            return;
        }
        product.setQuantity(product.getQuantity()-Integer.parseInt(txtQuantity.getText()));
        
        Object[] row = new Object[3];
        row[0] = product;
        row[1] = Integer.parseInt(txtQuantity.getText());
        row[2] = Integer.parseInt(txtQuantity.getText())*product.getPrice();
        model1.addRow(row);
        
        txtQuantity.setText("1");
        double total = Double.parseDouble(txtTotal.getText()) + (Integer.parseInt(txtQuantity.getText())*product.getPrice());
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        String message = txtMessage.getText();
        ManufacturingWarehouse manufacturingWarehouse = (ManufacturingWarehouse) warehouseJComboBox.getSelectedItem();
        Order order = new Order();
        
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        int noOfRows = model.getRowCount();
        for(int i=0;i<noOfRows;i++){
            Product product = (Product) model.getValueAt(i, 0);
            Integer quant = (Integer) model.getValueAt(i, 1);
            System.out.println(product.getProductName());
            order.addItem(product, quant);
        }
        order.setPrice(Double.parseDouble(txtTotal.getText()));
        
        ShippingOrderWorkRequest request = new ShippingOrderWorkRequest();
        request.setMessage(message);
        request.setManufacturingWarehouse(manufacturingWarehouse);
        request.setSender(useraccount);
        request.setStatus("Order placed");
        request.setOrders(order);
        request.setDistribution(distribution);
        
        manufacturingWarehouse.addOrder(order);
        
        if(manufacturingWarehouse ==null){
            System.out.println("nonono");
        }
        else{
            manufacturingWarehouse.getWorkQueue().getWorkRequestList().add(request);
            useraccount.getWorkQueue().getWorkRequestList().add(request);
        }
        model.setRowCount(0);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerWorkJPanel hentadjp = (ManagerWorkJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        if(enterprise!=null){
            populateJComboBox(enterprise.getManufacturingWarehouseDirectory().getWarehousedirectory());
        }
        
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerWorkJPanel hentadjp = (ManagerWorkJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JComboBox warehouseJComboBox;
    // End of variables declaration//GEN-END:variables
}
