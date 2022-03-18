/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import model.VitalSigns;
import model.Encounter;

/**
 *
 * @author gaurav
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        encounterHistory = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }


    
     public Encounter addNewEncounter(){
         
         Encounter newEncounter = new Encounter();
         encounterHistory.add(newEncounter);
         return newEncounter;
     }
     
     public void removeEncounter(Encounter e){
         encounterHistory.remove(e);
     }

}
