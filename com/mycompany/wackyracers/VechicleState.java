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
public interface VechicleState {

    /**
     * allows objects to attack another
     *
     * @param theTarget target of attack
     */
    public void attack(Engine theTarget);

    /**
     * get speed from state as well getting total speed by from weight
     *
     * @return the value of speed
     */
    public int getSpeed();

    /**
     * uses boost to extend distance if uses are higher than 1
     *
     * @param theEngine target of boost
     */
    public void boost(Engine theEngine);
}
