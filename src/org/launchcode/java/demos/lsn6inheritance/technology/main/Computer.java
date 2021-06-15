package org.launchcode.java.demos.lsn6inheritance.technology.main;

public class Computer extends AbstractEntity{

    private int ram;
    private int storage;
    private boolean hasScreen;

    public Computer(int ram, int storage, boolean hasScreeen) {
        this.ram = ram;
        this.storage = storage;
        this.hasScreen = hasScreeen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isHasScreeen() {
        return hasScreen;
    }

    public void setHasScreeen(boolean hasScreeen) {
        this.hasScreen = hasScreeen;
    }

    public void increaseRam(int moreRam) {
        this.ram += moreRam;
    }

    public void increaseStorage(int moreStorage) {
        this.storage += moreStorage;
    }
}
