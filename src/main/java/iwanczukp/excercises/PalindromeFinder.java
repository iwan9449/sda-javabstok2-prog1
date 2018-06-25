package iwanczukp.excercises;

import iwanczukp.utils.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PalindromeFinder {

    private static final String FILE_PATH = "src/main/resources/files/words.txt";

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            List<String> words = fileReader.readFileToList(FILE_PATH);
            List<String> results = findPalindromes(words);
            System.out.println("Wejście: " + words);
            System.out.println("Wyjście: " + results);

        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się znaleść pliku pod ścieżką \"" + FILE_PATH + "\"!");
        }

    }

    private static List<String> findPalindromes(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (isPalindrome(word)) {
                result.add(word);
            }
        }
        return result;
    }

    private static boolean isPalindrome(String word) {
        for (int leftIndex = 0, rightIndex = word.length() - 1; leftIndex < rightIndex; leftIndex++, rightIndex--) {
            if (word.charAt(leftIndex) != word.charAt(rightIndex)) {
                return false;
            }
        }
        return true;
    }

}
