package FuramaResort.models.person;

public abstract class Person {
    private String name;
    private String dateofbirth;
    private String gender;
    private String id;
    private String phonenumber;
    private String email;
    private String CMND;

    public Person() {}

    public Person(String name, String dateofbirth, String gender, String id, String phonenumber, String email, String code) {
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.gender = gender;
        this.id = id;
        this.phonenumber = phonenumber;
        this.email = email;
        this.CMND = code;
    }

    @Override
    public abstract String toString() ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }
}
