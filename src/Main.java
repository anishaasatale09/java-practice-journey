import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isStudent = true;
        boolean isSenior =true;
        double price = 99.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get 20% discount.");
                System.out.println("You get 10% discount.");
                price *= 0.7;

            } else {
                System.out.println("You get 10% discount.");
                price *= 0.9;
            }
        }
        else {
            if (isSenior) {
                System.out.println("You get 20% discount.");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }
        System.out.printf("You have to pay $%.2f", price);

        }
    }
