package bai_tap_lam_them;

public class Teacher {
    private String name;
    private String id;
    private String dayOfBirth;
    private boolean gender;
    private String specialize;
    public Teacher(){

    }

    public Teacher(String name, String id, String dayOfBirth, boolean gender, String specialize) {
        this.name = name;
        this.id = id;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.specialize = specialize;
    }

    public Teacher(String name, String id, String dayOfBirth, boolean gender) {
        this.name=name;
        this.id=id;
        this.dayOfBirth=dayOfBirth;
        this.gender=gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender=" + gender +
                ", specialize='" + specialize + '\'' +
                '}';
    }
}
