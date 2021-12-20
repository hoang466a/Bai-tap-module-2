package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class NumberToWord {
    private static String tensDown(String number) {
        switch (number) {
            case "0":
                return "";
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            default:
                return "can't read this";
        }
    }

    private static String hundredsUp(String number) {
        return tensDown(number) + " hunred ";
    }


    private static String tensUp(String number, String before){
        switch (number) {
            case "0":
                return before;
            case "1":
                switch(before){
                    case "zero":
                        return "ten";
                    case "one":
                        return "eleven";
                    case "two":
                        return "twelve";
                    case "three":
                        return "thirteen";
                    case "five":
                        return "fifteen";
                    default:
                        return tensDown(before)+ "teen";
                }
            case "2":
                return "twenty "+before;
            case "3":
                return "thirty "+before;
            case "5":
                return "fifty "+before;
            default:
                return tensDown(number)+"ty "+before;
        }
    }

   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (1 > 0) {
            System.out.print("nhập số cần đọc (0-999): ");
            String input = sc.nextLine();
            while (!(input.matches("^[1-9][0-9]?[0-9]$") ||
                    input.matches("^[0-9]$")))
            {
                System.out.println("không hợp lệ!");
                System.out.print("nhập số cần đọc (0-999): ");
                input = sc.nextLine();
            }
            String[] inputRay = input.split("");
            int number = Integer.parseInt(input);
            System.out.println(number);
            System.out.println(inputRay[0]);
            if(number>99)
            {
                System.out.print(hundredsUp(inputRay[0]));
                System.out.print(tensUp(inputRay[1],tensDown(inputRay[2])));
                System.out.println(" ");
            }
            else if(number>9&&number<100)
            {
                System.out.print(tensUp(inputRay[0],tensDown(inputRay[1])));
                System.out.println(" ");
            }
            else if(number<10)
            {
                System.out.println(tensDown(inputRay[0]));
            }
        }

    }
}

