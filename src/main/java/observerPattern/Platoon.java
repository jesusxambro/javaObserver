package observerPattern;

public class Platoon implements Observer {
    String platoonCallsign;

    public Platoon(String platoonCallsign) {
        this.platoonCallsign = platoonCallsign;
    };



    @Override
    public void update(Observer observer, String sitrep, int fuelOnHand) {
        if(observer.toString().equals(platoonCallsign)){
            System.out.println(platoonCallsign + " Confirmation of Receipt...");
        }else{
            System.out.println(platoonCallsign + " received "  + observer.toString() + " report: " + fuelOnHand + " gallons of fuel on hand!");
        };
    }

    @Override
    public String toString() {
        return platoonCallsign;
    };
}
