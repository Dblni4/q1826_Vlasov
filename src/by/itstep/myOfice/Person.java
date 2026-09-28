package by.itstep.myOfice;

import java.util.Objects;

public class Person {

    private String name;
    private String sname;

    public Person(String name, String sname) {
        this.name = name;
        this.sname = sname;
    }


    @Override

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(sname, person.sname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sname);
    }
}

