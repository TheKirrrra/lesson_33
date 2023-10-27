package homework_33;



public class MainTV {
    public static void main(String[] args) {

        Remote remote = new Remote();

        Channel[] channelList = new Channel[6];

        String[] programList ={"Film1","Serial1","Show1","News1","Music1"};
        channelList[1]=new Channel(programList);

        programList = new String[]{"Film2", "Serial2", "Show2", "News2", "Music2"};
        channelList[2]=new Channel(programList);

        programList = new String[]{"Film3", "Serial3", "Show3", "News3", "Music3"};
        channelList[3]=new Channel(programList);

        programList = new String[]{"Film4", "Serial4", "Show4", "News4", "Music4"};
        channelList[4]=new Channel(programList);

        programList = new String[]{"Film5", "Serial5", "Show5", "News5", "Music5"};
        channelList[5]=new Channel(programList);




        while(true)
        {
            int channelNumber = remote.inputChannel();

            if (channelNumber == 0) {
                break;
            }

            if (channelNumber >5 ){
                System.out.println("No Channel");
                continue;
            }

            int programmNumber = remote.ON(channelNumber);


            System.out.println( "Channel No: " + channelNumber +
                    "\nProgram Name: " + channelList[channelNumber].getRandomProgram(programmNumber));


        }



    }
}
