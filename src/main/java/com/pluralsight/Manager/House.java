package com.pluralsight.Manager;

public class House extends Asset{
   private String address;
    private int condition;
    private int  squareFoot;
    private int lotSize;


    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
@Override
    public double getValue() {
    double pricePerSqFoot;
        switch (condition){
            case 1:
                pricePerSqFoot = 180.00;
                break;
            case 2:
                pricePerSqFoot = 130.00;
                break;
            case 3:
                pricePerSqFoot = 90.00;
                break;
            case 4:
                pricePerSqFoot = 80.00;
                break;
            default:
                pricePerSqFoot = 0.0;
        }

    double baseValue = squareFoot * pricePerSqFoot;

    double lotValue = lotSize * 0.25;

    return baseValue + lotValue;
}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
