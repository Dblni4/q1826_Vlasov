package by.itstep.smartHome;

import org.w3c.dom.ls.LSOutput;

public class LightBulb extends HomeDevice implements Switchable, Controllable, EnergyEfficient {
    public LightBulb(String name, String manufacturer, int year) {
        super(name, manufacturer, year);
    }

    public boolean isOn; //состояние
    public int brightness;//яркость (0-100)
    public String color;//цвет света

    @Override
    String getDeviceInfo() {
        return "";
    }


    @Override
    public void setPower(int power) {

    }

    @Override
    public int getPower() {
        return 0;
    }

    @Override
    public String getStatus() {
        if (brightness <= 0) {
            return "Выключена";
        }else return "Включена, " + "яркость - " + brightness+"%," + "цвет света - " + color;

    }

    @Override
    public double calculateEnergyConsumption() {
        return brightness * 0.1;
    }

    @Override
    public String getEnergyClass() {
        if (brightness <= 50) {
            return "A";
        } else return "B";
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
