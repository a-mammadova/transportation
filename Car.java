public class Car extends Vehicle {
    public Car(String brand, int yearPurchased) {
        this.brand = brand;
        this.type = "Car";
        this.age = this.currYear - yearPurchased;
        this.gasConsumedPerHour = 10;
        this.maxGasAmountInTank = 200;
    }

    @Override
    public void refuel(int amountOfGas) {
        if (getGasRemained() + amountOfGas > 200) {
            gasRemained = 200;
        } else {
            gasRemained += amountOfGas;
        }
    }

    @Override
    public void run(int hour) {
        int gasNeeded = gasConsumedPerHour * hour;
        int gasUsed;

        if (getGasRemained() < gasNeeded) {
            gasUsed = gasRemained;
            gasRemained = 0;
        } else {
            gasUsed = gasNeeded;
            gasRemained -= gasUsed;
        }

        totalGasConsumed += gasUsed;
    }

}
