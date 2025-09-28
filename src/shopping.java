import java.util.Scanner;
public class shopping {

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';

        System.out.print("Enter your item name:");
        item = scanner.nextLine();
        System.out.print("Enter price:");
        price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();

        double total = price * quantity;
        System.out.println("You bought "+quantity+" " +item + "/s.");
        System.out.println("you have to pay "+currency+total);

        scanner.close();

    }
}
//KEEP SEMICOLON AFTER IMPORT. REMOVE LINE WHEN GETTING INPUT FROM USER.
//KEEP ATTENTION TO CLOSING SCANNER.