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
public class MidVechicleType extends Engine {
    private int weight = 10;
    private int speed = 10;


    public MidVechicleType() {
        boostType = new BoostMid();
        vechicleWeapon = new MidWeapon();
        
    }

    public void display() {
        System.out.println("Your Vechicle has a base speed of " + getSpeed() + " and weight of " + getWeight());
    }

    public int getWeight() {
        return weight + BoostMid.weight + MidWeapon.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed + 100 - getWeight();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    

}
