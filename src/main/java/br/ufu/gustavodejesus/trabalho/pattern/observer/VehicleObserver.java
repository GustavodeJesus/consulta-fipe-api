package br.ufu.gustavodejesus.trabalho.pattern.observer;

import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import br.ufu.gustavodejesus.trabalho.pattern.singleton.VehiclesViewed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VehicleObserver implements Observer {

    private static final Logger LOGGER = LoggerFactory.getLogger(VehicleObserver.class);

    private final VehiclesViewed vehiclesViewed;

    public VehicleObserver(VehiclesViewed vehiclesViewed) {
        this.vehiclesViewed = vehiclesViewed;
    }

    @Override
    public void update(IVehicle vehicle) {
        vehiclesViewed.addVehicle(vehicle);
        LOGGER.info("{} visualizado!", vehicle.getVehicleType());
    }
}
