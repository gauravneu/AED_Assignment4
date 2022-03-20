/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patients;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.CityDirectory;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author gaurav
 */
public class ViewPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientJPanel
     */
    
    JPanel userProcessContainer;
    PatientDirectory pd;
    CityDirectory cityList;
    
    public ViewPatientJPanel(JPanel userProcessContainer , PatientDirectory pd, CityDirectory cityList) {
       
        this.userProcessContainer = userProcessContainer;
        this.pd = pd;
        this.cityList = cityList;
        
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnViewVitalSigns = new javax.swing.JButton();
        btnViewSymptoms = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtApartmentNo = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        lblPinCode = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        txtPinCode = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        btnSearchPatient = new javax.swing.JButton();
        lblPatientID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel1.setText("Name :");

        jLabel2.setText("Age :");

        jLabel3.setText("Phone :");

        btnViewVitalSigns.setText("Add Details");
        btnViewVitalSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignsActionPerformed(evt);
            }
        });

        btnViewSymptoms.setText("View Details");
        btnViewSymptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSymptomsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btnViewVitalSigns)
                .addGap(128, 128, 128)
                .addComponent(btnViewSymptoms)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewVitalSigns)
                    .addComponent(btnViewSymptoms))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel7.setText("Gender :");

        jLabel8.setText("Appartment No :");

        jLabel9.setText("Street :");

        lblCity.setText("City :");

        lblCommunity.setText("Community :");

        lblPinCode.setText("PinCode :");

        btnSearchPatient.setText("Search Patient");
        btnSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPatientActionPerformed(evt);
            }
        });

        lblPatientID.setText("Patient ID :");

        jButton1.setText(" << Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(lblPatientID)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(lblCity)
                    .addComponent(lblCommunity)
                    .addComponent(lblPinCode))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtAge)
                            .addComponent(txtPinCode)
                            .addComponent(txtCommunity)
                            .addComponent(txtCity)
                            .addComponent(txtStreet)
                            .addComponent(txtApartmentNo)
                            .addComponent(txtPhone)
                            .addComponent(txtGender))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(btnSearchPatient))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientID)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btnSearchPatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel1)
                                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, 0)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel2))
                                                        .addGap(12, 12, 12)
                                                        .addComponent(jLabel7))
                                                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3))
                                            .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8))
                                    .addComponent(txtApartmentNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCommunity))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPinCode)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPatientActionPerformed
        // TODO add your handling code here:

        int patientID = 0;
        try {
               patientID = Integer.parseInt(txtPatientID.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please provide correct value "
                        + "for Patient Id");
            }
        
        
        Patient p = pd.getPatientById(patientID);
        if(p == null){            
            JOptionPane.showMessageDialog(null, "Please select a correct Patient First", "Warning", JOptionPane.WARNING_MESSAGE);
            return;  
        }

        
        txtAge.setText(String.valueOf(p.getPerson().getAge()));
        txtGender.setText(p.getPerson().getGender());
        txtName.setText(p.getPerson().getName());
        txtApartmentNo.setText(String.valueOf(p.getPerson().getHouse().getAppartmentNo()));
        txtCity.setText(p.getPerson().getHouse().getCityName());
        txtCommunity.setText(p.getPerson().getHouse().getCommunity().getCommunityName());
        txtPhone.setText(String.valueOf(p.getPerson().getPhoneNumber()));
        txtPinCode.setText(String.valueOf(p.getPerson().getHouse().getCommunity().getPinCode()));
        txtStreet.setText(p.getPerson().getHouse().getStreet());
    }//GEN-LAST:event_btnSearchPatientActionPerformed

    private void btnViewVitalSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignsActionPerformed
        // TODO add your handling code here:
        
        int patientID = 0;
        try {
               patientID = Integer.parseInt(txtPatientID.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please provide correct value "
                        + "for Patient Id");
            }
        
        
        Patient p = pd.getPatientById(patientID);
        if(p == null){            
            JOptionPane.showMessageDialog(null, "Please select a correct Patient First", "Warning", JOptionPane.WARNING_MESSAGE);
            return;  
        }
        AddVitalSignsJPanel avsjp = new AddVitalSignsJPanel(userProcessContainer,p);
        userProcessContainer.add("AddVitalSignsJPanel",avsjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);      
    }//GEN-LAST:event_btnViewVitalSignsActionPerformed

    private void btnViewSymptomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSymptomsActionPerformed
        // TODO add your handling code here:
        int patientID = 0;
        try {
               patientID = Integer.parseInt(txtPatientID.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please provide correct value "
                        + "for Patient Id");
            }
        
        
        Patient p = pd.getPatientById(patientID);
        if(p == null){            
            JOptionPane.showMessageDialog(null, "Please select a correct Patient First", "Warning", JOptionPane.WARNING_MESSAGE);
            return;  
        }
        ViewPatientDetailsJPanel vpdjp = new ViewPatientDetailsJPanel(userProcessContainer,p);
        userProcessContainer.add("ViewPatientDetailsJPanel",vpdjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewSymptomsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
 //       UpdateCarJPanel updateCarJPanel = (UpdateCarJPanel) component;
 //       updateCarJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchPatient;
    private javax.swing.JButton btnViewSymptoms;
    private javax.swing.JButton btnViewVitalSigns;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPinCode;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtApartmentNo;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPinCode;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
