public class Stringmethods {
    public static  void main(String[] args) {
        String name = "John Perry";
        //int length = name.length();
        //int index = name.indexOf("r"); // indexing starts from 0
        //int lastIndex = name.lastIndexOf("r");
        //char chara = name.charAt(5);
        //name =name.toLowerCase();
        //name =name.toUpperCase();
       //name = name.trim(); // remove extra spaces from string
        //name = name.replace("r","d"); //first mention old character which replaced by new character
        /* if(name.contains(" ")){
             System.out.println("Name contains space");
         }
         else{
             System.out.println("Name does not contains space");
         }

         */
        if(name.equals(" ")){
            System.out.println("Enter valid name");

        }else{
            System.out.println("Hello "+ name + "!");
        }


        System.out.println(name);
    }
}
