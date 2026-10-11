package by.itstep.smartHome;

public class SmartTV extends HomeDevice implements Switchable, Controllable, EnergyEfficient {
    public SmartTV(String name, String manufacturer, int year) {
        super(name, manufacturer, year);
    }

    public boolean isOn;//состояние
    public int volume;//громкость (0-100)
    public String currentChanel;//текущий канал

    @Override
    public void setPower(int power) {
        if(power > 100 || power < 0)
            System.out.println("Недопустимая громкость, установите значение от 0 до 100");
        else
            volume = power;
    }

    @Override
    public int getPower() {
        return volume;
    }

    @Override
    public String getStatus() {
        if (!isOn) {
            return "Выключен";
        } else return "Работает, " + "текущий канал - " + currentChanel + ", громкость - " + volume;
    }

    @Override
    public double calculateEnergyConsumption() {
        return volume * 0.5 + 10;
    }

    @Override
    public String getEnergyClass() {
        if (volume <= 30) {
            return "A";
        }
        if (volume >= 30 && volume <= 70) {
            return "B";
        }
        else return "C";

    }

    @Override
    String getDeviceInfo() {
        return  "SmartTV - " +
                "Название канала - " + currentChanel +
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
