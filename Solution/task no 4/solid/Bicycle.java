package transport.solid;

// Bicycle class implementing Transport
public final class Bicycle extends Transport {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is pedaled on roads.");
    }
}

