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
    public static int weight = 4;

    
    /**
     * allows weapon to shoot other engines 
     * @param theTarget target of shot
     */
    @Override
     public void attack(Engine theTarget) {
        if (this.ammo >= 1) {
            theTarget.health -= 10;
            setAmmo(-1);
            System.out.println("you fire at the target you now have " + this.ammo + " shots left");
           
            if (theTarget.health <= 0) {
                theTarget.currentState = theTarget.destoryedState;
                System.out.println("a racer has been eliminated");
            }else if (theTarget.health <=50){
                theTarget.setState(theTarget.brokenDownState);
                System.out.println("the shot has highly damaged the enginge its clear to see that the engine isn't preforming as well now");
            }
        } else {
            System.out.println("you cannot fire your weapon as you are out of ammo");
        }
    }

    public int getAmmo() {
        return ammo;
    }

    /**
     * allows ammo to be stocked
     * @param ammo new value of ammo
     */
    public void setAmmo(int ammo) {
        this.ammo = ammo + this.ammo;
        System.out.println("you now have " + getAmmo() + " shots ");
    }

}
