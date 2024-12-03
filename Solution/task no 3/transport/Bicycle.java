package transport;

public class Bicycle extends Transport implements IMovable {
    @Override
    public void move() {
        System.out.println("The bicycle is being pedaled.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Bicycle - No engine, no fuel required.");
    }
}
