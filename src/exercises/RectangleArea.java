package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rectangleLength;
        double rectangleWidth;

        System.out.println("Enter rectangle length:");
        rectangleLength = input.nextDouble();

        System.out.println("Enter rectangle width:");
        rectangleWidth = input.nextDouble();
        input.close();

        System.out.println("Rectangle area is " + rectangleLength * rectangleWidth);
    }
}
