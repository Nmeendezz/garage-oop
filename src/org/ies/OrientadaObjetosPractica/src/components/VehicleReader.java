package components;

import model.Vehicle;
import model.VehicleType;

import java.util.Scanner;

public class VehicleReader {

    private final Scanner scanner;

    public VehicleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicle read(){
        System.out.println("Introduce los datos del vehiculo");
        int option;
        do {
            System.out.println("Elige el tipo de vehiculo");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Camion");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option != 1 && option != 2 && option != 3);

        VehicleType vehicleType;
        if (option == 1){
            vehicleType = VehicleType.car;
        } else if (option == 2){
            vehicleType = VehicleType.motorbike;
        } else {
            vehicleType = VehicleType.truck;
        }

        System.out.println("Introduce la velocidad maxima");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el color");
        String color = scanner.nextLine();

        System.out.println("Introduce la matricula");
        String plate = scanner.nextLine();

        return new Vehicle(
                vehicleType,
                maxSpeed,
                color,
                plate
        );
    }
}
