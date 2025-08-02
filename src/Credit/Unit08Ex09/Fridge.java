package Credit.Unit08Ex09;

public class Fridge extends HouseholdAppliance {
    public Fridge(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Холодильник";
    }
}
