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
public class PoweredState implements VechicleState {

    Engine theEngine;
    public int powerleft = 3;

    public PoweredState(Engine theEngine) {
        this.theEngine = theEngine;
        theEngine.health = 999;
        //theEngine.setSpeed(theEngine.getSpeed() + 20);

        if (powerleft <= 0) {
            System.out.println("the superCharge in the powerup has ran out the car transfroms back into its normal state ");
            theEngine.currentState = theEngine.normalState;
        }

    }

    /**
     * allows objects to attack another
     *
     * @param theTarget target of attack
     */
    @Override
    public void attack(Engine theTarget) {
        System.out.println("Your weapon is Powered up and fires twice at once.");
        theEngine.vechicleWeapon.attack(theTarget);
        theEngine.vechicleWeapon.attack(theTarget);
        powerleft = powerleft - 1;
    }

    /**
     * uses boost to extend distance if uses are higher than 1
     *
     * @param theEngine target of boost
     */
    @Override
    public void boost(Engine theEngine) {
        System.out.println("Your booster is supercharged and fires up into turbo");
        theEngine.boostType.boost(theEngine);
        theEngine.boostType.boost(theEngine);
        powerleft = powerleft - 1;
    }

    /**
     * get speed from state as well getting total speed by from weight
     * @return the value of speed
     */
    @Override
    public int getSpeed() {
        powerleft = powerleft - 1;
        System.out.println("you engine is supercharged, the extra power makes faster than normal");
        return theEngine.getStateSpeed() + 125 - theEngine.getWeight();

    }

}
