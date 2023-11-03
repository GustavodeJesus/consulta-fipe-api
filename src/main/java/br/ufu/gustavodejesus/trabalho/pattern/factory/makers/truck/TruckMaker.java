package br.ufu.gustavodejesus.trabalho.pattern.factory.makers.truck;

import br.ufu.gustavodejesus.trabalho.model.FipeVehicle;
import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicleMaker;

public class TruckMaker implements IVehicleMaker {

    @Override
    public IVehicle makeVehicle(FipeVehicle vehicle) {
        return new Truck(
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
