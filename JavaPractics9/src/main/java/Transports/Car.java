package Transports;

public abstract class Car {
    private int countWheels;
    private String carName;
    private int countDoors;
    private int maxPower;

    public Car(int countWheels, String carName, int countDoors, int maxPower) {
        this.countWheels = countWheels;
        this.carName = carName;
        this.countDoors = countDoors;
        this.maxPower = maxPower;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

}
