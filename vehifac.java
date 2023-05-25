import java.util.Scanner;

class Vehicle {
    public void move() {
        System.out.println("Vehicle moves");
    }
}

class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("Helicopter flies in the air");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car drives on the road");
    }
}

class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("Train runs on the track");
    }
}

public class vehifac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of vehicle (helicopter/car/train):");
        String vehicleType = scanner.nextLine().toLowerCase();

        Vehicle vehicle;
        switch (vehicleType) {
            case "helicopter":
                vehicle = new Helicopter();
                break;
            case "car":
                vehicle = new Car();
                break;
            case "train":
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid vehicle type");
                return;
        }

        vehicle.move();
    }
}
