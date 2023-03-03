package ss9_personControll.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }
    public Teacher(String name, String id, String dayOfBirth, String gender, String specialize) {
        super(name, id, dayOfBirth, gender);
        this.specialize = specialize;
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
                "specialize='" + super.toString()+ specialize + '\'' +
                '}';
    }
}
