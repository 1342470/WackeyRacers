package com.mycompany.wackyracers;

public class LargeVechicleType extends Engine {

    private int weight = 20;
    private int speed = 5;
    private String nameOfDriver;
    private String power;

    public LargeVechicleType(String theName) {
        boostType = new BoostLarge();
        vechicleWeapon = new LargeWeapon();
        nameOfDriver = theName;

    }

    /**
     * gets the name of driver
     *
     * @return name of driver
     */
    public String getNameOfDriver() {
        return nameOfDriver;
    }

    /**
     * sets name of driver
     *
     * @param nameOfDriver new name of driver
     */
    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    /**
     * prints stats and type of vecicle
     */
    @Override
    public void display() {
        System.out.println("Your vehicle type is large and has a base speed of " + getSpeed() + " and weight of " + getWeight());
    }

    /**
     * gets the weight of all parts
     *
     * @return value of combined weight
     */
    @Override
    public int getWeight() {
        return weight + BoostLarge.weight + LargeWeapon.weight;
    }

    /**
     * allows new weight to be set
     *
     * @param weight value of new weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * gets the speed from the vechicles current state
     *
     * @return value of speed
     */
    @Override
    public int getSpeed() {
        return currentState.getSpeed();
    }

    /**
     * gets the speed from the instance varible set on object creation
     *
     * @return
     */
    public int getStateSpeed() {
        return speed;
    }

    /**
     * allow speed to be set
     *
     * @param speed new value of speed
     */
    @Override
    void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * allows objects to attack another
     *
     * @param theTarget target of attack
     */
    @Override
    void attack(Engine theTarget) {
        currentState.attack(theTarget);
        //vechicleWeapon.attack(theTarget);
    }

    /**
     * prints the drivers power
     * @return value of current power
     */
    @Override
    public String getPower() {
        return power;
    }

    /**
     * allows power to be reset
     * @param power value of power
     */
    @Override
    public void setPower(String power) {
        this.power = power;
    }

}
