package com.cav.op.unitcoms;

public class Troop implements Observer {

    private String troopCallsign;

    public Troop(String troopCallsign) {
        this.troopCallsign = troopCallsign;
    };

    @Override
    public void update(Observer observer, String sitrep, int fuelOnHand) {
        System.out.println(troopCallsign + " 4 received: "
        +observer.toString() 
        + "\nSitrep: " + sitrep
        + " Fuel On Hand: " + fuelOnHand +"\n");
    };

};
