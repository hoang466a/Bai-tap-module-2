package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class UsdVnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your money value (USD): ");
        int usd=input.nextInt();
        int exChange=23000;
        System.out.printf("Output your money value (VND): %d VND",usd*exChange);
    }
}
