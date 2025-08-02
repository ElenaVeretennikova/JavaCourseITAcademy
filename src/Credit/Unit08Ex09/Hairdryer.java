package Credit.Unit08Ex09;

public class Hairdryer extends HouseholdAppliance{
    public Hairdryer(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Фен";
    }
}
