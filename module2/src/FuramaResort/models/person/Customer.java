package FuramaResort.models.person;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer(){};

    public Customer(String name, String dateofbirth, String gender, String id, String phonenumber, String email, String code, String type, String address) {
        super(name, dateofbirth, gender, id, phonenumber, email, code);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
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
