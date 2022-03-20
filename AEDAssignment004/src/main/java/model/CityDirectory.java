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
        
        System.out.println("emptyCityDir called");
        System.out.println(cityList.isEmpty());
        return cityList.isEmpty();
    }

    public boolean isExistingCity(String cityName) {
        
        System.out.println("isExistingCity called");
        for (City c : cityList) {
            if (c.getcityName().toLowerCase().equals(cityName)) {
                System.out.println("true");
                return true;
            }
        }
        return false;
    }

    public boolean isExistingCommunityInGivenCity(String communityName, String cityName) {
        
         System.out.println("isExiisExistingCommunityInGivenCitystingCity called");
        
        if (!(cityList.isEmpty())) {

            //          System.out.println(cityList.size());
            for (City c : cityList) {
                if (c.getcityName().toLowerCase().equals(cityName)) {
                    for (Community c1 : c.getCommunities()) {
                        if (c1.getCommunityName().toLowerCase().equals(communityName)) {
                            System.out.println("true");
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
       
        System.out.println("isExistingHouseInExistingCommunityInGivenCity called");
      
        
        if (!(cityList.isEmpty())) {

        System.out.println(cityList.size());
            for (City c : cityList) {
 //               System.out.println("Level 1");
                if (c.getcityName().toLowerCase().equals(cityName)) {
   //                 System.out.println("Level 2");
                    for (Community c1 : c.getCommunities()) {
     //                   System.out.println("Level 3");
                        if (c1.getCommunityName().toLowerCase().equals(communityName)) {
       //                     System.out.println("Level 4");
                            for (House h : c1.getHouses()) {
         //                       System.out.println("Level 5");
                                
           //                     System.out.println(h.getAppartmentNo());
             //                   System.out.println(apartmentNo);
               //                 System.out.println(h.getStreet());
                 //               System.out.println(street);
                                
                                if ((h.getAppartmentNo() == apartmentNo) && (h.getStreet().toLowerCase().equals(street))) {
                   //                   System.out.println("true");
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
