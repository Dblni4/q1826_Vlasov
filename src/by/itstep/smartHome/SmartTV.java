package by.itstep.smartHome;

public class SmartTV extends HomeDevice implements Switchable, Controllable, EnergyEfficient {

    public boolean isOne;//состояние
    public int volume;//громкость (0-100)
    public String currentChanel;//текущий канал

    @Override
    public void setPower(int power) {

    }

    @Override
    public int getPower() {
        return 0;
    }

    @Override
    public String getStatus() {
        if(volume<= 0) {
            return "Выключен";
        }else return "Работает, " + "текущий канал - " + currentChanel +  ", громкость - " +volume ;
    }

    @Override
    public double calculateEnergyConsumption() {
        return volume * 0.5 + 10;
    }

    @Override
    public String getEnergyClass() {
        if (volume <= 30) {
            return "A";}
        if (volume >= 30 && volume<=70) {
                return "B";
            }
         else return "C";

    }

    @Override
    String getDeviceInfo() {
        return "";
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public boolean isOn() {
        return false;
    }
}
