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
public abstract class BaseCar {
	VechicleType vechicleType;
	VechicleWeapon vechicleWeapon;

	public BaseCar() {  
	}

	public void setVechicleType(VechicleType theType) {
		vechicleType = theType;
	}

	public void setVechicleWeapon(VechicleWeapon theWeapon) {
		vechicleWeapon = theWeapon;
	}

	abstract void display();

	public void boost() {
		vechicleType.boost();
	}

	public void useWeapon() {
		vechicleWeapon.attack();
	}
        
}