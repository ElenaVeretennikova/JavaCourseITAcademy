package Credit.Unit08Ex09;

import java.util.ArrayList;
import java.util.Comparator;

public class HouseholdApplianceProfile {
    private final ArrayList<HouseholdAppliance> householdApplianceArrayList = new ArrayList<>();

    public void addHouseHoldAppliance(HouseholdAppliance item) {
        householdApplianceArrayList.add(item);
    }

    public ArrayList<HouseholdAppliance> getHouseholdApplianceArrayList() {
        return this.householdApplianceArrayList;
    }

    public void printSumPowerConsumption() {
        int sumPowerConsumption = 0;
        for (HouseholdAppliance a : householdApplianceArrayList) {
            if (a.isTurnOn()) {
                sumPowerConsumption += a.getPowerConsumptionWatt();
            }
        }
        System.out.println("Cуммарная потребляемая мощность - " + sumPowerConsumption + " Вт");
    }

    public void printSortedByPowerConsumption() {
        householdApplianceArrayList.sort(Comparator.comparingInt(HouseholdAppliance::getPowerConsumptionWatt));
        System.out.println("Сортировка по потребляемой мощности: " + householdApplianceArrayList);
    }

    public void printKitchenApplianceByNoiseLevelRange(int minNoiseLevel, int maxNoiseLevel) {
        ArrayList<HouseholdAppliance> suitableAppliances = new ArrayList<>();
        for (HouseholdAppliance a : householdApplianceArrayList) {
            if ((a.getLocation()).equals(LocationEnum.KITCHEN)
                    && a.getNoiseLevelDB() >= minNoiseLevel
                    && a.getNoiseLevelDB() <= maxNoiseLevel) {
                suitableAppliances.add(a);
            }
        }
        System.out.println("Кухонные приборы, соответствующие заданному диапазону уровня шума: " + suitableAppliances);
    }
}
