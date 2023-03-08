package CreationalDP.BuilderDesignP;

public class Phone {
    /*
     * 1.We can make a Phone with following features.to make its object we have to
     * call the constructor
     * 2.Sometimes there are many attributes which make us hard to write all of them
     * inside the constructor
     * 3.also while writing them in constructor we need to check when all of them
     * are in serial order or not
     * 4.to avoid all this complexity we use BUILDER DESIGN PATTERN
     * 5.in which we make the object of the same class by introducing a builder
     * class(u can call it a helper class or anything) which takes all the
     * attributes of the main class(phone class in this example)
     * and allow as to give any number of attributes in any order.
     * 6.we also have a build method in the builder class which at the end build the
     * object and return the refernce of the main class thats it :)
     * example- Phone p = new Phone.Builder().setModel("Nokia").getPhone();
     * 7.overide toString() method just to see the output (optional);
     */
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

    @Override
    public String toString() {
        System.out.println("ModelName-> " + this.model);
        System.out.println("BatteryCapacity-> " + this.battery + " mah");
        System.out.println("Ram-> " + this.ram + " gb");
        return super.toString();
    }
}
