import java.util.Scanner;

public class WeightconversionProgram {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;


        System.out.println("1: To converts kgs in lbs");
        System.out.println("2: To convert lbs in kgs");
        System.out.print("Enter your Choice:");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("To covert kgs in lbs");
            System.out.println("Enter Weight");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20;
            System.out.println(" The new weight in lbs is:"+ newWeight);
        }
        else if (choice ==2 ) {
            System.out.println("To covert lbs in kgs");
            System.out.println("Enter Weight");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf(" The new weight in lbs is %.2f:",newWeight);

        }
        else{
            System.out.println("Enter valid Choice");
        }
    }
}
