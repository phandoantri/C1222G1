package case_study.model;

public class Employee extends Person{
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String level, String position, String salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee( String gender,String id, String name, String dayOfBirth, String cmndOfNumber, String phoneNumber, String email, String level, String position, String salary) {
        super(gender,id, name, dayOfBirth, cmndOfNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
