/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author gaurav
 */
public class Doctor extends Person{
    
    private ArrayList<Patient> assignedPatients;

    public Doctor(ArrayList<Patient> assignedPatients, int id, String name, City city) {
        super(id, name, city);
        this.assignedPatients = assignedPatients;
    }

    public ArrayList<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(ArrayList<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }
    
    
}
