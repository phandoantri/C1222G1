package case_study.model;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String level, String position, double salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String gender, String id, String name, String dayOfBirth, String cmndOfNumber, String phoneNumber, String email, String level, String position, double salary) {
        super(gender, id, name, dayOfBirth, cmndOfNumber, phoneNumber, email);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.getGender() + "," + super.getId() + "," + super.getName() + "," + super.getDayOfBirth() + "," + super.getCmndOfNumber() + "," + super.getPhoneNumber() + "," + super.getEmail() + "," + level + "," + position + "," + salary;
    }

}
