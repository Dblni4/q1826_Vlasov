package by.itstep.lesson2;


import java.util.Locale;
import java.util.Scanner;

public enum SeasonYearEnum {


    DECEMBER,
    JANUARY,
    FEBRUARY,

    MARCH,
    APRIL,
    MAY,

    JUNE,
    JULY,
    AUGUST,

    SEPTEMBER,
    OCTOBER,
    NOVEMBER;

    Scanner obj = new Scanner(System.in);
    String month = obj.nextLine();

    SeasonYearEnum enumMonth = SeasonYearEnum.valueOf(month.toUpperCase());









}
