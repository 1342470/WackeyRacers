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
public class MidWeapon implements VechicleWeapon {
    private int ammo = 3;
    public static int weight = 4;

    @Override
    public void attack(Engine theTarget) {
        if(this.ammo >=1){
        theTarget.health -= 10;
        setAmmo(-1);
        }else{System.out.println("you cannot fire your weapon as you are out of ammo");}
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

   

    

}
