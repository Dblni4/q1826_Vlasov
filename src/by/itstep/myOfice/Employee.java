package by.itstep.myOfice;

public abstract class Employee extends Person{

    private int age;
    protected Profession profession;
    private final int basicSalary = 1000;


    public Employee(String name, String sname, int age) {
        super(name, sname);
        this.age = age;
        setProfession();

    }

    public Integer getSalary() {
        return basicSalary * profession.getCoefficient() * age;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "age=" + age +
                ", profession=" + profession +
                ", Salary=" + getSalary() +
                '}';
    }

    public abstract void setProfession();
}

