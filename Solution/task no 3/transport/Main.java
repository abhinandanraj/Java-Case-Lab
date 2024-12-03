package transport;

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine(150, FuelType.GASOLINE);
        Car car = new Car(carEngine);
        car.move();
        car.displayInfo();
        car.refuel();

        Engine planeEngine = new Engine(1000, FuelType.DIESEL);
        Plane plane = new Plane(planeEngine);
        plane.move();
        plane.displayInfo();
        plane.refuel();

        Engine shipEngine = new Engine(500, FuelType.DIESEL);
        Ship ship = new Ship(shipEngine);
        ship.move();
        ship.displayInfo();
        ship.refuel();

        Bicycle bicycle = new Bicycle();
        bicycle.move();
        bicycle.displayInfo();
    }
}
