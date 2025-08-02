package Credit.Unit08Ex09;

public class AirConditioner extends HouseholdAppliance{
    public AirConditioner(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Кондиционер";
    }
}
