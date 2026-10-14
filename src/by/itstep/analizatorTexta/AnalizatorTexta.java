package by.itstep.analizatorTexta;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnalizatorTexta {

    public String text;

    Scanner scanner = new Scanner(System.in);

    public void inputText() {
        text = scanner.nextLine().toLowerCase();
    }

    public int wordCount() {

        if (text.trim().isEmpty()) {
            return 0;
        }
        int length = text.trim().split("\\s+").length;
        return length;
    }

    public String longWord() {

        String[] words = text.trim().split("\\s+");
        String longer = words[0];
        for (String word : words) {
            if (word.length() > longer.length()) {
                longer = word;
            }
        }
        return longer;
    }

    public Map<Character, Integer> letterFrequency() {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (!Character.isLetter(letter)) {
                continue;
            }
            if (frequency.containsKey(letter)) {
                int count = frequency.get(letter);
                count += 1;
                frequency.put(letter, count);
            } else {
                frequency.put(letter, 1);
            }
        }
        return frequency;
    }

    public String[] reversWord() {
        String[] revWord = text.trim().split("\\s+");
        for (int i = 0; i < revWord.length; i++) {
            String word = revWord[i];
            String reversedWord = "";
            for (int f = word.length() - 1; f >= 0; f--) {
                char letter = word.charAt(f);
                reversedWord += letter;
            }
            revWord[i] = reversedWord;
        }
        return revWord;
    }

    public String palindrom() {
        String cleanText = "";

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (!Character.isLetter(letter)) {
                continue;
            }
            cleanText += letter;

        }
        StringBuilder builder = new StringBuilder(cleanText);
        builder.reverse();
        String reversedText = builder.toString();

        boolean noOrYes = cleanText.equals(reversedText);
        if (noOrYes)
            return "Да";
        else
            return "Нет";
    }


    @Override
    public String toString() {
        return "AnalizatorTexta{" +
                "text='" + text + '\'' +
                ", scanner=" + scanner +
                '}';
    }
}
