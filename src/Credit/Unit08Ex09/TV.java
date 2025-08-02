package Credit.Unit08Ex09;

public class TV extends HouseholdAppliance{
    public TV(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Телевизор";
    }
}
