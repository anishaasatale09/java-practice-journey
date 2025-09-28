/*Leap year check: Input year. If divisible by 400 → leap;
else if divisible by 100 → not leap;
else if divisible by 4 → leap; else not.*/

import java.util.Scanner;

public class problem42 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Enter year:");
        year = scanner.nextInt();

        if(year%400==0){
            System.out.printf("%d is a leap year",year);
        } else if (year%100==0) {
            System.out.printf("%d is a leap year",year);
        } else if (year%4==0) {
            System.out.printf("%d is a leap year",year);

        }else{
            System.out.printf("%d is not a leap year",year);
        }
        scanner.close();

    }
}
