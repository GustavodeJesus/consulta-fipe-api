package br.ufu.gustavodejesus.trabalho.pattern.factory.makers.motorcycle;

import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import br.ufu.gustavodejesus.trabalho.model.VehicleType;

public class Motorcycle implements IVehicle {

    private String value;
    private String brand;
    private String model;
    private int modelYear;
    private String fuelType;
    private String fipeCode;
    private String referenceMonth;
    private String fuelTypeAbbreviation;

    public Motorcycle(String value,
                      String brand,
                      String model,
                      int modelYear,
                      String fuelType,
                      String fipeCode,
                      String referenceMonth,
                      String fuelTypeAbbreviation) {
        this.value = value;
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.fuelType = fuelType;
        this.fipeCode = fipeCode;
        this.referenceMonth = referenceMonth;
        this.fuelTypeAbbreviation = fuelTypeAbbreviation;
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

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.MOTORCYCLE;
    }

}
