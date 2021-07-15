public class Printer implements IPrinter {
    private int paintVolume;
    private boolean status;

    @Override
    public void on() {
        System.out.println("Принтер включился! Осталок краски: " + paintVolume);
        status = true;
    }

    @Override
    public void off() {
        System.out.println("Принтер выключился");
        status = false;
    }

    @Override
    public void print(String text, Paper paper) {
        if (status)
            if (text.length() <=paintVolume) {
                System.out.println("На печать отправлен текст " + text);
                paintVolume -= text.length();
                soutBalance();
                System.out.println("Использовалась бумага: " + paper.getName() +", размер: " + paper.getSize());
            }
            else System.out.println("Не хватает краски в количестве: " + Math.abs(text.length()-paintVolume));
        else System.out.println("Принтер выключен и недоступен. Печать невозможна");

    }

    @Override
    public void charge(int volume) {
        paintVolume += volume;
        System.out.println("Принтер заправлен на " + volume + " символов");
        soutBalance();
    }

    public void soutBalance(){
        System.out.println("У принтера осталось краски:" + paintVolume);
    }
}
