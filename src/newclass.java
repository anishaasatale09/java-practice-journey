import java.util.Scanner;
public class newclass {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isWaterFull;
        System.out.print("Enter water is full or not(true/false): ");
        isWaterFull = scanner.nextBoolean();
        if(isWaterFull){
            System.out.println("Turn off the motor!");
        }else{
            System.out.println("Water is not full yet, do not turn off the motor!");
        }
        scanner.close();
    }
}

// Save all these programs in a new repo or directory for future references.