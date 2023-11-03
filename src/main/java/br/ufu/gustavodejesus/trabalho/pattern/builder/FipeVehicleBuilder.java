package br.ufu.gustavodejesus.trabalho.pattern.builder;

import br.ufu.gustavodejesus.trabalho.model.FipeVehicle;

public class FipeVehicleBuilder {
    private final FipeVehicle fipeVehicle;

    public FipeVehicleBuilder() {
        fipeVehicle = new FipeVehicle();
    }

    public FipeVehicleBuilder withVehicleType(int vehicleType) {
        fipeVehicle.setVehicleType(vehicleType);
        return this;
    }

    public FipeVehicleBuilder withValue(String value) {
        fipeVehicle.setValue(value);
        return this;
    }

    public FipeVehicleBuilder withBrand(String brand) {
        fipeVehicle.setBrand(brand);
        return this;
    }

    public FipeVehicleBuilder withModel(String model) {
        fipeVehicle.setModel(model);
        return this;
    }

    public FipeVehicleBuilder withModelYear(int modelYear) {
        fipeVehicle.setModelYear(modelYear);
        return this;
    }

    public FipeVehicleBuilder withFuelType(String fuelType) {
        fipeVehicle.setFuelType(fuelType);
        return this;
    }

    public FipeVehicleBuilder withFipeCode(String fipeCode) {
        fipeVehicle.setFipeCode(fipeCode);
        return this;
    }

    public FipeVehicleBuilder withReferenceMonth(String referenceMonth) {
        fipeVehicle.setReferenceMonth(referenceMonth);
        return this;
    }

    public FipeVehicleBuilder withFuelTypeAbbreviation(String fuelTypeAbbreviation) {
        fipeVehicle.setFuelTypeAbbreviation(fuelTypeAbbreviation);
        return this;
    }

    public FipeVehicle build() {
        return fipeVehicle;
    }
}
