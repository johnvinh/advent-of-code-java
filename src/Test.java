import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        try (FileReader fr = new FileReader("input.txt"); BufferedReader in = new BufferedReader(fr)) {
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("There was an error reading the file!");
            e.printStackTrace();
            System.exit(1);
        }

        aoc2017.day1.Part2 solution = new aoc2017.day1.Part2(lines);
        System.out.println(solution.solve());
    }
}
