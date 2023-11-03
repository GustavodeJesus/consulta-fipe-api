package br.ufu.gustavodejesus.trabalho.model.mapper;

import br.ufu.gustavodejesus.trabalho.client.response.FipeVehicleResponse;
import br.ufu.gustavodejesus.trabalho.model.FipeVehicle;
import br.ufu.gustavodejesus.trabalho.pattern.builder.FipeVehicleBuilder;

public class VehicleMapper implements IVehicleMapper {
    @Override
    public FipeVehicle fromResponse(FipeVehicleResponse vehicleResponse) {
        return new FipeVehicleBuilder()
                .withVehicleType(vehicleResponse.getVehicleType())
                .withValue(vehicleResponse.getValue())
                .withBrand(vehicleResponse.getBrand())
                .withModel(vehicleResponse.getModel())
                .withModelYear(vehicleResponse.getModelYear())
                .withFuelType(vehicleResponse.getFuelType())
                .withFipeCode(vehicleResponse.getFipeCode())
                .withReferenceMonth(vehicleResponse.getReferenceMonth())
                .withFuelTypeAbbreviation(vehicleResponse.getFuelTypeAbbreviation())
                .build();
    }
}
