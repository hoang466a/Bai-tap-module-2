package FuramaResort.models.person;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer(){};

    public Customer(String id, String name, String dateofbirth, String gender, String CMND, String phonenumber, String email, String type,String address) {
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
                "id="+this.getId()+
                ", name="+this.getName()+
                ", date of birth="+this.getDateofbirth()+
                ", gender="+this.getGender()+
                ", CMND="+this.getCMND()+
                ", Phone number="+this.getPhonenumber()+
                ", Email=" +this.getEmail()+
                ", type customer='" + this.getType() + '\'' +
                ", address='" + this.getAddress() + '\'' +
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
