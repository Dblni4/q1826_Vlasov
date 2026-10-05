package by.itstep.myOfice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Director extends Employee implements HeresJohnny {

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
        if (employees == null) {
            return super.getSalary();
        } else {
            return super.getSalary() + (employees.length * 100);
        }
    }


    @Override
    public String toString() {
        return "Director{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }

    @Override
    public void findEmployee(Employee employee, String name) {
        boolean found = false;
        if (employees == null)
            return;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println("Сотрудник " + name + " в подчинении у директора " + getName() + " " + getSname());
                found = true;
                break;
            }


        }
        if (!found) {
            System.out.println("Нет такого сотрудника");

        }
    }}