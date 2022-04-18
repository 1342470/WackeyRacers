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
    public static Scanner again = new Scanner(System.in);
    public static Scanner newVechicle = new Scanner(System.in);
    public static String correct = null;
    public static String theBoost;
    public static String theWeapon;
    public static boolean winCon = false;

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
        checklLargeState(The_Boudler_moblie);
        sleepFunction();
        checkMidState(Penelope_Pitstop);
        sleepFunction();
        checkSmallState(The_Turbo_Terrific);
        sleepFunction();
        checklLargeState(The_Mean_Machine);
        sleepFunction();
        checkMidState(The_Bullet_Proof_Bomb);
        sleepFunction();
        checkSmallState(The_Arkansas_Chuggabug);
        sleepFunction();
        checklLargeState(The_Convert_a_Car);
        sleepFunction();
        checkMidState(The_Creepy_Coupe);
        sleepFunction();
        checklLargeState(The_Army_surplus_Special);
        sleepFunction();
        checklLargeState(The_Buzz_Wagon);
        System.out.println("The_Buzz_Wagon has currently traveled" + The_Buzz_Wagon.distance + " and is on lap " + The_Buzz_Wagon.laps);
        sleepFunction();
        System.out.println("You have currently traveled" + thePlayer.distance + " and are on lap " + thePlayer.laps);
        sleepFunction();
    }

    public static void checkSmallState(SmallVechicleType theAI) {
        if (theAI.currentState == theAI.destoryedState) {
        } else {
            System.out.println(theAI.getNameOfDriver() + " has currently traveled" + theAI.distance + " and is on lap " + theAI.laps);
        }
    }

    public static void checkMidState(MidVechicleType theAI) {
        if (theAI.currentState == theAI.destoryedState) {
        } else {
            System.out.println(theAI.getNameOfDriver() + " has currently traveled" + theAI.distance + " and is on lap " + theAI.laps);
        }
    }

    public static void checklLargeState(LargeVechicleType theAI) {
        if (theAI.currentState == theAI.destoryedState) {
        } else {
            System.out.println(theAI.getNameOfDriver() + " has currently traveled" + theAI.distance + " and is on lap " + theAI.laps);
        }
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
        while (thePlayer.laps != 3 || The_Boudler_moblie.laps != 3 || Penelope_Pitstop.laps != 3 || The_Turbo_Terrific.laps != 3 || The_Mean_Machine.laps != 3 || The_Bullet_Proof_Bomb.laps != 3 || The_Arkansas_Chuggabug.laps != 3 || The_Convert_a_Car.laps != 3 || The_Creepy_Coupe.laps != 3 || The_Army_surplus_Special.laps != 3 || The_Buzz_Wagon.laps != 3 || winCon == false) {
            printContests(thePlayer);
            drive(thePlayer);
            lapCheck(thePlayer);
            finalLapCheck(thePlayer);

        }
    }

    public static void getWeaponType(Engine thePlayer) {
        while (!"yes".equals(correct)) {
            System.out.println("Which type of Weapon would you like. will you choose? Please note the bigger the boost the more you will weigh and you will be slower the more weight you have.you can even choose to not have one by typing 'non' or 'no' if you want to limit your weight");
            String vechicle = theName.nextLine();

            if ("large".equals(vechicle) || "Large".equals(vechicle)) {
                System.out.println("so you would like the Large Weapon, It has high damage but at the cost of only having one shot make it count: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.vechicleWeapon = new LargeWeapon();
                    //testRaceWay(thePlayer);
                    startRace(thePlayer);
                    correct = "yes";
                } else {
                    correct = "no";
                }
            } else if ("mid".equals(vechicle) || "Mid".equals(vechicle)) {
                System.out.println("so you would like the mid Weapon,Balanced stats across the board: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.vechicleWeapon = new MidWeapon();
                    startRace(thePlayer);
                    correct = "yes";
                } else {
                    correct = "no";
                }
            } else if ("small".equals(vechicle) || "Small".equals(vechicle)) {
                System.out.println("so you would like the small Weapon, it has low fire power but a high ammo count: Type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.vechicleWeapon = new SmallWeapon();
                    startRace(thePlayer);
                    correct = "yes";
                } else {
                    correct = "no";
                }
            } else if ("non".equals(vechicle) || "no".equals(vechicle)) {
                System.out.println("so you would like the no weapon, you may not be able to shoot however as the lack of attack is met with a lower weight leading to a overall higher speed: type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.vechicleWeapon = new NoWeapon();
                    System.out.println("Great now lets choose your Weapon type");
                    startRace(thePlayer);
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

    public static void getBoosterType(Engine thePlayer) {
        while (!"yes".equals(correct)) {
            System.out.println("Which type of boost would you like. Please note the bigger the boost the more you will weigh and you will be slower the more weight you have. you can even choose to not have one by typing 'non' or 'no' if you want to limit your weight");
            String vechicle = theName.nextLine();

            if ("large".equals(vechicle) || "Large".equals(vechicle)) {
                System.out.println("so you would like the Large booster, low boosters but high distance in one go: type yes or no?");
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
                System.out.println("so you would like the mid booster, balanced amount of boost and uses: type yes or no?");
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
                System.out.println("so you would like the small booster,low distance but high amounts of uses: type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.boostType = new BoostSmall();
                    System.out.println("Great now lets choose your Weapon type");
                    getWeaponType(thePlayer);
                    correct = "yes";
                } else {
                    correct = "no";
                }
            } else if ("non".equals(vechicle) || "no".equals(vechicle)) {
                System.out.println("so you would like the no booster, you may not be able to boost however as the lack of booster and fuel onboard means lower weight leading to a overall higher speed: type yes or no?");
                Scanner theResponse = new Scanner(System.in);
                String theReply = theResponse.nextLine();
                if ("yes".equals(theReply) || "Yes".equals(theReply)) {
                    thePlayer.boostType = new NoBoost();
                    System.out.println("Great now lets choose your Weapon type");
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
                    Random rand2 = new Random();
                    int powerChance = rand2.nextInt(upperbound);
                    switch (powerChance) {
                        case 1:
                            thePlayer.currentState = thePlayer.poweredState;
                            break;
                        case 3:
                            System.out.println("oh looks like the player just missed a chance to power up");
                            break;
                        default:
                            System.out.println(" missing a chance for a power up");
                            break;
                    }
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
            aiTurnLarge(The_Boudler_moblie, thePlayer);
            sleepFunction();
            aiTurnMid(Penelope_Pitstop, thePlayer);
            sleepFunction();
            aiTurnLarge(The_Mean_Machine, thePlayer);
            sleepFunction();
            aiTurnMid(The_Bullet_Proof_Bomb, thePlayer);
            sleepFunction();
            aiTurnSmall(The_Turbo_Terrific, thePlayer);
            sleepFunction();
            aiTurnSmall(The_Arkansas_Chuggabug, thePlayer);
            sleepFunction();
            aiTurnLarge(The_Convert_a_Car, thePlayer);
            sleepFunction();
            aiTurnMid(The_Creepy_Coupe, thePlayer);
            sleepFunction();
            aiTurnLarge(The_Army_surplus_Special, thePlayer);
            sleepFunction();
            aiTurnLarge(The_Buzz_Wagon, thePlayer);
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

    public static void aiTurnLarge(LargeVechicleType theAI, Engine thePlayer) {
        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 1) {
            theAI.distance += theAI.getSpeed();
            System.out.println(theAI.getNameOfDriver() + " drives ahead");
            Random rand2 = new Random();
            int powerChance = rand2.nextInt(upperbound);
            switch (powerChance) {
                case 1:
                    System.out.println(theAI.getNameOfDriver() + " manged to get a powerup their car has transformed to match its powered state");
                    theAI.currentState = theAI.poweredState;
                    break;
                case 3:
                    System.out.println("oh looks like " + theAI.getNameOfDriver() + " just missed a chance to power up");
                    break;
                case 4:
                    System.out.println(theAI.getNameOfDriver() + " manged to get a powerup their car has transformed to match its powered state");
                    theAI.currentState = theAI.poweredState;
                    break;
                case 6:
                    System.out.println(theAI.getNameOfDriver() + " manged to get a pick up some extra ammo");
                    theAI.vechicleWeapon.setAmmo(1);
                    break;
                default:
                    System.out.println(" missing a chance for a power up");
                    break;
            }

        }
        switch (int_random) {
            case 2:
                System.out.println(theAI.getNameOfDriver() + " trys to use their boost ");
                theAI.boost();
                break;
            case 3:
                targetRandomLarge(theAI, thePlayer);
                break;
            case 4:
                System.out.println(theAI.getNameOfDriver() + " uses their power");
                System.out.println(theAI.getPower());
                theAI.boost();
                break;
            default:
                System.out.println("Oh no the " + theAI.getNameOfDriver() + " stalled");
                break;
        }
    }

    public static void aiTurnMid(MidVechicleType theAI, Engine thePlayer) {
        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 1) {
            theAI.distance += theAI.getSpeed();
            System.out.println(theAI.getNameOfDriver() + " drives ahead");
            Random rand2 = new Random();
            int powerChance = rand2.nextInt(upperbound);
            switch (powerChance) {
                case 1:
                    System.out.println(theAI.getNameOfDriver() + " manged to get a powerup their car has transformed to match its powered state");
                    theAI.currentState = theAI.poweredState;
                    break;
                case 3:
                    System.out.println("oh looks like " + theAI.getNameOfDriver() + " just missed a chance to power up");
                    break;
                case 4:
                    System.out.println(theAI.getNameOfDriver() + " manged to get a powerup their car has transformed to match its powered state");
                    theAI.currentState = theAI.poweredState;
                    break;
                case 6:
                    System.out.println(theAI.getNameOfDriver() + " manged to get a pick up some extra ammo");
                    theAI.vechicleWeapon.setAmmo(1);
                    break;
                default:
                    System.out.println(" missing a chance for a power up");
                    break;
            }
        }
        switch (int_random) {
            case 2:
                System.out.println(theAI.getNameOfDriver() + " trys to use their boost ");
                theAI.boost();
                break;
            case 3:
                targetRandomMid(theAI, thePlayer);
                break;
            case 4:
                System.out.println(theAI.getNameOfDriver() + " uses their power");
                System.out.println(theAI.getPower());
                theAI.boost();
                break;
            default:
                System.out.println("Oh no the " + theAI.getNameOfDriver() + " stalled");
                break;
        }
    }

    public static void aiTurnSmall(SmallVechicleType theAI, Engine thePlayer) {
        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 1) {
            theAI.distance += theAI.getSpeed();
            System.out.println(theAI.getNameOfDriver() + " drives ahead");
            Random rand2 = new Random();
            int powerChance = rand2.nextInt(upperbound);
            switch (powerChance) {
                case 1:
                    System.out.println(theAI.getNameOfDriver() + " manged to get a powerup their car has transformed to match its powered state");
                    theAI.currentState = theAI.poweredState;
                    break;
                case 3:
                    System.out.println("oh looks like " + theAI.getNameOfDriver() + " just missed a chance to power up");
                    break;
                case 4:
                    System.out.println(theAI.getNameOfDriver() + " manged to get a powerup their car has transformed to match its powered state");
                    theAI.currentState = theAI.poweredState;
                    break;
                case 6:
                    System.out.println(theAI.getNameOfDriver() + " manged to get a pick up some extra ammo");
                    theAI.vechicleWeapon.setAmmo(1);
                    break;
                default:
                    System.out.println(" missing a chance for a power up");
                    break;
            }
        }
        switch (int_random) {
            case 2:
                System.out.println(theAI.getNameOfDriver() + " trys to use their boost ");
                theAI.boost();
                break;
            case 3:
                targetRandomSmall(theAI, thePlayer);
                break;
            case 4:
                System.out.println(theAI.getNameOfDriver() + " uses their power");
                System.out.println(theAI.getPower());
                theAI.boost();
                break;
            default:
                System.out.println("Oh no the " + theAI.getNameOfDriver() + " stalled");
                break;
        }
    }

    public static void targetRandomSmall(SmallVechicleType theAttacker, Engine thePlayer) {
        Random rand = new Random();
        int upperbound = 12;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 1) {
            theAttacker.attack(The_Boudler_moblie);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Boudler_moblie they now have " + The_Boudler_moblie.health + " health remaining");
        } else if (int_random == 1) {
            theAttacker.attack(The_Boudler_moblie);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Boudler_moblie they now have " + The_Boudler_moblie.health + " health remaining");
        } else if (int_random == 2) {
            theAttacker.attack(Penelope_Pitstop);
            System.out.println(theAttacker.getNameOfDriver() + " shoots Penelope_Pitstope they now have " + Penelope_Pitstop.health + " health remaining");
        } else if (int_random == 3) {
            theAttacker.attack(The_Turbo_Terrific);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Turbo_Terrific they now have " + The_Turbo_Terrific.health + " health remaining");
        } else if (int_random == 4) {
            theAttacker.attack(The_Mean_Machine);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Mean_Machine they now have " + The_Mean_Machine.health + " health remaining");
        } else if (int_random == 5) {
            theAttacker.attack(The_Bullet_Proof_Bomb);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Bullet_Proof_Bomb they now have " + The_Bullet_Proof_Bomb.health + "health remaining");
        } else if (int_random == 6) {
            theAttacker.attack(The_Arkansas_Chuggabug);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Arkansas_Chuggabug they now have " + The_Arkansas_Chuggabug.health + " health remaining");
        } else if (int_random == 7) {
            theAttacker.attack(The_Creepy_Coupe);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Creepy_Coupe they now have " + The_Creepy_Coupe.health + " health remaining");
        } else if (int_random == 8) {
            theAttacker.attack(The_Convert_a_Car);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Convert_a_Car they now have " + The_Convert_a_Car.health + " health remaining");
        } else if (int_random == 9) {
            theAttacker.attack(The_Army_surplus_Special);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Army_surplus_Special they now have " + The_Army_surplus_Special.health + " health remaining");
        } else if (int_random == 10) {
            theAttacker.attack(The_Buzz_Wagon);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Buzz_Wagon they now have " + The_Buzz_Wagon.health + " remaining");
        } else if (int_random == 11) {
            theAttacker.attack(thePlayer);
            System.out.println(theAttacker.getNameOfDriver() + " shoots you your health is now " + thePlayer.health);
        } else {
            System.out.println(theAttacker.getNameOfDriver() + " trys to shoot at another racer but fails");
        }
    }

    public static void targetRandomMid(MidVechicleType theAttacker, Engine thePlayer) {
        Random rand = new Random();
        int upperbound = 14;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 1) {
            theAttacker.attack(The_Boudler_moblie);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Boudler_moblie they now have " + The_Boudler_moblie.health + " health remaining");
        } else if (int_random == 1) {
            theAttacker.attack(The_Boudler_moblie);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Boudler_moblie they now have " + The_Boudler_moblie.health + " health remaining");
        } else if (int_random == 2) {
            theAttacker.attack(Penelope_Pitstop);
            System.out.println(theAttacker.getNameOfDriver() + " shoots Penelope_Pitstope they now have " + Penelope_Pitstop.health + " health remaining");
        } else if (int_random == 3) {
            theAttacker.attack(The_Turbo_Terrific);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Turbo_Terrific they now have " + The_Turbo_Terrific.health + " health remaining");
        } else if (int_random == 4) {
            theAttacker.attack(The_Mean_Machine);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Mean_Machine they now have " + The_Mean_Machine.health + " health remaining");
        } else if (int_random == 5) {
            theAttacker.attack(The_Bullet_Proof_Bomb);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Bullet_Proof_Bomb they now have " + The_Bullet_Proof_Bomb.health + "health remaining");
        } else if (int_random == 6) {
            theAttacker.attack(The_Arkansas_Chuggabug);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Arkansas_Chuggabug they now have " + The_Arkansas_Chuggabug.health + " health remaining");
        } else if (int_random == 7) {
            theAttacker.attack(The_Creepy_Coupe);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Creepy_Coupe they now have " + The_Creepy_Coupe.health + " health remaining");
        } else if (int_random == 8) {
            theAttacker.attack(The_Convert_a_Car);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Convert_a_Car they now have " + The_Convert_a_Car.health + " health remaining");
        } else if (int_random == 9) {
            theAttacker.attack(The_Army_surplus_Special);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Army_surplus_Special they now have " + The_Army_surplus_Special.health + " health remaining");
        } else if (int_random == 10) {
            theAttacker.attack(The_Buzz_Wagon);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Buzz_Wagon they now have " + The_Buzz_Wagon.health + " remaining");
        } else if (int_random == 11) {
            theAttacker.attack(thePlayer);
            System.out.println(theAttacker.getNameOfDriver() + " shoots you your health is now " + thePlayer.health);
        } else {
            System.out.println(theAttacker.getNameOfDriver() + " trys to shoot at another racer but fails");
        }
    }

    public static void targetRandomLarge(LargeVechicleType theAttacker, Engine thePlayer) {
        Random rand = new Random();
        int upperbound = 16;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 1) {
            theAttacker.attack(The_Boudler_moblie);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Boudler_moblie they now have " + The_Boudler_moblie.health + " health remaining");
        } else if (int_random == 1) {
            theAttacker.attack(The_Boudler_moblie);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Boudler_moblie they now have " + The_Boudler_moblie.health + " health remaining");
        } else if (int_random == 2) {
            theAttacker.attack(Penelope_Pitstop);
            System.out.println(theAttacker.getNameOfDriver() + " shoots Penelope_Pitstope they now have " + Penelope_Pitstop.health + " health remaining");
        } else if (int_random == 3) {
            theAttacker.attack(The_Turbo_Terrific);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Turbo_Terrific they now have " + The_Turbo_Terrific.health + " health remaining");
        } else if (int_random == 4) {
            theAttacker.attack(The_Mean_Machine);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Mean_Machine they now have " + The_Mean_Machine.health + " health remaining");
        } else if (int_random == 5) {
            theAttacker.attack(The_Bullet_Proof_Bomb);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Bullet_Proof_Bomb they now have " + The_Bullet_Proof_Bomb.health + "health remaining");
        } else if (int_random == 6) {
            theAttacker.attack(The_Arkansas_Chuggabug);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Arkansas_Chuggabug they now have " + The_Arkansas_Chuggabug.health + " health remaining");
        } else if (int_random == 7) {
            theAttacker.attack(The_Creepy_Coupe);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Creepy_Coupe they now have " + The_Creepy_Coupe.health + " health remaining");
        } else if (int_random == 8) {
            theAttacker.attack(The_Convert_a_Car);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Convert_a_Car they now have " + The_Convert_a_Car.health + " health remaining");
        } else if (int_random == 9) {
            theAttacker.attack(The_Army_surplus_Special);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Army_surplus_Special they now have " + The_Army_surplus_Special.health + " health remaining");
        } else if (int_random == 10) {
            theAttacker.attack(The_Buzz_Wagon);
            System.out.println(theAttacker.getNameOfDriver() + " shoots The_Buzz_Wagon they now have " + The_Buzz_Wagon.health + " remaining");
        } else if (int_random == 11) {
            theAttacker.attack(thePlayer);
            System.out.println(theAttacker.getNameOfDriver() + " shoots you your health is now " + thePlayer.health);
        } else {
            System.out.println(theAttacker.getNameOfDriver() + " trys to shoot at another racer but fails");
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
        if (The_Buzz_Wagon.distance >= 100) {
            The_Buzz_Wagon.laps = The_Buzz_Wagon.laps + 1;
            The_Buzz_Wagon.distance = 0;
        }

    }

    public static void finalLapCheck(Engine thePlayer) {
        if (thePlayer.laps >= 3) {
            playerWin(thePlayer);
        }
        if (The_Boudler_moblie.laps >= 3) {
            largeAIWin(The_Boudler_moblie, thePlayer);
        }
        if (Penelope_Pitstop.laps >= 3) {
            midAIWin(Penelope_Pitstop, thePlayer);
        }
        if (The_Turbo_Terrific.laps >= 3) {
            smallAIWin(The_Turbo_Terrific, thePlayer);
        }
        if (The_Mean_Machine.laps >= 3) {
            largeAIWin(The_Mean_Machine, thePlayer);
        }
        if (The_Bullet_Proof_Bomb.laps >= 3) {
            midAIWin(The_Bullet_Proof_Bomb, thePlayer);
        }
        if (The_Arkansas_Chuggabug.laps >= 3) {
            smallAIWin(The_Arkansas_Chuggabug, thePlayer);
        }
        if (The_Creepy_Coupe.laps >= 3) {
            midAIWin(The_Creepy_Coupe, thePlayer);
        }
        if (The_Convert_a_Car.laps >= 3) {
            largeAIWin(The_Convert_a_Car, thePlayer);
        }
        if (The_Army_surplus_Special.laps >= 3) {
            largeAIWin(The_Army_surplus_Special, thePlayer);
        }
        if (The_Buzz_Wagon.laps >= 3) {
            largeAIWin(The_Buzz_Wagon, thePlayer);
        }
    }

    public static void playerWin(Engine thePlayer) {
        System.out.println("Dispite being a new racer you still mange to beat everyone else. The player had a car with a speed of " + thePlayer.getSpeed());
        sleepFunction();
        System.out.println("Would you like to race again?");
        correct = "no";
        while (!"yes".equals(correct)) {
            String tryaAgain = again.nextLine();
            if ("yes".equals(tryaAgain) || "Yes".equals(tryaAgain)) {
                System.out.println("Ok would you like to use your old car or would you like to create a new one? Please enter either yes or no:");
                String newEngine = newVechicle.nextLine();
                if ("yes".equals(newEngine) || "Yes".equals(newEngine)) {
                    System.out.println("Okay lets build your new vehcicle");
                    getPlayerVechicle();
                    resetGame(thePlayer);
                    correct = "yes";
                } else if ("no".equals(newEngine) || "No".equals(newEngine)) {
                    System.out.println("Okay lets get back into racing ");
                    resetGame(thePlayer);
                    startRace(thePlayer);
                    correct = "yes";
                } else {
                    correct = "no";
                }

            }
            if ("no".equals(tryaAgain) || "No".equals(tryaAgain)) {
                correct = "yes";
                gameOver();
            } else {
                System.out.println("Im not sure what that means");
                correct = "no";
            }
        }

    }

    public static void largeAIWin(LargeVechicleType theAI, Engine thePlayer) {
        System.out.println("todays winner is " + theAI.getNameOfDriver() + " dispite being a large vechicle their vechicle had a speed " + theAI.getSpeed() + " I guess though it weighed " + theAI.getWeight() + " that didn't hold them back. Congrats " + theAI.getNameOfDriver());
        sleepFunction();
        lose(thePlayer);
        winCon = true;
    }

    public static void midAIWin(MidVechicleType theAI, Engine thePlayer) {
        System.out.println("todays winner is " + theAI.getNameOfDriver() + " I guess having states balanced all around payed off today they had a speed of " + theAI.getSpeed() + " and weight " + theAI.getWeight() + " which had a impact on todays results. Congrats " + theAI.getNameOfDriver());
        sleepFunction();
        lose(thePlayer);
        winCon = true;
    }

    public static void smallAIWin(SmallVechicleType theAI, Engine thePlayer) {
        System.out.println("todays winner is " + theAI.getNameOfDriver() + " dispite being a large vechicle their vechicle had a speed " + theAI.getSpeed() + " I guess though it weighed " + theAI.getWeight() + " that didn't hold them back. Congrats " + theAI.getNameOfDriver());
        sleepFunction();
        lose(thePlayer);
        winCon = true;
    }

    public static void gameOver() {
        System.out.println("okay thanks for racing and we hope to see you agian");
        winCon = true;
    }

    public static void resetGame(Engine thePlayer) {
        thePlayer.laps = 0;
        thePlayer.distance = 0;
        The_Boudler_moblie.laps = 0;
        The_Boudler_moblie.distance = 0;
        Penelope_Pitstop.laps = 0;
        Penelope_Pitstop.distance = 0;
        The_Turbo_Terrific.laps = 0;
        The_Turbo_Terrific.distance = 0;
        The_Mean_Machine.laps = 0;
        The_Mean_Machine.distance = 0;
        The_Bullet_Proof_Bomb.laps = 0;
        The_Bullet_Proof_Bomb.distance = 0;
        The_Arkansas_Chuggabug.laps = 0;
        The_Arkansas_Chuggabug.distance = 0;
        The_Creepy_Coupe.laps = 0;
        The_Creepy_Coupe.distance = 0;
        The_Convert_a_Car.laps = 0;
        The_Convert_a_Car.distance = 0;
        The_Army_surplus_Special.laps = 0;
        The_Army_surplus_Special.distance = 0;
        The_Buzz_Wagon.laps = 0;
        The_Buzz_Wagon.distance = 0;
        thePlayer.health = 100;
        The_Boudler_moblie.health = 100;
        Penelope_Pitstop.health = 100;
        The_Turbo_Terrific.health = 100;
        The_Mean_Machine.health = 100;
        The_Bullet_Proof_Bomb.health = 100;
        The_Arkansas_Chuggabug.health = 100;
        The_Creepy_Coupe.health = 100;
        The_Convert_a_Car.health = 100;
        The_Army_surplus_Special.health = 100;
        The_Buzz_Wagon.health = 100;
        winCon = false;
    }

    public static void lose(Engine thePlayer) {
        System.out.println("Unfornaly you lost todays race would you like to try again?");
        correct = "no";
        while (!"yes".equals(correct)) {
            String tryaAgain = again.nextLine();
            if ("yes".equals(tryaAgain) || "Yes".equals(tryaAgain)) {
                System.out.println("Ok would you like to use your old car or would you like to create a new one? Please enter either yes or no:");
                String newEngine = newVechicle.nextLine();
                if ("yes".equals(newEngine) || "Yes".equals(newEngine)) {
                    System.out.println("Okay lets build your new vehcicle");
                    getPlayerVechicle();
                    correct = "yes";
                } else if ("no".equals(newEngine) || "No".equals(newEngine)) {
                    System.out.println("Okay lets get back into racing ");
                    startRace(thePlayer);
                    correct = "yes";
                } else {
                    correct = "no";
                }

            }
            if ("no".equals(tryaAgain) || "No".equals(tryaAgain)) {
                System.out.println("okay thanks for racing and we hope to see you agian");
                correct = "yes";
            } else {
                System.out.println("Im not sure what that means");
                correct = "no";
            }
        }
    }

    public static void testRaceWay(Engine ThePlayer) {

        ThePlayer.attack(The_Turbo_Terrific);
        checkSmallState(The_Turbo_Terrific);
        ThePlayer.vechicleWeapon.setAmmo(1);
        ThePlayer.attack(The_Turbo_Terrific);
        checkSmallState(The_Turbo_Terrific);

        ThePlayer.attack(The_Turbo_Terrific);
        checkSmallState(The_Turbo_Terrific);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the raceway todays race is one to remeber, your are in group of eleven different racers racing against each other in various road rallies, with each driver hoping to win the title of the World's Wackiest Racer. The rules are extremely lax and allow for almost any vehicle design, power system and a wide range of tactics like combat and shortcuts. Despite this loose rule structure, competitors Dick Dastardly and his dog sidekick, Muttley, are still determined to cheat in their own ineffectual way so be carefull.");
        getPlayerVechicle();
    }

}
