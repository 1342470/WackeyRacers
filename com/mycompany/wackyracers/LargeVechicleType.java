package com.mycompany.wackyracers;

public class LargeVechicleType extends Engine {
    private int weight = 20;
    private int speed = 5;


    public LargeVechicleType() {
        boostType = new BoostLarge();
        vechicleWeapon = new LargeWeapon();
        
    }

    public void display() {
        System.out.println("Your Vechicle has a base speed of " + getSpeed() + " and weight of " + getWeight());
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    

}
