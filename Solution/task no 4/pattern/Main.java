package observer.pattern;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ObservableStringBuilder
        Ob osb = new Ob();

        // Add a listener that prints the current state
        osb.addChangeListener(newState -> System.out.println("State changed: " + newState));

        System.out.println("Initial state: " + osb);

        osb.append("Hello");
        osb.append(", World!");
        osb.delete(5, 7);
        osb.replace(0, 5, "Hi");
        osb.insert(2, " there");
        osb.reverse();

        System.out.println("Final state: " + osb);
    }
}
