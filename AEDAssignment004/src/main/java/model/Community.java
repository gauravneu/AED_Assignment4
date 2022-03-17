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
    private double area;
    private long community;
    private ArrayList<House> house;

    public Community(String communityName, double area, long community, ArrayList<House> house) {
        this.communityName = communityName;
        this.area = area;
        this.community = community;
        this.house = house;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getCommunity() {
        return community;
    }

    public void setCommunity(long community) {
        this.community = community;
    }

    public ArrayList<House> getHouse() {
        return house;
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }
    
    
}
