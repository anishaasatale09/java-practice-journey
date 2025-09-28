import java.util.Scanner;
public class calculator {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter principal:");
        principal = scanner.nextDouble();

        System.out.print("Enter Interest rate:");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter no of time compounded per year :");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the no of years :");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+rate/timesCompound,timesCompound*years);

        System.out.printf("The total amount is $%.3f",amount);

        scanner.close();

    }



}
