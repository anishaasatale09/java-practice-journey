/*- Grade Evaluator
- Prompt: Take a student's marks (0–100) as input and print the grade:
- A: 90–100
- B: 75–89
- C: 50–74
- D: 35–49
- F: Below 35
- Bonus: Validate that the input is within 0–100.
*/
import java.util.Scanner;
public class problem12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double marks;
        System.out.println("Enter your marks: ");
        marks = scanner.nextDouble();
        if(marks>100){
            System.out.println("Enter marks in range of 0-100");
        } else if (marks<0) {
            System.out.println("Enter marks in range of 0-100");
        } else if(marks>=90){
            System.out.println("A");
        } else if (marks>=75) {
            System.out.println("B");
        } else if (marks>=50) {
            System.out.println("C");
        } else if (marks>=35) {
            System.out.println("D");
        } else {
            System.out.println("F");
            
        }
    }

}
