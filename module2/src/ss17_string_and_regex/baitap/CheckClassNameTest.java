package ss17_string_and_regex.baitap;
public class CheckClassNameTest {
    private static CheckClassName checkClassName;
    private static String [] valid={"C0318G","P0123M"};
    private static String [] invalid={"Z0318G","P0123A"};

    public static void main(String[] args) {
        checkClassName=new CheckClassName();
        for (String test:valid)
        {
            boolean check=checkClassName.checkclassname(test);
            System.out.println("Tên lớp: "+test+" hợp lệ hay không?: "+check);
        }

        for (String test:invalid)
        {
            boolean check=checkClassName.checkclassname(test);
            System.out.println("Tên lớp: "+test+" hợp lệ hay không?: "+check);
        }

        /*if (a.matches("^[(]+[0-9]{2}+[)]+[-]+[(]+[0]+[0-9]{9}+[)]"))

        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }*/

    }


}
