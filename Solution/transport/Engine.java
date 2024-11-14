package transport;

public final class Engine {
    private int horsePower;
    private FuelType fuelType;

    public Engine(int horsePower, FuelType fuelType) {
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
