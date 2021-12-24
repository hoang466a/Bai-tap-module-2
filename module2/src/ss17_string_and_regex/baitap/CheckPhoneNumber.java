package ss17_string_and_regex.baitap;
import java.util.Scanner;



public class CheckPhoneNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại (sdt hợp lệ có dạng: (xx)-(0xxxxxxxxx)): ");
        String phonenumber=input.nextLine();
        if (phonenumber.matches("^[(]+[0-9]{2}+[)]+[-]+[(]+[0]+[0-9]{9}+[)]"))
        {
            System.out.println("Số điện thoại hợp lệ!");
        }
        else
        {
            System.out.println("Số điện thoại không hợp lệ!");
        }

    }
}
