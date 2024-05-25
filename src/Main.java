
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
        String filePath = "./input.txt";
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            String[] linesArray = lines.toArray(new String[0]);
            // Convert the List to an Array
            for (String line : linesArray) {
                System.out.println(line);
            }
//            Day1 d = new Day1();
//            System.out.println(d.part2(linesArray));
            Day2 d = new Day2();
            System.out.println(d.part2(linesArray));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
