package org.launchcode.java.demos.lsn6inheritance.technology.main;

public class Smartphone extends Computer {

    private int numberOfSelfies;

    public Smartphone (int ram, int storage, boolean hasScreen, int numberOfSelfies) {
        super(ram, storage, hasScreen);
        this.numberOfSelfies = numberOfSelfies;
    }

    public void takeSelfie() {
        this.numberOfSelfies += 1;
    }

    public int getNumberOfSelfies() {
        return this.numberOfSelfies;
    }
}
