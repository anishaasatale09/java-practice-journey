/*Shopping discount tiers:
Input cart total and membership (none/silver/gold).
Apply: total ≥200 → 20%, ≥100 → 10%, else 0%.
Members get extra 5% if gold, 2% if silver.*/
import java.util.Scanner;
public class problem44 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double cartTotal;
        String membership;


        System.out.println("Enter Total cart Amount:");
        cartTotal = scanner.nextDouble();

        System.out.println("Enter your Membership:");
        membership = scanner.nextLine();

        if(cartTotal>=200) {
            if (membership.equals("gold")) {
                System.out.println("You got 20% discount");
                System.out.println("You'll get additional 5% discount.");
                cartTotal *= 0.25;
            } else if (membership.equals("silver")) {
                System.out.println("You got 20% discount");
                System.out.println("You'll get additional 2% discount.");
                cartTotal *= 22;
            } else {
                System.out.println("You got 20% discount");
                cartTotal *= 0.20;
            }
        }
        else if(cartTotal>=100) {
            if (membership.equals("gold")) {
                System.out.println("You got 10% discount");
                System.out.println("You'll get additional 5% discount.");
                cartTotal *= 0.15;
            } else if (membership.equals("silver")) {
                System.out.println("You got 10% discount");
                System.out.println("You'll get additional 2% discount.");
                cartTotal *= 12;
            } else {
                System.out.println("You got 10% discount");
                cartTotal *= 0.10;
            }
        }
        else{
            cartTotal*=1;

            }
        scanner.close();
        }
    }

