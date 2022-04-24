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
public class BrokenDownState implements VechicleState {
 
    Engine theEngine;
 
    public BrokenDownState(Engine theEngine) {
        this.theEngine = theEngine;
        //theEngine.setSpeed(theEngine.getSpeed()/2);

    }


    @Override
    public void attack(Engine theTarget) {
        theEngine.vechicleWeapon.attack(theTarget);
    }


    @Override
    public void boost(Engine theEngine) {
        System.out.println("unfornatly your boosters broken you cannot boost at the moment");
    
    }
    
    @Override
    public int getSpeed() {
        return theEngine.getStateSpeed() + 75 - theEngine.getWeight();
    }


  
}

