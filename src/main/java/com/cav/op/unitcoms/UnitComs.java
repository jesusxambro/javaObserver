package com.cav.op.unitcoms;

import java.util.ArrayList;


public class UnitComs implements UnitComsInterface {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String sitrep;
    private int fuelOnHand;
    private Observer observer;

    public UnitComs(String sitrep, int fuelOnHand) {
        this.sitrep = sitrep;
        this.fuelOnHand = fuelOnHand;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("-----------------\""+observer +"\" has fallen off the net----------------");
    }

    @Override
    public void notifyObservers() {
        System.out.println("-----------------New Fuel Sitrep in----------------");
        observers.forEach(observer -> observer.update(this.observer, this.sitrep, this.fuelOnHand));
    }

    @Override
    public void setSitRep(Observer observer, String newSitRep, int newFuelOnHand) {
        if(fuelOnHand != newFuelOnHand && newSitRep != this.sitrep){
            this.fuelOnHand = newFuelOnHand;
            this.sitrep = newSitRep;
            this.observer = observer;
            notifyObservers();
        }else{
            System.out.println("Sitrep already received...");
        }
    }

}
