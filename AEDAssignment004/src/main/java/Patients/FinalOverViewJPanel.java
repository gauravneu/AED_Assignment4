/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patients;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author gaurav
 */
public class FinalOverViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FinalOverView
     */
    JPanel userProcessContainer;
    PatientDirectory pd;
    Patient patient;
    ArrayList<Patient> pL;

    public FinalOverViewJPanel(JPanel userProcessContainer, PatientDirectory pd) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.pd = pd;
        refreshTable();

    }

    public void refreshTable() {
        pL = pd.getPatientList();
        DefaultTableModel model = (DefaultTableModel) tblAbnormal.getModel();
        model.setRowCount(0);

        int id = 1;
        for (Patient p : pL) {

            for (Encounter e : p.getEncounterHistory().getEncounterHistory()) {
                if ((e.getVitalSigns().getBloodPressure() < 130)
                        || (e.getVitalSigns().getGlucoseLevel() < 140)
                        || (e.getVitalSigns().getPulseRate() < 70)) {
                    Object row[] = new Object[7];
                    row[0] = id;
                    row[1] = p.getPatientNo();
                    row[2] = e.getVitalSigns().getBloodPressure();
                    row[3] = e.getVitalSigns().getGlucoseLevel();
                    row[4] = e.getVitalSigns().getPulseRate();
                    row[5] = p.getPerson().getHouse().getCommunity().getCommunityName();
                    row[6] = p.getPerson().getHouse().getCity().getcityName();
                    model.addRow(row);
                    id++;
                }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAbnormal = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("All Abnormal Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        tblAbnormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "S.No.", "Patient Id", "Blood Pressure", "Pulse Rate", "Glucose Level", "Community", "City"
            }
        ));
        jScrollPane3.setViewportView(tblAbnormal);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 91, 830, 510));

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAbnormal;
    // End of variables declaration//GEN-END:variables
}
