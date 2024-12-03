package transport.solid;

// Ship class implementing Transport and IFuelConsumable
public final class Ship extends Transport implements IFuelConsumable {
    public Ship(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " sails on water.");
    }

    @Override
    public void refuel() {
        System.out.println(getName() + " is refueling at a dock.");
    }
}
