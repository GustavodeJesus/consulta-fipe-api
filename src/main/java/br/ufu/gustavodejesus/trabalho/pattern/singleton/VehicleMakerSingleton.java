package br.ufu.gustavodejesus.trabalho.pattern.singleton;

import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicleMaker;
import br.ufu.gustavodejesus.trabalho.pattern.factory.makers.car.CarMaker;
import br.ufu.gustavodejesus.trabalho.pattern.factory.makers.motorcycle.MotorcycleMaker;
import br.ufu.gustavodejesus.trabalho.pattern.factory.makers.truck.TruckMaker;

public class VehicleMakerSingleton {
    private static IVehicleMaker truckMaker;
    private static IVehicleMaker carMaker;
    private static IVehicleMaker motorcycleMaker;

    private VehicleMakerSingleton() {

    }

    public static IVehicleMaker getInstance(int vehicleType) {
        return switch (vehicleType) {
            case 1 -> {
                if (carMaker == null) carMaker = new CarMaker();
                yield carMaker;
            }
            case 2 -> {
                if (motorcycleMaker == null) motorcycleMaker = new MotorcycleMaker();
                yield motorcycleMaker;
            }
            case 3 -> {
                if (truckMaker == null) truckMaker = new TruckMaker();
                yield truckMaker;
            }
            default -> throw new IllegalArgumentException("VehicleType not mapped");
        };
    }
}