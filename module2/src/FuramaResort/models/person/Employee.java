package FuramaResort.models.person;

public class Employee extends Person {
    private String educationlevel;
    private String position;
    private String salary;

    public Employee(){};

    public Employee(String id, String name, String dateofbirth, String gender, String CMND, String phonenumber, String email, String educationlevel, String position, String salary) {
        super(name, dateofbirth, gender, id, phonenumber, email, CMND);
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

    @Override
    public String toString() {
        return "Employee{" +
                "educationlevel='" + educationlevel + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
