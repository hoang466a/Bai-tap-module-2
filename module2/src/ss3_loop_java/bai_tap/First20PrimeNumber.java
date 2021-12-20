package ss3_loop_java.bai_tap;
import java.util.Scanner;
public class First20PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
        int num=2;
        while(count<20)
        {
            boolean check=true;
            if(num==2)
            {
                System.out.printf("%d,",num);
                count++;
                num++;
            }
            else if(num>2)
            {
            for (int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    check=false;
                    num++;
                    break;
                }
            }
            if(check==true)
            {
                count++;
                System.out.printf(" %d,",num);
                num++;
            }
            }
        }

    }




}
