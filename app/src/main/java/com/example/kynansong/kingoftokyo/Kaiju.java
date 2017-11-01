package com.example.kynansong.kingoftokyo;

/**
 * Created by kynansong on 01/11/2017.
 */


public abstract class Kaiju {

    private String name;
    private int health;
    private int attackValue;
    private String roar;

    public Kaiju(String name, int health, int attackValue, String roar) {
        this.name = name;
        this.health = health;
        this.attackValue = attackValue;
        this.roar = roar;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public String getRoar() {
        return this.roar;
    }

    public void Attack(Vehicle type) {
        type.damaged(this.attackValue);

    }

}
