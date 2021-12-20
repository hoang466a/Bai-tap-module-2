package ss5_Class_Object.bai_tap;
import java.util.Scanner;
public class TestWatchStop {
    public static void main(String[] args) {
        WatchStop s1=new WatchStop() ;
        s1.start();
        System.out.println(s1.getStartTime());
        int sum=0;
        for (int i=0;i<10000000;i++)
        {
            sum++;
            sum--;
            Math.pow(sum,0.5);
        }
        System.out.println(sum);
        s1.stop();
        System.out.println(s1.getStartTime());
        System.out.println(s1.getEndTime());
        System.out.println(s1.getElapsedTime());

    }
}
