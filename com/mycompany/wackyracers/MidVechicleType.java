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
        nameOfDriver = theName;

    }

    /**
     * gets the name of driver
     *
     * @return name of driver
     */
    public String getNameOfDriver() {
        return nameOfDriver;
    }

    /**
     * sets name of driver
     *
     * @param nameOfDriver new name of driver
     */
    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    /**
     * prints stats and type of vecicle
     */
    public void display() {
        System.out.println("Your vehicle type is mid and has a base speed of " + getSpeed() + " and weight of " + getWeight());
    }

    /**
     * gets the weight of all parts
     *
     * @return value of combined weight
     */
    public int getWeight() {
        return weight + BoostMid.weight + MidWeapon.weight;
    }

    /**
     * allows new weight to be set
     *
     * @param weight value of new weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * gets the speed from the vechicles current state
     *
     * @return value of speed
     */
    @Override
    public int getSpeed() {
        return currentState.getSpeed();
    }

    /**
     * gets the speed from the instance varible set on object creation
     *
     * @return
     */
    public int getStateSpeed() {
        return speed;
    }

    /**
     * allow speed to be set
     *
     * @param speed new value of speed
     */
    @Override
    void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * allows objects to attack another
     *
     * @param theTarget target of attack
     */
    @Override
    void attack(Engine theTarget) {
        currentState.attack(theTarget);
        //vechicleWeapon.attack(theTarget);
    }

    /**
     * prints the drivers power
     *
     * @return value of current power
     */
    public String getPower() {
        return power;
    }

    /**
     * allows power to be reset
     *
     * @param power value of power
     */
    public void setPower(String power) {
        this.power = power;
    }

}
