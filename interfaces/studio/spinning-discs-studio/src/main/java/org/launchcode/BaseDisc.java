package org.launchcode;

public abstract class BaseDisc {

    private static int nextId = 1;
    private final int id;
    private String name;
    public String discType;
    private int spinRate;

    public BaseDisc(int id, String name, String discType, int spinRate) {
        this.id = id;
        this.name = name;
        this.discType = discType;
        this.spinRate = spinRate;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }

    @Override
    public String toString() {
        return name + "\nID: " + id + "\nDisk Type: " + discType + "\nSpin Rate: " + spinRate + "\nRPM: \n";
    }

    void spinDisc() {
        System.out.println("\n" + "The " + discType + name + " spins at a rate of " + spinRate + "RPM");
    }
}
