package br.ufu.gustavodejesus.trabalho.pattern.observer;

import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;

public interface Subject {
    public void addObservers(Observer observer);

    public void removeObservers(Observer observer);

    public void notifyObservers();

    public void setVehicle(IVehicle vehicle);
}
