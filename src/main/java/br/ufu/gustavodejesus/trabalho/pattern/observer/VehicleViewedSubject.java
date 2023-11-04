package br.ufu.gustavodejesus.trabalho.pattern.observer;


import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import java.util.ArrayList;
import java.util.List;

public class VehicleViewedSubject implements Subject {

    private List<Observer> observers;

    private IVehicle vehicle;

    public VehicleViewedSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(vehicle);
        }
    }

    @Override
    public void setVehicle(IVehicle vehicle) {
        this.vehicle = vehicle;
        notifyObservers();
    }
}
