package filter_method;

public class Student {
    private int ID;
    private String name;
    private String major;
    private double grade;

    public Student(int iD, String name, String major, double grade) {
        ID = iD;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    
}
