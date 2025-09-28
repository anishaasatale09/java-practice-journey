/*🧃 Problem 2: Random Drink Selector
Prompt:
Create a program that randomly selects a drink from 3 options:
- 1 → “You got Lemonade!”
- 2 → “You got Mango Juice!”
- 3 → “You got Cold Coffee!”
Use Random to pick a number between 1 and 3, then use if-else to print the result.
*/
import java.util.Random;

public class problem21 {
    public static void main(String[] args){
        Random random = new Random();

        int drinkSelector;
        drinkSelector = random.nextInt(1,4);
        //System.out.println(drinkSelector);

        if(drinkSelector==1){
            System.out.println("You got Lemonade!");
        } else if (drinkSelector==2) {
            System.out.println("You got Mango Juice!");
        }else{
            System.out.println("You got Cold Coffee!");
        }
    }
}
