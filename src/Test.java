import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        try (FileReader fr = new FileReader("input.txt"); BufferedReader in = new BufferedReader(fr)) {
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {

        }

        aoc2021day3.Part1 solution = new aoc2021day3.Part1(lines, 12);
        System.out.println(solution.solve());
    }
}
