package by.itstep.myOfice;

public enum Profession {
    DIRECTOR(2),
    WORKER(1);

    private final int coefficient;

    Profession(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;

    }
}