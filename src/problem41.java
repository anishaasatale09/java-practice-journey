/*Grade classifier: Input score 0–100. Print A/B/C/D/F.
If A, also print “with honors” when ≥95.*/

import java.util.Scanner;
public class problem41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int score;
        System.out.println("Enter your score:");
        score = scanner.nextInt();
        if(score>100){
            System.out.println("Score should between 0-100");
        } else if (score<0) {
            System.out.println("Score should between 0-100");
        }
        else if(score>=90){
            if(score>=95){
                System.out.println("A");
                System.out.println("with honors");
            }
            else{
                System.out.println("A");
            }

        }
        else if(score>=80){
            System.out.println("B");

        }
        else if(score>=60) {
            System.out.println("D");

        }
        else{
            System.out.println("E");
        }

    }
}
