package com.cav.op;

import org.junit.jupiter.api.Test;

import com.cav.op.unitcoms.Platoon;
import com.cav.op.unitcoms.Troop;
import com.cav.op.unitcoms.UnitComs;

public class ObserverTest {
    @Test
    void testObserver() throws Exception {

        UnitComs companyUnitComs = new UnitComs("", 0);
        Platoon firstPlatoon = new Platoon("Deathdealer 6");
        Platoon secondPlatoon = new Platoon("Bulldog 6");
        Platoon thirdPlatoon = new Platoon("Comanche 6");

        Troop ableTroop = new Troop("AJAX");

        companyUnitComs.registerObserver(ableTroop);

        companyUnitComs.registerObserver(firstPlatoon);
        companyUnitComs.registerObserver(secondPlatoon);
        companyUnitComs.registerObserver(thirdPlatoon);

        companyUnitComs.setSitRep(thirdPlatoon,"AJAX 4 - WE ARE 120/300 ON CLIII",120);

        companyUnitComs.removerObserver(secondPlatoon);

        companyUnitComs.setSitRep(firstPlatoon,"AJAX 4 - WE ARE 70/240 ON CLIII",70);
        System.out.println("Resending the same Sitrep...");
        companyUnitComs.setSitRep(firstPlatoon,"AJAX 4 - WE ARE 70/240 ON CLIII",70);
    }

}
