package br.ufu.gustavodejesus.trabalho.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FipeVehicleResponse {
    @JsonProperty("TipoVeiculo")
    private int vehicleType;
    @JsonProperty("Valor")
    private String value;
    @JsonProperty("Marca")
    private String brand;
    @JsonProperty("Modelo")
    private String model;
    @JsonProperty("AnoModelo")
    private int modelYear;
    @JsonProperty("Combustivel")
    private String fuelType;
    @JsonProperty("CodigoFipe")
    private String fipeCode;
    @JsonProperty("MesReferencia")
    private String referenceMonth;
    @JsonProperty("SiglaCombustivel")
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
