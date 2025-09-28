//Use nested ternary operators to find the largest of three numbers.

public class nestedTernery {
    public static void main(String[] args){
        int a = 10;
        int b = 12;
        int c = 155555;

        int maxab = (a>b) ? a :b;

        int maxabc = (maxab > c) ? maxab : c;

        System.out.println(maxabc);

    }
}
