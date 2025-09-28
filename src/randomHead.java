import java.util.Random;
public class randomHead {
    public static void main(String[] args){
        Random random = new Random();

        boolean isHeads;
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEAD");
        }else {
            System.out.println("TAIL");
        }
    }
}
