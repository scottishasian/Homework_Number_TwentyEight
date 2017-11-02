package Behaviour;

import com.example.kynansong.kingoftokyo.Kaiju;

/**
 * Created by kynansong on 01/11/2017.
 */

public interface VehicleAttack {
    void attackKaiju(Kaiju kaiju); //This attack can also accept other interfaces. So if all Kaiju fell into
                                   // a Movement movement interface, then the amount of things a vehicle can attack
                                   // will be more dynamic as you are targeting things that share a commonality.
}
