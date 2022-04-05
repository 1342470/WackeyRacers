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
public class SmallVechicleType extends Engine {
    private int weight = 5;
    private int speed = 15;


    public SmallVechicleType() {
        boostType = new BoostSmall();
        vechicleWeapon = new SmallWeapon();
        
    }

    public void display() {
        System.out.println("Your Vechicle has a base speed of " + getSpeed() + " and weight of " + getWeight());
    }

    public int getWeight() {
        return weight + BoostSmall.weight + SmallWeapon.weight;
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
