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
public class SmallWeapon implements VechicleWeapon {
    private int ammo = 10;
    public static int weight = 29;

    @Override
    public void attack(Engine theTarget) {
        if(this.ammo >=1){
        theTarget.health -= 2;
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
