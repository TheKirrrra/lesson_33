
public class Main {
    public static void main(String[] args) {
            Bus bus = new Bus("22A");
            Bus bus2 = new Bus("1");
            BusDriver busDriver = new BusDriver("Marsel");

        busDriver.goToBus(bus);
        busDriver.goToBus(bus2);

        Passenger p1 = new Passenger("Aysel");
        Passenger p2 = new Passenger("Mykhailo");
        Passenger p3 = new Passenger("Maxim");
        Passenger p4 = new Passenger("Mihail");
        Passenger p5 = new Passenger("Delayed");

        bus.addPassenger(p1);
        bus.addPassenger(p2);
        bus.addPassenger(p3);
        bus.addPassenger(p4);

        busDriver.goToBus(bus);

        bus.go();
        bus.addPassenger(p5);

        }
    }


    /*
    Смоделировать предметную область "Телевизор"

Классы:
    - Телевизор
    - Канал
    - Передача
    - Пульт

В телевизоре есть множество каналов.
У каждого канала есть множество передач
У каждого канала есть номер

Сделать пульт, который имеет ссылку на телевизор.
У пульта должен быть метод on(номер канала)
При вызоове этого метода, канал с нужным номером показывает случайную передачу
     */