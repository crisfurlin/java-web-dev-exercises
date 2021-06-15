package org.launchcode.java.demos.lsn6inheritance.cat.main;

public class Garfield {
    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());
    }
}
