package Credit.Unit08Ex09;

public class Stove extends HouseholdAppliance{
    public Stove(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Плита";
    }
}
