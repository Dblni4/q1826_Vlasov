package by.itstep.lesson2;

import java.util.Scanner;

public class SeasonYear {
    public void seasonYear() {

        Scanner obj = new Scanner(System.in);
        String month = obj.nextLine().toLowerCase();

        switch (month) {
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error: no such month.");
        }

    }
}
