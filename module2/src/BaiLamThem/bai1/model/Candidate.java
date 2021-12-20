package BaiLamThem.bai1.model;

public class Candidate {
    private String candidateid;
    private String namestudent;
    private String dateofbirth;
    private double mathpoint;
    private double literaturepoint ;
    private double englishpoint;


    public Candidate()
    {}

    public Candidate(String studentid, String namestudent, String dateofbirth, double mathpoint, double literaturepoint, double englishpoint)
    {
        this.candidateid=studentid;
        this.namestudent=namestudent;
        this.dateofbirth=dateofbirth;
        this.mathpoint=mathpoint;
        this.literaturepoint=literaturepoint;
        this.englishpoint=englishpoint;
    }

    public Candidate(String studentId, String studentName, String studentBirth, String studentGender, String studentClassName, String studentCourse) {
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "studentid='" + candidateid + '\'' +
                ", namestudent='" + namestudent + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", mathpoint=" + mathpoint +
                ", literaturepoint=" + literaturepoint +
                ", englishpoint=" + englishpoint +
                '}';
    }

    public double pointSum()
    {
        return this.mathpoint+this.englishpoint+this.literaturepoint;
    }



    public String getStudentid() {
        return candidateid;
    }

    public void setStudentid(String studentid) {
        this.candidateid = studentid;
    }



    public String getNamestudent() {
        return namestudent;
    }

    public void setNamestudent(String namestudent) {
        this.namestudent = namestudent;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public double getMathpoint() {
        return mathpoint;
    }

    public void setMathpoint(double mathpoint) {
        this.mathpoint = mathpoint;
    }

    public double getLiteraturepoint() {
        return literaturepoint;
    }

    public void setLiteraturepoint(double literaturepoint) {
        this.literaturepoint = literaturepoint;
    }

    public double getEnglishpoint() {
        return englishpoint;
    }

    public void setEnglishpoint(double englishpoint) {
        this.englishpoint = englishpoint;
    }
}
