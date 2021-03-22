package com.example.simpleparadox.listycity;

/**
 * the lab says to add a test for functionality that will fail (later implement it, i will choose the city class and have it and set a neighbouring city field
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }
}
