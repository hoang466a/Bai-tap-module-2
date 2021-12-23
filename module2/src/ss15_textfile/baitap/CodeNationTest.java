package ss15_textfile.baitap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodeNationTest {
    public static final String FILE_NATION="D:\\Codegym\\Module02\\module2\\src\\ss15_textfile\\baitap\\csv.txt";

    static List<CodeNation> readFile(String file)
    {
        List <CodeNation> codenation= new ArrayList<>();
        BufferedReader br=null;

        try {
            br=new BufferedReader(new FileReader(file));
            String line;
            String []temp;
            CodeNation codeNation;
            while ((line=br.readLine())!=null)
            {
                temp=line.split(",");
                codeNation=new CodeNation(temp[0],temp[1],temp[2]);
                codenation.add(codeNation);}

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return codenation;
    }


    public static void main(String[] args) {
        List<CodeNation> codeNations=new ArrayList<>();
        codeNations=readFile(FILE_NATION);
        for (CodeNation check:codeNations )
        {
            System.out.println(check);
        }
    }


}
