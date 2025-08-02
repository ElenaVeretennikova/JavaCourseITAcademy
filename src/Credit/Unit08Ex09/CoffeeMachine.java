package Credit.Unit08Ex09;

public class CoffeeMachine extends HouseholdAppliance {
    public CoffeeMachine(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        super(location, turnOn, powerConsumptionWatt, noiseLevelDB);
    }

    @Override
    protected String getName() {
        return "Кофемашина";
    }

}
