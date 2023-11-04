package br.ufu.gustavodejesus.trabalho.pattern.singleton;

import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import java.util.ArrayList;
import java.util.List;

public class VehiclesViewed {

    private static VehiclesViewed instance = null;
    private final List<IVehicle> vehicles;

    private VehiclesViewed() {
        vehicles = new ArrayList<>();
    }

    public static VehiclesViewed getInstance() {
        if (instance == null) {
            instance = new VehiclesViewed();
        }
        return instance;
    }

    public void addVehicle(IVehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<IVehicle> getVehicles() {
        return vehicles;
    }

}
