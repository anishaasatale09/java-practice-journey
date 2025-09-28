/*🎨 Problem 3: Random Color Generator
Prompt:
Use Random to generate a number between 1 and 5.
Each number represents a color:
- 1 → “You got Red!”
- 2 → “You got Blue!”
- 3 → “You got Green!”
- 4 → “You got Yellow!”
- 5 → “You got Purple!”
Print the color based on the random number using if-else statements.
*/
import java.util.Random;
public class problem22 {
    public static void main(String[] args){
        Random random = new Random();

        int number;
        number = random.nextInt(1,6);
        //System.out.println(number);

        if(number==1){
            System.out.println("You got Red!");
        } else if (number==2) {
            System.out.println("You got Blue!");
        } else if (number==3) {
            System.out.println("You got Green!");
        } else if (number==4) {
            System.out.println("You got Yellow!");
        } else  {
            System.out.println("You got Purple!");

        }
    }
}
