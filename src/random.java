import java.util.Random;
public class random {
    public static void main(String[] args){
        Random random = new Random();

        //int number;
        double number;
        number = random.nextDouble(1,7); //7 excluded
        System.out.println(number);
    }
}
