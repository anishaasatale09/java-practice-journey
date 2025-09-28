public class formating {
    public static void main(String[] args){
        String name = "Deremon";
        int age = 25;
        boolean isRobot = true;
        double height = 2.666666;
        char firstLetter = 'D';

        //[flags]
        //+ = output a plus
        //, = grouping separator
        //( = negative numbers are enclosed in ()
        //space = display negative, space if positive

        //[width]
        //0 = zero padding
        //number = right justified padding
        //negative number = left justified padding

        System.out.printf("Hello %s. You are %d years old.Welcome to our family.\n",name,age);
        System.out.printf("First letter of your name is %c.Your height is %.4f",firstLetter,height);
    }
}
