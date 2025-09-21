public class VehicleFactory {
    public static Vehicle createVehicles(String type) {
        switch (type) {
            case "car":

                return new Car();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}

interface VehicleFactorySecond {
    Engine createEngine();

    Tire createTire();
}

class CarFactory implements VehicleFactorySecond {
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public Tire createTire() {
        return new CarTire();
    }
}

class BikeFactory implements VehicleFactorySecond {
    @Override
    public Engine createEngine() {
        return new BikeEngine();
    }

    @Override
    public Tire createTire() {
        return new BikeTire();
    }
}