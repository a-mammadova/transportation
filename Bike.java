public class Bike extends Vehicle {
    public Bike(String brand, int yearPurchased) {
        this.brand = brand;
        this.type = "Bike";
        this.age = this.currYear - yearPurchased;
        this.gasConsumedPerHour = 0;
    }

    @Override
    public void refuel(int amountOfGas) {
        System.out.println("You don't need to refuel a bike.");
    }

    @Override
    public void run(int hour) {
        System.out.println("Eco-friendly travel by bicycle!");
    }
}
