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
public class BoostMid implements BoostType {
    private int uses = 5;
    public static int weight = 20;

    @Override
    public void boost(Engine theTarget) {
        if(this.uses >=1){
        theTarget.distance +=5;
        setUses(-1);
        }else{System.out.println("the boost failed as the booster fuel is empty");}
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

   

    

}
