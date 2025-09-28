/*Triangle type: Input three sides. If valid triangle,
 print equilateral/isosceles/scalene.
 If not valid, print “invalid”.*/

import java.util.Scanner;

public class problem43 {
    public static void main(String[] args){
        Scanner scanner = new Scanner((System.in));
        double side1;
        double side2;
        double side3;

        System.out.println("Enter lenght of side1:");
        side1 = scanner.nextDouble();

        System.out.println("Enter lenght of side2:");
        side2 = scanner.nextDouble();

        System.out.println("Enter lenght of side3:");
        side3 = scanner.nextDouble();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("triangle is validate");
            if(side1==side2 && side2==side3) {
                System.out.println("triangle is equilateral");
            }
            else if (side1==side2 || side2==side3||side1==side3) {
                System.out.println("triangle is isosceles");

            }else{
                System.out.println("Triangle is scalene");
            }
        }
        else{
            System.out.println("Triangle is not valid");
        }
    }
}
