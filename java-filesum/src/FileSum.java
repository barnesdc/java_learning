
/**
 * FileSum
 */

import java.util.Scanner;
import java.io.*;

public class FileSum {
    private double sum; // Accumulator

    public FileSum(String filename) throws IOException {
        // String str; // hold a line read from the file

        // create the necessary objects for file input

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        // initialize the accumulator
        sum = 0.0;

        // Read all of the values from the file and calculate their total.
        while (inputFile.hasNext()) {
            // read a value from the file.
            double number = inputFile.nextDouble();
            sum = sum + number;
        }

        // close the file
        inputFile.close();
    }

    public double getSum() {
        return sum;
    }
}
