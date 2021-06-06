/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package base;

import java.util.Scanner;

/*
Example Output

What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters

The formula for this conversion is m2 = f2 × 0.09290304

Constraints

Keep the calculations separate from the output.
Use a constant to hold the conversion factor.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Create a new version of the program that allows you to choose feet or meters for your inputs.
Implement this program as a GUI program that automatically updates the values when any value changes.
 */
public class App {
    static Scanner in = new Scanner(System.in);
    public static final double CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {
        int length = getLength();
        int width = getWidth();
        getDimensions(length, width);
    }

    private static int getDimensions(int length, int width) {
        int area = length * width;
        double areaXconst = areaConversion(area);
        System.out.println(String.format("You entered dimensions of %d feet by %d feet.", length, width));
        System.out.println(String.format("The area is\n%d square feet\n%,.3f square meters", area, areaXconst));
        return 0;
    }

    private static double areaConversion(int area) {

        return CONVERSION_FACTOR * area;
    }

    private static int getWidth() {
        System.out.print("What is the width of the room in feet? ");
        return in.nextInt();
    }

    private static int getLength() {
        System.out.print("What is the length of the room in feet? ");
        return in.nextInt();
    }

}
