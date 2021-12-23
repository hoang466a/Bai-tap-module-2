package ss15_textfile.baitap;
import java.io.*;

public class CopyToTargerFile {
public static final String File_source="D:\\Codegym\\Module02\\module2\\src\\ss15_textfile\\baitap\\sourcefile";
public static final String File_target="D:\\Codegym\\Module02\\module2\\src\\ss15_textfile\\baitap\\targetfile";


public int countCharacter(String file) throws IOException {
        BufferedReader bw=null;
        int count=0;
        try{
            bw=new BufferedReader(new FileReader(file));
            int i;
            while((i=bw.read())!=-1)
            {
                if ((char)i!=' ')
                    count++;
            }

        }
        catch(Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
            }
        finally {
            bw.close();
        }
        return count;
    }




    public void copyToTargetFile(String source,String target) throws IOException
    {
        BufferedReader br=null;
        FileWriter bw=null;
        BufferedWriter bw1=null;
        String result="";
        try{
            br=new BufferedReader(new FileReader(source));
            bw=new FileWriter(target);
            bw1=new BufferedWriter(bw);
            int i;
            while((i=br.read())!=-1)
            {
                result+=(char)i;
            }
            bw1.write(result);



        }
        catch(Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        finally {
            br.close();
            bw1.flush();
            bw1.close();
        }

    }



    public static void main(String[] args) {
        CopyToTargerFile check=new CopyToTargerFile();
        /*String in="day khong la bai test";
        try {
            String result1="aloha bloha";
            FileWriter test=new FileWriter("D:\\Codegym\\Module02\\module2\\src\\ss15_textfile\\baitap\\bloha.txt");
            BufferedWriter bw1=new BufferedWriter(test);

            /*int i;
            while((i=bw1.read())!=-1)
            {
                result1+=(char)i;
            }
            bw1.write(result1);
            bw1.close();
            test.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            System.out.println("Số lượng từ trong file gốc là: "+check.countCharacter(File_source));
            check.copyToTargetFile(File_source,File_target);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }




}
