package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityTest {

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    private City mockCity1() {
        return new City("Calgary", "Alberta");
    }

    @Test
    void SetNeighbourTest(){

        City testCity = mockCity();
        testCity.setNeighbour(mockCity1());

        assertEquals(testCity.getNeighbour().getCityName(),"Calgary");
    }

}
