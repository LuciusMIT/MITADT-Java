abstract class Appliance {
    int powerConsumption; // in watts
    String brand;

    public Appliance(int powerConsumption, String brand) {
        this.powerConsumption = powerConsumption;
        this.brand = brand;
    }

    abstract double calculateEnergyUsage(); // energy usage in kilowatt-hours (kWh)
}

class WashingMachine extends Appliance {
    int usageHoursPerDay; // number of hours used per day

    public WashingMachine(int powerConsumption, String brand, int usageHoursPerDay) {
        super(powerConsumption, brand);
        this.usageHoursPerDay = usageHoursPerDay;
    }

    @Override
    double calculateEnergyUsage() {
        return (powerConsumption / 1000.0) * usageHoursPerDay; // kWh per day
    }
}

class Refrigerator extends Appliance {
    int usageHoursPerDay = 24; // refrigerator runs 24 hours a day

    public Refrigerator(int powerConsumption, String brand) {
        super(powerConsumption, brand);
    }

    @Override
    double calculateEnergyUsage() {
        return (powerConsumption / 1000.0) * usageHoursPerDay; // kWh per day
    }
}

class Microwave extends Appliance {
    int usageMinutesPerDay; // number of minutes used per day

    public Microwave(int powerConsumption, String brand, int usageMinutesPerDay) {
        super(powerConsumption, brand);
        this.usageMinutesPerDay = usageMinutesPerDay;
    }

    @Override
    double calculateEnergyUsage() {
        return (powerConsumption / 1000.0) * (usageMinutesPerDay / 60.0); // kWh per day
    }
}

class Main {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine(500, "LG", 1);
        Appliance refrigerator = new Refrigerator(150, "Samsung");
        Appliance microwave = new Microwave(1000, "Panasonic", 30);

        System.out.println("Washing Machine energy usage: " + washingMachine.calculateEnergyUsage() + " kWh/day");
        System.out.println("Refrigerator energy usage: " + refrigerator.calculateEnergyUsage() + " kWh/day");
        System.out.println("Microwave energy usage: " + microwave.calculateEnergyUsage() + " kWh/day");
    }
}
