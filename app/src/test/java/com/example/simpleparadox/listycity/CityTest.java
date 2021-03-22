package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityTest {
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void testToString() {
        City mockCity = mockCity();
        assertEquals("Edmonton, Alberta", mockCity.toString());
    }
}
