/*🧪 Problem 5: Temperature Converter with Advice
Prompt:
Ask the user to enter a temperature in Celsius.
Convert it to Fahrenheit using the formula:
F = (C × 9/5) + 32
Then use if-else to give advice:
- If Fahrenheit > 100 → “It’s really hot!”
- If Fahrenheit < 50 → “It’s quite cold.”
- Else → “The weather is moderate.”
*/

import java.util.Scanner;
public class problem14 {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp;
        System.out.println("Enter temperature in celsius: ");
        temp = scanner.nextDouble();

        double fahrenheit = (temp*9/5)+32;
        System.out.printf("The temperature is %.2f fahrenheit.\n",fahrenheit);
        if(fahrenheit>=100){
            System.out.println("It's really hot!");
        } else if (fahrenheit<=50) {
            System.out.println("it's quite cold!");
        }else{
            System.out.println("The weather is moderate.");
        }
        scanner.close();
    }
}
