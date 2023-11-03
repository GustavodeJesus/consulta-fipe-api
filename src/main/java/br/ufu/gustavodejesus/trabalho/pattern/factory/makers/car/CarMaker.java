package br.ufu.gustavodejesus.trabalho.pattern.factory.makers.car;

import br.ufu.gustavodejesus.trabalho.model.FipeVehicle;
import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicleMaker;

public class CarMaker implements IVehicleMaker {

    @Override
    public IVehicle makeVehicle(FipeVehicle vehicle) {
        return new Car(
                vehicle.getValue(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getModelYear(),
                vehicle.getFuelType(),
                vehicle.getFipeCode(),
                vehicle.getReferenceMonth(),
                vehicle.getFuelTypeAbbreviation()
        );
    }
}
