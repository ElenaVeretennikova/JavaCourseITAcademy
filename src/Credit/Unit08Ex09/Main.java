package Credit.Unit08Ex09;

public class Main {
    public static void main(String[] args) {
        HouseholdApplianceProfile myFlat = createHouseholdApplianceProfile();
        myFlat.printSumPowerConsumption();
        myFlat.printSortedByPowerConsumption();
        myFlat.printKitchenApplianceByNoiseLevelRange(10, 50);
    }

    private static HouseholdApplianceProfile createHouseholdApplianceProfile() {
        HouseholdApplianceProfile myFlat = new HouseholdApplianceProfile();

        AirConditioner airConditioner = new AirConditioner
                (LocationEnum.LIVING_ROOM, true, 780, 40);
        myFlat.addHouseHoldAppliance(airConditioner);

        AirHumidifier airHumidifier = new AirHumidifier
                (LocationEnum.LIVING_ROOM, false, 28, 32);
        myFlat.addHouseHoldAppliance(airHumidifier);

        CoffeeMachine coffeeMachine = new CoffeeMachine
                (LocationEnum.KITCHEN, true, 1350, 60);
        myFlat.addHouseHoldAppliance(coffeeMachine);

        Dishwasher dishwasher = new Dishwasher
                (LocationEnum.KITCHEN, true, 740, 50);
        myFlat.addHouseHoldAppliance(dishwasher);

        Fridge fridge = new Fridge
                (LocationEnum.KITCHEN, true, 300, 35);
        myFlat.addHouseHoldAppliance(fridge);

        Hairdryer hairdryer = new Hairdryer(LocationEnum.BATHROOM, false, 1600, 70);
        myFlat.addHouseHoldAppliance(hairdryer);

        MicrowaveOven microwaveOven = new MicrowaveOven
                (LocationEnum.KITCHEN, false, 2900, 50);
        myFlat.addHouseHoldAppliance(microwaveOven);

        Stove stove = new Stove(LocationEnum.KITCHEN, true, 7400, 10);
        myFlat.addHouseHoldAppliance(stove);

        TV tv = new TV(LocationEnum.LIVING_ROOM, false, 100, 70);
        myFlat.addHouseHoldAppliance(tv);

        VacuumCleaner vacuumCleaner = new VacuumCleaner
                (LocationEnum.LIVING_ROOM, false, 1600, 80);
        myFlat.addHouseHoldAppliance(vacuumCleaner);

        WashingMachine washingMachine = new WashingMachine
                (LocationEnum.BATHROOM, true, 1100, 75);
        myFlat.addHouseHoldAppliance(washingMachine);
        return myFlat;
    }
}
