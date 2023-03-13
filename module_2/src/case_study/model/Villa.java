package case_study.model;

public class Villa extends Facility{
    private String roomStandard;
    private String swimmingPoolAria;
    private String numberOfFloor;

    public Villa() {
    }

    public Villa(String roomStandard, String swimmingPoolAria, String numberOfFloor) {
        this.roomStandard = roomStandard;
        this.swimmingPoolAria = swimmingPoolAria;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String serviceName, String usableAria, String taxCost, int maxPeople, String rentalType, String roomStandard, String swimmingPoolAria, String numberOfFloor) {
        super(serviceName, usableAria, taxCost, maxPeople, rentalType);
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

    public String getSwimmingPoolAria() {
        return swimmingPoolAria;
    }

    public void setSwimmingPoolAria(String swimmingPoolAria) {
        this.swimmingPoolAria = swimmingPoolAria;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
