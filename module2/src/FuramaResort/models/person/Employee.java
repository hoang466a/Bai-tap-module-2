package FuramaResort.models.person;

public class Employee extends Person {
    private String educationlevel;
    private String position;
    private String salary;

    public Employee(){};

    public Employee(String name, String dateofbirth, String gender, String id, String phonenumber, String email, String code, String educationlevel, String position, String salary) {
        super(name, dateofbirth, gender, id, phonenumber, email, code);
        this.educationlevel = educationlevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEducationlevel() {
        return educationlevel;
    }

    public void setEducationlevel(String educationlevel) {
        this.educationlevel = educationlevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
