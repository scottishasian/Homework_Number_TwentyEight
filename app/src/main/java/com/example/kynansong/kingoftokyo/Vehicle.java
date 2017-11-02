package com.example.kynansong.kingoftokyo;

import Behaviour.VehicleAttack;

/**
 * Created by kynansong on 01/11/2017.
 */

public abstract class Vehicle implements VehicleAttack {

    private String type;
    private int health;

    public Vehicle (String type, int health) {
        this.type = type;
        this.health = health;
    }

    public String getType() {
        return this.type;
    }

    public int getHealth() {
        return this.health;
    }

    public void damaged(int attackValue) {
        this.health -= attackValue;
    }

    public void attackKaiju(Kaiju kaiju) {
        kaiju.isDamaged(3);

    }
}
