/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


/**
 *
 * @author gaurav
 */
public class Patient extends Person{
    private String chiefComplaint;
    private EncounterHistory encounterHistory;

    public Patient(String chiefComplaint, EncounterHistory encounterHistory, 
            int id, int age, Date dob, char gender, String name, House house, 
            String maritalStatus, String SSN, Long phoneNumber) {
        super(id, age, dob, gender, name, house, maritalStatus, SSN, phoneNumber);
        
        this.chiefComplaint = chiefComplaint;
        this.encounterHistory = encounterHistory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }  

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }
    
}