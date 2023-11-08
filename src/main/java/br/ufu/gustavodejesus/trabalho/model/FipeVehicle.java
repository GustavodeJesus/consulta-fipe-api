package br.ufu.gustavodejesus.trabalho.model;

public class FipeVehicle {
    private int vehicleType;
    private String value;
    private String brand;
    private String model;
    private int modelYear;
    private String fuelType;
    private String fipeCode;
    private String referenceMonth;
    private String fuelTypeAbbreviation;

    public int getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFipeCode() {
        return fipeCode;
    }

    public void setFipeCode(String fipeCode) {
        this.fipeCode = fipeCode;
    }

    public String getReferenceMonth() {
        return referenceMonth;
    }

    public void setReferenceMonth(String referenceMonth) {
        this.referenceMonth = referenceMonth;
    }

    public String getFuelTypeAbbreviation() {
        return fuelTypeAbbreviation;
    }

    public void setFuelTypeAbbreviation(String fuelTypeAbbreviation) {
        this.fuelTypeAbbreviation = fuelTypeAbbreviation;
    }
}
