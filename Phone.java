public class Phone {
    private String model;
    private int battery;
    private int ram;

    private Phone(Builder b) {
        this.model = b.model;
        this.battery = b.battery;
        this.ram = b.ram;
    }

    public static class Builder {
        private String model;
        private int battery;
        private int ram;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Phone getPhone() {
            return new Phone(this);
        }

    }
}
