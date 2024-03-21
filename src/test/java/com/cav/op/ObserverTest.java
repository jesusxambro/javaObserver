package com.cav.op;

import org.junit.jupiter.api.Test;

import com.cav.op.unitcoms.Platoon;
import com.cav.op.unitcoms.UnitComs;

public class ObserverTest {
    @Test
    void testObserver() throws Exception {

        UnitComs fourSevenCavComs = new UnitComs("4/7 CAV", 4000);
        Platoon firstPlatoon = new Platoon("Deathdealers 6");
        Platoon secondPlatoon = new Platoon("Bulldogs 6");
        Platoon thirdPlatoon = new Platoon("Comanches 6");

        fourSevenCavComs.registerObserver(firstPlatoon);
        fourSevenCavComs.registerObserver(secondPlatoon);
        fourSevenCavComs.registerObserver(thirdPlatoon);

        fourSevenCavComs.setSitRep(thirdPlatoon,"GARYOWEN 3 - WE ARE 120/300 ON CLIII",120);

        fourSevenCavComs.removerObserver(secondPlatoon);

        fourSevenCavComs.setSitRep(firstPlatoon,"GARYOWEN 3 - WE ARE 70/240 ON CLIII",70);
        System.out.println("Resending the same Sitrep...");
        fourSevenCavComs.setSitRep(firstPlatoon,"GARYOWEN 3 - WE ARE 70/240 ON CLIII",70);
    }

}
