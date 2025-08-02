package Credit.Unit08Ex09;

public class WashingMachine extends HouseholdAppliance{
    public WashingMachine(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Стиральная машина";
    }
}
