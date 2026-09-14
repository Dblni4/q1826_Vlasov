package by.itstep.lesson2;

import java.util.Scanner;

public class Povtorusha {
    public void povtorusha() {
        System.out.println("Введите слово!");
        Scanner obj = new Scanner(System.in);
        String inputWord = obj.nextLine();

        while (!inputWord.equals("exit")) {
            System.out.println(inputWord);
            System.out.println("Введите слово!");
            inputWord = obj.nextLine();
        }
    }
}
