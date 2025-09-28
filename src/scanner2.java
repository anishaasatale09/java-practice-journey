import java.util.Scanner;
public class scanner2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your occupation: ");
        String occ = scanner.nextLine();

        System.out.println("Hello Mr."+ occ);
        scanner.close();
    }
}
