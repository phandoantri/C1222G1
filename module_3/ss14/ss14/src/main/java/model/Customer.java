package model;

import java.util.Date;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private Date dayOfBirth;
    private boolean gender;
    private int idTypeCustomer;
    private String nameTypeCustomer;

    public Customer() {
    }

    public Customer(int idCustomer, String nameCustomer, Date dayOfBirth, boolean gender, int idTypeCustomer, String nameTypeCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idTypeCustomer = idTypeCustomer;
        this.nameTypeCustomer = nameTypeCustomer;
    }

    public Customer( String nameCustomer, Date dayOfBirth, boolean gender, String nameTypeCustomer) {
        this.nameCustomer=nameCustomer;
        this.dayOfBirth=dayOfBirth;
        this.gender=gender;
        this.nameTypeCustomer=nameTypeCustomer;
    }

    public Customer(int id, String name, Date dayOfBirth, boolean gender, String nameTypeCustomer) {
        this.idCustomer = id;
        this.nameCustomer = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.nameTypeCustomer = nameTypeCustomer;
    }

    public Customer(String nameCustomer, java.sql.Date dayOfBirth, boolean gender, int idTypeCustomer) {
        this.nameCustomer=nameCustomer;
        this.dayOfBirth=dayOfBirth;
        this.gender=gender;
        this.idTypeCustomer=idTypeCustomer;
    }

    public Customer(String nameCustomer, java.sql.Date dayOfBirth, boolean gender, int idTypeCustomer, String nameTypeCustomer) {
        this.nameCustomer=nameCustomer;
        this.dayOfBirth=dayOfBirth;
        this.gender=gender;
        this.idTypeCustomer=idTypeCustomer;
        this.nameTypeCustomer=nameTypeCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdTypeCustomer() {
        return idTypeCustomer;
    }

    public void setIdTypeCustomer(int idTypeCustomer) {
        this.idTypeCustomer = idTypeCustomer;
    }

    public String getNameTypeCustomer() {
        return nameTypeCustomer;
    }

    public void setNameTypeCustomer(String nameTypeCustomer) {
        this.nameTypeCustomer = nameTypeCustomer;
    }
}
