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

    @Override
    public void attack(Engine theTarget) {
        System.out.println("Your Vechicle is unable to shoot as it doesn't have any Weapons");
    }

    @Override
    public void setAmmo(int ammo) {
        System.out.println("you can't add any ammo as you don't have a weapon");
    }


}
