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
    private String nameOfDriver;
    private String power;

    public MidVechicleType(String theName) {
        boostType = new BoostLarge();
        vechicleWeapon = new MidWeapon();
         nameOfDriver = theName ; 

    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    public void display() {
        System.out.println("Your vehicle type is mid and has a base speed of " + getSpeed() + " and weight of " + getWeight());
    }

    public int getWeight() {
        return weight + BoostMid.weight + MidWeapon.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getSpeed() {
        //return currentState.getSpeed();
        return speed + 100 - getWeight();
    }

    @Override
     void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    void attack(Engine theTarget) {
        currentState.attack(theTarget);
        //vechicleWeapon.attack(theTarget);
    }


    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    
    

}
