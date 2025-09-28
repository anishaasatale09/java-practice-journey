/*- Max and Min Finder
- Prompt: Ask the user to enter two numbers.
Use Math.max() and Math.min() to print the larger and smaller number.
*/
import java.util.Scanner;
public class problem32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter 1st Number:");
        num1 = scanner.nextInt();
        System.out.print("Enter 2nd Number:");
        num2 = scanner.nextInt();


        System.out.println(Math.max(num1,num2)+ " is maximum from both");
        System.out.println(Math.min(num1,num2)+ " is minimum from both");

    }
}
