package FuramaResort.models.person;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer(){};

    public Customer(String name, String dateofbirth, String gender, String id, String phonenumber, String email, String CMND, String type, String address) {
        super(name, dateofbirth, gender, id, phonenumber, email, CMND);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
