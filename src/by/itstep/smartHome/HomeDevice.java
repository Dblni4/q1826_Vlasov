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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    abstract String getDeviceInfo(); //возвращает информацию об устройстве
}
