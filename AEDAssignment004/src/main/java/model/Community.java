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
    private static int pinId = 10001;
    private String communityName;
    private int pinCode;
    private City city;
    private ArrayList<House> houses = new ArrayList<>();

    public Community() {
        
        pinCode = pinId;
        pinId++;
        
    }
    

    public House addHouse(){
        House h1 = new House();
        houses.add(h1);
        return h1;
    }

    public int getPinCode() {
        return pinCode;
    }
    
    
    
    
    public House getHouse(int aptNo, String street) {
        for (House h : houses) {
            if ((h.getStreet().toLowerCase().equals(street)) && (h.getAppartmentNo() == aptNo)) {
                return h;
            }
        }
        return null;
    }

    

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }
    
    
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHouse() {
        return houses;
    }

    public void setHouse(ArrayList<House> houses) {
        this.houses = houses;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
}
