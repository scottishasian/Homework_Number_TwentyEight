package com.example.kynansong.kingoftokyo;

/**
 * Created by kynansong on 01/11/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import com.example.kynansong.kingoftokyo.*;

public class FishMonsterTest {

    FishMonster fishMonster;
    Bicycle bicycle;

    @Before
    public void before() {
        fishMonster = new FishMonster("Susan",100, 12, " *** ");
        bicycle = new Bicycle("Axe Bike", 50, 12);
    }

    @Test
    public void hasName() {
        assertEquals("Susan", fishMonster.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, fishMonster.getHealth());
    }

    @Test
    public void getAttackValue() {
        assertEquals(12, fishMonster.getAttackValue());
    }

    @Test
    public void getRoar() {
        assertEquals(" *** ", fishMonster.getRoar());
    }

    @Test
    public void canAttack() {
        fishMonster.Attack(bicycle);
        assertEquals(38, bicycle.getHealth());
    }

    @Test
    public void canMove() {
        assertEquals("I am using splash.", fishMonster.move());
    }

    @Test
    public void canBeDamaged() {
        bicycle.attackKaiju(fishMonster);
        assertEquals(88, fishMonster.getHealth());
    }

}
