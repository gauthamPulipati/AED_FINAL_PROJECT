/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HomeDeliveryMan;

import Business.Products.Product;
import Business.WorkQueue.CustomerOrderWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ProcessCustomerOrder extends javax.swing.JPanel {

    /**
     * Creates new form ProcessCustomerOrder
     */
    
    private JPanel userProcessContainer;
    CustomerOrderWorkRequest request;
    
    public ProcessCustomerOrder(JPanel userProcessContainer, CustomerOrderWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        brnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(231, 207, 205));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 20)); // NOI18N
        jLabel1.setText("Delivery Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 256, -1, -1));
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 257, 184, 88));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 423, -1, -1));

        jPanel1.setBackground(new java.awt.Color(159, 154, 164));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 3, true));

        jLabel2.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        jLabel2.setText("Process Order");

        brnBack.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        brnBack.setText("<< Back");
        brnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(351, 351, 351))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(brnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(brnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 892, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        request.setMessage(txtMessage.getText());
        request.setStatus("Completed");
//        for(Product product:request.getOrder().getItems()){
//            Product pro = request.getDistribution().getProductDirectory().newProduct(product.getProductName(),product.getPrice(), request.getOrder().getQuantity());
//            System.out.println(request.getDistribution().getDistributionName()+" ---0000000");
//            pro.setDistribution(request.getDistribution());
//        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void brnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HomeDeliveryManJPanel hentadjp = (HomeDeliveryManJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_brnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
