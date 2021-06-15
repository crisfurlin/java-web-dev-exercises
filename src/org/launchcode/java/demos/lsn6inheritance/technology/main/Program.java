package org.launchcode.java.demos.lsn6inheritance.technology.main;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop(8, 800, true, 100);
        Smartphone mySmartphone = new Smartphone(4, 128, true, 0);

        System.out.println(myLaptop.getId());
        System.out.println(mySmartphone.getId());

        mySmartphone.takeSelfie();
        System.out.println(myLaptop.needsToPlugIn());
        System.out.println(mySmartphone.getNumberOfSelfies());

        mySmartphone.takeSelfie();
        System.out.println(mySmartphone.getNumberOfSelfies());
    }
}
