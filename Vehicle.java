public class Vehicle {
    protected int currYear;
    protected int age;
    protected int gasRemained;
    protected int gasConsumedPerHour;
    protected int totalGasConsumed;
    protected int maxGasAmountInTank;
    protected String type;
    protected String brand;

    public Vehicle() {
        this.currYear = 2020;
        this.totalGasConsumed = 0;
        this.gasRemained = 0;
    }

    public int getAge() {
        return this.age;
    }

    public int getGasRemained() {
        return this.gasRemained;
    }

    public int getTotalGasConsumed() {
        return this.totalGasConsumed;
    }

    public void refuel(int amountOfGas) {}

    public void run(int hours) {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle other = (Vehicle) o;
        if (brand == null ? other.brand != null : !brand.equals(other.brand)) return false;
        return type == null ? other.type == null : type.equals(other.type);
    }

    @Override
    public String toString() {
        return type + " " + brand;
    }
}
