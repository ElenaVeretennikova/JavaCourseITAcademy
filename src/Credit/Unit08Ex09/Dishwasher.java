package Credit.Unit08Ex09;

public class Dishwasher extends HouseholdAppliance {
    public Dishwasher(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);

    }

    @Override
    protected String getName() {
        return "Посудомойка";
    }
}
