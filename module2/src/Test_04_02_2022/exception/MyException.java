package Test_04_02_2022.exception;

public class MyException extends Exception {
    public MyException(){}

    @Override
    public String getMessage() {
        return "Không tìm thấy giá trị cần tìm, xin nhập lại";
    }
}