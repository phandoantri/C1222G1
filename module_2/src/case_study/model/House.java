package case_study.model;

public class House extends Facility{
    private String roomStandard;
    private String numberOfFloor;

    public House() {
    }

    public House(String roomStandard, String numberOfFloor) {
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String serviceName, String usableAria, String taxCost, int maxPeople, String rentalType, String roomStandard, String numberOfFloor) {
        super(serviceName, usableAria, taxCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
