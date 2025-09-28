import java.util.Scanner;

public class math11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //v= pi.r².h
        double r;
        double h;

        System.out.println("Enter radius(r): ");
        r = scanner.nextDouble();
        System.out.println("Enter height(h): ");
        h = scanner.nextDouble();

        double result = Math.PI*Math.pow(r,2)*h;
        System.out.printf("Volume =%.2fcm",result);

    }

}
