package homework_33;

import java.util.Random;

public class Channel {

    private int id;

    private String name;

    private int count;

    private Programm[] programms;

    public Channel(String name, int id) {
        this.name = name;
        this.id = id;
        this.programms = new Programm[6];
    }

    public Programm[] addProgramms(Programm programm) {
        for (int i = 0; i < programms.length; i++) {
        if (count < programms.length) {
            programms[count] = programm;
            count++;
        } else {
            System.err.println("Не могу добавить ещё передачи.");
            }
        }
        return programms;
    }

    public static void randomProgramm(Programm[] programms) {
        Random random = new Random();
        int rnd = random.nextInt(programms.length);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
