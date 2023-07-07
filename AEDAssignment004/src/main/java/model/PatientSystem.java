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
public class PatientSystem {

   private CityDirectory cityDirectory;
   private PersonDirectory personDirectory;
   private PatientDirectory patientDirectory;

    public PatientSystem() {
        cityDirectory = new CityDirectory();
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
    }

    public CityDirectory getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(CityDirectory cityDirectory) {
        this.cityDirectory = cityDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
}
