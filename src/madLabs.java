import java.util.Scanner;
public class madLabs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter adjective1 (discription): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter noun(person/animal): ");
        noun = scanner.nextLine();
        System.out.print("Enter adjective2 (discription): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter verb -ing: ");
        verb = scanner.nextLine();
        System.out.print("Enter adjective3 (discription): ");
        adjective3 = scanner.nextLine();


        System.out.println("I went to a " + adjective1+" zoo i saw "+noun+" there.");
        System.out.println(noun +" was "+adjective2+".");
        System.out.println("I was "+verb+"!");
        System.out.println("He was "+adjective3+".");

    }
}
