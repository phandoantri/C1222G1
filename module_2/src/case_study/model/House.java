package case_study.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloor;

    public House() {
    }

    public House(String roomStandard, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String serviceName, double usableAria, double rantCost, int maxPeople, String rentalType, String roomStandard, int numberOfFloor) {
        super(serviceName, usableAria, rantCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return super.getServiceName() + "," + super.getUsableAria() + "," + super.getRantCost() + "," + super.getMaxPeople() + "," + super.getRentalType() + "," + roomStandard + "," + numberOfFloor;
    }
}
