package ss3_loop_java.bai_tap;
import java.util.Scanner;
public class PrimeNumberUnder100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=2;
        while(num<100)
        {
            boolean check=true;
            if(num==2)
            {
                System.out.printf("%d,",num);
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
                    System.out.printf(" %d,",num);
                    num++;
                }
            }
        }

    }
}
