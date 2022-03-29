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
public class BoostSmall implements BoostType {
    private int uses = 10;
    public static int weight = 10;

    @Override
    public void boost(Engine theTarget) {
        if(this.uses >=1){
        theTarget.distance +=2;
        setUses(-1);
        }else{System.out.println("you cannot boost as your booster fuel is empty");}
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

   

    

}
