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
    VechicleState destoryedState = new DistoryedState(this);
    VechicleState poweredState = new PoweredState(this);
    VechicleState brokenDownState  = new BrokenDownState(this);
    VechicleState normalState = new NormalState(this);
    VechicleState currentState;
    //allows engine to swap boost and vechicle types
    BoostType boostType;
    VechicleWeapon vechicleWeapon;
    //varrious stats used by the main
    public int distance = 0;
    public int laps = 0;
    public int health = 100;
    private String power;

    public Engine() {
        currentState = normalState;
        
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
     * gets the current state of the engine
     * @return current state
     */
    public VechicleState getState() {
        return currentState;
    }

    /**
     * allows the state to be changed to another new state 
     * @param newState value of the new state that will be set
     * @return new state as the value of the new state
     */
    public VechicleState setState(VechicleState newState) {
        return this.currentState = newState;
    }

    /**
     * get the destoryed state
     * @return the engines destoryed state
     */
    public VechicleState getdestoryedState() {
        return destoryedState;
    }

        /**
     * get the powered state
     * @return the engines powered state
     */
    public VechicleState getpoweredState() {
        return poweredState;
    }

    /**
     * get the broken state
     * @return the engines broken state
     */
    public VechicleState getbrokenDownState() {
        return brokenDownState;
    }

    /**
     * get the normal state
     * @return the engines normal state
     */    
    public VechicleState getnormalState() {
        return normalState;
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

    public abstract int getStateSpeed();
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

    /**
     * prints out the stats of a vechicle including speed, weight
     */
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

    /**
     * gets the number of laps of object
     * @return int of current objects laps
     */
    public int getLaps() {
        return laps;
    }

    /**
     * allows new value of laps to be set 
     * @param laps new number of laps
     */
    public void setLaps(int laps) {
        this.laps = laps;
    }

}
