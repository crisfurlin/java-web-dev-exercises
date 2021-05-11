package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double userRadius;

        System.out.println("Enter a radius:");
        userRadius = input.nextDouble();
        System.out.println("The area of radius " + userRadius + " is: " + new Circle(userRadius).getArea());
    }
}
