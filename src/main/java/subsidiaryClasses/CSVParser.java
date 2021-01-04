package subsidiaryClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSVParser {
    private final static String FILE_DELIMITER = "\\Z";
    public static String LINE_DELIMITER = ",";

    public static List<List<String>> parseFile(File file, int numLinesToSkip) throws FileNotFoundException {
        List<List<String>> values = new ArrayList<>();

        Scanner fileScanner = new Scanner(file);
        fileScanner.useDelimiter(CSVParser.FILE_DELIMITER);

        while(fileScanner.hasNextLine()) {
            if (numLinesToSkip > 0) {
                fileScanner.nextLine();
                --numLinesToSkip;
            }
            else {
                values.add(Arrays.asList(fileScanner.nextLine().split(CSVParser.LINE_DELIMITER)));
            }
        }

        fileScanner.close();

        return values;
    }
    public static List<List<String>> parseFile(File file) throws FileNotFoundException {
        return CSVParser.parseFile(file, 0);
    }
    public static List<List<String>> parseFile(String filepath, int numLinesToSkip) throws FileNotFoundException {
        return CSVParser.parseFile(new File(filepath), numLinesToSkip);
    }
    public static List<List<String>> parseFile(String filepath) throws FileNotFoundException {
        return CSVParser.parseFile(new File(filepath), 0);
    }
}
