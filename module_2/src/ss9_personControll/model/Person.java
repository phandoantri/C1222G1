package ss9_personControll.model;

public class Person {
    private String name;
    private String id;
    private String  dayOfBirth;
    private String gender;

    public Person() {

    }
    public Person(String name, String id, String dayOfBirth, String gender) {
        this.name = name;
        this.id = id;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender=" + gender +
                '}';
    }


}
