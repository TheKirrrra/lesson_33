package homework_33;

import java.util.Random;
import java.util.Scanner;

public class Remote {

    Random random = new Random();

    private Scanner scanner = new Scanner(System.in);
    public int ON(int rnd){
        rnd = random.nextInt(5);
        return rnd;
    }

    public int inputChannel() {
        System.out.println("Доступны каналы - 1-5\nПрекратить работу - 0");
        return scanner.nextInt();
    }
}
