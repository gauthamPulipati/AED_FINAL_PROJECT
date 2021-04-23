/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RetailDelivery;

import Business.WorkQueue.StoreAdminOrderWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ProcessRetailOrder extends javax.swing.JPanel {

    /**
     * Creates new form ProcessRetailOrder
     */
    private JPanel userProcessContainer;
    StoreAdminOrderWorkRequest request;
    
    public ProcessRetailOrder(JPanel userProcessContainer, StoreAdminOrderWorkRequest request) {
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

        txtMessage = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        brnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 201, 90));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 18)); // NOI18N
        jLabel1.setText("Delivery Message :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(252, 163, 17));
        btnSubmit.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        jPanel1.setBackground(new java.awt.Color(252, 163, 17));

        brnBack.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        brnBack.setText("<< Back");
        brnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel2.setText("Process Retail Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(brnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(239, 239, 239))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(brnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 886, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void brnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RetailDeliveryManJPanel hentadjp = (RetailDeliveryManJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_brnBackActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
