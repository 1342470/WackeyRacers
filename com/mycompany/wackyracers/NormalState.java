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
public class NormalState implements VechicleState {

    Engine theEngine;

    public NormalState(Engine theEngine) {
        this.theEngine = theEngine;
        theEngine.health = 100;

    }

    /**
     * allows objects to attack another
     * @param theTarget target of attack
     */
    @Override
    public void attack(Engine theTarget) {
        theEngine.vechicleWeapon.attack(theTarget);
    }

    /**
     * uses boost to extend distance if uses are higher than 1
     * @param theEngine target of boost
     */
    @Override
    public void boost(Engine theEngine) {
        System.out.println("Your booster is in good health can fires you down the road ahead");
        theEngine.boostType.boost(theEngine);
    }

    /**
     * get speed from state as well getting total speed by from weight
     * @return the value of speed
     */
    @Override
    public int getSpeed() {
        return theEngine.getStateSpeed() + 100 - theEngine.getWeight();
    }

}
