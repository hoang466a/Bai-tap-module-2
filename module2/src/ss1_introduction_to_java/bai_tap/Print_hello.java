package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class Print_hello {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello: " + name);
    }
}
