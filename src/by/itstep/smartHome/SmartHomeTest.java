package by.itstep.smartHome;


import com.sun.source.tree.UsesTree;

public class SmartHomeTest {

    public static void main(String[] args) {

        Thermostat term1 = new Thermostat("Living room thermostat", "Bosch", 2024);
        Thermostat term2 = new Thermostat("Bedroom thermostat", "Xiaomi", 2023);
        Thermostat term3 = new Thermostat("Kitchen thermostat", "Samsung", 2022);

        LightBulb liBul1 = new LightBulb("Kitchen lamp", "Philips", 2024);
        LightBulb liBul2 = new LightBulb("Bedroom lamp", "Xiaomi", 2023);
        LightBulb liBul3 = new LightBulb("Hall lamp", "IKEA", 2022);

        SmartTV tv1 = new SmartTV("Living room TV", "Samsung", 2024);
        SmartTV tv2 = new SmartTV("Bedroom TV", "LG", 2023);
        SmartTV tv3 = new SmartTV("Kitchen TV", "Sony", 2022);

        HomeDevice[] homeDevices = {
                term1, term2, term3,
                liBul1, liBul2, liBul3,
                tv1, tv2, tv3
        };
        Controllable[] controllables = {
                term1, term2, term3,
                liBul1, liBul2, liBul3,
                tv1, tv2, tv3
        };

        EnergyEfficient[] energyEfficients = {
                liBul1, liBul2, liBul3,
                tv1, tv2, tv3
        };

        Switchable[] switchables = {
                term1, term2, term3,
                liBul1, liBul2, liBul3,
                tv1, tv2, tv3
        };

        term1.temperature = 20;
        term2.temperature = 98;
        term3.temperature = -50;

        liBul1.color = "White";
        liBul2.color = "Yellow";
        liBul3.color = "Blue";


        tv1.currentChanel = "Discovery";
        tv2.currentChanel = "Netflix";
        tv3.currentChanel = "YouTube";

        for (Switchable device : switchables) {
            device.turnOn();
            System.out.println(device.isOn());
        }

        int[] powers = {
                22, 24, 20,
                30, 60, 90,
                20, 50, 80
        };

        for (int i = 0; i < controllables.length; i++) {

            controllables[i].setPower(powers[i]);

            System.out.println(controllables[i].getStatus());
        }
        for (EnergyEfficient device : energyEfficients) {

            System.out.println("Потребление энергии: " + device.calculateEnergyConsumption());
            System.out.println("Класс энергоэффективности: " + device.getEnergyClass());
        }
        for (HomeDevice device : homeDevices) {
            System.out.println(device.getDeviceInfo());
        }
        for (Switchable device : switchables) {
            device.turnOff();
            System.out.println(device.isOn());
        }
    }

}
