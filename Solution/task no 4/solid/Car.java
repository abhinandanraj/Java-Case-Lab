package transport.solid;

public final class Car extends Transport implements IFuelConsumable {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " drives on roads.");
    }

    @Override
    public void refuel() {
        System.out.println(getName() + " is refueling at a gas station.");
    }
}
