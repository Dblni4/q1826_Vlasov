package by.itstep.myOfice;

import java.util.Arrays;

public class Director extends Employee {

    private Employee[] employees;


    public Director(String name, String sname, int age) {
        super(name, sname, age);
    }

    @Override
    public void setProfession() {
        this.profession = Profession.DIRECTOR;
    }

    public void addWorker(Employee employee) {
        if (employees == null) {
            employees = new Employee[1];
            employees[0] = employee;

        } else {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
        }
    }

    @Override
    public Integer getSalary() {
        if(employees == null){
        return super.getSalary();
     }else {
            return super.getSalary() + (employees.length * 100);
        }
    }

    @Override
    public String toString() {
        return "\nDirector {" +
                "employees=" + Arrays.toString(employees) +
                " ,Salary=" + getSalary() +
                '}';
    }
}
