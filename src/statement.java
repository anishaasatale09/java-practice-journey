import java.util.Scanner;

public class statement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your good name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a student(true/false): ");
        isStudent = scanner.nextBoolean();


        //GROUP1

        if(name.isEmpty()){
            System.out.println("Name cannot be empty!");
        }else{
            System.out.println("Hello "+name+"!");
        }

        //GROUP2

        if(age>=65){
            System.out.println("You are citizen");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if (age < 0) {
            System.out.println("Age cannot be less than zero");
        }
        else if(age == 0 ){
            System.out.println("Enter valid age.");
        }
        else{
            System.out.println("You are a Child!");
        }

        //GROUP3
        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are NOT a Student");
        }

        scanner.close();
    }

}
