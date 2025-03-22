package FinalTest;

import java.util.*;

public class Processer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleList list = new VehicleList();

        while (true) {
            System.out.println("0. Exit"
                    + "\n1. Add a new car"
                    + "\n2. Add a new truck"
                    + "\n3. Update vehicle by ID"
                    + "\n4. Delete vehicle by ID"
                    + "\n5. Find vehicle by ID"
                    + "\n6. Display all vehicles"
                    + "\n7. Find cars by number of seats"
                    + "\n8. Find the truck with the longest distance"
                    + "\n9. Find electric cars"
                    + "\nChoose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
//                    System.out.println("Enter car ID: ");
//                    String id = sc.nextLine();
//                    System.out.println("Enter brand: ");
//                    String carBrand = sc.nextLine();
//                    System.out.println("Enter model: ");
//                    String carModel = sc.nextLine();
//                    list.addVehicle(new Car(carId, carBrand, carModel, 0, 0, 0, ""));
//                    break;
                case 2:
//                    System.out.println("Enter car ID: ");
//                    String truckId = sc.nextLine();
//                    System.out.println("Enter brand: ");
//                    String truckBrand = sc.nextLine();
//                    System.out.println("Enter model: ");
//                    String truckModel = sc.nextLine();
//                    list.addVehicle(new Truck(truckId, truckBrand, truckModel, 0, 0, 0, 0));
//                    break;
                case 3:
                    System.out.println("Enter vehicle ID to update: ");
                    String updateId = sc.nextLine();
                    list.updateVehicleById(updateId);
                    break;
                case 4:
                    System.out.println("Enter vehicle ID to delete: ");
                    String deleteId = sc.nextLine();
                    list.updateVehicleById(deleteId);
                    break;
                case 5:
                    System.out.println("Enter vehicle ID to find: ");
                    String findId = sc.nextLine();
                    Vehicle find = list.findVehicleById(findId);
                    if (find != null) {
                        find.displayDetails();
                    }
                    break;
                case 6:
                    list.displayAllVehicles();
                    break;
                case 7:
                    System.out.print("Enter number of seats: ");
                    int seats = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Car> cars = list.findCarBySeats(seats);
                    for (Car car : cars) {
                        car.displayDetails();
                    }
                    break;
                case 8:
                    Truck longestTruck = list.findTruckWithLongestDistance();
                    if (longestTruck != null) {
                        longestTruck.displayDetails();
                    }
                    break;
                case 9:
                    ArrayList<Car> electricCars = list.findElectricCars();
                    for (Car car : electricCars) {
                        car.displayDetails();
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
