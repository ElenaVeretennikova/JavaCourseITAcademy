package Credit.Unit08Ex09;

public abstract class HouseholdAppliance {
    private LocationEnum location;
    private boolean turnOn;
    private final int powerConsumptionWatt;
    private final int noiseLevelDB;

    public HouseholdAppliance(LocationEnum location, boolean turnOn, int powerConsumptionWatt, int noiseLevelDB) {
        this.location = location;
        this.turnOn = turnOn;
        this.powerConsumptionWatt = powerConsumptionWatt;
        this.noiseLevelDB = noiseLevelDB;
    }
    protected abstract String getName();

    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public int getPowerConsumptionWatt() {
        return powerConsumptionWatt;
    }

    public int getNoiseLevelDB() {
        return noiseLevelDB;
    }
    @Override
    public String toString() {
        return getName();
    }
}
