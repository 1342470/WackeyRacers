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

    //sets various states a vechicle can go to 
    VechicleState destoryedState;
    VechicleState poweredState;
    VechicleState brokenDownState;
    VechicleState normalState;
    VechicleState currentState = normalState;
    //allows engine to swap boost and vechicle types
    BoostType boostType;
    VechicleWeapon vechicleWeapon;
    //varrious stats used by the main
    public int distance = 0;
    public int laps = 0;
    public int health = 100;
    private String power;

    public Engine() {
        destoryedState = new DistoryedState(this);
        poweredState = new PoweredState(this);
        brokenDownState = new BrokenDownState(this);
        normalState = new NormalState(this);
        
        if (health >50){
            currentState = normalState;
        }
        if (health < 50) {
            currentState = brokenDownState;
        }
        if (health <= 0) {
            currentState = destoryedState;
        }

    }

    /**
     * sets the type of booster that will be used during the race this could be
     * either small,mid or large
     *
     * @param theType requires a new instance of a boost class to be created.
     * for example new BoostLarge ect.
     */
    public void setBoostType(BoostType theType) {
        boostType = theType;
    }

    /**
     * sets the type of weapon that will be used during the race this could be
     * either small,mid or large
     *
     * @param theWeapon requires a new instance of a weapon class to be created.
     * for example new LargeWeapon ect.
     */
    public void setVechicleWeapon(VechicleWeapon theWeapon) {
        vechicleWeapon = theWeapon;
    }

    /**
     * set the string value of a racer
     *
     * @param thePower the string that will resepent the racers power
     */
    public void setPower(String thePower) {
        thePower = power;
    }

    /**
     * returns a string with the value of a racers power (used during the race
     * to print out current events)
     *
     * @return turns the value assined to power
     */
    public String getPower() {
        return power;
    }

    abstract void display();

    /**
     * use the vehicles weapon to shoot at another racer
     *
     * @param theTarget will be the target of the attack
     */
    abstract void attack(Engine theTarget);

    /**
     * returns speed value
     *
     * @return speed value
     */
    abstract int getSpeed();

    abstract void setSpeed(int speed);

    /**
     * allow user to user a boost to increase distance
     *
     * @param boostType depending on which booster has been created for the
     * vechile the distance the boost method will send back will be diffrent
     */
    public void boost() {
        currentState.boost(this);
        //boostType.boost(this);
    }

    abstract int getWeight();

    /**
     * get the current distance of the vehicle
     *
     * @return value of distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * allows the distance to set to a value
     *
     * @param distance int that is used to show how far a vechical has traveled
     */
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
