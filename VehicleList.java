package FinalTest;

import java.util.*;

public class VehicleList {

    ArrayList<Vehicle> vehicle2 = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicle2.add(v);
    }

    public boolean updateVehicleById(String id) {
        for (Vehicle v : vehicle2) {
            if (v.id.equals(id)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter brand: ");
                v.brand = sc.nextLine();
                System.out.println("Enter model: ");
                v.model = sc.nextLine();
                return true;
            }
        }
        return false;
    }

    public boolean deleteVehicleById(String id) {
        return vehicle2.removeIf(v -> v.id.equals(id));
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle v : vehicle2) {
            if (v.id.equals(id)) {
                return v;
            }
        }
        return null;
    }

    public void displayAllVehicles() {
        for (Vehicle v : vehicle2) {
            v.displayDetails();
            System.out.println("------");
        }
    }

    public ArrayList<Car> findCarBySeats(int seats) {
        ArrayList<Car> cars = new ArrayList<>();
        for (Vehicle v : vehicle2) {
            if (v instanceof Car car && car.getNumberOfSeats() == seats) {
                cars.add(car);
            }
        }
        return cars;
    }

    public Truck findTruckWithLongestDistance() {
        Truck longestTruck = null;
        for (Vehicle v : vehicle2) {
            if (v instanceof Truck truck) {
                if (longestTruck == null || truck.distance > longestTruck.distance) {
                    longestTruck = truck;
                }
            }
        }
        return longestTruck;
    }

    public ArrayList<Car> findElectricCars() {
        ArrayList<Car> electricCars = new ArrayList<>();
        for (Vehicle v : vehicle2) {
            if (v instanceof Car car && car.getFuelType().equalsIgnoreCase("electric")) {
                electricCars.add(car);
            }
        }
        return electricCars;
    }
}
