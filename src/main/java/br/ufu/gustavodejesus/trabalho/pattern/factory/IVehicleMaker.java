package br.ufu.gustavodejesus.trabalho.pattern.factory;

import br.ufu.gustavodejesus.trabalho.model.FipeVehicle;

public interface IVehicleMaker {
    public IVehicle makeVehicle(FipeVehicle vehicle);
}
