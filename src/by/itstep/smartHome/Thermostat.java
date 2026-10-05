package by.itstep.smartHome;

public class Thermostat extends HomeDevice implements Switchable, Controllable{

    public boolean isOne;//состояние
    public int temperature;//текущая температура
    public int targetTemperature;//целевая температура

    @Override
    public void setPower(int power) {

    }

    @Override
    public int getPower() {
         int difference = temperature - targetTemperature;
         return difference;
    }

    @Override
    public String getStatus() {
         if(temperature<= 0) {
             return "Выключен";
         }else return "Работает, "+ "текущая температура - " + temperature +", "
                 + "целевая температура - " + targetTemperature;

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
