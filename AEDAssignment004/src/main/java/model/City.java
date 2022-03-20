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
public class City {
    private String cityName;
    private ArrayList<Community> communities = new ArrayList<>();
    
    public String getcityName() {
        return cityName;
    }

    public void setcityName(String name) {
        this.cityName = name;
    }


    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    public Community addCommunity(){
        Community c = new Community();
        communities.add(c);
        return c;
    }
    
    public Community getCommunity(String communityName){
        for (Community c: communities){
            if(c.getCommunityName().toLowerCase().equals(communityName)){return c;}
        }
        return null;
    }  
    
    public boolean emptyCityDir(){
      return  communities.isEmpty();
    }
    

}
