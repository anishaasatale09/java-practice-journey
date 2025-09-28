import java.util.Scanner;
public class hypo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        System.out.print("Enter length (Side A): ");
        a = scanner.nextInt();
        System.out.print("Enter length (Side B): ");
        b = scanner.nextInt();
        double result = Math.pow(a,2)+Math.pow(b,2);
        System.out.println("The hypotenuse of triangle is: "+result +"cm");
        //System.out.println("%.2f", result);
    }
}
