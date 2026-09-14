package by.itstep.lesson2;

import java.util.Scanner;

public class ConsonantVowel {

    public void testConsonantOrVowel() {

        Scanner scanerInput = new Scanner(System.in);
        char letter = scanerInput.next().charAt(0);
        letter = Character.toUpperCase(letter);

        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Vowel");
        } else if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Consonant");
        } else System.out.println("Invalid value");
    }


    public void testConsonantOrVowelSwitch() {

        Scanner scanerInput = new Scanner(System.in);
        char letter = scanerInput.next().charAt(0);
        letter = Character.toUpperCase(letter);

        if (letter < 'A' | letter > 'Z') {
            System.out.println("Invalid value");
            return;
        }

        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Value");
                break;
            default:
                System.out.println("Consonant");

        }
    }
}
