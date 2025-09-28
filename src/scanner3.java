import java.util.Scanner;

public class scanner3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("you are working (true/false): ");
        boolean isWorking = scanner.nextBoolean();

        System.out.println("Hello "+ name +" you are "+age+" years old");
        System.out.println("Your salary is "+ salary+ " then you are working"+ isWorking);

        if(isWorking){
            System.out.println("Congratulations!!");

        }else{
            System.out.println("You are not a Working professional.");
        }
        scanner.close();



    }
}
