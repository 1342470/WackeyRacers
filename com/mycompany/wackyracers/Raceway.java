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

    public static LargeVechicleType The_Boudler_moblie = new LargeVechicleType();
    public static MidVechicleType Penelope_Pitstop = new MidVechicleType();
    public static SmallVechicleType The_Turbo_Terrific = new SmallVechicleType();
    public static LargeVechicleType The_Mean_Machine = new LargeVechicleType();
    public static MidVechicleType The_Bullet_Proof_Bomb = new MidVechicleType();
    public static SmallVechicleType The_Arkansas_Chuggabug = new SmallVechicleType();
    public static LargeVechicleType The_Convert_a_Car = new LargeVechicleType();
    public static MidVechicleType The_Creepy_Coupe = new MidVechicleType();
    public static LargeVechicleType The_Army_surplus_Special = new LargeVechicleType();
    public static LargeVechicleType The_Buzz_Wagon = new LargeVechicleType();

    public static void printContests(Engine thePlayer) {
        System.out.println("The_Boudler_moblie has currently traveled" + The_Boudler_moblie.distance + " and is on lap " + The_Boudler_moblie.laps);
        System.out.println("Penelope_Pitstop has currently traveled" + Penelope_Pitstop.distance + " and is on lap " + Penelope_Pitstop.laps);
        System.out.println("The_Turbo_Terrific has currently traveled" + The_Turbo_Terrific.distance + " and is on lap " + The_Turbo_Terrific.laps);
        System.out.println("The_Mean_Machine has currently traveled" + The_Mean_Machine.distance + " and is on lap " + The_Mean_Machine.laps);
        System.out.println("The_Bullet_Proof_Bomb has currently traveled" + The_Bullet_Proof_Bomb.distance + " and is on lap " + The_Bullet_Proof_Bomb.laps);
        System.out.println("The_Arkansas_Chuggabug has currently traveled" + The_Arkansas_Chuggabug.distance + " and is on lap " + The_Arkansas_Chuggabug.laps);
        System.out.println("The_Convert_a_Car has currently traveled" + The_Convert_a_Car.distance + " and is on lap " + The_Convert_a_Car.laps);
        System.out.println("The_Boudler_moblie has currently traveled" + The_Creepy_Coupe.distance + " and is on lap " + The_Creepy_Coupe.laps);
        System.out.println("The_Boudler_moblie has currently traveled" + The_Army_surplus_Special.distance + " and is on lap " + The_Army_surplus_Special.laps);
        System.out.println("The_Boudler_moblie has currently traveled" + The_Buzz_Wagon.distance + " and is on lap " + The_Buzz_Wagon.laps);
        System.out.println("You have currently traveled" + thePlayer.distance + " and are on lap " + thePlayer.laps);
    }

    public static void startRace(Engine thePlayer) {
        while (thePlayer.laps != 3 || The_Boudler_moblie.laps != 3 || Penelope_Pitstop.laps != 3 || The_Turbo_Terrific.laps != 3 || The_Mean_Machine.laps != 3 || The_Bullet_Proof_Bomb.laps != 3 || The_Arkansas_Chuggabug.laps != 3 || The_Convert_a_Car.laps != 3 || The_Creepy_Coupe.laps != 3 || The_Army_surplus_Special.laps != 3 || The_Buzz_Wagon.laps != 3) {
            while (thePlayer.distance != 100 || The_Boudler_moblie.distance != 100 || Penelope_Pitstop.distance != 100 || The_Turbo_Terrific.distance != 100 || The_Mean_Machine.distance != 100 || The_Bullet_Proof_Bomb.distance != 100 || The_Arkansas_Chuggabug.distance != 100 || The_Convert_a_Car.distance != 100 || The_Creepy_Coupe.distance != 100 || The_Army_surplus_Special.distance != 100 || The_Buzz_Wagon.distance != 100) {
                printContests(thePlayer);
                drive(thePlayer);
                lapCheck(thePlayer);
            }
        }
    }

    public static void getWeaponType(Engine thePlayer) {
        while (!"yes".equals(correct)) {
            System.out.println("Which type of Weapon would you like. will you choose? Please note the bigger the boost the more you will weigh and you will be slower the more weight you have.");
            String vechicle = theName.nextLine();

            if ("large".equals(vechicle) || "Large".equals(vechicle)) {
                System.out.println("so you would like the Large Weapon, It has high damage but at the cost of only having one shot make it count: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)) {
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
                if ("yes".equals(theResponse) || "Yes".equals(theResponse)) {
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

    public static void drive(Engine thePlayer) {
        The_Boudler_moblie.distance += The_Boudler_moblie.getSpeed();
        Penelope_Pitstop.distance += Penelope_Pitstop.getSpeed();
        The_Turbo_Terrific.distance += The_Turbo_Terrific.getSpeed();
        The_Mean_Machine.distance += The_Mean_Machine.getSpeed();
        The_Bullet_Proof_Bomb.distance += The_Bullet_Proof_Bomb.getSpeed();
        The_Arkansas_Chuggabug.distance += The_Arkansas_Chuggabug.getSpeed();
        The_Creepy_Coupe.distance += The_Creepy_Coupe.getSpeed();
        The_Convert_a_Car.distance += The_Convert_a_Car.getSpeed();
        The_Army_surplus_Special.distance += The_Army_surplus_Special.getSpeed();
        thePlayer.distance += thePlayer.getSpeed();
    }

    public static void lapCheck(Engine thePlayer) {
        if (thePlayer.distance <= 100) {
            thePlayer.laps = thePlayer.laps + 1;
            thePlayer.distance = 0;
        }
        if (The_Boudler_moblie.distance <= 100) {
            The_Boudler_moblie.laps = The_Boudler_moblie.laps + 1;
            The_Boudler_moblie.distance = 0;
        }
        if (Penelope_Pitstop.distance <= 100) {
            Penelope_Pitstop.laps = Penelope_Pitstop.laps + 1;
            Penelope_Pitstop.distance = 0;
        }
        if (The_Turbo_Terrific.distance <= 100) {
            The_Turbo_Terrific.laps = The_Turbo_Terrific.laps + 1;
            The_Turbo_Terrific.distance = 0;
        }
        if (The_Mean_Machine.distance <= 100) {
            The_Mean_Machine.laps = The_Mean_Machine.laps + 1;
            The_Mean_Machine.distance = 0;
        }
        if (The_Bullet_Proof_Bomb.distance <= 100) {
            The_Bullet_Proof_Bomb.laps = The_Bullet_Proof_Bomb.laps + 1;
            The_Bullet_Proof_Bomb.distance = 0;
        }
        if (The_Arkansas_Chuggabug.distance <= 100) {
            The_Arkansas_Chuggabug.laps = The_Arkansas_Chuggabug.laps + 1;
            The_Arkansas_Chuggabug.distance = 0;
        }
        if (The_Creepy_Coupe.distance <= 100) {
            The_Creepy_Coupe.laps = The_Creepy_Coupe.laps + 1;
            The_Creepy_Coupe.distance = 0;
        }
        if (The_Convert_a_Car.distance <= 100) {
            The_Convert_a_Car.laps = The_Convert_a_Car.laps + 1;
            The_Convert_a_Car.distance = 0;
        }
        if (The_Army_surplus_Special.distance <= 100) {
            The_Army_surplus_Special.laps = The_Army_surplus_Special.laps + 1;
            The_Army_surplus_Special.distance = 0;
        }

    }

    public static void main(String[] args) {

        System.out.println("Welcome to the raceway todays race is one to remeber, your are in group of eleven different racers racing against each other in various road rallies, with each driver hoping to win the title of the World's Wackiest Racer. The rules are extremely lax and allow for almost any vehicle design, power system and a wide range of tactics like combat and shortcuts. Despite this loose rule structure, competitors Dick Dastardly and his dog sidekick, Muttley, are still determined to cheat in their own ineffectual way so be carefull.");
        getPlayerVechicle();
    }

}
