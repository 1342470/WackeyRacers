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
public class NoBoost implements BoostType {


    @Override
    public void boost(Engine theTarget) {
        System.out.println("you can't boost as you don't have a booster equiped");
    }


}
