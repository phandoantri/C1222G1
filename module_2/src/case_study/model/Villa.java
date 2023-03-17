package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolAria;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String roomStandard, double swimmingPoolAria, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.swimmingPoolAria = swimmingPoolAria;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String serviceName, double usableAria, double rantCost, int maxPeople, String rentalType, String roomStandard, double swimmingPoolAria, int numberOfFloor) {
        super(serviceName, usableAria, rantCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolAria = swimmingPoolAria;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolAria() {
        return swimmingPoolAria;
    }

    public void setSwimmingPoolAria(double swimmingPoolAria) {
        this.swimmingPoolAria = swimmingPoolAria;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return super.getServiceName() + "," + super.getUsableAria() + "," + super.getRantCost() + "," + super.getMaxPeople() + "," + super.getRentalType() + "," + roomStandard + "," + swimmingPoolAria + "," + numberOfFloor;
    }
}
