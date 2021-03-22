package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This method checks to see if a city already exists in the list
     * @param city
     *      City to check
     * @return
     *      Return true if the city exists already
     */
    public boolean hasCity(City city) {
        for (City c : cities) {
            if (c.getCityName().equals(city.getCityName()) &&
                    c.getProvinceName().equals(city.getProvinceName())) {
                return true;
            }
        }

        return false;
    }

    /**
     * Delete the city from the list if it is there
     * @param city
     *      Candidate city to delete
     */
    public void delete(City city) {
        if (!hasCity(city)) {
            throw new IllegalArgumentException();
        }

        for (City c : cities) {
            if (c.compareTo(city) == 0){
                cities.remove(c);
                break;
            }
        }
    }

    /**
     * Return the size of the city list
     * @return
     *      Size of city list
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Exchange the city1 in the citylist with city2
     * @param city1,city2
     */
    public void exchange(City city1, City city2){
        if (!hasCity(city1)){
            throw new IllegalArgumentException();
        }else if (hasCity(city2)){
            throw new IllegalArgumentException();
        }
        cities.remove(city1);
        cities.add(city2);
    }
}
