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
public class Community {
    private String communityName;
    private long pinCode;
    private ArrayList<House> house;
    private City city;

    public Community(String communityName, long pinCode, ArrayList<House> house) {
        this.communityName = communityName;
        this.pinCode = pinCode;
        this.house = house;
        this.city = city;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }


    public ArrayList<House> getHouse() {
        return house;
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
}
