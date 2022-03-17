/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gaurav
 */
public class House {
    private int appartmentNo;
    private String street;

    public House(int appartmentNo, String street) {
        this.appartmentNo = appartmentNo;
        this.street = street;
    }

    public int getAppartmentNo() {
        return appartmentNo;
    }

    public void setAppartmentNo(int appartmentNo) {
        this.appartmentNo = appartmentNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    
}
