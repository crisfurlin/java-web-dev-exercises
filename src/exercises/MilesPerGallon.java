package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numberMiles;
        double gallonsGas;

        System.out.println("Enter the number of miles you have driven:");
        numberMiles = input.nextDouble();

        System.out.println("Enter the amount of gas you've consumed:");
        gallonsGas = input.nextDouble();
        input.close();

        System.out.println("You've made " + numberMiles/gallonsGas + " miles per gallon of gas.");
    }
}
