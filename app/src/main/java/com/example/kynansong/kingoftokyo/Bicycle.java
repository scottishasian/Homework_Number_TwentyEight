package com.example.kynansong.kingoftokyo;

import Behaviour.VehicleAttack;

/**
 * Created by kynansong on 01/11/2017.
 */

public class Bicycle extends Vehicle implements VehicleAttack{
    public Bicycle(String type, int health, int attackValue) {
        super(type, health, attackValue);
    }

    public void attackKaiju(Kaiju kaiju) {
        kaiju.isDamaged(getAttackValue());

    }
}
