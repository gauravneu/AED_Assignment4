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
public class CityDirectory {

    private ArrayList<City> cityList = new ArrayList<>();

    
    
    
    
    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    public City addCity() {
        City city = new City();
        cityList.add(city);
        return city;
    }

    public City getCity(String cityName) {
        for (City c : cityList) {
            if (c.getcityName().toLowerCase().equals(cityName)) {
                return c;
            }
        }
        return null;
    }

    public boolean emptyCityDir() {
        

        return cityList.isEmpty();
    }

    public boolean isExistingCity(String cityName) {
        
        for (City c : cityList) {
            if (c.getcityName().toLowerCase().equals(cityName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistingCommunityInGivenCity(String communityName, String cityName) {
        
       
        if (!(cityList.isEmpty())) {

          
            for (City c : cityList) {
                if (c.getcityName().toLowerCase().equals(cityName)) {
                    for (Community c1 : c.getCommunities()) {
                        if (c1.getCommunityName().toLowerCase().equals(communityName)) {
                         
                            return true;
                            
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public boolean isExistingHouseInExistingCommunityInGivenCity(String communityName, String cityName, int apartmentNo, String street) {
       
      
      
        
        if (!(cityList.isEmpty())) {

            for (City c : cityList) {
                if (c.getcityName().toLowerCase().equals(cityName)) {
                    for (Community c1 : c.getCommunities()) {
                        if (c1.getCommunityName().toLowerCase().equals(communityName)) {
                            for (House h : c1.getHouses()) {
                                
                                if ((h.getAppartmentNo() == apartmentNo) && (h.getStreet().toLowerCase().equals(street))) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

}
