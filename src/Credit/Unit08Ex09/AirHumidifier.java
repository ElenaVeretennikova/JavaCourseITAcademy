package Credit.Unit08Ex09;

public class AirHumidifier extends HouseholdAppliance{
    public AirHumidifier(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Увлажнитель воздуха";
    }
}
