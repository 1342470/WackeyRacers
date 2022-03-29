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

    @Override
    public void boost(Engine theTarget) {
        theTarget.distance += 5;
    }


    
}
