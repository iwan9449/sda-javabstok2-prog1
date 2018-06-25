package iwanczukp.excercises;

import iwanczukp.utils.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class InputNumbersSum {

    private static final String FILE_PATH = "src/main/resources/files/numbers.txt";

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            List<String> lines = fileReader.readFileToList(FILE_PATH);
            List<Integer> numbers = lines.stream().map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> results = calculateSum(numbers);
            System.out.println("Wejście: " + numbers);
            System.out.println("Wyjście: " + results);

        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się znaleść pliku pod ścieżką \"" + FILE_PATH + "\"!");
        }

    }

    private static List<Integer> calculateSum(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
            result.add(sum);
        }
        return result;
    }

}
