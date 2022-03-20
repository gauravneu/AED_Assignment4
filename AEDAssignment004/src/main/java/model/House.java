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
    private String cityName;
    private Community community;
    private City city;


    
    
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

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }   

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
}