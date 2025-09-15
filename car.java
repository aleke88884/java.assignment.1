public class Car {
    private String model;
    private final String made;
    private final double weight;
    private final int doors;

    private Car(Builder builder) {
        this.model = builder.model;
        this.made = builder.made;
        this.weight = builder.weight;
        this.doors = builder.doors;
    }

    public String getModel() {
        return model;
    }

    public String getMade() {
        return made;
    }

    public double getWeight() {
        return weight;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Model: " + model +
                ";\nMade: " + made +
                ";\nWeight: " + weight +
                ";\nDoors: " + doors + ";";
    }

    public static class Builder {
        private String model;
        private String made;
        private double weight;
        private int doors;

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder maded(String made) {
            this.made = made;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}