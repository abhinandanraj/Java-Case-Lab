package transport.solid;

// Plane class implementing Transport and IFuelConsumable
public final class Plane extends Transport implements IFuelConsumable {
    public Plane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " flies in the sky.");
    }

    @Override
    public void refuel() {
        System.out.println(getName() + " is refueling at an airport.");
    }
}
