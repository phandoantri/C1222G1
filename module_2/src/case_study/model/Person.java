package case_study.model;

public abstract class Person {
    private String gender;
    private String id;
    private String name;
    private String dayOfBirth;
    private String cmndOfNumber;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person( String gender,String id, String name, String dayOfBirth, String cmndOfNumber, String phoneNumber, String email) {
        this.gender=gender;
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.cmndOfNumber = cmndOfNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getCmndOfNumber() {
        return cmndOfNumber;
    }

    public void setCmndOfNumber(String cmndOfNumber) {
        this.cmndOfNumber = cmndOfNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", cmndOfNumber='" + cmndOfNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
