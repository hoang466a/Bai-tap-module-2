package ss10_StackQueue.baitap;
import java.lang.reflect.Array;
import java.util.Stack;
public class UpSideDown {
    public <E>void output(Stack <E> stack)
    {
        stack.forEach(System.out::println);
    }


    public static void main(String[] args) {
        UpSideDown upsidedown=new UpSideDown();
        Stack <Integer> stack=new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        int size=stack.size();
        upsidedown.output(stack);
        int []array=new int[size];
        for (int i=0;i<size;i++)
        {
            array[i]=stack.pop();
        }
        for (int elements:array)
        {
            stack.push(elements);
        }
        upsidedown.output(stack);

        System.out.println("-----------------------------");



        Stack <String> wStack=new Stack<>();
        String word="bai test dao nguoc chuoi";
        String[] result=word.split("");
        System.out.println(result.length);
        for (String result1:result)
        {
            wStack.push(result1);
        }
        size=wStack.size();
        System.out.println(size);
        for (int i=0;i<size;i++)
        {
            wStack.pop();
        }
        for (int i= result.length-1;i>=0;i--)
        {
            wStack.push(result[i]);
        }
        upsidedown.output(wStack);





    }

}
