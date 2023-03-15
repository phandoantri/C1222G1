package case_study.model;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String gender, String id, String name, String dayOfBirth, String cmndOfNumber, String phoneNumber, String email, String typeOfGuest, String address) {
        super(gender, id, name, dayOfBirth, cmndOfNumber, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    @Override
    public String toString() {
        return super.getGender() + "," + super.getId() + "," + super.getName() + "," + super.getDayOfBirth() + "," + super.getCmndOfNumber() + "," + super.getPhoneNumber() + "," + super.getEmail() + "," + typeOfGuest + "," + address;
    }
}
