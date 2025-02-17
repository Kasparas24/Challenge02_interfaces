import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Commerce House", UsageType.BUSINESS));
        mappables.add(new Building("Starlight Arena", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Action Park", UsageType.SPORT));
        mappables.add(new Building("Harmony Villa", UsageType.PRIVATE));
        mappables.add(new UtilityLine("Lumina Fibre", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("SoftCurrent Pathway", UtilityType.LOW_VOLTAGE));
        mappables.add(new UtilityLine("PowerPulse Grid", UtilityType.HIGH_VOLTAGE));
        mappables.add(new Forest("Silver Birch Glade", TreeType.BIRCH));
        mappables.add(new Forest("Northwind Woods", TreeType.PINE));
        mappables.add(new Forest("Majestic Oakwood", TreeType.OAK));

        for(var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}