/*- Odd or Even Checker
- Prompt: Ask the user to enter a number.
Print whether the number is odd or even.
        - Bonus: Handle negative numbers gracefully.

import java.util.Scanner;
public class problem11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double number;
        System.out.print("Enter a number: ");
        number = scanner.nextDouble();
        if(number<0){
            System.out.println("Number is negative");
        }
        else if(number==0)  {
            System.out.println("Given number is zero");
        }
        else if(number%2==0)
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Your number is odd!!");
        }
        scanner.close();
    }
}
*/