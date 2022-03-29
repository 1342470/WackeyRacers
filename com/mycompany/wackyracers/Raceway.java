/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wackyracers;

import java.util.Scanner;

/**
 *
 * @author kylej
 */
public class Raceway {

    public static Scanner theName = new Scanner(System.in);
    public static String correct = null;
    public static String theBoost;
    public static String theWeapon;
    
    public static void startRace(Engine thePlayer){
    
    }

    public static void getWeaponType(Engine thePlayer) {
        while (!"yes".equals(correct)) {
            System.out.println("Which type of Weapon would you like. will you choose? Please note the bigger the boost the more you will weigh and you will be slower the more weight you have.");
            String vechicle = theName.nextLine();

            if ("large".equals(vechicle) || "Large".equals(vechicle)) {
                System.out.println("so you would like the Large Weapon, It has high damage but at the cost of only having one shot make it count: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)){
                    thePlayer.vechicleWeapon = new LargeWeapon();
                    startRace(thePlayer);
                } else {
                    correct = "no";
                }
            } else if ("mid".equals(vechicle) || "Mid".equals(vechicle)) {
                System.out.println("so you would like the mid Weapon,Balanced stats across the board: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)) {
                    thePlayer.vechicleWeapon = new LargeWeapon();
                    startRace(thePlayer);
                } else {
                    correct = "no";
                }
            } else if ("small".equals(vechicle) || "Small".equals(vechicle)) {
                System.out.println("so you would like the small Weapon, it has low fire power but a high ammo count: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)){
                    thePlayer.vechicleWeapon = new LargeWeapon();
                    startRace(thePlayer);
                } else {
                    correct = "no";
                }
            } else {
                System.out.println("Unkown Vechicle type");
                correct = "no";
            }
        }
    }

    public static void getBoosterType(Engine thePlayer) {
        while (!"yes".equals(correct)) {
            System.out.println("Which type of boost would you like. will you choose? Please note the bigger the boost the more you will weigh and you will be slower the more weight you have.");
            String vechicle = theName.nextLine();

            if ("large".equals(vechicle) || "Large".equals(vechicle)) {
                System.out.println("so you would like the Large booster, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)) {
                    thePlayer.boostType = new BoostLarge();
                    System.out.println("Great now lets choose your weapon type");
                    correct = "yes";
                    getWeaponType(thePlayer);
                } else {
                    correct = "no";
                }
            } else if ("mid".equals(vechicle) || "Mid".equals(vechicle)) {
                System.out.println("so you would like the mid vechicle, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)) {
                    thePlayer.boostType = new BoostMid();
                    System.out.println("Great now lets choose your Weapon type");
                    correct = "yes";
                    getBoosterType(thePlayer);
                } else {
                    correct = "no";
                }
            } else if ("small".equals(vechicle) || "Small".equals(vechicle)) {
                System.out.println("so you would like the small booster, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)) {
                    thePlayer.boostType = new BoostSmall();
                    System.out.println("Great now lets choose your booster type");
                    correct = "yes";
                    getBoosterType(thePlayer);
                } else {
                    correct = "no";
                }
            } else {
                System.out.println("Unkown Vechicle type");
                correct = "no";
            }
        }

    }

    public static void getPlayerVechicle() {
        //loop that while the string correct doesn't equal yes it will ask the user what type of vechical they would like to choose
        while (!"yes".equals(correct)) {
            System.out.println("Which type of vechicle would you like. Large vechicles have less ammo but pack a punch and have acess to larger boosters however due to the extra weight they arn't able to go as fast, secondly is the mid tier which has the most balanced set of stats, finally their is the small vechicle due to is size it is the fastest of the lot however its boost isn't as large and though its amount of ammo is carrys is large the damage is deals isn't great. so which will you choose?");
            //get user input
            String vechicle = theName.nextLine();
            //if string matches ask user again if this is what they want if true create new LargeVeichalType object and move onto the next section 
            if ("large".equals(vechicle) || "Large".equals(vechicle)) {
                System.out.println("so you would like the Large vechicle, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)) {
                    LargeVechicleType player = new LargeVechicleType();
                    System.out.println("Great now lets choose your booster type");
                    correct = "yes";
                    getBoosterType(player);
                } else {
                    correct = "no";
                }
                //if string matches ask user again if this is what they want if true create new MidVeichalType object and move onto the next section 
            } else if ("mid".equals(vechicle) || "Mid".equals(vechicle)) {
                System.out.println("so you would like the mid vechicle, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)) {
                    MidVechicleType player = new MidVechicleType();
                    System.out.println("Great now lets choose your booster type");
                    correct = "yes";
                    getBoosterType(player);
                } else {
                    correct = "no";
                }
                //if string matches ask user again if this is what they want if true create new smallVeichalType object and move onto the next section 
            } else if ("small".equals(vechicle) || "Small".equals(vechicle)) {
                System.out.println("so you would like the small vechicle, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)) {
                    SmallVechicleType player = new SmallVechicleType();
                    System.out.println("Great now lets choose your booster type");
                    correct = "yes";
                    getBoosterType(player);
                } else {
                    correct = "no";
                }
                //if string doesn't match set correct to no and loop
            } else {
                System.out.println("Unkown Vechicle type");
                correct = "no";
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("Welcome to the raceway todays race is one to remeber, your are in group of eleven different racers racing against each other in various road rallies, with each driver hoping to win the title of the World's Wackiest Racer. The rules are extremely lax and allow for almost any vehicle design, power system and a wide range of tactics like combat and shortcuts. Despite this loose rule structure, competitors Dick Dastardly and his dog sidekick, Muttley, are still determined to cheat in their own ineffectual way so be carefull.");
        getPlayerVechicle();
    }

}
