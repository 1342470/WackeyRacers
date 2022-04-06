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
    private String nameOfDriver;


    public SmallVechicleType(String theName) {
        boostType = new BoostLarge();
        vechicleWeapon = new LargeWeapon();
        nameOfDriver = theName ; 
        
    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
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

    void attack(Engine theTarget) {
        vechicleWeapon.attack(theTarget);
    }

}
