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

    public void display() {
        System.out.println("Your Vechicle has a base speed of " + getSpeed() + " and weight of " + getWeight());
    }

    public int getWeight() {
        return weight + BoostLarge.weight + LargeWeapon.weight;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    
    

}
