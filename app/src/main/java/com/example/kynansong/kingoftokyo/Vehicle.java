package com.example.kynansong.kingoftokyo;

import Behaviour.VehicleAttack;

/**
 * Created by kynansong on 01/11/2017.
 */

public abstract class Vehicle implements VehicleAttack {

    private String type;
    private int health;
    private int attackValue;

    public Vehicle (String type, int health, int attackValue) {
        this.type = type;
        this.health = health;
        this.attackValue = attackValue;
    }

    public String getType() {
        return this.type;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public void damaged(int attackValue) {
        this.health -= attackValue;
    }


}
