package br.ufu.gustavodejesus.trabalho.model.mapper;

import br.ufu.gustavodejesus.trabalho.client.response.FipeVehicleResponse;
import br.ufu.gustavodejesus.trabalho.model.FipeVehicle;

public interface IVehicleMapper {
    FipeVehicle fromResponse(FipeVehicleResponse vehicleResponse);

}
