package com.example.kynansong.kingoftokyo;

import Behaviour.Movement;

/**
 * Created by kynansong on 01/11/2017.
 */

public class FishMonster extends Kaiju implements Movement{
    public FishMonster(String name, int health, int attackValue, String roar) {
        super(name, health, attackValue, roar);
    }

    public String move(){
        return "I am using splash.";
    }
}
