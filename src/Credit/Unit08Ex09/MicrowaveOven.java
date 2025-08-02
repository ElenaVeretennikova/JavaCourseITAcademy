package Credit.Unit08Ex09;

public class MicrowaveOven extends HouseholdAppliance{
    public MicrowaveOven(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Микроволновая печь";
    }
}
