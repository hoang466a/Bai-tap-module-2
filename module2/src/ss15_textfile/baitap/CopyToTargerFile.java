package ss15_textfile.baitap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class CopyToTargerFile {

    public int countCharacter(String file)
    {
        int count=0;
        try{
            BufferedReader bw=new BufferedReader(new FileReader(file));
            int i;
            while((i=bw.read())!=-1)
            {
                if ((char)i!=' ')
                {
                    count++;
                }
            }

        }
        catch(Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
    }
        return count;
    }

    public void countCharacter1(String source,String target)
    {
        int count=0;
        try{
            BufferedReader br=new BufferedReader(new FileReader(source));
            FileWriter bw=new FileWriter(target, true);
            BufferedWriter bw1=new BufferedWriter(bw);
            int i;
            while((i=br.read())!=-1)
            {
                if ((char)i!=' ')
                {
                    count++;
                }
            }

        }
        catch(Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }

    }



    public static void main(String[] args) {
        CopyToTargerFile check=new CopyToTargerFile();
        System.out.println("Số lượng từ trong file gốc là: "+check.countCharacter("D:\\Codegym\\Module02\\module2\\src\\ss15_textfile\\baitap\\sourcefile"));

    }




}
