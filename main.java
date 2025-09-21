class Main {
    public static void main(String[] args) {
        // Car car = new Car.Builder()
        // .model("Mercedes")
        // .maded("Germany")
        // .weight(1.140)
        // .doors(4)
        // .build();
        // System.out.println(car.getModel());
        // System.out.println(car.toString());

        // ===========================================================
        Vehicle car = VehicleFactory.createVehicles("car");
        car.drive();
        Vehicle truck = VehicleFactory.createVehicles("truck");
        truck.drive();

        // ==========================================================
        VehicleFactorySecond factory = new CarFactory(); // or new BikeFactory()

        Engine engine = factory.createEngine();
        Tire tire = factory.createTire();

        engine.start();
        tire.roll();
    }
}