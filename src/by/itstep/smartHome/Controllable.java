package by.itstep.smartHome;

public interface Controllable {

    void setPower(int power); //установить мощность

    int getPower();//получить текущую мощность

    String getStatus();// получить статус устройства
}
