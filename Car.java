package FinalTest;

public class Car extends Vehicle {

    private int numberOfSeats;
    private String fuelType;

    public Car() {
    }

    public Car(int numberOfSeats, String fuelType, String id, String brand, String model, int retalDays, double retalPricePerDay) {
        super(id, brand, model, retalDays, retalPricePerDay);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public double calculateRentalCost() {
        double cost = retalPricePerDay * retalDays;
        if (fuelType.equalsIgnoreCase("electric")) {
            cost *= 0.9;
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats + ", Fuel type: " + fuelType);
    }
}
