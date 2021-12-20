package ss12_SearchingAlgorithm.baitap;
import java.util.Scanner;
import java.util.ArrayList;

public class Search {



    public void increaseString(String input)
    {
        String []listInput=input.split("");
        ArrayList<String>listOutput=new ArrayList<String>();
        listOutput.add(listInput[0]);
        int count=0;
        for (int i=1;i<listInput.length;i++)
        {
            if (listInput[i].compareTo(listOutput.get(count))>0)
            {
                listOutput.add(listInput[i]);
                count++;
            }
        }
        for (String listoutput:listOutput)
        {
            System.out.println(listoutput);
        }
    }



    public static void main(String[] args) {
        Search search=new Search();
        Scanner input=new Scanner(System.in);
        System.out.println("Input the string: ");
        String inputString=input.nextLine();
        search.increaseString(inputString);
    }
}
