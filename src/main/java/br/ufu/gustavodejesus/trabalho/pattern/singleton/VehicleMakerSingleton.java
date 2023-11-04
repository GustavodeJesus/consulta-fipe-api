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
            case CAR -> {
                if (carMaker == null) carMaker = new CarMaker();
                yield carMaker;
            }
            case MOTORCYCLE -> {
                if (motorcycleMaker == null) motorcycleMaker = new MotorcycleMaker();
                yield motorcycleMaker;
            }
            case TRUCK -> {
                if (truckMaker == null) truckMaker = new TruckMaker();
                yield truckMaker;
            }
            default -> throw new IllegalArgumentException("VehicleType not mapped");
        };
    }

    public static final int CAR = 1;
    public static final int MOTORCYCLE = 2;
    public static final int TRUCK = 3;
}