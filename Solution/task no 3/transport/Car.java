package transport;

public class Car extends Transport implements IMovable, IRefuelable {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println("The car is moving.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Car with engine: " + engine.getHorsePower() + " HP, Fuel type: " + engine.getFuelType());
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the car.");
    }
}
