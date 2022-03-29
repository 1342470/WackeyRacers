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
public class LargeWeapon implements VechicleWeapon {
    private int ammo = 1;

    @Override
    public void attack(Engine theTarget) {
        theTarget.health -= 50;
        setAmmo(-1);
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

   

    

}
