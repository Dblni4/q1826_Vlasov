package by.itstep.smartHome;


import java.util.List;

public class LightBulb extends HomeDevice implements Switchable, Controllable, EnergyEfficient {
    public LightBulb(String name, String manufacturer, int year) {
        super(name, manufacturer, year);
    }

    public boolean isOn; //состояние
    public int brightness;//яркость (0-100)
    public String color;//цвет света



    @Override
    String getDeviceInfo() {
        return  "LightBulb: " +
                "Название - " + getName() +
                ". Производитель - " + getManufacturer() +
                ". Год: '" + getYear() + '\'' +
                '}';
    }


    @Override
    public void setPower(int power) {
        if(power > 100 || power < 0)
            System.out.println("Недопустимая яркость, установите значение от 0 до 100");
        else
            brightness = power;
    }


    @Override
    public int getPower() {
        return brightness;
    }

    @Override
    public String getStatus() {
        if (isOn) {
            return "Включена, яркость - " + brightness + "%, цвет света - " + color;
        } else {
            return "Выключена";
        }
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
