package homework_33;

import java.util.Random;

public class Channel {

    private final String[] programs;

    public Channel(String[] listOfProgramms) {
        this.programs = listOfProgramms;
    }

    public String getRandomProgram(int amountOf) {
        return programs[amountOf];
    }

}
