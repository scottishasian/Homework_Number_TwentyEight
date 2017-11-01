package com.example.kynansong.kingoftokyo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kynansong on 01/11/2017.
 */

public class BicycleTest {

    Bicycle bicycle;
    FishMonster fishMonster;

    @Before
    public void before() {
        bicycle = new Bicycle("Axe Bike", 50);
        fishMonster = new FishMonster("Susan", 100, 12, " *** ");
    }

    @Test
    public void getType() {
        assertEquals("Axe Bike", bicycle.getType());
    }

    @Test
    public void getHealth() {
        assertEquals(50, bicycle.getHealth());
    }

    @Test
    public void isDamaged() {
        bicycle.damaged(fishMonster.getAttackValue());
        assertEquals(38, bicycle.getHealth());
    }
}
