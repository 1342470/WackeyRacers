/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wackyracers;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kylej
 */
public class Raceway {

    public static Scanner theName = new Scanner(System.in);
    public static Scanner theShot = new Scanner(System.in);
    public static String correct = null;
    public static String theBoost;
    public static String theWeapon;

    public static LargeVechicleType The_Boudler_moblie = new LargeVechicleType("The Slag Brothers ");
    public static MidVechicleType Penelope_Pitstop = new MidVechicleType("Penelope Pitstop");
    public static SmallVechicleType The_Turbo_Terrific = new SmallVechicleType("Peter Perfect");
    public static LargeVechicleType The_Mean_Machine = new LargeVechicleType("Dick Dastardly");
    public static MidVechicleType The_Bullet_Proof_Bomb = new MidVechicleType("The Ant Hill Mob");
    public static SmallVechicleType The_Arkansas_Chuggabug = new SmallVechicleType("Lazy Luke and Blubber Bear");
    public static LargeVechicleType The_Convert_a_Car = new LargeVechicleType("Professor Pat Pending");
    public static MidVechicleType The_Creepy_Coupe = new MidVechicleType("The Gruesome Twosome");
    public static LargeVechicleType The_Army_surplus_Special = new LargeVechicleType("Sergeant Blast and Private Meekley ");
    public static LargeVechicleType The_Buzz_Wagon = new LargeVechicleType("Rufus Ruffcut and Sawtooth ");

    public static void printContests(Engine thePlayer) {
        System.out.println("The_Boudler_moblie has currently traveled" + The_Boudler_moblie.distance + " and is on lap " + The_Boudler_moblie.laps);
        sleepFunction();
        System.out.println("Penelope_Pitstop has currently traveled" + Penelope_Pitstop.distance + " and is on lap " + Penelope_Pitstop.laps);
        sleepFunction();
        System.out.println("The_Turbo_Terrific has currently traveled" + The_Turbo_Terrific.distance + " and is on lap " + The_Turbo_Terrific.laps);
        sleepFunction();
        System.out.println("The_Mean_Machine has currently traveled" + The_Mean_Machine.distance + " and is on lap " + The_Mean_Machine.laps);
        sleepFunction();
        System.out.println("The_Bullet_Proof_Bomb has currently traveled" + The_Bullet_Proof_Bomb.distance + " and is on lap " + The_Bullet_Proof_Bomb.laps);
        sleepFunction();
        System.out.println("The_Arkansas_Chuggabug has currently traveled" + The_Arkansas_Chuggabug.distance + " and is on lap " + The_Arkansas_Chuggabug.laps);
        sleepFunction();
        System.out.println("The_Convert_a_Car has currently traveled" + The_Convert_a_Car.distance + " and is on lap " + The_Convert_a_Car.laps);
        sleepFunction();
        System.out.println("The_Creepy_Coupe has currently traveled" + The_Creepy_Coupe.distance + " and is on lap " + The_Creepy_Coupe.laps);
        sleepFunction();
        System.out.println("The_Army_surplus_Special has currently traveled" + The_Army_surplus_Special.distance + " and is on lap " + The_Army_surplus_Special.laps);
        sleepFunction();
        System.out.println("The_Buzz_Wagon has currently traveled" + The_Buzz_Wagon.distance + " and is on lap " + The_Buzz_Wagon.laps);
        sleepFunction();
        System.out.println("You have currently traveled" + thePlayer.distance + " and are on lap " + thePlayer.laps);
        sleepFunction();
    }

    public static void setpower(Engine thePlayer) {
        The_Boudler_moblie.setPower("The Boulder moblie rocks and rolls into action");
        Penelope_Pitstop.setPower("Stops by the pits to boost and stops play mrs nice girl");
        The_Turbo_Terrific.setPower("Terrfic looks like turbo in turbo terrific has come out");
        The_Mean_Machine.setPower("owch they don't call them the mean machine for no reason");
        The_Bullet_Proof_Bomb.setPower("BOOM the bullet_proof_bomb blasts past");
        The_Arkansas_Chuggabug.setPower("The_Arkansas_Chuggabug chuggs on by");
        The_Convert_a_Car.setPower("The_Convert_a_Car has changed forms");
        The_Buzz_Wagon.setPower("The buzz wagon buzzes on Ahead");
        thePlayer.setPower("You hit the boost and speed ahead");
        The_Army_surplus_Special.setPower("The_Army_surplus_Special enlists an boost in power");

    }

    public static void startRace(Engine thePlayer) {
        thePlayer.display();
        setpower(thePlayer);
        while (thePlayer.laps <= 3 || The_Boudler_moblie.laps <= 3 || Penelope_Pitstop.laps <= 3 || The_Turbo_Terrific.laps <= 3 || The_Mean_Machine.laps <= 3 || The_Bullet_Proof_Bomb.laps <= 3 || The_Arkansas_Chuggabug.laps <= 3 || The_Convert_a_Car.laps <= 3 || The_Creepy_Coupe.laps <= 3 || The_Army_surplus_Special.laps <= 3 || The_Buzz_Wagon.laps <= 3) {
            printContests(thePlayer);
            drive(thePlayer);
            lapCheck(thePlayer);

        }
    }

    public static void getWeaponType(Engine thePlayer) {
        while (!"yes".equals(correct)) {
            System.out.println("Which type of Weapon would you like. will you choose? Please note the bigger the boost the more you will weigh and you will be slower the more weight you have.");
            String vechicle = theName.nextLine();

            if ("large".equals(vechicle) || "Large".equals(vechicle)) {
                System.out.println("so you would like the Large Weapon, It has high damage but at the cost of only having one shot make it count: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.vechicleWeapon = new LargeWeapon();
                    startRace(thePlayer);
                } else {
                    correct = "no";
                }
            } else if ("mid".equals(vechicle) || "Mid".equals(vechicle)) {
                System.out.println("so you would like the mid Weapon,Balanced stats across the board: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.vechicleWeapon = new LargeWeapon();
                    startRace(thePlayer);
                } else {
                    correct = "no";
                }
            } else if ("small".equals(vechicle) || "Small".equals(vechicle)) {
                System.out.println("so you would like the small Weapon, it has low fire power but a high ammo count: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
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
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.boostType = new BoostLarge();
                    System.out.println("Great now lets choose your weapon type");
                    getWeaponType(thePlayer);
                    correct = "yes";
                } else {
                    correct = "no";
                }
            } else if ("mid".equals(vechicle) || "Mid".equals(vechicle)) {
                System.out.println("so you would like the mid vechicle, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.boostType = new BoostMid();
                    System.out.println("Great now lets choose your Weapon type");
                    getWeaponType(thePlayer);
                    correct = "yes";
                } else {
                    correct = "no";
                }
            } else if ("small".equals(vechicle) || "Small".equals(vechicle)) {
                System.out.println("so you would like the small booster, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.boostType = new BoostSmall();
                    System.out.println("Great now lets choose your booster type");
                    getWeaponType(thePlayer);
                    correct = "yes";
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
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    LargeVechicleType player = new LargeVechicleType("The player 01");
                    System.out.println("Great now lets choose your booster type");
                    getBoosterType(player);
                    correct = "yes";
                } else {
                    correct = "no";
                }
                //if string matches ask user again if this is what they want if true create new MidVeichalType object and move onto the next section 
            } else if ("mid".equals(vechicle) || "Mid".equals(vechicle)) {
                System.out.println("so you would like the mid vechicle, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    MidVechicleType player = new MidVechicleType("The player 01");
                    System.out.println("Great now lets choose your booster type");
                    getBoosterType(player);
                    correct = "yes";
                } else {
                    correct = "no";
                }
                //if string matches ask user again if this is what they want if true create new smallVeichalType object and move onto the next section 
            } else if ("small".equals(vechicle) || "Small".equals(vechicle)) {
                System.out.println("so you would like the small vechicle, type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    SmallVechicleType player = new SmallVechicleType("The player 01");
                    System.out.println("Great now lets choose your booster type");
                    getBoosterType(player);
                    correct = "yes";
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
        correct = "no";
        while (!"yes".equals(correct)) {
            System.out.println("What will you do you can either 'drive',' shoot' or 'boost'?");
            //get user input
            String action = theName.nextLine();
            //if string matches ask user again if this is what they want if true create new LargeVeichalType object and move onto the next section 
            if ("Drive".equals(action) || "drive".equals(action)) {
                //instance of random class and selecting the highest value that it will generate
                Random rand = new Random();
                int upperbound = 3;
                int int_random = rand.nextInt(upperbound);
                if (int_random == 1 || int_random == 3) {
                    thePlayer.distance += thePlayer.getSpeed();
                    System.out.println("You put your foot on the gas and drive on");
                    correct = "yes";
                } else {
                    System.out.println("you tryed to put your foot down however your engine stalled");
                    correct = "yes";
                }
            } else if ("Boost".equals(action) || "boost".equals(action)) {
                //instance of random class and selecting the highest value that it will generate
                Random rand = new Random();
                int upperbound = 4;
                int int_random = rand.nextInt(upperbound);
                if (int_random == 1 || int_random == 3 || int_random == 4) {
                    thePlayer.boost();
                    System.out.println("you use your boost and speed ahead.");
                    correct = "yes";
                } else {
                    System.out.println("you tryed to boost  however your boost stalled");
                    correct = "yes";
                }
            } else if ("shoot".equals(action) || "shoot".equals(action)) {
                System.out.println("who will you shoot you can shoot either 'The_Boudler_moblie', 'Penelope_Pitstop', 'The_Turbo_Terrific', 'The_Mean_Machine', 'The_Bullet_Proof_Bomb', 'The_Arkansas_Chuggabug', 'The_Creepy_Coupe', 'The_Convert_a_Car' or 'The_Army_surplus_Special' ?");
                String shot = theShot.nextLine();
                if ("The_Boudler_moblie".equals(shot) || "The Boudler moblie".equals(shot) || "the boudler moblie".equals(shot)) {
                    System.out.println("you shoot the boulder moblie");
                    thePlayer.attack(The_Boudler_moblie);
                    correct = "yes";
                } else if ("Penelope_Pitstop".equals(shot) || "Penelope Pitstop".equals(shot) || "penelope pitstop".equals(shot)) {
                    System.out.println("you shoot Penelope_Pitstop");
                    thePlayer.attack(Penelope_Pitstop);
                    correct = "yes";
                } else if ("The_Turbo_Terrific".equals(shot) || "The Turbo Terrific".equals(shot) || "the turbo terrific".equals(shot)) {
                    System.out.println("you shoot The_Turbo_Terrific");
                    thePlayer.attack(The_Turbo_Terrific);
                    correct = "yes";
                } else if ("The_Mean_Machine".equals(shot) || "The Mean Machine".equals(shot) || "the mean machine".equals(shot)) {
                    System.out.println("you shoot The_Mean_Machine");
                    thePlayer.attack(The_Mean_Machine);
                    correct = "yes";
                } else if ("The_Bullet_Proof_Bomb".equals(shot) || "The Bullet Proof Bomb".equals(shot) || "the bullet proof bomb".equals(shot)) {
                    System.out.println("you shoot The_Bullet_Proof_Bomb");
                    thePlayer.attack(The_Bullet_Proof_Bomb);
                    correct = "yes";
                } else if ("The_Arkansas_Chuggabug".equals(shot) || "The Arkansas Chuggabug".equals(shot) || "the arkansas chuggabug".equals(shot)) {
                    System.out.println("you shoot The_Arkansas_Chuggabug");
                    thePlayer.attack(The_Arkansas_Chuggabug);
                    correct = "yes";
                } else if ("The_Creepy_Coupe".equals(shot) || "The_Creepy_Coupe".equals(shot) || "The_Creepy_Coupe".equals(shot)) {
                    System.out.println("you shoot The_Creepy_Coupe");
                    thePlayer.attack(The_Creepy_Coupe);
                    correct = "yes";
                } else if ("The_Convert_a_Car".equals(shot) || "The Convert a Car".equals(shot) || "the convert a car".equals(shot)) {
                    System.out.println("you shoot The_Convert_a_Car");
                    thePlayer.attack(The_Convert_a_Car);
                    correct = "yes";
                } else if ("The_Army_surplus_Special".equals(shot) || "The Army surplus Special".equals(shot) || "the army surplus special".equals(shot)) {
                    System.out.println("you shoot ");
                    thePlayer.attack(The_Army_surplus_Special);
                    correct = "yes";
                } else {
                    System.out.println("unknown action");
                }

            } else if ("power".equals(action) || "Power".equals(action)) {
                thePlayer.getPower();
                thePlayer.boostType.boost(thePlayer);
                thePlayer.attack(The_Convert_a_Car);
                thePlayer.attack(Penelope_Pitstop);
                thePlayer.attack(The_Turbo_Terrific);
                thePlayer.attack(The_Bullet_Proof_Bomb);
                thePlayer.attack(The_Arkansas_Chuggabug);
                thePlayer.attack(The_Creepy_Coupe);
                thePlayer.attack(The_Army_surplus_Special);

            } else {
                System.out.println("unknown action");
            }
            sleepFunction();
            aiTurnLarge(The_Boudler_moblie);
            sleepFunction();
            aiTurnMid(Penelope_Pitstop);
            sleepFunction();
            aiTurnLarge(The_Mean_Machine);
            sleepFunction();
            aiTurnMid(The_Bullet_Proof_Bomb);
            sleepFunction();
            aiTurnSmall(The_Turbo_Terrific);
            sleepFunction();
            aiTurnSmall(The_Arkansas_Chuggabug);
            sleepFunction();
            aiTurnLarge(The_Convert_a_Car);
            sleepFunction();
            aiTurnMid(The_Creepy_Coupe);
            sleepFunction();
            aiTurnLarge(The_Army_surplus_Special);
            sleepFunction();
            aiTurnLarge(The_Buzz_Wagon);
            sleepFunction();
        }
    }

    public static void sleepFunction() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Raceway.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void aiTurnLarge(LargeVechicleType theAI) {
        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 1) {
            theAI.distance += theAI.getSpeed();
            System.out.println(theAI.getNameOfDriver() + " drives ahead");

        }
        switch (int_random) {
            case 2:
                theAI.boost();
                System.out.println(theAI.getNameOfDriver() + " boosts");
                break;
            case 3:
                theAI.attack(The_Creepy_Coupe);
                System.out.println(theAI.getNameOfDriver() + " attacks");
                break;
            case 4:
                System.out.println(theAI.getNameOfDriver() + " uses their power");
                theAI.getPower();
                theAI.boost();
                break;
            default:
                System.out.println("Oh no the " + theAI.getNameOfDriver() + " stalled");
                break;
        }
    }

    public static void aiTurnMid(MidVechicleType theAI) {
        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 1) {
            theAI.distance += theAI.getSpeed();
            System.out.println(theAI.getNameOfDriver() + " drives ahead");
        }
        switch (int_random) {
            case 2:
                theAI.boost();
                System.out.println(theAI.getNameOfDriver() + " boosts");
                break;
            case 3:
                theAI.attack(The_Creepy_Coupe);
                System.out.println(theAI.getNameOfDriver() + " attacks");
                break;
            case 4:
                System.out.println(theAI.getNameOfDriver() + " uses their power");
                theAI.getPower();
                theAI.boost();
                break;
            default:
                System.out.println("Oh no the " + theAI.getNameOfDriver() + " stalled");
                break;
        }
    }

    public static void aiTurnSmall(SmallVechicleType theAI) {
        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 1) {
            theAI.distance += theAI.getSpeed();
            System.out.println(theAI.getNameOfDriver() + " drives ahead");
        }
        switch (int_random) {
            case 2:
                theAI.boost();
                System.out.println(theAI.getNameOfDriver() + " boosts");
                break;
            case 3:
                theAI.attack(The_Creepy_Coupe);
                System.out.println(theAI.getNameOfDriver() + " attacks");
                break;
            case 4:
                System.out.println(theAI.getNameOfDriver() + " uses their power");
                theAI.getPower();
                theAI.boost();
                break;
            default:
                System.out.println("Oh no the " + theAI.getNameOfDriver() + " stalled");
                break;
        }
    }

    public static void lapCheck(Engine thePlayer) {
        if (thePlayer.distance >= 100) {
            thePlayer.laps = thePlayer.laps + 1;
            thePlayer.distance = 0;
        }
        if (The_Boudler_moblie.distance >= 100) {
            The_Boudler_moblie.laps = The_Boudler_moblie.laps + 1;
            The_Boudler_moblie.distance = 0;
        }
        if (Penelope_Pitstop.distance >= 100) {
            Penelope_Pitstop.laps = Penelope_Pitstop.laps + 1;
            Penelope_Pitstop.distance = 0;
        }
        if (The_Turbo_Terrific.distance >= 100) {
            The_Turbo_Terrific.laps = The_Turbo_Terrific.laps + 1;
            The_Turbo_Terrific.distance = 0;
        }
        if (The_Mean_Machine.distance >= 100) {
            The_Mean_Machine.laps = The_Mean_Machine.laps + 1;
            The_Mean_Machine.distance = 0;
        }
        if (The_Bullet_Proof_Bomb.distance >= 100) {
            The_Bullet_Proof_Bomb.laps = The_Bullet_Proof_Bomb.laps + 1;
            The_Bullet_Proof_Bomb.distance = 0;
        }
        if (The_Arkansas_Chuggabug.distance >= 100) {
            The_Arkansas_Chuggabug.laps = The_Arkansas_Chuggabug.laps + 1;
            The_Arkansas_Chuggabug.distance = 0;
        }
        if (The_Creepy_Coupe.distance >= 100) {
            The_Creepy_Coupe.laps = The_Creepy_Coupe.laps + 1;
            The_Creepy_Coupe.distance = 0;
        }
        if (The_Convert_a_Car.distance >= 100) {
            The_Convert_a_Car.laps = The_Convert_a_Car.laps + 1;
            The_Convert_a_Car.distance = 0;
        }
        if (The_Army_surplus_Special.distance >= 100) {
            The_Army_surplus_Special.laps = The_Army_surplus_Special.laps + 1;
            The_Army_surplus_Special.distance = 0;
        }

    }

    public static void main(String[] args) {

        System.out.println("Welcome to the raceway todays race is one to remeber, your are in group of eleven different racers racing against each other in various road rallies, with each driver hoping to win the title of the World's Wackiest Racer. The rules are extremely lax and allow for almost any vehicle design, power system and a wide range of tactics like combat and shortcuts. Despite this loose rule structure, competitors Dick Dastardly and his dog sidekick, Muttley, are still determined to cheat in their own ineffectual way so be carefull.");
        getPlayerVechicle();
    }

}
