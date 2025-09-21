class CarEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting a car engine");
    }
}


class CarTire implements Tire {
    @Override
    public void roll() {
        System.out.println("Car tire is rolling");
    }
}

class BikeEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting a bike engine");
    }
}


class BikeTire implements Tire {
    @Override
    public void roll() {
        System.out.println("Bike tire is rolling 🚲");
    }
}