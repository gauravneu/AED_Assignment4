/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gaurav
 */
public class EncounterHistory {
    private ArrayList<VitalSigns> vitalSignshistory;

    public EncounterHistory(ArrayList<VitalSigns> vitalSignshistory) {
        this.vitalSignshistory = vitalSignshistory;
    }

    public ArrayList<VitalSigns> getVitalSignshistory() {
        return vitalSignshistory;
    }

    public void setVitalSignshistory(ArrayList<VitalSigns> vitalSignshistory) {
        this.vitalSignshistory = vitalSignshistory;
    }
    
    
}
