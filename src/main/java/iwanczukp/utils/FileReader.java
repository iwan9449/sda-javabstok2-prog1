package iwanczukp.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public List<String> readFileToList(String filePath) throws FileNotFoundException {
        List<String> values = new ArrayList<>();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            values.add(scanner.next());
        }
        return values;
    }

}
