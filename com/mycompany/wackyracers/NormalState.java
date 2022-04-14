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

    @Override
    public void attack(Engine theTarget) {
        theEngine.vechicleWeapon.attack(theTarget);
    }

    @Override
    public void boost(Engine theEngine) {
        System.out.println("Your booster is in good health can fires you down the road ahead");
        theEngine.boostType.boost(theEngine);
    }
    
    @Override
    public int getSpeed() {
        return theEngine.getSpeed() + 100 - theEngine.getWeight();
    }


  
}
