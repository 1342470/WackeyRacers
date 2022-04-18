package com.mycompany.wackyracers;

public class LargeVechicleType extends Engine {

    private int weight = 20;
    private int speed = 5;
    private String nameOfDriver;
    private String power;

    public LargeVechicleType(String theName) {
        boostType = new BoostLarge();
        vechicleWeapon = new LargeWeapon();
        nameOfDriver = theName;

    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    @Override
    public void display() {
        System.out.println("Your vehicle type is large and has a base speed of " + getSpeed() + " and weight of " + getWeight());
    }

    @Override
    public int getWeight() {
        return weight + BoostLarge.weight + LargeWeapon.weight;
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

    @Override
    public String getPower() {
        return power;
    }

    @Override
    public void setPower(String power) {
        this.power = power;
    }


}
