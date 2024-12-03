package transport.solid;

public abstract class Transport implements IMovable {
    private String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
