package Test_04_02_2022.model;

public class Student extends Person{
    private String name_class;
    private String point;


    public Student(){}


    public Student(String name_class, String point) {
        this.name_class = name_class;
        this.point = point;
    }

    public Student(String id, String name, String dateOfBirth, String gender, String name_class, String point) {
        super(id, name, dateOfBirth, gender);
        this.name_class = name_class;
        this.point = point;
    }

    public String getName_class() {
        return name_class;
    }

    public void setName_class(String name_class) {
        this.name_class = name_class;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                "name_class='" + name_class + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
