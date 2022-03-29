/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wackyracers;

/**
 *
 * @author kylej
 */
public abstract class Engine {
    BoostType boostType;
    VechicleWeapon vechicleWeapon;
    public int distance = 0;
    public int laps = 0;
    public int health = 100;
    public Engine() {
    }

    public void setBoostType(BoostType theType) {
        boostType = theType;
    }

    public void setVechicleWeapon(VechicleWeapon theWeapon) {
        vechicleWeapon = theWeapon;
    }

    abstract void display();

    public void boost() {
        boostType.boost(this);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    
}
