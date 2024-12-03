package transport.solid;

import java.util.ArrayList;
import java.util.List;

// Generic Transport Manager
public class TransportManager<T extends Transport> {
    private List<T> transports = new ArrayList<>();

    public void addTransport(T transport) {
        transports.add(transport);
    }

    public void showAllTransports() {
        for (T transport : transports) {
            System.out.println(transport.getName());
        }
    }

    public void moveAll() {
        for (T transport : transports) {
            transport.move();
        }
    }
}
