package case_study.model;

public abstract class Facility {
    private String serviceName;
    private double usableAria;
    private double rantCost;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double usableAria, double rantCost, int maxPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableAria = usableAria;
        this.rantCost = rantCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableAria() {
        return usableAria;
    }

    public void setUsableAria(double usableAria) {
        this.usableAria = usableAria;
    }

    public double getRantCost() {
        return rantCost;
    }

    public void setRantCost(double rantCost) {
        this.rantCost = rantCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return serviceName + "," + usableAria + "," + rantCost + "," + maxPeople + "," + rentalType;
    }
}
