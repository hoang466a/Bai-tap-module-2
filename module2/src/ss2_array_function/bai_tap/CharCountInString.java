package ss2_array_function.bai_tap;
import java.util.Scanner;
public class CharCountInString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input your string: ");
        String inputstring= input.nextLine();
        System.out.println("Input your char: ");
        char inputchar = input.findInLine(".").charAt(0);
        System.out.println(inputchar);
        int count=0;
        for (int i=0;i<inputstring.length();i++)
        {
            char outputchar=inputstring.charAt(i);
            if(outputchar==inputchar)
            {
                count++;
            }
        }
        System.out.println("number of times a character "+inputchar+" occurs in the given string: "+count);

    }
}
