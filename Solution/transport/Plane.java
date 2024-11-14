package transport;

public class Plane extends Transport implements IMovable, IRefuelable {
    private Engine engine;

    public Plane(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println("The plane is flying.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Plane with engine: " + engine.getHorsePower() + " HP, Fuel type: " + engine.getFuelType());
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the plane.");
    }
}
