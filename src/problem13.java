/*- Problem Statement:
Ask the user to enter a number between 1 and 5.
If the number is 3, print “Access granted.”
Otherwise, print “Access denied.”

*/
import java.util.Scanner;
public class problem13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("Enter a number between 1 and 5:");
        num = scanner.nextInt();

        if(num<1){
            System.out.println("Enter number between 1 and 5");
        } else if (num>5) {
            System.out.println("Enter number between 1 and 5");
        } else if (num==3) {
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
        scanner.close();
    }
}
