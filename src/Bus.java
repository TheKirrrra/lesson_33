public class Bus {

    private final String number;

    private Passenger[] passengers;
    private int count; // по умолчанию 0,

    private boolean isGo;

    public Bus(String number) {
        this.number = number;
        this.passengers = new Passenger[5];
    }



    private BusDriver busDriver;

    public void setBusDriver(BusDriver busDriver) {
        this.stop();
        if (busDriver == null) {
            System.err.println("Вы пытаетесь, вложить в водителя null");
        } else if ( this.busDriver == busDriver){
            System.err.println("Вы пытаетесь положить того же водителя");
        } else if (this.busDriver != null) {
            System.err.println("А водитель уже есть! Освободите его сначала!");
        }  else {
            System.out.println("Водитель " + busDriver.getName() + " в автобусе " + number);
            this.busDriver = busDriver;
        }
    }

    public void freeBusDriver() {
        this.stop();
        System.out.println("Водитель " + busDriver.getName() + " освобожден из автобуса " + number);
        this.busDriver = null;
    }

    public void addPassenger(Passenger passenger) {
        this.stop();
        if (count < passengers.length) {
            passengers[count] = passenger;
            count++;
        } else {
            System.err.println("Автобус заполнен");
        }
    }

    public String getNumber() {
        return number;
    }

    public void go() {
        if (busDriver != null) {
            this.isGo = true;
            System.out.println("Автобус " + number + " поехал под управлением " + busDriver.getName());

            System.out.println("Пассажиры автобуса:");
            for (int i = 0; i < count; i++) {
                System.err.println(passengers[i].getName());
            }
        }


    }

    public void stop() {
        System.out.println("Автобус " + number + " был остановлен/ или уже стоит");
        this.isGo = false;
    }
}
