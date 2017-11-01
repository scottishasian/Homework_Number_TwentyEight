package com.example.kynansong.kingoftokyo;

import Movement.Movement;

/**
 * Created by kynansong on 01/11/2017.
 */

public class BlobMonster extends Kaiju implements Movement{
    public BlobMonster(String name, int health, int attackValue, String roar) {
        super(name, health, attackValue, roar);
    }

    public String move() {
        return "I am slithering.";
    }
}
