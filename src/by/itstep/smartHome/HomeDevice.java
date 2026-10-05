package by.itstep.smartHome;

public abstract class HomeDevice {

     public String name; //название устройства
     public String manufacturer; // производитель
     public int year;//год выпуска

    public HomeDevice(String name, String manufacturer, int year) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    protected HomeDevice() {
    }

    abstract String getDeviceInfo(); //возвращает информацию об устройстве
}
