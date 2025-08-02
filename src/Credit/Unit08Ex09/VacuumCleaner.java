package Credit.Unit08Ex09;

public class VacuumCleaner extends HouseholdAppliance{
    public VacuumCleaner(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Пылесос";
    }
}
