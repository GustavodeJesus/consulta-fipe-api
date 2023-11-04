package br.ufu.gustavodejesus.trabalho.pattern.singleton;

import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class VehiclesViewed {

    private static VehiclesViewed instance = null;
    private List<IVehicle> vehicles;

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
