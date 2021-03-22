package com.example.simpleparadox.listycity;

import java.util.Locale;

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

    public String toString() {
        return String.format(Locale.CANADA, "%s, %s", city, province);
    }
}
