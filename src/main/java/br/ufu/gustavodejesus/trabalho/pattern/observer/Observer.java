package br.ufu.gustavodejesus.trabalho.pattern.observer;

import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;

public interface Observer {
    public void update(IVehicle vehicle);
}
