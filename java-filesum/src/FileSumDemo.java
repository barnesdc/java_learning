import java.io.*;

/**
 * This program demonstrates the FileSum class
 */

public class FileSumDemo {
    public static void main(String[] args) throws IOException {

        // // create an instance of the FileSum class
        FileSum fs = new FileSum("src/Numbers.txt");
        System.out.println("The sum of the numbers in " + "Numbers.txt is " + fs.getSum());

    }

}
