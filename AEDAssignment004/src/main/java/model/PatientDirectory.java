/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.lang.*;

/**
 *
 * @author gaurav
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<>();
        
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        
        this.patientList = patientList;
    }
        
    public ArrayList<Encounter> getAllEncountersOfPatients(int patientId){
        
         
         for(Patient p: patientList){

            
         if(p.getPatientNo() == patientId){
             return p.getEncounterHistory().getEncounterHistory();
         }
    }
         return null;
    }
       
    
    
    
    public Patient getPatientById(int patientId) {
        
        for (Patient p : patientList) {

  //              System.out.println(p.getPatientNo());
    //            System.out.println(patientId);
                
                
            if (p.getPatientNo() == patientId) {
                return p;
            }
        }
        return null;
    }
    
    
    public Patient getPatient(){
         for(Patient p: patientList){
         return p;
         }
         return null;
    }
    
    
    
    public Patient addPatient(){
        Patient newPatient = new Patient();
        patientList.add(newPatient);
        return newPatient;
    }
    
    
         public void removePatient(Patient p){
         patientList.remove(p);
     }
    
}
