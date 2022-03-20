/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patients;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.VitalSigns;

/**
 *
 * @author gaurav
 */
public class UpdatePatientDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePatientDetailsJPanel
     */
    JPanel userProcessContainer;
    Patient patient;
    EncounterHistory encounterHistory;
    Encounter encounter;
    VitalSigns vitalSigns;

    public UpdatePatientDetailsJPanel(JPanel userProcessContainer, Encounter e) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.encounter = e;
        this.vitalSigns = e.getVitalSigns();

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
        lblBodyTemperature = new javax.swing.JLabel();
        lblPulseRate = new javax.swing.JLabel();
        lblRespirationRate = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblGlucoseLevel = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtGlucoseLevel = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtRespirationRate = new javax.swing.JTextField();
        txtPulseRate = new javax.swing.JTextField();
        txtBodyTemperature = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        jLabel1.setText("Update Vital Signs");

        lblBodyTemperature.setText("Body Temperature :");

        lblPulseRate.setText("Pulse Rate :");

        lblRespirationRate.setText("Respiration Rate :");

        lblBloodPressure.setText("Blood Pressure :");

        lblHeight.setText("Height :");

        lblGlucoseLevel.setText("Glucose Level :");

        lblWeight.setText("Weight :");

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        txtBodyTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodyTemperatureActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWeight)
                    .addComponent(lblGlucoseLevel)
                    .addComponent(lblHeight)
                    .addComponent(lblBloodPressure)
                    .addComponent(lblRespirationRate)
                    .addComponent(lblPulseRate)
                    .addComponent(lblBodyTemperature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(txtGlucoseLevel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHeight, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRespirationRate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBodyTemperature, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBodyTemperature)
                    .addComponent(txtBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulseRate)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRespirationRate)
                    .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressure)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(lblHeight)
                        .addGap(29, 29, 29)
                        .addComponent(lblGlucoseLevel)
                        .addGap(31, 31, 31)
                        .addComponent(lblWeight))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGlucoseLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(145, 145, 145))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBodyTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodyTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodyTemperatureActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        if (txtBloodPressure.getText().isEmpty()
                && txtBodyTemperature.getText().isEmpty()
                && txtGlucoseLevel.getText().isEmpty()
                && txtHeight.getText().isEmpty()
                && txtPulseRate.getText().isEmpty()
                && txtRespirationRate.getText().isEmpty()
                && txtWeight.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter appropriate values to Update");
            return;
        }
        double bodyTemperature = 0;
        double pulseRate = 0;
        double respirationRate = 0;
        double bloodPressure = 0;
        double height = 0;
        double glucoseLevel = 0;
        double weight = 0;

        if (!txtBodyTemperature.getText().isEmpty()) {
            try {
                bodyTemperature = Double.parseDouble(txtBodyTemperature.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Insert Proper values for Body Temperature");
                return;
            }
        }

        if (!txtPulseRate.getText().isEmpty()) {
            try {
                pulseRate = Double.parseDouble(txtPulseRate.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Insert Proper values for Pulse Rate");
                return;
            }
        }

        if (!txtGlucoseLevel.getText().isEmpty()) {
            try {
                glucoseLevel = Double.parseDouble(txtGlucoseLevel.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Insert Proper values for Glucose Level");
                return;
            }
        }

        if (!txtBloodPressure.getText().isEmpty()) {
            try {
                bloodPressure = Double.parseDouble(txtBloodPressure.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Insert Proper values for Blood Pressure");
                return;
            }
        }

        if (!txtHeight.getText().isEmpty()) {
            try {
                height = Double.parseDouble(txtHeight.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Insert Proper values for Height");
                return;
            }
        }

        if (!txtRespirationRate.getText().isEmpty()) {
            try {
                respirationRate = Double.parseDouble(txtRespirationRate.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Insert Proper values for Respiration Rate");
                return;
            }
        }

        if (!txtWeight.getText().isEmpty()) {
            try {
                weight = Double.parseDouble(txtWeight.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Insert Proper values for Weight");
                return;
            }
        }

        try {

            if (bodyTemperature != 0) {
                vitalSigns.setBodyTemperature(bodyTemperature);
            }

            if (pulseRate != 0) {
                vitalSigns.setPulseRate(pulseRate);
            }

            if (respirationRate != 0) {
                vitalSigns.setRespirationRate(respirationRate);
            }
            if (bloodPressure != 0) {
                vitalSigns.setBloodPressure(bloodPressure);
            }

            if (height != 0) {
                vitalSigns.setHeight(height);
            }

            if (glucoseLevel != 0) {
                vitalSigns.setGlucoseLevel(glucoseLevel);
            }
            if (weight != 0) {
                vitalSigns.setWeight(weight);
            }

            encounter.setVitalSigns(vitalSigns);

            JOptionPane.showMessageDialog(this, "Vital Signs Details Are Updated!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Provide proper details!!");
        }


    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblBodyTemperature;
    private javax.swing.JLabel lblGlucoseLevel;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblPulseRate;
    private javax.swing.JLabel lblRespirationRate;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtBodyTemperature;
    private javax.swing.JTextField txtGlucoseLevel;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespirationRate;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
