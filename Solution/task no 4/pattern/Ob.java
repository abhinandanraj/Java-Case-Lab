package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Ob {
    private final StringBuilder stringBuilder; // Delegate for StringBuilder
    private final List<ChangeListener> listeners; // List of observers

    public Ob() {
        this.stringBuilder = new StringBuilder();
        this.listeners = new ArrayList<>();
    }

    public interface ChangeListener {
        void onChange(String newState);
    }

    public void addChangeListener(ChangeListener listener) {
        listeners.add(listener);
    }

    private void notifyListeners() {
        String currentState = stringBuilder.toString();
        for (ChangeListener listener : listeners) {
            listener.onChange(currentState);
        }
    }

    public Ob append(String str) {
        stringBuilder.append(str);
        notifyListeners();
        return this;
    }

    public Ob delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyListeners();
        return this;
    }

    public Ob replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyListeners();
        return this;
    }

    public Ob insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        notifyListeners();
        return this;
    }

    public Ob reverse() {
        stringBuilder.reverse();
        notifyListeners();
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
