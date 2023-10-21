package homework_33;
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
При вызове этого метода, канал с нужным номером показывает случайную передачу
 */
public class TV {

    private final String model;

    private Channel[] channels;

    private int count;

    private boolean isOn;

    public TV(String model) {
        this.model = model;
        this.channels = new Channel[5];
    }

    public void addChannel(Channel channel) {
        if (count < channels.length) {
            channels[count] = channel;
            count++;
        } else {
            System.err.println("Не могу добавить ещё каналы.");
        }
    }

    public void turnON(){
        if (!this.isOn) {
            System.out.println("Включаю телевизор");
            this.isOn = true;
        } else {
            System.err.println("Телевизор уже включен");
        }
    }
    public void turnOFF(){
        if (this.isOn) {
            System.out.println("Выключаю телевизор");
            isOn = false;
        } else {
            System.err.println("Телевизор уже выключен");
        }
    }

    public void print() {
        System.out.println("Каналы:");
        for (int i = 0; i < count; i++) {
            System.out.println(channels[i].getId() + ". " +  channels[i].getName());
        }
    }
}
