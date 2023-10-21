package homework_33;



public class MainTV {
    public static void main(String[] args) {
        TV tv = new TV ("Samsung");
        Remote remote = new Remote();


        Programm programm1 = new Programm("Пока все дома");
        Programm programm2 = new Programm("КВН");
        Programm programm3 = new Programm("Окна");
        Programm programm4 = new Programm("Сериал Бригада");
        Programm programm5 = new Programm("Кино ГП и ФК");
        Programm programm6 = new Programm("Новости");

        Channel channel1 = new Channel("MTV", 1);
        Channel channel2 = new Channel("1+1", 2);
        Channel channel3 = new Channel("ТНТ", 3);
        Channel channel4 = new Channel("СТС", 4);
        Channel channel5 = new Channel("Ютуб", 5);



        tv.addChannel(channel1);
        tv.addChannel(channel2);
        tv.addChannel(channel3);
        tv.addChannel(channel4);
        tv.addChannel(channel5);




        tv.print();



    }
}
