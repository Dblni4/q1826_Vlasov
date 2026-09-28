package by.itstep.myOfice;

public class Worker extends Employee {

    public Worker(String name, String sname, int age) {
        super(name, sname, age);
    }

    @Override
    public void setProfession() {
        this.profession = Profession.WORKER;

    }
}
