package com.cav.op.unitcoms.interfaces;

public interface UnitComsInterface {
    public void registerObserver( Observer observer);
    public void removerObserver( Observer observer);
    public void notifyObservers();
    public void setSitRep( Observer observer, String sitRep, int fuelOnHand);
}
