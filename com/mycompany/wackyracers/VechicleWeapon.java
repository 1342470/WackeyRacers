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
public interface VechicleWeapon {

    /**
     * allows objects to attack another
     *
     * @param theTarget target of attack
     */
    public void attack(Engine theTarget);

    /**
     * allows ammo to be stocked
     *
     * @param ammo new value of ammo
     */
    public void setAmmo(int ammo);

}
