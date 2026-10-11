package by.itstep.smartHome;

import javax.swing.*;

public class Thermostat extends HomeDevice implements Switchable, Controllable {
    public Thermostat(String name, String manufacturer, int year) {
        super(name, manufacturer, year);
    }

    public boolean isOn;//состояние
    public int temperature;//текущая температура
    public int targetTemperature;//целевая температура

    @Override
    public void setPower(int power) {
        if(power > 100 || power < 0)
            System.out.println("Недопустимая целевая температура, установите значение от 0 до 100");
        else
            targetTemperature = power;
    }

    @Override
    public int getPower() {
        int power = Math.abs(temperature - targetTemperature);
        if(power > 100){
            return 100;
        }
        else return power;
    }

    @Override
    public String getStatus() {
        if (!isOn) {
            return "Выключен";

        } else return "Работает, текущая температура  " + temperature + "°C"
                + ", целевая температура  " + targetTemperature + "°C";
    }



    @Override
    String getDeviceInfo() {
        return  "Thermostat  = " +
                "Название: " + getName() +
                ". Производитель: " + getManufacturer() +
                ". Год: '" + getYear() + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        this.isOn = true;

    }

    @Override
    public void turnOff() {
        this.isOn = false;

    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
