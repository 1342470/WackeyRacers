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
public class NoWeapon implements VechicleWeapon {

    /**
     * allows weapon to shoot other engines
     *
     * @param theTarget target of shot
     */
    @Override
    public void attack(Engine theTarget) {
        System.out.println("Your Vechicle is unable to shoot as it doesn't have any Weapons");
    }

    /**
     * allows ammo to be stocked
     *
     * @param ammo new value of ammo
     */
    @Override
    public void setAmmo(int ammo) {
        System.out.println("you can't add any ammo as you don't have a weapon");
    }

}
