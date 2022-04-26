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
public class DistoryedState implements VechicleState {

    Engine theEngine;

    public DistoryedState(Engine theEngine) {
        this.theEngine = theEngine;
        theEngine.health = 0;
        theEngine.setSpeed(0);
        theEngine.setVechicleWeapon(new NoWeapon());
        theEngine.setBoostType(new NoBoost());
    }

    public void setSpeed(int theSpeed) {
        theEngine.setSpeed(theSpeed);
    }

    @Override
    /**
     * allows objects to attack another
     */
    public void attack(Engine theTarget) {
        System.out.println("you are unable to attack as your vechicle has been distoryed");
    }

    @Override
    /**
     * uses boost to extend distnace if uses are higher than 1
     */
    public void boost(Engine theEng) {
        System.out.println("you are unable to boost as your chechicle has been distoryed");
    }

    @Override
    public int getSpeed() {
        return 0;
    }

}
