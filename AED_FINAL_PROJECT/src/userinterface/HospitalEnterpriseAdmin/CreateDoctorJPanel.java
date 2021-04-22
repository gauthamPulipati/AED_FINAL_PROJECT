/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalEnterpriseAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Role.ApproveDoctorRole;
import Business.Role.ConsultDoctorRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aksha
 */
public class CreateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    public CreateDoctorJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateJComboBox();
        rbtnApprove.setSelected(true);
        rbtnConsulting.setSelected(false);
    }
    
    
    private void populateJComboBox(){
        hospitalJComboBox.removeAllItems();
        int i=0;
        for(Hospital hos :enterprise.getHospitalDirectory().getHospitals()){
            if(i==0){
                populateTable(hos);
                i++;
                System.out.println(hos.getHospitalName());
            }
            hospitalJComboBox.addItem(hos);
        }
    }
    
    private void populateTable(Hospital hospital){
        DefaultTableModel model = (DefaultTableModel)tblDoctor.getModel();
        model.setRowCount(0);
        //String dm = "Business.Role.LabAdminRole";
        String dm = "Approving Doctor";
        String dm2 = "Consulting Doctor";
        
        for(UserAccount us: hospital.getUserAccountDirectory().getUserAccountList()){
            if(us.getRole().toString().equals(dm) || us.getRole().toString().equals(dm2)){
                Object[] row = new Object[3];
                row[0] = us;
                row[1] = us.getEmployee().getName();
                if(us.getRole().toString().equals(dm)){
                    row[2] = dm;
                }
                else if(us.getRole().toString().equals(dm2)){
                    row[2] = dm2;
                }
                model.addRow(row);
            }
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbtnApprove = new javax.swing.JRadioButton();
        rbtnConsulting = new javax.swing.JRadioButton();
        txtDoctorName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        hospitalJComboBox = new javax.swing.JComboBox();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor Username", "Name", "Profession"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Hospital Name:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Doctor's Name:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Username:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Type:");

        rbtnApprove.setText("Approving Doctor");
        rbtnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnApproveActionPerformed(evt);
            }
        });

        rbtnConsulting.setText("Consulting Doctor");
        rbtnConsulting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConsultingActionPerformed(evt);
            }
        });

        txtDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Password:");

        hospitalJComboBox.setBackground(new java.awt.Color(180, 223, 229));
        hospitalJComboBox.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        hospitalJComboBox.setForeground(new java.awt.Color(48, 60, 108));
        hospitalJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hospitalJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalJComboBoxActionPerformed(evt);
            }
        });

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnModify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnConsulting, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {hospitalJComboBox, txtDoctorName, txtPassword, txtUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModify)
                            .addComponent(btnDelete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnApprove))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnConsulting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnSubmit))))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Hospital hospital = (Hospital) hospitalJComboBox.getSelectedItem();
        
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String name = txtDoctorName.getText();
        
        String type ="";
        if(rbtnApprove.isSelected()){
            type="Approving";
        }
        else{
            type="Consulting";
        }
        
         if(username.isEmpty() || name.isEmpty() || password.isEmpty() ){
        
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory");
            return;
        }
        boolean isValid ; 
        
        isValid = name.matches("^[a-zA-Z]+$");
        if(!isValid) {
            JOptionPane.showMessageDialog(null, "Name must contains only alphabets");
            txtDoctorName.setText("");
            return;
        }
        if(hospital.getUserAccountDirectory().checkIfUsernameIsUnique(username) == false){
            JOptionPane.showMessageDialog(this, "user name taken, try another one");
            txtUsername.setText("");
            txtPassword.setText("");
            return;
        }
        
        isValid = username.matches("^[a-zA-Z0-9]+$");
        
        if(!isValid) {
            JOptionPane.showMessageDialog(null, "Username must be Alphanumeric");
            txtUsername.setText("");
            return;
        }
        
        isValid = password.matches("^[a-zA-Z0-9]+$$");
        
        if(!isValid) {
            JOptionPane.showMessageDialog(null, "Password must be Alphanumeric");
            txtPassword.setText("");
            return;
        }

        if(password.length()<6){
            JOptionPane.showMessageDialog(this, "Password too weak, choose a password with a minimum length of 6");
            txtPassword.setText("");
            return;
        }
        
        Employee employee = hospital.getEmployeeDirectory().createEmployee(name);
        if(type.equals("Approving")){
            UserAccount ua = hospital.getUserAccountDirectory().createUserAccount(username, password, employee, new ApproveDoctorRole());
        }
        else if (type.equals("Consulting")){
            UserAccount ua = hospital.getUserAccountDirectory().createUserAccount(username, password, employee, new ConsultDoctorRole());
        }
        //System.out.println(hospital.getUserAccountDirectory().getUserAccountList().size()+" ---- aaa");
        
             
      
        //System.out.println(hospital.getUserAccountDirectory().getUserAccountList().size()+" ---- aaa");
        populateTable(hospital);
        
        txtUsername.setText("");
        txtPassword.setText("");
        txtDoctorName.setText("");
        btnDelete.setEnabled(true);
        btnModify.setEnabled(true);
        populateTable(hospital);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HospitalEnterpriseAdminJPanel hentadjp = (HospitalEnterpriseAdminJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void hospitalJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalJComboBoxActionPerformed
        // TODO add your handling code here:
        Hospital hospital = (Hospital) hospitalJComboBox.getSelectedItem();
        if(hospital!=null){
            populateTable(hospital);
        }
    }//GEN-LAST:event_hospitalJComboBoxActionPerformed

    private void rbtnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnApproveActionPerformed
        // TODO add your handling code here:
        if(rbtnApprove.isSelected()){
            rbtnConsulting.setSelected(false);
        }
        else{
            rbtnConsulting.setSelected(true);
        }
    }//GEN-LAST:event_rbtnApproveActionPerformed

    private void rbtnConsultingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsultingActionPerformed
        // TODO add your handling code here:
        if(rbtnConsulting.isSelected()){
            rbtnApprove.setSelected(false);
        }
        else{
            rbtnApprove.setSelected(true);
        }
    }//GEN-LAST:event_rbtnConsultingActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        Hospital hosp = (Hospital) hospitalJComboBox.getSelectedItem();
        int selectedRowIndex = tblDoctor.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to Modify");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        UserAccount us = (UserAccount) model.getValueAt(selectedRowIndex, 0);
        txtUsername.setText(us.getUsername());
        txtPassword.setText(us.getPassword());
        txtDoctorName.setText(us.getEmployee().getName());
        hosp.getUserAccountDirectory().removeUser(us);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Hospital hosp = (Hospital) hospitalJComboBox.getSelectedItem();

        int selectedRow = tblDoctor.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();

        UserAccount us = (UserAccount) model.getValueAt(selectedRow, 0);

        hosp.getEmployeeDirectory().deleteEmployee(us.getEmployee());
        hosp.getUserAccountDirectory().removeUser(us);
        populateTable(hosp);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox hospitalJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnApprove;
    private javax.swing.JRadioButton rbtnConsulting;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
