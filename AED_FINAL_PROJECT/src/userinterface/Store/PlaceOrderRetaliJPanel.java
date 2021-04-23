/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Store;

import Business.Distribution.Distribution;
import Business.Enterprise.Enterprise;
import Business.ManifacturingWarehouse.ManufacturingWarehouse;
import Business.Order.Order;
import Business.Products.Product;
import Business.RetailStore.RetailStore;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.StoreAdminOrderWorkRequest;
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
public class PlaceOrderRetaliJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaceOrderRetaliJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private ArrayList<Enterprise> dlist;
    private RetailStore retailStore;
    
    public PlaceOrderRetaliJPanel(JPanel userProcessContainer,UserAccount useraccount, ArrayList<Enterprise> dlist, RetailStore retailStore) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.dlist = dlist;
        this.retailStore = retailStore;
        txtQuantity.setText("1");
        txtTotal.setText("0");
        DefaultTableModel model1 = (DefaultTableModel) tblOrder.getModel();
        model1.setRowCount(0);
        populateJComboBox1();
        
    }
    
    private void populateJComboBox1(){
        enterpriseJComboBox.removeAllItems();
        int i=0;
        for(Enterprise enterprise: dlist){
            if(i==0){
                populateJComboBox(enterprise.getDistributionDirectory().getDistributions());
                i++;
            }
            enterpriseJComboBox.addItem(enterprise);
        }
    }
    
    private void populateJComboBox(ArrayList<Distribution> ds){
        distributionJComboBox.removeAllItems();
        int i=0;
        for(Distribution d :ds){
            if(i==0){
                populateTableProducts(d);
                i++;
                System.out.println(d.getDistributionName());
            }
            distributionJComboBox.addItem(d);
        }
    }
    
    private void populateTableProducts(Distribution d){
        DefaultTableModel model = (DefaultTableModel)tblProducts.getModel();
        model.setRowCount(0);
        //String dm = "Business.Role.LabAdminRole";
        
        for(Product product:d.getProductDirectory().getProducts()){
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = product.getPrice();
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

        btnAddToCart = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        txtMessage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        distributionJComboBox = new javax.swing.JComboBox();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        btnAddToCart.setText("Add to cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("Message");

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

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        txtTotal.setText("0");

        jLabel2.setText("Total Price");

        jLabel1.setText("Quantity:");

        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtQuantity.setText("1");

        distributionJComboBox.setBackground(new java.awt.Color(180, 223, 229));
        distributionJComboBox.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        distributionJComboBox.setForeground(new java.awt.Color(48, 60, 108));
        distributionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        distributionJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distributionJComboBoxActionPerformed(evt);
            }
        });

        enterpriseJComboBox.setBackground(new java.awt.Color(180, 223, 229));
        enterpriseJComboBox.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(48, 60, 108));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Select Distribution");

        jLabel6.setText("Select Enterprise");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(distributionJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(34, 34, 34)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(135, 135, 135)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(distributionJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnAddToCart))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnPlaceOrder)
                .addGap(69, 69, 69))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(276, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

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

        Object[] row = new Object[3];
        row[0] = product;
        row[1] = Integer.parseInt(txtQuantity.getText());
        row[2] = Integer.parseInt(txtQuantity.getText())*product.getPrice();
        model1.addRow(row);

        txtQuantity.setText("1");
        double total = Double.parseDouble(txtTotal.getText()) + Integer.parseInt(txtQuantity.getText())*product.getPrice();
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        StoreAdminJPanel hentadjp = (StoreAdminJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        String message = txtMessage.getText();
        Distribution distribution = (Distribution) distributionJComboBox.getSelectedItem();
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

        StoreAdminOrderWorkRequest request = new StoreAdminOrderWorkRequest();
        request.setMessage(message);
        request.setDistribution(distribution);
        request.setSender(useraccount);
        request.setStatus("Retail Order placed");
        request.setOrders(order);
        request.setDistribution(distribution);

        distribution.addOrder(order);

        if(distribution ==null){
            System.out.println("nonono");
        }
        else{
            distribution.getWorkQueue().getWorkRequestList2().add(request);
            useraccount.getWorkQueue().getWorkRequestList2().add(request);
        }
        model.setRowCount(0);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void distributionJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distributionJComboBoxActionPerformed
        // TODO add your handling code here:
        Distribution distribution = (Distribution) distributionJComboBox.getSelectedItem();
        if(distribution!=null){
            populateTableProducts(distribution);
        }
    }//GEN-LAST:event_distributionJComboBoxActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
        //Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        //populateJComboBox(enterprise.getDistributionDirectory().getDistributions());
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox distributionJComboBox;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
