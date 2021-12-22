package ss15_textfile.thuchanh;
import java.io.FileReader;
import java.io.FileWriter;

public class TestFileReader {
    public void readFile(){
        try {
            //creating FileReader object.
            FileReader fr =
                    new FileReader("D:\\Codegym\\Module02\\module2\\src\\ss15_textfile\\thuchanh\\testfilereader");

            int i;
            //read file.
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    String str = "C1021G1 www.w3spoint.com";

    public void writeFile(){
        try {
            FileWriter fw = new FileWriter("D:\\Codegym\\Module02\\module2\\src\\ss15_textfile\\thuchanh\\testfilereader");
            fw.write(str);
            fw.flush();
            fw.close();

            System.out.println("Contents written successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        TestFileReader test=new TestFileReader();
        test.readFile();
//        test.writeFile();
    }
}

