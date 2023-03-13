package case_study.model;

import java.util.Date;

public abstract class Facility {
    private String serviceName;
    private String usableAria;
    private String taxCost;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, String usableAria, String taxCost, int maxPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableAria = usableAria;
        this.taxCost = taxCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableAria() {
        return usableAria;
    }

    public void setUsableAria(String usableAria) {
        this.usableAria = usableAria;
    }

    public String getTaxCost() {
        return taxCost;
    }

    public void setTaxCost(String taxCost) {
        this.taxCost = taxCost;
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
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableAria='" + usableAria + '\'' +
                ", taxCost='" + taxCost + '\'' +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
