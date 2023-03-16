package case_study.model;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceName, double usableAria, double rantCost, int maxPeople, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableAria, rantCost, maxPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return super.getServiceName() + "," + super.getUsableAria() + "," + super.getRantCost() + "," + super.getMaxPeople() + "," + super.getRentalType() + "," + freeServiceIncluded;
    }
}
