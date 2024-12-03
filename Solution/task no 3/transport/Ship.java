package transport;

public class Ship extends Transport implements IMovable, IRefuelable {
    private Engine engine;

    public Ship(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println("The ship is sailing.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Ship with engine: " + engine.getHorsePower() + " HP, Fuel type: " + engine.getFuelType());
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the ship.");
    }
}
