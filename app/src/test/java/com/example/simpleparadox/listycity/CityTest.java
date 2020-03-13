package com.example.simpleparadox.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityTest {
    private City mockCity() {
        City city = new City("Edmonton", "AB");
        return city;
    }

    @Test
    void testSetCityName() {
        City city = mockCity();

        city.setCityName("Calgary");

        assertEquals("Calgary", city.getCityName());
    }

}
