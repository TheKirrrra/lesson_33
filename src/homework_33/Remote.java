package homework_33;

public class Remote {

    private TV tv;

    public TV getTV() {
        return tv;
    }
    private Programm[] programms;

    public void setTV(TV tv) {
        this.tv = tv;
    }

    public void on(int number) {
        System.out.println("Включить канал номер " + number);
        Channel.randomProgramm(programms);
    }
}
