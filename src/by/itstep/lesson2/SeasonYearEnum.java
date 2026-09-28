package by.itstep.lesson2;


public enum SeasonYearEnum {


    DECEMBER("Winter"),
    JANUARY("Winter"),
    FEBRUARY("Winter"),

    MARCH("Spring"),
    APRIL("Spring"),
    MAY("Spring"),

    JUNE("Summer"),
    JULY("Summer"),
    AUGUST("Summer"),

    SEPTEMBER("Autumn"),
    OCTOBER("Autumn"),
    NOVEMBER("Autumn");

    public final String seasonYear;

    SeasonYearEnum(String seasonYear) {
        this.seasonYear = seasonYear;
    }
}
