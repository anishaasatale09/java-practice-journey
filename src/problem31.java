/*- Square Root Explorer
- Prompt: Ask the user to enter a number.
Use Math.sqrt() to calculate and print its square root.
If the number is negative, print “Square root not defined for negative numbers.”
- Power Calculator
*/
import java.util.Scanner;
public class problem31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        if (num>=0){
            System.out.println(Math.sqrt(num));
        }else{
            System.out.println("Square root not defined for negative numbers.");
        }
        scanner.close();

    }
}