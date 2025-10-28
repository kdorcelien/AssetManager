package com.pluralsight.Manager;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double costPerYear = 0;
        if (year <= 3) {
            costPerYear = -originalCost * 0.03 * year;
        } else if (year >= 4 && year <= 6) {
            costPerYear = -originalCost * 0.06 * year;
        } else if (year >= 7 && year <= 10) {
            costPerYear = -originalCost * 0.08 * year;
        } else if (year > 10) {
            costPerYear = 1000.00;
        }
        boolean isHondaOrToyota = makeModel.toLowerCase().contains("honda") ||
                makeModel.toLowerCase().contains("toyota");

        if (odometer > 100000 && !isHondaOrToyota) {
            costPerYear = originalCost * 0.75;
        }

        return costPerYear;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
