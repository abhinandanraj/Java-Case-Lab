package transport.solid;

public class Main {
    public static void main(String[] args) {
        // Create Transport Manager
        TransportManager<Transport> manager = new TransportManager<>();

        // Add different transport types
        Car car = new Car("Tata Safari");
        Plane plane = new Plane("Air India");
        Ship ship = new Ship("INS Vikrant");
        Bicycle bicycle = new Bicycle("Mountain Bike");

        manager.addTransport(car);
        manager.addTransport(plane);
        manager.addTransport(ship);
        manager.addTransport(bicycle);

        // Show all transports
        System.out.println("List of transports:");
        manager.showAllTransports();

        // Move all transports
        System.out.println("\nMoving all transports:");
        manager.moveAll();

        // Specific refueling for fuel-consuming transports
        System.out.println("\nRefueling applicable transports:");
        car.refuel();
        plane.refuel();
        ship.refuel();
    }
}

