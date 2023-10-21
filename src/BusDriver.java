public class BusDriver {
    private String name;

    private Bus bus;

    public BusDriver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void goToBus(Bus bus) {
        this.free();
        this.bus = bus;
        bus.setBusDriver(this);
    }
        private void free() {

            if (bus != null) {
                System.out.println("Водитель " + name + " освобождает автобус " + bus.getNumber());
                this.bus.freeBusDriver();
            }
            this.bus = null;
        }
}
